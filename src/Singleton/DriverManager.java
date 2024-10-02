package Singleton;
public class DriverManager {
    private static DriverManager instance;
    private DriverManager() {}
    public static DriverManager getInstance() {
        if (instance == null) {
            synchronized (DriverManager.class) {
                if (instance == null) {
                    instance = new DriverManager(); // lazy double-check
                }
            }
        }
        return instance;
    }
    public String findNearestDriver(String location) {
        System.out.println("Nearest driver found: Driver1 at " + location);
        return "Driver1";
    }
}