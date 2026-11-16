package Question2_Library;

public class BorrowingProcessor
{
    public void borrowingProcessor(Book book, Member member) {
        var bookAvailability = new BookAvailability();
        bookAvailability.isAvailable(book);

        var borrowingDatabase = new BorrowingDatabase();
        borrowingDatabase.records(book, member);

        var emailNotification = new EmailNotification();
        emailNotification.notify(member);

    }
}
