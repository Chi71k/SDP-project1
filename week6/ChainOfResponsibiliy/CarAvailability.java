package week6.ChainOfResponsibiliy;

class CarAvailability extends Handler {
    @Override
    public void handle(Request request) {
        if (request.areCarsAvailable()) {
            System.out.println("Cars are available.");
            if (nextHandler != null) {
                nextHandler.handle(request);
            }
        } else {
            System.out.println("No cars available.");
        }
    }
}
