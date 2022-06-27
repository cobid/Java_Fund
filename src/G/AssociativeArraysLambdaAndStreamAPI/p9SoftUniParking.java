package G.AssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p9SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> registerAuto = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] ticket = scanner.nextLine().split(" ");
            String command = ticket[0];
            String nameCostumer = ticket[1];
            if (command.equals("register")){
                String plateCar = ticket[2];
                if(!registerAuto.containsKey(nameCostumer)){
                registerAuto.put(nameCostumer, plateCar);
                    System.out.printf("%s registered %s successfully%n", nameCostumer, plateCar);
                }else{
                    System.out.printf("ERROR: already registered with plate number %s%n", registerAuto.get(nameCostumer));
                }
            }else  if(command.equals("unregister")){
                if(!registerAuto.containsKey(nameCostumer)){
                    System.out.printf("ERROR: user %s not found%n", nameCostumer);
                }else{
                    registerAuto.remove(nameCostumer);
                    System.out.printf("%s unregistered successfully%n", nameCostumer);
                }
            }

        }
        registerAuto.forEach((k, v)-> System.out.printf("%s => %s%n", k, v));


    }
}
