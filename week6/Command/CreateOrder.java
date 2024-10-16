package week6.Command;

public class CreateOrder implements Command {
    private TaxiOrderReceiver taxiOrder;
    private String destination;

    public CreateOrder(TaxiOrderReceiver taxiOrder, String destination) {
        this.taxiOrder = taxiOrder;
        this.destination = destination;
    }

    @Override
    public void execute() {
        taxiOrder.createOrder(destination);
    }
}
