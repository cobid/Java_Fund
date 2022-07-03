package FINALEXAM_Preparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMessages = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attack>[AD])![^@!:>-]*->(?<soldierCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackersPlanet = new ArrayList<>(); // type A
        List<String> destroyedPlanet = new ArrayList<>(); //type D
        for (int i = 1; i <= countMessages; i++) {
            String encrypted = scanner.nextLine();
            String decrypted = getDecryptedMessage(encrypted);


            Matcher matcher = pattern.matcher(decrypted);

            if(matcher.find()) {
                String planetName = matcher.group("planetName");
                int population = Integer.parseInt(matcher.group("population"));
                String attack = matcher.group("attack");
                int soldierCount = Integer.parseInt(matcher.group("soldierCount"));

                if(attack.equals("A")){
                    attackersPlanet.add(planetName);
                } else if(attack.equals("D")){
                    destroyedPlanet.add(planetName);
                }
            }
        }

        System.out.println("Attacked planets: " + attackersPlanet.size());
        Collections.sort(attackersPlanet);
        attackersPlanet.forEach(planet -> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + destroyedPlanet.size());
        Collections.sort(destroyedPlanet);
        destroyedPlanet.forEach(planet -> System.out.println("-> " + planet));

    }

    private static String getDecryptedMessage(String encryptedMessage) {
        int countLetters = getSpecialLetterCount(encryptedMessage);
        StringBuilder decryptedMessage = new StringBuilder();
        for (char symbol : encryptedMessage.toCharArray()) {
            char newSymbol = (char) (symbol - countLetters);
            decryptedMessage.append(newSymbol);
        }
        return decryptedMessage.toString();

    }

    private static int getSpecialLetterCount(String encrypted) {
        int count = 0;
        for (char symbol : encrypted.toLowerCase().toCharArray()) {
            if (symbol == 's' || symbol == 'a' || symbol == 't' || symbol == 'r') {
                count++;
            }
        }
        return count;
    }

}
