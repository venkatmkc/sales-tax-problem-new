public class Item {
    private final int quantity;
    private final String name;
    private final double price;

    public Item(int quantity, String name, double price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public double salesTax() {
        return 0;
    }
}
