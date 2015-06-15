import static java.lang.Integer.*;

public class Tokenizer {
    private String userInput;

    public Tokenizer(String userInput) {
        this.userInput = userInput;
    }

    public int tokenize() {
        String[] rawQuantity= userInput.split(" ");
        return parseInt(rawQuantity[0]);
    }
}
