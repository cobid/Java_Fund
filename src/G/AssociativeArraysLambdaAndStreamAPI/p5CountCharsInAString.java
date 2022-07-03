package G.AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class p5CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().replaceAll(" ","" );
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if(charMap.containsKey(word.charAt(i))){
                charMap.put(word.charAt(i), charMap.get(word.charAt(i)) + 1);
            }else{
                charMap.put(word.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : charMap.entrySet()) {
            System.out.printf("%s -> %d%n", characterIntegerEntry.getKey(), characterIntegerEntry.getValue());
        }
    }
}
