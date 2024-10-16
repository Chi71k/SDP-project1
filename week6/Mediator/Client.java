package week6.Mediator;

public class Client {
    private Mediator mediator;

    public Client(Mediator mediator) {
        this.mediator = mediator;
    }

    public void requestRide() {
        System.out.println("Client: Need a ride.");
        mediator.notify(this, "need ride");
    }

    public void notifyCompleted() {
        System.out.println("Client: Ride completed.");
    }
}