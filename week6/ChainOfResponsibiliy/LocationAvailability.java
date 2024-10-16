package week6.ChainOfResponsibiliy;

class LocationAvailability extends Handler {
    @Override
    public void handle(Request request) {
        if (request.isLocationServiceable()) {
            System.out.println("Location is serviceable");
        } else {
            System.out.println("Location not serviceable");
        }
    }
}
