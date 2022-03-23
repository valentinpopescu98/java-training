package behavioral.strategy.strategies;

import behavioral.strategy.domain.CreditCard;

public class VisaStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        String cardNumber = creditCard.getCardNumber();
        boolean isValid = defaultValidation(cardNumber);
        if (isValid) {
            isValid = cardNumber.startsWith("VISA");
        }

        return isValid;
    }
}
