package Question2_Interface_Library;

public class BorrowingProcessor
{
    private BookAvailability bookAvailability;
    private BorrowingDatabase borrowingDatabase;
    private NotificationService notificationService;

    public BorrowingProcessor(BookAvailability availability,
                              BorrowingDatabase database,
                              NotificationService service) {
        this.bookAvailability = availability;
        this.borrowingDatabase = database;
        this.notificationService = service;
    }

    public void borrowBook(Book book, Member member) {
        if (bookAvailability.isAvailable(book)) {
            borrowingDatabase.recordingBorrowing(book, member);
            notificationService.notify(member);

            System.out.println("\nBook borrowing completed successfully!");
        } else
            System.out.println("\nBorrowing unsuccessful.");

    }
}
