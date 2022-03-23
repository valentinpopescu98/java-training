package behavioral.strategy.ex1.domain;

import behavioral.strategy.ex1.strategies.ValidationStrategy;

public class CreditCard {
    private String cardNumber;
    private ValidationStrategy validationStrategy;

    public CreditCard(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public boolean isValid() {
        return validationStrategy.isValid(this);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
