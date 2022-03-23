package behavioral.observer.ex2.domain;

import behavioral.observer.ex2.subject.Subject;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
