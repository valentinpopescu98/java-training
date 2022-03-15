package creational.singleton.ex2;

public class MySingleton {
    private static volatile MySingleton instance;

    public MySingleton() {
        if (instance != null) {
            throw new RuntimeException(instance.toString() + " is already instantiated.");
        }
    }

    public static MySingleton getInstance() {
        synchronized (MySingleton.class) {
            if (instance == null) {
                instance = new MySingleton();
            }
        }

        return instance;
    }
}
