package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p26Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //((daysInMonth * capsulesCount) * pricePerCapsule)

        int n = Integer.parseInt(scanner.nextLine());

        double totPrice = 0.0;
        double order = 0;

        for (int i = 1; i <= n; i++) {
            double pricePerCaps = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCaps = Integer.parseInt(scanner.nextLine());

            order = ((days * countCaps) * pricePerCaps);
            totPrice += order;
            System.out.printf("The price for the coffee is: $%.2f%n", order);
        }
        System.out.printf("Total: $%.2f", totPrice);

    }
}
