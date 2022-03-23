package behavioral.observer.ex2.subject;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageFlow extends Subject {
    private Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    public void addMessage(String message) {
        messageHistory.push(message);
        notifyObservers();
    }

    @Override
    public String getMessage() {
        return messageHistory.getLast();
    }
}
