public class FastFood {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane Smith");
        Order order = new Order(101, 12.50);
        customer.placeOrder(order);

        System.out.println(customer.getFullDetails());
    }
}
