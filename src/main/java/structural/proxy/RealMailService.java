package structural.proxy;

public class RealMailService implements MailService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sent message: " + message);
    }

    @Override
    public String getMessage() {
        String message = "Message received.";
        System.out.println(message);

        return message;
    }
}
