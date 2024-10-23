package week7.Strategy;

public class Main {
    public static void main(String[] args) {
        PricingStrategy distanceBased = new DistancePricing(10);
        PricingStrategy timeBased = new TimePricing(2);
        PricingStrategy fixedPrice = new FixedPricing(50);

        TaxiOrder ride1 = new TaxiOrder(distanceBased);
        double distanceFare = ride1.calculateFare(15);
        System.out.println("Distance-based Price: " + distanceFare);

        ride1.setPricingStrategy(timeBased);
        double timeFare = ride1.calculateFare(30);
        System.out.println("Time-based Price: " + timeFare);

        ride1.setPricingStrategy(fixedPrice);
        double fixedFare = ride1.calculateFare(0);
        System.out.println("Fixed Price: " + fixedFare);
    }
}