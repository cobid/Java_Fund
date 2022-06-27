package D.Methods;

import java.util.Scanner;

public class p17CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        double area = rectangleArea(num1, num2);
        System.out.printf("%.0f", area);
    }
    private static double rectangleArea(double num1, double num2) {
        double width = Double.parseDouble(String.valueOf(num1));
        double height = Double.parseDouble(String.valueOf(num2));
        return width * height;
    }
}
