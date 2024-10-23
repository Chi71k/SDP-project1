package week7.Strategy;

class TaxiOrder {
    private PricingStrategy pricingStrategy;

    // Constructor to inject a strategy at runtime
    public TaxiOrder(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    // Calculate the fare based on the strategy
    public double calculateFare(double value) {
        return pricingStrategy.calculateFare(value);
    }
}
