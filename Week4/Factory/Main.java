package Week4.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new StandardTaxiFactory();
        Taxi taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Yerassyl");

        factory = new PremiumTaxiFactory();
        taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Yerassyl");

    }
}
