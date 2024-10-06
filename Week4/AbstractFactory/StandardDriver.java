package Week4.AbstractFactory;

public class StandardDriver extends Driver {
    public StandardDriver(String driverName) {
        super(driverName);
    }

    @Override
    public void drive() {
        System.out.println("Driver regularly");
    }
}