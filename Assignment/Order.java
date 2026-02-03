public class Order {
    public int orderId;
    public FoodItem foodItem;

    public Order(int orderId, FoodItem foodItem) {
        this.orderId = orderId;
        this.foodItem = foodItem;
    }

    public double calculateTotal() {
        return foodItem.getPrice();
    }

    public String identify() {
        return "Order ID: " + orderId;
    }
}
