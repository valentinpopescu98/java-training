package behavioral.observer.ex2.domain;

import behavioral.observer.ex2.subject.Subject;

public class ITServicesObserver extends Observer {
    public ITServicesObserver(Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("IT Services Department: " + subject.getMessage());
    }

    public void addMessage(String message) {
        subject.addMessage("IT Services Department: " + message);
    }
}
