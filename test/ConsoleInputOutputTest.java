import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ConsoleInputOutputTest {
    @Test
    public void inputShouldBeObtainedFromTheUser() {
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream("1 music Cd at 12.5".getBytes());
        System.setIn(inputStreamContent);
        Scanner consoleInput = new Scanner(System.in);
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(consoleInput);

        String actualUserInput = consoleInputOutput.getUserInput();

        assertThat(actualUserInput, is("1 music Cd at 12.5"));
    }

    @Test
    public void outputShouldBeDisplayedToTheUser() {
        ByteArrayOutputStream outputStreamContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamContent));
        Scanner consoleInput = new Scanner(System.in);
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(consoleInput);

        consoleInputOutput.displayOutputToUser("output");
        String actualOutputToUser = outputStreamContent.toString();

        assertThat(actualOutputToUser, is("output\n"));
    }
}
