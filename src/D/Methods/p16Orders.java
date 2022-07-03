package D.Methods;

import java.util.Scanner;

public class p16Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOrder = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        orders(nameOrder, quantity);
    }
    private static void orders( String product, int quantity) {
        double price = 0.0;
        if (product.equals("coffee")) {
            price = quantity * 1.50;
            System.out.printf("%.2f",price);
        }
        if (product.equals("water")) {
            price = quantity * 1.00;
            System.out.printf("%.2f",price);
        }
        if (product.equals("coke")) {
            price = quantity * 1.40;
            System.out.printf("%.2f",price);
        }
        if (product.equals("snacks")) {
            price = quantity * 2.00;
            System.out.printf("%.2f",price);
        }
    }
}
