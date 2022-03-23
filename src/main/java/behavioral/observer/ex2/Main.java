package behavioral.observer.ex2;

import behavioral.observer.ex2.domain.HRObserver;
import behavioral.observer.ex2.domain.ITServicesObserver;
import behavioral.observer.ex2.subject.MessageFlow;
import behavioral.observer.ex2.subject.Subject;

public class Main {
    public static void main(String[] args) {
        Subject subject = new MessageFlow();

        HRObserver hrObserver = new HRObserver(subject);
        ITServicesObserver itServicesObserver = new ITServicesObserver(subject);

        hrObserver.addMessage("Documents ready!");
        itServicesObserver.addMessage("Account is configured!");
    }
}
