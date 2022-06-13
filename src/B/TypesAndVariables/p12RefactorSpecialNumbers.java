package B.TypesAndVariables;

import java.util.Scanner;

public class p12RefactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int number = 0;
        int sum = 0;
        boolean isTrue = false;
        for (int i = 1; i <= input; i++) {
             number = i;
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            isTrue = (sum == 5) || (sum == 7) || (sum == 11);

            String state = (Boolean.toString(isTrue)).substring(0, 1).toUpperCase() + (Boolean.toString(isTrue)).substring(1);

            System.out.printf("%d -> %s%n", i, state);

            sum = 0;
        }

    }
}
