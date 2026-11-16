package Question2_Library;

public class Main
{
    static void main(String[] args) {
        var book = new Book ();
        book.setTitle("Clean code");
        book.setAuthor("Robert C. Martin");
        book.setAvailable(true);

        var member = new Member();
        member.setName("Kamau");
        member.setEmail("kamau@gmail.com");

        var processor = new BorrowingProcessor();
        processor.borrowingProcessor(book, member);


    }
}
