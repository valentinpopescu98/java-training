package behavioral.chain_of_responsability.ex2.domain;

import behavioral.chain_of_responsability.ex2.Handler;
import behavioral.chain_of_responsability.ex2.Request;

import java.util.Random;

public class Manager extends Handler {
    @Override
    public void handleRequest(Request request) {
        boolean isManagerFree = new Random().nextBoolean();
        if (isManagerFree) {
            System.out.println("Manager is handling request...");
        }
        else {
            getSuccessor().handleRequest(request);
        }
    }
}
