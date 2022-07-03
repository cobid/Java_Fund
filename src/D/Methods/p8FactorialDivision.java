package D.Methods;

import java.util.Scanner;

public class p8FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        long resultFactorialFirst = factorialFromInteger(num1);
        long resultFactorialSecond = factorialFromInteger(num2);

        double result = resultFactorialFirst * 1.0 / resultFactorialSecond;

        System.out.printf("%.2f", result);
    }

    private static long factorialFromInteger(int num) {
        long resultFactorial = 1;
        for (int i = 1; i <= num ; i++) {
            resultFactorial = resultFactorial * i;
        }
        return resultFactorial;
    }
}
