import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void showMenu(Safe safe) {
        boolean exit = false;
        Coin choosedCoin;

        while (!exit) {
            System.out.println("\n=== SAFE ===");
            System.out.println("by: Raphael Valderrama Torres");
            System.out.println("RU: 4383905");
            System.out.println("============");
            System.out.println("""
                1 - Add coin
                2 - Remove coin
                3 - List coins
                4 - Calculate total converted to R$
                0 - Finish""");

            String userInput = scanner.next();

            if (userInput.equals("0")) {
                System.out.println("\n== FINISH ==");
                break;
            }

            switch (userInput) {
                case "1": // add coin
                    choosedCoin = chooseCoin();
                    safe.add(choosedCoin);
                    break;
                case "2": // remove coin
                    if(safe.getListCoins().isEmpty()) {
                        System.out.println("Empty Safe!");
                        break;
                    }
                    choosedCoin = chooseCoin();
                    safe.remove(choosedCoin);
                    break;
                case "3": // list coins
                    if(safe.getListCoins().isEmpty()) {
                        System.out.println("Empty Safe!");
                        break;
                    }
                    safe.list();
                    break;
                case "4": // calculate total in R$
                    safe.totalAmountConverted();
                    break;
                default:
                    System.out.println("Not a valid option!");
            }
        }
    }

    private static Coin chooseCoin() {
        // Showing coins optional in terminal
        System.out.println("""
                \nChoose coin:
                1 - Euro
                2 - Dollar
                3 - Real""");

        // getting user input
        String coinChoice = scanner.next();

        System.out.println("\nEnter value:");
        double value = scanner.nextDouble();

        // returning coin based on user choice
        return switch (coinChoice) {
            case "1" -> new Euro(value);
            case "2" -> new Dollar(value);
            case "3" -> new Real(value);
            default -> null;
        };
    }
}
