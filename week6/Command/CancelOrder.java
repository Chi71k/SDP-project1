package week6.Command;

public class CancelOrder implements Command {
    private TaxiOrderReceiver taxiOrder;

    public CancelOrder(TaxiOrderReceiver taxiOrder) {
        this.taxiOrder = taxiOrder;
    }

    @Override
    public void execute() {
        taxiOrder.cancelOrder();
    }
}

