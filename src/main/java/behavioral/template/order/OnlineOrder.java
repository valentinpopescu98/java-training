package behavioral.template.order;

public class OnlineOrder extends Order {
    @Override
    public void checkout() {
        System.out.println("(Online) Checking out...");
    }

    @Override
    public void processPayment() {
        System.out.println("(Online) Processing payment...");
    }

    @Override
    public void issueReceipt() {
        System.out.println("(Online) Issuing recepit...");
    }

    @Override
    public void wrapProduct() {
        System.out.println("(Online) Product is being wrapped as gift...");
    }

    @Override
    public void deliver() {
        System.out.println("(Online) Delivering...");
    }
}
