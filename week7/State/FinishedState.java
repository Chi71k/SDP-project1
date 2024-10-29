package week7.State;

class FinishedState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order is already completed, cannot go further.");
    }

    @Override

    public void prev(Order order) {
        order.setState(new OnTheWayState());
        System.out.println("Order reverted to OnTheWay state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in Finished state.");
    }
}
