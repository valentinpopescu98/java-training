package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        User user = new User();

        user.setName("Valentin Popescu");
        user.setUsername("valentinpopescu");
        user.setPoints(0);
        caretaker.save(user);

        System.out.println("Original user (SAVE)");
        System.out.println(user);

        user.setPoints(100);
        caretaker.save(user);

        System.out.println("User after change 1 (SAVE)");
        System.out.println(user);

        user.setPoints(150);
        caretaker.save(user);

        System.out.println("User after change 2 (SAVE)");
        System.out.println(user);

        caretaker.undo(user);

        System.out.println("User after change 1 (UNDO)");
        System.out.println(user);

        caretaker.undo(user);

        System.out.println("Original user (UNDO)");
        System.out.println(user);
    }
}
