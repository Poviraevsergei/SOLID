package O.bad;

public class Notification {
    public void sendNotification(String type, String text){
        if (type == "SMS"){
            //SMS logic
            System.out.println("SMS:" + text);
        }
        if (type == "EMAIL"){
            //EMAIL logic
            System.out.println("EMAIL:" + text);
        }
        if (type == "TELEGRAM"){
            //TELEGRAM logic
            System.out.println("TELEGRAM:" + text);
        }
    }
}
