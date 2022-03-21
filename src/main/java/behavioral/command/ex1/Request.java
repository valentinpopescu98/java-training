package behavioral.command.ex1;

public class Request implements Runnable {
    private String info;

    public Request(String info) {
        this.info = info;
    }

    @Override
    public void run() {
        System.out.println("Request: " + info);
    }
}
