package week7.State;

interface OrderState {
    void next(Order order);    // Transition to the next state
    void prev(Order order);    // Transition to the previous state
    void printStatus();        // Print the current status
}