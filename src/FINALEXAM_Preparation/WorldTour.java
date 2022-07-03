package FINALEXAM_Preparation;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] commandArr = input.split(":");
            String command = commandArr[0];
            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(commandArr[1]);
                    String string = commandArr[2];
                    if (indexisValid(index,text)) {
                        String firstPart = text.substring(0, index);
                        String secondPart = text.substring(index);
                        text = firstPart + string + secondPart;
                        System.out.println(text);
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = Integer.parseInt(commandArr[2]);
                    if (indexisValid(startIndex, text)&& indexisValid(endIndex, text)) {
                        String firstPart = text.substring(0, startIndex);
                        String secondPart = text.substring(endIndex + 1);
                        text = firstPart + secondPart;
                    }
                    break;
                case "Switch":
                    String oldString = commandArr[1];
                    String newString = commandArr[2];
                    if (text.contains(oldString)) {
                        text = text.replaceAll(oldString, newString);
                    }
                    break;
            }
            System.out.println(text);
            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", text);
    }

    public static boolean indexisValid(int index, String stop) {
        return index >= 0 && index < stop.length();
    }
}