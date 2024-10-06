package Week5;

public class CarSharing {
    private Car car;

    public CarSharing(Car car) {
        this.car = car;
    }

    public void rentFreeCar(Driver driver){
        if (car.isAvailable()) {
            driver.addCar(car);
            car.setAvailable(false);
        }
        else {
            System.out.println("Now we dont have free cars");
        }
    }
}

