package Question2_Library;

public class BorrowingDatabase
{
    public void records(Book book, Member member) {
        System.out.println("\nRecording borrowing transaction...");

        System.out.println(
                book.getTitle() + " borrowed by " + member.getName() + "."
        );
    }
}
