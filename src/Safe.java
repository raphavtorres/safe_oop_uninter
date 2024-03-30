import java.util.ArrayList;
import java.util.Scanner;

public class Safe {

    private final ArrayList<Coin> listCoins;

    public Safe() {
        this.listCoins = new ArrayList<>();
    }

    public void add(Coin coin) {
        this.listCoins.add(coin);
    }

    public void remove(Coin coin) {
        this.listCoins.remove(coin);
    }

    public void list() {
        for (Coin coin : this.listCoins) {
            System.out.println(coin.info());
        }
    }

    public void totalAmountConverted() {
        double total = 0;

        for (Coin coin : this.listCoins) {
            total += coin.convert();
        }
        System.out.println("Total amount = " + total);
    }

}
