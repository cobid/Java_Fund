package D.Methods;

import java.util.Scanner;

public class p4PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        boolean isValidLength = isValidLength(pass);
        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isValidLettersAndNumbers = onlyLettersAndNumbers(pass);
        if (!isValidLettersAndNumbers) {
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isValidCountNumbers = isValidNumbers(pass);
        if (!isValidCountNumbers) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidLength && isValidCountNumbers && isValidLettersAndNumbers) {
            System.out.println("Password is valid");
        }
    }

    private static boolean isValidLength(String pass) {
        if (pass.length() >= 6 && pass.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean onlyLettersAndNumbers(String pass) {
        for (char symbol : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidNumbers(String pass) {
        int count = 0;
        for (char symbol : pass.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
        }
        return count >= 2;
    }

}
