package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p22Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String pass = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char currentLetter = username.charAt(i);
            pass += currentLetter;
        }
        for (int i = 1; i <= 4; i++) {
            String input = scanner.nextLine();
            if (pass.equals(input)) {
                System.out.printf("User %s logged in.", username);
                return;
            } else {
                if (i == 4) {
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            }
        }
        System.out.printf("User %s blocked!", username);
    }
}
