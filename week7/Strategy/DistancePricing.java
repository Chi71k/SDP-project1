package week7.Strategy;

class DistancePricing implements PricingStrategy {
    private final double pricePerKm;

    public DistancePricing(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * pricePerKm;
    }
}