package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new StandardFactory();
        Taxi taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Yerassyl");

        factory = new PremiumFactory();
        taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Yerassyl");
    }
}
