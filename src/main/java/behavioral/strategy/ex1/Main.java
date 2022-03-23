package behavioral.strategy.ex1;

import behavioral.strategy.ex1.domain.CreditCard;
import behavioral.strategy.ex1.strategies.MastercardStrategy;
import behavioral.strategy.ex1.strategies.VisaStrategy;

public class Main {
    public static void main(String[] args) {
        CreditCard visaCard = new CreditCard(new VisaStrategy());
        visaCard.setCardNumber("VISA123456789012");
        System.out.println("Visa card validity: " + visaCard.isValid());

        CreditCard mcCard = new CreditCard(new MastercardStrategy());
        mcCard.setCardNumber("VISA123456789012");
        System.out.println("Mastercard card validity: " + mcCard.isValid());
    }
}
