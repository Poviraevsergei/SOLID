package O.good;

public class TelegramSender implements ISender {
    @Override
    public void sendNotification(String text) {
        //TELEGRAM logic
        System.out.println("TELEGRAM:" + text);
    }
}
