package behavioral.observer.ex1;

import java.util.Observable;

public class Publisher extends Observable {
    public void onChange() {
        setChanged();
        notifyObservers();
    }
}
