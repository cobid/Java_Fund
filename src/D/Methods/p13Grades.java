package D.Methods;

import java.util.Scanner;

public class p13Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        grades(num);
    }
    private static void grades(double number) {
        if (number >= 2.00 && number <= 2.99){
            System.out.println("Fail");
        }
        if (number >= 3.00 && number <= 3.49){
            System.out.println("Poor");
        }
        if (number >= 3.50 && number <= 4.49){
            System.out.println("Good");
        }
        if (number >= 4.50 && number <= 5.49){
            System.out.println("Very good");
        }
        if (number >= 5.50 && number <= 6.00){
            System.out.println("Excellent");
        }
    }
}
