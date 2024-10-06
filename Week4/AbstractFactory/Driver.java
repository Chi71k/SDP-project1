package Week4.AbstractFactory;

public abstract class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public abstract void drive();

}