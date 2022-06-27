package G.AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class p11StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List> studentGrate = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grate = Double.parseDouble(scanner.nextLine());
            if (!studentGrate.containsKey(name)) {
                studentGrate.put(name, new ArrayList<>());
            }
            studentGrate.get(name).add(grate);

        }

        studentGrate.forEach((k, v) -> {
            double sum = 0.0;
            for (int i = 0; i < v.size(); i++) {
                sum += (double) (v.get(i));
            }
            double average = sum / v.size();
            if (average >= 4.5) {
                System.out.printf("%s -> %.2f%n", k, average);
            }
        });

    }
}
