package behavioral.chain_of_responsability.ex2;

import behavioral.chain_of_responsability.ex2.domain.Director;
import behavioral.chain_of_responsability.ex2.domain.Manager;
import behavioral.chain_of_responsability.ex2.domain.Respondent;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Manager manager = new Manager();
        Respondent respondent = new Respondent();

        respondent.setSuccessor(manager);
        manager.setSuccessor(director);

        Request request = new Request("Request");
        respondent.handleRequest(request);
    }
}
