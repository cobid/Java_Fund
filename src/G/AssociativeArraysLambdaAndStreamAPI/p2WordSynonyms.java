package G.AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class p2WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> wordsMap = new LinkedHashMap<>();
        for (int i = 0; i < num; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, new ArrayList<>());
                wordsMap.get(word).add(synonym);
            }else {
                wordsMap.get(word).add(synonym);
            }

        }
        for (Map.Entry<String, List<String>> stringListEntry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n", stringListEntry.getKey(), String.join(", ", stringListEntry.getValue()));

        }


    }
}
