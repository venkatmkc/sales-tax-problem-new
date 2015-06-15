import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.*;

public class SalesTaxCalculatorTest {
    @Mock
    private ConsoleInputOutput consoleInputOutput;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void shouldGetItemInputFromUser() {
        SalesTaxCalculator salesTaxCalculator = new SalesTaxCalculator(consoleInputOutput);

        salesTaxCalculator.start();

        verify(consoleInputOutput).getUserInput();
    }
}
