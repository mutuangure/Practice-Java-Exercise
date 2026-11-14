package Question2_Interface_Library;

public class SqlBorrowingDatabase implements BorrowingDatabase
{
    @Override
    public void recordingBorrowing(Book book, Member member) {

        System.out.println();
        System.out.println("Recording borrowing transaction...");

        System.out.println(
                book.getTitle() + " borrowed by " + member.getName() + "."
        );
    }
}
