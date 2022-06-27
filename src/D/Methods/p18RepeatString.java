package D.Methods;

import java.util.Scanner;

public class p18RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int n = scanner.nextInt();
        repeatString(string, n);
    }
    private static void repeatString(String input, int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < (char)(input.length()); j++) {
                System.out.print(input.charAt(j));
            }
        }
    }
}
