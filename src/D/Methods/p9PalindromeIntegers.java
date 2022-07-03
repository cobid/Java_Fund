package D.Methods;

import java.util.Scanner;

public class p9PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            System.out.println(findPalindrome(input));
            input = scanner.nextLine();
        }
    }

    private static boolean findPalindrome(String input) {
        for (int index = 0; index < input.length() / 2; index++) {
            if (input.charAt(index) != input.charAt(input.length() - 1 - index)) {
                return false;
            }
        }
        return true;
    }
}
