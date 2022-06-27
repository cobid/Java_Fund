package FINALEXAM;

import java.util.*;
import java.util.List;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> compilation = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            List<String> composers = new ArrayList<>();
            String[] input = scanner.nextLine().split("\\|");
            String piece = input[0];
            String composer = input[1];
            String key = input[2];
            composers.add(composer);
            composers.add(key);
            compilation.put(piece, composers);
        }

        String secondInput = scanner.nextLine();
        while (!secondInput.equals("Stop")) {
            String[] commands = secondInput.split("\\|");
            String command = commands[0];
            String currentPiece;
            switch (command) {
                case "Add":
                    currentPiece = commands[1];
                    String currentCompositor = commands[2];
                    String currentKey = commands[3];
                    if (!compilation.containsKey(currentPiece)) {
                        List<String> currentInfo = new ArrayList<>();
                        currentInfo.add(currentCompositor);
                        currentInfo.add(currentKey);
                        compilation.put(currentPiece, currentInfo);

                        System.out.printf("%s by %s in %s added to the collection!%n", currentPiece, currentCompositor, currentKey);
                    } else {
                        System.out.printf("%s is already in the collection!%n", currentPiece);
                    }
                    break;
                case "Remove":
                    currentPiece = commands[1];
                    if(compilation.containsKey(currentPiece)){
                        compilation.remove(currentPiece);
                        System.out.printf("Successfully removed %s!%n", currentPiece);
                    }else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                    }
                    break;
                case "ChangeKey":
                    currentPiece = commands[1];
                    currentKey = commands[2];
                    if(!compilation.containsKey(currentPiece)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                    }else{
                        List<String> currentInfo = compilation.get(currentPiece);
                        currentInfo.remove(1);
                        currentInfo.add(currentKey);
                        compilation.put(currentPiece, currentInfo);
                        System.out.printf("Changed the key of %s to %s!%n", currentPiece, currentKey);
                    }
                    break;
            }
            secondInput = scanner.nextLine();
        }
        compilation.entrySet().stream().sorted((e1, e2) -> {
            if (e1.getKey().compareTo(e2.getKey()) == 0) {
                return e1.getValue().get(0).compareTo(e2.getValue().get(0));
            }
            return e1.getKey().compareTo(e2.getKey());
        }).forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(),
                entry.getValue().get(0), entry.getValue().get(1)));

    }
}
