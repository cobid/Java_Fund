package B.TypesAndVariables;

import java.util.Scanner;

public class p10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            number = i;
                while (number > 0) {
                    sum += number % 10;
                    number = number / 10;
                }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
            sum = 0;
        }
    }
}
