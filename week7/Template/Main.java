package week7.Template;

public class Main {
    public static void main(String[] args) {
        OrderProcess standardOrder = new StandardOrderProcess();
        System.out.println("Processing standard order:");
        standardOrder.processOrder();
    }
}