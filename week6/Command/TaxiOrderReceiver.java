package week6.Command;

public class TaxiOrderReceiver {
    private String destination;
    private boolean orderCreated;

    public void createOrder(String destination) {
        this.destination = destination;
        orderCreated = true;
        System.out.println("Order created. Destination: " + destination);
    }

    public void cancelOrder() {
        if (orderCreated) {
            System.out.println("Order canceled. Previous destination: " + destination);
            orderCreated = false;
        } else {
            System.out.println("No order to cancel.");
        }
    }

    public void changeDestination(String newDestination) {
        if (orderCreated) {
            System.out.println("Destination changed from " + destination + " to " + newDestination);
            this.destination = newDestination;
        } else {
            System.out.println("No order to change the destination.");
        }
    }
}
