package behavioral.memento;

import java.util.Stack;

public class Caretaker {
    private Stack<UserMemento> userHistory = new Stack<>();

    public void save(User user) {
        userHistory.push(user.newMemento());
    }

    public void undo(User user) {
        userHistory.pop();
        UserMemento previous = userHistory.lastElement();
        user.changeUserToMemento(previous);
    }
}
