package week7.Observer;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Client client1 = new Client("Нургиса");
        Client client2 = new Client("Дос");

        order.subscribe(client1);
        order.subscribe(client2);

        order.setStatus("In Progress");

        order.unsubscribe(client1);

        order.setStatus("Completed");
    }
}