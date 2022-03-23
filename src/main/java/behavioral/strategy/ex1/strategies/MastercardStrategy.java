package behavioral.strategy.ex1.strategies;

import behavioral.strategy.ex1.domain.CreditCard;

public class MastercardStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        String cardNumber = creditCard.getCardNumber();
        boolean isValid = defaultValidation(cardNumber);
        if (isValid) {
            isValid = cardNumber.startsWith("MAST");
        }

        return isValid;
    }
}
