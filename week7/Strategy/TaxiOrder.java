package week7.Strategy;

class TaxiOrder {
    private PricingStrategy pricingStrategy;

    public TaxiOrder(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateFare(double value) {
        return pricingStrategy.calculateFare(value);
    }
}
