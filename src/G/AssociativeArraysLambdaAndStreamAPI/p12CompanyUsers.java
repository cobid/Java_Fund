package G.AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class p12CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List> employersList = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] employer = input.split(" -> ");
            String company= employer[0];
            String id = employer[1];
            if (!employersList.containsKey(company)) {
                employersList.put(company, new ArrayList<>());
                employersList.get(company).add(id);
            }else{
                if(!employersList.get(company).contains(id)){
                    employersList.get(company).add(id);
                }
            }
            input = scanner.nextLine();
        }
        employersList.forEach((k, v) -> {
            System.out.printf("%s%n", k);
            v.forEach(name -> System.out.printf("-- %s%n", name));
        });
    }
}
