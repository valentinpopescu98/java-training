package behavioral.template.order;

public abstract class Order {
    public boolean isGift = false;

    public abstract void checkout();
    public abstract void processPayment();
    public abstract void issueReceipt();
    public abstract void wrapProduct();
    public abstract void deliver();

    public final void processOrder() {
        checkout();
        processPayment();

        if (isGift) {
            wrapProduct();
        }
        else {
            issueReceipt();
        }

        deliver();
    }

    public void setGift(boolean gift) {
        isGift = gift;
    }
}
