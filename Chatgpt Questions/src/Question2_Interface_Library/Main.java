package Question2_Interface_Library;

public class Main
{
    static void main(String[] args) {
        Book book = new Book(
                "Clean Code",
                "Robert C. Martin",
                true
        );
        Member member = new Member(
                "John",
                "mutuangure@gmail.com"
        );

        BookAvailability inventory = new LibraryInventory();
        BorrowingDatabase database = new SqlBorrowingDatabase();
        NotificationService notification = new EmailNotification();

        BorrowingProcessor processor = new BorrowingProcessor(
                inventory,
                database,
                notification
        );

        processor.borrowBook(book, member);
    }
}
