package H.TextProcessing;

import java.util.Scanner;

public class p01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        while (!string.equals("end")) {
            String result = " ";
            for (int i = string.length() - 1; i >= 0; i--) {
                result += string.charAt(i);
            }
            System.out.printf("%s =%s%n", string, result);
            string = scanner.nextLine();
        }

    }
}
