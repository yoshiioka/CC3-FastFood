public class Customer {
    public String name;
    public Order order;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        this.order = order;
    }

    public String identify() {
        return "I am the Customer Class. I represent the person ordering.";
    }

    public String getFullDetails() {
        String details = "--- System Identity Report ---\n" +
                         this.identify() + "\n" +
                         this.order.identify() + "\n" +
                         this.order.foodItem.identify() + "\n\n" +
                         "--- Transaction Details ---\n" +
                         "Customer Name: " + this.name + "\n" +
                         "Order ID: " + this.order.orderId + "\n" +
                         "Total Price: $" + String.format("%.2f", this.order.calculateTotal());
        return details;
    }
}
