import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void shouldComputeSalesTax() {
        Item item = new Item(1, "music Cd", 12.5);

        double actualSalesTax = item.salesTax();

        assertThat(actualSalesTax, is(1.25));
    }

    @Test
    public void shouldProduceFormattedItemDetailS() {
        Item item = new Item(1, "music Cd", 12.5);

        String actualFormattedItem = item.toString();

        assertThat(actualFormattedItem, is("1 music Cd : 12.5"));
    }

}