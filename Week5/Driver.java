package Week5;

public class Driver {
    private Car car;
    public void addCar(Car car){
        this.car = car;
        System.out.println("Driver took the car " + car.getCarModel() + " " + car.getCarColor());
    }
    public void takePassenger(Passenger passenger){
        System.out.println("Driver is taking " + passenger.getName() + " to " + passenger.getDestination());
    }
}
