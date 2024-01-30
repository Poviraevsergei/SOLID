package D;

public class Example {
    public static void main(String[] args) {
        NotificationI n = new TelegramNotification();
        NotificationI n1 = new SmsNotification();
    }
}
