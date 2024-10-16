package week6.ChainOfResponsibiliy;

public class Main {
    public static void main(String[] args) {
        Handler carAvailabilityHandler = new CarAvailability();
        Handler balanceCheckHandler = new BalanceCheck();
        Handler locationHandler = new LocationAvailability();
        carAvailabilityHandler.setNextHandler(balanceCheckHandler).setNextHandler(locationHandler);
        Request request = new Request(true, 100, 150, true);
        carAvailabilityHandler.handle(request);
    }
}
