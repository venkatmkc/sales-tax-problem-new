import org.junit.Test;

public class SalesTaxCalculator {
    private ConsoleInputOutput consoleInputOutput;

    public SalesTaxCalculator(ConsoleInputOutput consoleInputOutput) {
        this.consoleInputOutput = consoleInputOutput;
    }

    public void start() {
        String userInput = consoleInputOutput.getUserInput();
    }
}
