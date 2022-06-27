package D.Methods;

import java.util.Scanner;

public class p14PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= num; i++) {
            triangle(1, i);
        }
        for (int i = num - 1; i >= 1; i--) {
            triangle(1, i);
        }

    }

    public static void triangle(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
