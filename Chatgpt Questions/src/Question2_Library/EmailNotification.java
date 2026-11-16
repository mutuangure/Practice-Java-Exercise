package Question2_Library;

public class EmailNotification
{
    public void notify(Member member) {
        System.out.println("\nSending notification...");

        System.out.println(
                "Notification sent to " + member.getEmail() + "."
        );
    }
}
