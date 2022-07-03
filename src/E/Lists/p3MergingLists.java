package E.Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p3MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> line1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> line2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultNumbers = new ArrayList<>();

        int size = Math.min(line1.size(), line2.size());
        for (int i = 0; i < size; i++) {
            int resultLine1 = line1.get(i);
            int resultLine2 = line2.get(i);
            resultNumbers.add(resultLine1);
            resultNumbers.add(resultLine2);
        }
        if (line1.size() > line2.size()) {
            resultNumbers.addAll(line1);
        } else if (line2.size() > line1.size()) {
            resultNumbers.addAll(line2);
        }
        for (int item : resultNumbers) {
            System.out.print(item + " ");
        }

    }

}

