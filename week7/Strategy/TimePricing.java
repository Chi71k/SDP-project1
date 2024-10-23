package week7.Strategy;

class TimePricing implements PricingStrategy {
    private final double pricePerMinute;

    public TimePricing(double pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }

    @Override
    public double calculateFare(double timeInMinutes) {
        return timeInMinutes * pricePerMinute;
    }
}
