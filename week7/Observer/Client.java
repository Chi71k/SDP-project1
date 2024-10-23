package week7.Observer;

class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public void update(Order order) {
        System.out.println("Notification for: " + name + ". Order status " + order.getStatus());
    }
}