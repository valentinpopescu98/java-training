package behavioral.observer.ex2.domain;

import behavioral.observer.ex2.subject.Subject;

public class HRObserver extends Observer {
    public HRObserver(Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("Human Resources Department: " + subject.getMessage());
    }

    public void addMessage(String message) {
        subject.addMessage("Human Resources Department: " + message);
    }
}
