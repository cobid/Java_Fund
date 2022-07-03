package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p24VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0.0;
        double price = 0.0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.0 || coins == 2.0) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (sum >= 2.0) {
                        System.out.printf("Purchased %s%n", product);
                        price = 2.0;
                        sum -= price;
                    }else{
                        System.out.println("Sorry, not enough money");
                        System.out.printf("Change: %.2f", sum);
                        return;
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        System.out.printf("Purchased %s%n", product);
                        price = 0.7;
                        sum -= price;
                    }else{
                        System.out.println("Sorry, not enough money");
                        System.out.printf("Change: %.2f", sum);
                        return;
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        System.out.printf("Purchased %s%n", product);
                        price = 1.5;
                        sum -= price;
                    }else{
                        System.out.println("Sorry, not enough money");
                        System.out.printf("Change: %.2f", sum);
                        return;
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        System.out.printf("Purchased %s%n", product);
                        price = 0.8;
                        sum -= price;
                    }else{
                        System.out.println("Sorry, not enough money");
                        System.out.printf("Change: %.2f", sum);
                        return;
                    }
                    break;
                case "Coke":
                    if (sum >= 1.0) {
                        System.out.printf("Purchased %s%n", product);
                        price = 1.0;
                        sum -= price;
                    }else{
                        System.out.println("Sorry, not enough money");
                        System.out.printf("Change: %.2f", sum);
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            product = scanner.nextLine();
            if (product.equals("End") || sum < 0) {
                System.out.printf("Change: %.2f%n", sum);
            }
        }
    }
}


