package FINALEXAM_Preparation;

import java.util.*;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newPass = "";
        String text = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] commandInput = input.split(" ");
            String command = commandInput[0];
            switch (command) {
                case "TakeOdd":
                    for (int i = 0; i < text.length(); i++) {
                        if (i % 2 == 1) {
                            String symbul = Character.toString(text.charAt(i));
                            newPass += symbul;
                        }
                    }
                    text = newPass;
                    System.out.printf("%s%n", text);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commandInput[1]);
                    int numRemove = Integer.parseInt(commandInput[2]);
                    String firstPart = text.substring(0, index);
                    String secondPart = text.substring(index + numRemove);
                    text = firstPart + secondPart;
                    System.out.printf("%s%n", text);
                    break;
                case "Substitute":
                    String substring = commandInput[1];
                    String substitute = commandInput[2];
                    if (text.contains(substring)) {
                        text = text.replaceAll(substring, substitute);
                        System.out.printf("%s%n", text);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", text);
    }
}
