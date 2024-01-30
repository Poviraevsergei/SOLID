package D;

public class Main {
    public static void main(String[] args) {
        NotificationI notification = new TelegramNotification();
        // бронирует -> sms всё гуд
        notification.sendMessage("OK");
        // отменить -> sms всё отменено
        notification.sendMessage("OK");
        // бронирует -> sms
        notification.sendMessage("OK");
        // переносит -> sms ждём!!!
        notification.sendMessage("OK");
    }
}
