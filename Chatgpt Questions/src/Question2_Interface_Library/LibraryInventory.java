package Question2_Interface_Library;

public class LibraryInventory implements BookAvailability
{
    @Override
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
