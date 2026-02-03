public class Customer {
    public String name;
    public Order order;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        this.order = order;
        System.out.println(name + " placed an order.");
    }

    public String identify() {
        return "Customer name: " + name;
    }
}
