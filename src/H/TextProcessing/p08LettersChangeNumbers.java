package H.TextProcessing;

import java.util.Scanner;

public class p08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
         String input = scanner.nextLine();
         String[] passwords = input.split("\\s+");

         double totalSum = 0;

        for (String password: passwords) {
            double modifiedNumber = getModifiedNumber(password);
            totalSum += modifiedNumber;
        }

        System.out.printf("%.2f", totalSum);
    }

    private static double getModifiedNumber(String password) {
        char firstLetter = password.charAt(0);
        char lastLetter = password.charAt(password.length() - 1);

        //First option
        StringBuilder builder = new StringBuilder(password);
        builder.deleteCharAt(firstLetter);
        builder.deleteCharAt(firstLetter);

        double number = Double.parseDouble(builder.toString());
        //return number;

        //Second option
        double number2 = Double.parseDouble(password.replace(Character.toString(firstLetter), "").replace(Character.toString(lastLetter), "").trim());

        // Third option
        double number3 = Double.parseDouble(password.substring(1, password.indexOf(lastLetter)));

        //Проверка за голяма буква
        // аски -> >=65 и <=90
        //Проверка за malka буква
        // аски -> >=97 и <=122
        if(Character.isUpperCase(firstLetter)){
            int positionUpperLetter = (int)firstLetter - 64;
            number = number /positionUpperLetter;

        } else {
            int positionlowerLetter = (int)firstLetter - 96;
            number = number * positionlowerLetter;
        }

        if(Character.isUpperCase(lastLetter)){
            int positionUpperLetter = (int)lastLetter - 64;
            number = number - positionUpperLetter;

        } else {
            int positionlowerLetter = (int)lastLetter - 96;
            number = number + positionlowerLetter;
        }

        return number;

    }
}
