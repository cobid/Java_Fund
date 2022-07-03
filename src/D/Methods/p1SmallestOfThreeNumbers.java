package D.Methods;

import java.util.Scanner;

public class p1SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        SmallestOfThree(num1, num2, num3);

    }

    private static void SmallestOfThree(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            System.out.print(num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.print(num2);
        }else {
            System.out.print(num3);
        }
    }
}
