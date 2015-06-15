import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TokenizerTest {
    @Test
    public void shouldTokenizeUserInputToQuantity() {
        Tokenizer tokenizer = new Tokenizer("2 book at 12.49");

        int actualQuantity = tokenizer.tokenize();

        assertThat(actualQuantity, is(2));
    }
}
