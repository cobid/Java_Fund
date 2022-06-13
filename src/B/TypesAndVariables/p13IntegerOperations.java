package B.TypesAndVariables;

import java.util.Scanner;

public class p13IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int forthNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        sum = ((firstNumber + secondNumber) / thirdNumber) * forthNumber;
        System.out.print(sum);

    }
}
