package behavioral.strategy.strategies;

import behavioral.strategy.domain.CreditCard;

public abstract class ValidationStrategy {
    public abstract boolean isValid(CreditCard creditCard);

    public boolean defaultValidation(String cardNumber) {
        return cardNumber.chars().anyMatch(Character::isLetterOrDigit) && cardNumber.length() == 16;
    }
}
