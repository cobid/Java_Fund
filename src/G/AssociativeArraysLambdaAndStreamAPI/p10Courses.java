package G.AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class p10Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List> students = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" : ");
            String course = data[0];
            String studentName = data[1];
            if (!students.containsKey(course)) {
                students.put(course, new ArrayList<>());
            }
            students.get(course).add(studentName);
            input = scanner.nextLine();
        }

        students.forEach((k, v) -> {
            System.out.printf("%s: %d%n", k, v.size());
            v.forEach(name -> System.out.printf("-- %s%n", name));
        });
    }


}

