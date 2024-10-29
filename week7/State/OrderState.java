package week7.State;

interface OrderState {
    void next(Order order);
    void prev(Order order);
    void printStatus();
}