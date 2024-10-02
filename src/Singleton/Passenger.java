package Singleton;

public class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }
    public void assignTaxi(String driver) {
        System.out.println(name + " "+ driver + " will be coming to you soon");
    }
}
