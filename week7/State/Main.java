package week7.State;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.printStatus();

        order.nextState();
        order.printStatus();

        order.nextState();
        order.printStatus();

        order.nextState();
        order.printStatus();

        order.nextState();

        order.previousState();
        order.printStatus();
    }
}