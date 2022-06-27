package G.AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class p3OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = scanner.nextLine().split(" ");
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String word : wordsArr) {
            String toOverCase = word.toLowerCase();
            if (counts.containsKey(toOverCase)) {
                counts.put(toOverCase, counts.get(toOverCase) + 1);
            } else {
                counts.put(toOverCase, 1);
            }
        }
        ArrayList<String> oddWords = new ArrayList<>();
        for (Map.Entry<String, Integer> value : counts.entrySet()) {
            if (value.getValue() % 2 == 1) {
                oddWords.add(value.getKey());
            }

        }
        for (int i = 0; i < oddWords.size(); i++) {
            System.out.print(oddWords.get(i));
            if (i < oddWords.size()-1){
                System.out.print(", ");
            }

        }


    }
}
