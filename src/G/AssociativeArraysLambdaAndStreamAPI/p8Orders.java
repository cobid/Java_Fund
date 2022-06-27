package G.AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class p8Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<Double>> orders = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            for (int i = 0; i < input.length(); i++) {
                String[] products = input.split(" ");
                String nameProduct = products[0];
                double priceProduct = Double.parseDouble(products[1]);
                double quantityProduct = Double.parseDouble(products[2]);
                if (orders.containsKey(nameProduct)) {
                    orders.get(nameProduct).set(0, priceProduct);
                    orders.get(nameProduct).set(1, orders.get(nameProduct).get(1) + quantityProduct);
                } else {
                    orders.put(nameProduct, new ArrayList<>());
                    orders.get(nameProduct).add(priceProduct);
                    orders.get(nameProduct).add(quantityProduct);
                }
                input = scanner.nextLine();
            }
        }
        orders.forEach((k,v)-> System.out.printf("%s -> %.2f%n", k, v.get(0) * v.get(1)));
    }
}
