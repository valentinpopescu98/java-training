package behavioral.strategy.ex1.strategies;

import behavioral.strategy.ex1.domain.CreditCard;

public abstract class ValidationStrategy {
    public abstract boolean isValid(CreditCard creditCard);

    public boolean defaultValidation(String cardNumber) {
        return cardNumber.chars().anyMatch(Character::isLetterOrDigit) && cardNumber.length() == 16;
    }
}
