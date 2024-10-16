package week6.ChainOfResponsibiliy;

class Request {
    private boolean carsAvailable;
    private double clientBalance;
    private double requiredBalance;
    private boolean locationServiceable;

    public Request(boolean carsAvailable, double clientBalance, double requiredBalance, boolean locationServiceable) {
        this.carsAvailable = carsAvailable;
        this.clientBalance = clientBalance;
        this.requiredBalance = requiredBalance;
        this.locationServiceable = locationServiceable;
    }

    public boolean areCarsAvailable() {
        return carsAvailable;
    }

    public double getClientBalance() {
        return clientBalance;
    }

    public double getRequiredBalance() {
        return requiredBalance;
    }

    public boolean isLocationServiceable() {
        return locationServiceable;
    }
}
