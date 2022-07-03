package D.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p19MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(Math.pow(num1, num2)));

    }
    private static double powNumber(double num1, int num2) {
        double result =  Math.pow(num1, num2);
        return  result;
    }
}
