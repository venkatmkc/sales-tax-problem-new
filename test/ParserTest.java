import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

public class ParserTest {
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void shouldParseUserInputToItem() {
        Parser parser = new Parser("2 music Cd at 12.49");

        Item actualItem = parser.parse();
        double actualSalesTax = actualItem.salesTax();

        assertThat(actualSalesTax, is(1.249));
    }
}
