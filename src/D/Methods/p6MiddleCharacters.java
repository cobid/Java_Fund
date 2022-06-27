package D.Methods;

import java.util.Scanner;

public class p6MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String result = middleSymbols(string);

        System.out.println(result);
    }

    private static String middleSymbols(String input) {
        if (input.length() % 2 == 0) {
            String result = "";
            result = result + input.charAt(input.length() / 2 - 1) + input.charAt(input.length() / 2);
            return result;
        } else {
            return "" + input.charAt(input.length() / 2);
        }
    }
}
