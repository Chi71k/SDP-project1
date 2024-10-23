package week7.State;

class ConfirmedState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new OnTheWayState());
        System.out.println("Taxi is on the way.");
    }

    @Override
    public void prev(Order order) {
        order.setState(new CreatedState());
        System.out.println("Order reverted to Created state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in Confirmed state.");
    }
}