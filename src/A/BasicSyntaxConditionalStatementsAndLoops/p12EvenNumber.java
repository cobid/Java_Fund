package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isEven = false;
        while (!isEven) {
            if (num % 2 == 0) {
                System.out.printf("The number is: %d", Math.abs(num));
                isEven = true;
                break;
            } else {
                System.out.println("Please write an even number.");
            }
            num = scanner.nextInt();
        }
    }
}
