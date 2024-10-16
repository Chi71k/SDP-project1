package week6.Command;

public class ChangeDestination implements Command {
    private TaxiOrderReceiver taxiOrder;
    private String newDestination;

    public ChangeDestination(TaxiOrderReceiver taxiOrder, String newDestination) {
        this.taxiOrder = taxiOrder;
        this.newDestination = newDestination;
    }

    @Override
    public void execute() {
        taxiOrder.changeDestination(newDestination);
    }
}
