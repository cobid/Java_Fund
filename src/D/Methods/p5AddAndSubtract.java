package D.Methods;

import java.util.Scanner;

public class p5AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int firstResult = sumNumbers(num1, num2);
        int finalResult = subtract(firstResult, num3);
        System.out.println(finalResult);

    }
    private static int sumNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    private static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
