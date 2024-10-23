package week7.Strategy;

class FixedPricing implements PricingStrategy {
    private final double fixedPrice;

    public FixedPricing(double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    @Override
    public double calculateFare(double value) {
        return fixedPrice;
    }
}