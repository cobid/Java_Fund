package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num2 > 10) {
            System.out.printf("%d X %d = %d%n", num1, num2, num1 * num2);
        }
        for (int i = num2; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", num1, i, num1 * i);
        }
    }
}
