package Week4.AbstractFactory;

public class PremiumFactory extends Factory {
    @Override
    public Taxi createTaxi(String driverName, String license) {
        return new PremiumTaxi(driverName, license);
    }

    @Override
    public Driver createDriver(String driverName) {
        return new PremiumDriver(driverName);
    }
}

