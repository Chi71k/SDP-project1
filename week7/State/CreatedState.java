package week7.State;

class CreatedState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new ConfirmedState());
        System.out.println("Order has been confirmed.");
    }

    @Override
    public void prev(Order order) {
        System.out.println("This is the initial state, cannot go back.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in Created state.");
    }
}
