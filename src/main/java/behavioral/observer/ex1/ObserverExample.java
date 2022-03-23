package behavioral.observer.ex1;

public class ObserverExample {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        ClientObserver clientObserver = new ClientObserver("client");
        ClientObserver clientObserver2 = new ClientObserver("client2");

        publisher.addObserver(clientObserver);
        publisher.addObserver(clientObserver2);

        publisher.onChange();
    }
}
