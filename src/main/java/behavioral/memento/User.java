package behavioral.memento;

public class User {
    private String name;
    private String username;
    private int points;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return String.format("User: name = %s, username = %s, points = %d",
                name, username, points);
    }

    public UserMemento newMemento() {
        return new UserMemento(username, points);
    }

    public void changeUserToMemento(UserMemento userMemento) {
        name = userMemento.getName();
        username = userMemento.getUsername();
        points = userMemento.getPoints();
    }
}
