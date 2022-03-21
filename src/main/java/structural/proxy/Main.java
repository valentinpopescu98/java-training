package structural.proxy;

public class Main {
    public static void main(String[] args) {
        MailService mailServiceInstance = (MailService) RealMailProxy.newInstance(new RealMailService());

        mailServiceInstance.sendMessage("Message 1");
        mailServiceInstance.getMessage();
    }
}
