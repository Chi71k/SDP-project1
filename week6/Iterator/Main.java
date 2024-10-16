package week6.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Driver> driverList = new ArrayList<>();
        DriverCollection driverCollection = new DriverCollection();

        driverCollection.addDriver(new Driver("Driver 1", 10, 10));
        driverCollection.addDriver(new Driver("Driver 2", 5, 8));
        driverCollection.addDriver(new Driver("Driver 3", 2, 3));

        double clientX = 4;
        double clientY = 5;

        DriverIterator iterator = driverCollection.createIterator();

        Driver closestDriver = null;
        double closestDistance = Double.MAX_VALUE;

        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            double distance = driver.calculateDistance(clientX, clientY);
            if (distance < closestDistance) {
                closestDistance = distance;
                closestDriver = driver;
            }
        }

        if (closestDriver != null) {
            System.out.println("Closest driver is: " + closestDriver.getName() +
                    " with a distance of: " + closestDistance);
        }
    }
}