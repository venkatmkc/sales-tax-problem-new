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

}