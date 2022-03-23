package behavioral.observer.ex1;

import java.util.Observable;
import java.util.Observer;

public class ClientObserver implements Observer {
    private String name;

    public ClientObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("New update: " + name);
    }
}
