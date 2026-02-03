public class FastFood {
    public static void main(String[] args) {
        Customer customer = new Customer("Leng Ganda");
        Order order = new Order(67, 12.50);
        customer.placeOrder(order);

        System.out.println(customer.getFullDetails());
    }
}
