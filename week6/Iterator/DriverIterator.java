package week6.Iterator;

import java.util.List;

public class DriverIterator implements Iterator<Driver> {
    private List<Driver> drivers;
    private int position = 0;

    public DriverIterator(List<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public boolean hasNext() {
        return position < drivers.size();
    }

    @Override
    public Driver next() {
        if (this.hasNext()) {
            return drivers.get(position++);
        }
        return null;
    }
}