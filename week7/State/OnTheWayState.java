package week7.State;

class OnTheWayState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new FinishedState());
        System.out.println("Order has been completed.");
    }

    @Override
    public void prev(Order order) {
        order.setState(new ConfirmedState());
        System.out.println("Order reverted to Confirmed state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Taxi is OnTheWay state.");
    }
}