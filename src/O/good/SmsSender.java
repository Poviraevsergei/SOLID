package O.good;

public class SmsSender implements ISender{
    @Override
    public void sendNotification(String text) {
        //SMS logic
        System.out.println("SMS:" + text);
    }
}
