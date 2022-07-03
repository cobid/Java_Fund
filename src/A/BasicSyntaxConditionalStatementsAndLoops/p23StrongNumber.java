package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p23StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int num = number;
        int allDigitFac = 0;
        int factorial = 1;

        for (int i = 0; i < input.length(); i++) {
            int digit = num % 10;
            num /= 10;


            for (int j = 1; j <= digit; j++) {
                factorial *= j;
            }
            allDigitFac += factorial;
            factorial = 1;
        }
        if (allDigitFac == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
