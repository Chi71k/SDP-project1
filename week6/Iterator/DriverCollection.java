package week6.Iterator;

import java.util.ArrayList;
import java.util.List;

public class DriverCollection {
    private List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public DriverIterator createIterator() {
        return new DriverIterator(drivers);
    }
}