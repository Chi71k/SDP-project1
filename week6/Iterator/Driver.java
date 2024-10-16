package week6.Iterator;

public class Driver {
    private String name;
    private double locationX;
    private double locationY;

    public Driver(String name, double locationX, double locationY) {
        this.name = name;
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public String getName() {
        return name;
    }

    public double getLocationX() {
        return locationX;
    }

    public double getLocationY() {
        return locationY;
    }

    public double calculateDistance(double clientX, double clientY) {
        return Math.sqrt(Math.pow((clientX - locationX), 2) + Math.pow((clientY - locationY), 2));
    }
}