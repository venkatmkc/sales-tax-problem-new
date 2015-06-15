import static java.lang.Double.parseDouble;
import static java.lang.Integer.*;

public class Parser {
    private String userInput;

    public Parser(String userInput) {
        this.userInput = userInput;
    }

    public Item parse() {
        String[] rawQuantity= userInput.split(" ");
        int quantity = parseInt(rawQuantity[0]);
        String[] rawPrice = userInput.split(" at ");
        double price = parseDouble(rawPrice[1]);
        String[] rawName = rawPrice[0].split(" ");
        String name = new String();
        for(int currentIndex = 1; currentIndex < rawName.length; currentIndex++)
            name += rawName[currentIndex];
        return new Item(quantity, name, price);
    }
}
