package FINALEXAM_Preparation;


import java.util.Scanner;


public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String massage = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String[] commands = input.split("\\|");
            String comandsName = commands[0];
            switch (comandsName) {
                case "Move":
                    massage = move(massage, Integer.parseInt(commands[1]));
                    break;
                case "Insert":
                    massage = insert(massage, Integer.parseInt(commands[1]), commands[2]);
                    break;
                case "ChangeAll":
                    massage = changeAll(massage, commands[1], commands[2]);
                    break;
                default:
                    throw new IllegalStateException("Unknow command ports" + comandsName + "in" + input);


            }



            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", massage);
    }

    private static String insert(String massage, int index, String charImport) {
        String firstPart = massage.substring(0, index);
        String secondPart = massage.substring(index);
        return firstPart + charImport + secondPart;
    }
    private static String changeAll(String massage, String command, String command1) {
        return massage.replace(command,command1);
    }
    private static String move(String massage, int lenght) {
        String firstPart = massage.substring(0, lenght);
        String secondPart = massage.substring(lenght);
        return secondPart + firstPart;
    }
}
