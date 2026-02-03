public class FoodItem {
    public double price;

    public FoodItem(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String identify() {
        return "FoodItem with price: " + price;
    }
}
