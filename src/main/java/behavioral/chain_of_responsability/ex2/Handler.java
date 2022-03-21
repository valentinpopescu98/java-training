package behavioral.chain_of_responsability.ex2;

public class Handler {
    private Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(Request request) {
        System.out.println("No handlers for this request... ");

    }
}
