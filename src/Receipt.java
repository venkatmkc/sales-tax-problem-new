import java.util.ArrayList;

public class Receipt {
    private ArrayList<Item> items;

    public Receipt(ArrayList<Item> items) {
        this.items = items;
    }

    public double totalSalesTax() {
        double totalSalesTax = 0;
        for(Item item : items) {
            totalSalesTax += item.salesTax();
        }
        return totalSalesTax;
    }

    public double totalPrice() {
        double totalPrice = 0;
        for(Item item : items) {
            totalPrice += item.netPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        String formattedString = new String();
        for(Item item : items) {
            formattedString += item + "\n";
        }
        formattedString += "Sales Tax : " + totalSalesTax() + "\n";
        formattedString += "Total : " + totalPrice() + "\n";
        return formattedString;
    }
}
