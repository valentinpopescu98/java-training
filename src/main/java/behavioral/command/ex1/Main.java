package behavioral.command.ex1;

public class Main {
    public static void main(String[] args) {
        Request request = new Request("Paint");
        Request request2 = new Request("Sing");

        Thread thread = new Thread(request);
        thread.start();

        Thread thread2 = new Thread(request2);
        thread2.start();
    }
}
