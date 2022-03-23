package behavioral.template.order;

public class StoreOrder extends Order {
    @Override
    public void checkout() {
        System.out.println("(Store) Checking out...");
    }

    @Override
    public void processPayment() {
        System.out.println("(Store) Processing payment...");
    }

    @Override
    public void issueReceipt() {
        System.out.println("(Store) Issuing recepit...");
    }

    @Override
    public void wrapProduct() {
        System.out.println("(Store) Product is being wrapped as gift...");
    }

    @Override
    public void deliver() {
        System.out.println("(Store) Delivering...");
    }
}
