package behavioral.chain_of_responsability.ex2.domain;

import behavioral.chain_of_responsability.ex2.Handler;
import behavioral.chain_of_responsability.ex2.Request;

import java.util.Random;

public class Respondent extends Handler {
    @Override
    public void handleRequest(Request request) {
        boolean isRespondentFree = new Random().nextBoolean();
        if (isRespondentFree) {
            System.out.println("Respondent is handling request...");
        }
        else {
            getSuccessor().handleRequest(request);
        }
    }
}
