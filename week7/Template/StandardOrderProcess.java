package week7.Template;

class StandardOrderProcess extends OrderProcess {

    @Override
    protected boolean checkAvailability() {
        System.out.println("Checking availability for a standard taxi...");
        return true;
    }

    @Override
    protected void calculateCost() {
        System.out.println("Calculating cost for a standard taxi ride.");
        System.out.println("Cost: $25.00");
    }
}