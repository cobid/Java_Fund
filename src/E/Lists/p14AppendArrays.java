package E.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class p14AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> listOfPipe = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(listOfPipe);


        System.out.print(listOfPipe.toString().replace("[", " ")
                .replace("]", " ")
                .trim()
                .replaceAll(",", " ")
                .replaceAll("\\s+"," "));



    }
}
