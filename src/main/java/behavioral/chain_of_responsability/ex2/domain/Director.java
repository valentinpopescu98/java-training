package behavioral.chain_of_responsability.ex2.domain;

import behavioral.chain_of_responsability.ex2.Handler;
import behavioral.chain_of_responsability.ex2.Request;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("Manager is handling request...");
    }
}
