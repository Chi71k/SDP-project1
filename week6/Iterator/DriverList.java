package week6.Iterator;

import java.util.List;

public class DriverList {
    private List<Driver> drivers;

    public DriverList(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public DriverIterator createIterator() {
        return new DriverIterator(drivers);
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }
}