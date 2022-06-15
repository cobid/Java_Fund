package C.Arrays;

import java.util.Scanner;

public class p8Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] passengers = new int[num];
        for (int i = 0; i < num; i++) {
            passengers[i] = Integer.parseInt(scanner.nextLine());
            sum += passengers[i];
            System.out.print(passengers[i] + " ");
        }
        System.out.printf("%n%d", sum);


    }
}
