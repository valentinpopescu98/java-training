package behavioral.strategy;

import behavioral.strategy.domain.CreditCard;
import behavioral.strategy.strategies.MastercardStrategy;
import behavioral.strategy.strategies.VisaStrategy;

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
