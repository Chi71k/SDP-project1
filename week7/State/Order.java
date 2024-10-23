package week7.State;

class Order {
    private OrderState state;

    public Order() {
        this.state = new CreatedState(); // Order starts in CreatedState
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void previousState() {
        state.prev(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}