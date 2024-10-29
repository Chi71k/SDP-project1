package week7.Template;

abstract class OrderProcess {
    public final void processOrder() {
        if (checkAvailability()) {
            startOrder();
            calculateCost();
            confirmOrder();
        } else {
            System.out.println("Taxi not available.");
        }
    }
    protected void startOrder() {
        System.out.println("Processing standard order:");
    }
    protected abstract boolean checkAvailability();

    protected abstract void calculateCost();

    protected void confirmOrder() {
        System.out.println("Order has been confirmed.");
    }
}