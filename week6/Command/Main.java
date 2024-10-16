package week6.Command;

public class Main {
    public static void main(String[] args) {
        TaxiOrderReceiver receiver = new TaxiOrderReceiver();

        Command createOrder = new CreateOrder(receiver, "Location A");
        Command cancelOrder = new CancelOrder(receiver);
        Command changeDestination = new ChangeDestination(receiver, "Location B");

        createOrder.execute();
        changeDestination.execute();
        cancelOrder.execute();
    }
}