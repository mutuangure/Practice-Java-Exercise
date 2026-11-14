package Question2_Interface_Library;

public class EmailNotification implements NotificationService {

    @Override
    public void notify(Member member) {

        System.out.println();
        System.out.println("Sending notification...");

        System.out.println(
                "Notification sent to " + member.getEmail() + "."
        );
    }
}
