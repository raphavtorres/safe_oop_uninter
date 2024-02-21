import java.util.ArrayList;
import java.util.Scanner;

public class Safe {
    Scanner scanner = new Scanner(System.in);

    private ArrayList<Coin> coins;

    public void add() {
        var coin = this.chooseCoin();
        this.coins.add(coin);
    }

    public void remove() {
        var coin = this.chooseCoin();
        this.coins.remove(coin);
    }

    public void list() {
        for (Coin coin : this.coins) {
            System.out.println(coin.info() + " - ");
        }
    }

    private Coin chooseCoin() {
        // Showing coins optional in terminal
        System.out.println("""
                Choose coin:
                1 - Euro
                2 - Dollar
                3 - Real
                """);
        // getting user input
        String userInput = scanner.next();
        double value = 0.0;
        // returning coin based on user choice
        return switch (userInput) {
            case "1" -> new Euro(value);
            case "2" -> new Dollar(value);
            case "3" -> new Real(value);
            default -> null;
        };
    }

    public void totalAmountConverted() {}

}
