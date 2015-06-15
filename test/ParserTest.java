import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

public class ParserTest {
    @Mock
    private Item item;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void shouldParseUserInputToItem() {
        when(item.salesTax()).thenReturn(0.0);
        Parser parser = new Parser("2 music Cd at 12.49");

        Item actualItem = parser.parse();
        double actualSalesTax = actualItem.salesTax();

        assertThat(actualSalesTax, is(0.0));
    }
}
