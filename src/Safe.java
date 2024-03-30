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
        Coin listCoin;
        // iterating list backwards
        for (int i = listCoins.size() - 1; i >= 0; i--) {
            listCoin = listCoins.get(i);
            // getting coin in list with same value as the one from user input
            if (coin.getValue() == listCoin.getValue()) {
                this.listCoins.remove(listCoin);
                break;
            }
        }
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

    public ArrayList<Coin> getListCoins() {
        return listCoins;
    }
}
