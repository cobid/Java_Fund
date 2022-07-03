package D.Methods;

import java.util.Locale;
import java.util.Scanner;

public class p2VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        int result = vowelsInString(input);
        System.out.print(result);
    }
    private static int vowelsInString(String input) {
        int vowelsCount = 0;
        for (int index = 0; index <= input.length() - 1; index++) {
            char currentChar = input.charAt(index);
            if (currentChar == 'a' || currentChar == 'i' || currentChar == 'u' || currentChar == 'e' || currentChar == 'o') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
