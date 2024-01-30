package O.good;

public class EmailSender implements ISender {
    @Override
    public void sendNotification(String text) {
        //EMAIL logic
        System.out.println("EMAIL:" + text);
    }
}
