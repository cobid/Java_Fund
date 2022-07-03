package E.Lists;



import java.util.*;

public class p6ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> product = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String currentProduct = scanner.nextLine();
            product.add(currentProduct);
        }

        Collections.sort(product);
        for (int i = 0; i < product.size(); i++) {
            System.out.printf("%d.%s%n", 1 + i, product.get(i));
        }
    }
}
