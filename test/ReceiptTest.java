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
}