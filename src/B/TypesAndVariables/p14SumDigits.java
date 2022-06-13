package B.TypesAndVariables;

import java.util.Scanner;

public class p14SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            char number = num.charAt(i);
            sum += Integer.parseInt("" + number);

        }
        System.out.println(sum);
    }
}
