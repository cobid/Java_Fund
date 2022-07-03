package FINALEXAM;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2_final {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            Pattern pattern = Pattern.compile("\\|(?<name>[A-Z]{4,})\\|:#(?<title>[A-Za-z]+ [A-Za-z]+)\\#");
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                String bossName = matcher.group(1);
                String title = matcher.group(2);
                int lentName = matcher.group(1).length();
                int lentTitle = matcher.group(2).length();
                System.out.printf("%s, The %s%n" +
                        ">>" + "Strength: %d%n" +
                        ">>" + "Armor: %d%n", bossName, title, lentName, lentTitle);
            } else {
                System.out.printf("Access denied!%n");
            }

        }
    }
}
