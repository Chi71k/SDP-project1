package Week4.AbstractFactory;

public abstract class Taxi {
    private Driver driver;
    private String license;

    public Taxi(String driverName, String license) {
        this.driver = driver;
        this.license = license;
    }

    public abstract void takePassenger(String passenger);

}

