import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Safe safe = new Safe();

        Menu.showMenu();

        String userInput = scanner.next();

        switch (userInput) {
            case "1": // add coin
                safe.add();
                break;
            case "2": // remove coin
                safe.remove();
                break;
            case "3": // list coins
                break;
            case "4": // calculate total in R$
                break;
        }

        // instanciar o cofre
        // menu: adicionar/remover/listar moedas
        // valor total convertido em Real
    }
}