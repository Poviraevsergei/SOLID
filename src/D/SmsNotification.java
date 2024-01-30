package D;

public class SmsNotification implements NotificationI {

    public void sendMessage(String text) {
        System.out.println("Отправляем через смс");
    }
}
