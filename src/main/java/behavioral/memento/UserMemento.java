package behavioral.memento;

public class UserMemento {
    private String name;
    private String username;
    private int points;

    public UserMemento(String username, int points) {
        this.username = username;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public int getPoints() {
        return points;
    }
}
