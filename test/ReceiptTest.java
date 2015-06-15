import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReceiptTest {
    @Test
    public void shouldComputeTotalSalesTax() {
        ArrayList<Item> items = new ArrayList<>();
        Item itemOne = new Item(1, "music Cd", 12.5);
        Item itemTwo = new Item(1, "perfume", 20);
        items.add(itemOne);
        items.add(itemTwo);
        Receipt receipt = new Receipt(items);

        double actualTotalSalesTax = receipt.totalSalesTax();

        assertThat(actualTotalSalesTax, is(3.25));
    }

    @Test
    public void shouldComputeTotalPrice() {
        ArrayList<Item> items = new ArrayList<>();
        Item itemOne = new Item(1, "music Cd", 12.5);
        Item itemTwo = new Item(1, "perfume", 20);
        items.add(itemOne);
        items.add(itemTwo);
        Receipt receipt = new Receipt(items);

        double actualTotalPrice = receipt.totalPrice();

        assertThat(actualTotalPrice, is(35.75));
    }

    @Test
    public void shouldProduceFormattedReceipt() {
        ArrayList<Item> items = new ArrayList<>();
        Item item = new Item(1, "music Cd", 12.5);
        items.add(item);
        Receipt receipt = new Receipt(items);

        String actualReceipt = receipt.toString();

        assertThat(actualReceipt, is("1 music Cd : 12.5\nSales Tax : 1.25\nTotal : 13.75\n"));
    }
}