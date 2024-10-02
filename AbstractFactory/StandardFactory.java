package AbstractFactory;

public class StandardFactory extends Factory {
    @Override
    public Taxi createTaxi(String driverName, String license) {
        return new StandardTaxi(driverName, license);
    }

    @Override
    public Driver createDriver(String driverName) {
        return new StandardDriver(driverName);
    }
}