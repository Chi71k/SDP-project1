package Week5;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada granta","red");
        Passenger passenger = new Passenger("Yeraasyl","AITU");

        CarSharing carSharing = new CarSharing(car);
        TaxiService taxiService = new CarSharingAdapter(carSharing);

        taxiService.requestTaxi(passenger);
    }
}
