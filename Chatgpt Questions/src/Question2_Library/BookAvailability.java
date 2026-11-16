package Question2_Library;

public class BookAvailability
{
    public boolean isAvailable(Book book) {
        System.out.println("Checking book availability...");

        if (book.isAvailable()) {
            System.out.println("Book is available.");
            return true;
        } else {
            System.out.println("Book is not available.");
            return false;
        }
    }
}
