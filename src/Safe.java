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
        // returning coin based on user choice
        return switch (userInput) {
            case "1" -> new Euro();
            case "2" -> new Dollar();
            case "3" -> new Real();
            default -> null;
        };
    }

    public void totalAmountConverted() {}

}
