package FINALEXAM;

import java.util.Scanner;
public class Problem1_final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            switch (command) {
                case "Replace":
                    String current = commandArr[1];
                    String newChar = commandArr[2];
                    if (text.contains(current)) {
                        text = text.replaceAll(current, newChar);
                    }
                    System.out.println(text);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = Integer.parseInt(commandArr[2]);
                    if (isIndexValid(startIndex, text) && isIndexValid(endIndex, text)) {
                        String firstPart = text.substring(0, startIndex);
                        String secondPart = text.substring(endIndex + 1);
                        text = firstPart + secondPart;
                        System.out.println(text);
                    } else {
                        System.out.printf("Invalid indices!%n");
                    }
                    break;
                case "Make":
                    String upperLower = commandArr[1];
                    if (upperLower.equals("Upper")) {
                        text = text.toUpperCase();
                    } else if (upperLower.equals("Lower")) {
                        text = text.toLowerCase();
                    }
                    System.out.println(text);
                    break;
                case "Check":
                    String check = commandArr[1];
                    if (text.contains(check)) {
                        System.out.printf("Message contains %s%n", check);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", check);
                    }
                    break;
                case "Sum":
                    int start = Integer.parseInt(commandArr[1]);
                    int end = Integer.parseInt(commandArr[2]);
                    int sum = 0;
                    if (isIndexValid(start, text) && isIndexValid(end, text)) {

                        String substring = text.substring(start, end + 1);

                       // for (int i = 0; i < substring.toCharArray().length; i++) {
                       //     sum += substring.charAt(i);
                       // }
                        System.out.println(sum);

                    } else {
                        System.out.printf("Invalid indices!%n");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println();
    }

    private static boolean isIndexValid(int index, String text) {
        return index >= 0 && index < text.length();
    }
}
