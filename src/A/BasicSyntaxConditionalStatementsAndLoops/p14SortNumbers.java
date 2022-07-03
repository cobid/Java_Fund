package A.BasicSyntaxConditionalStatementsAndLoops;

import java.sql.Array;
import java.util.*;

public class p14SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        List<Integer> arr = new ArrayList();
        arr.add(n1);
        arr.add(n2);
        arr.add(n3);

        // keep other elements as it is.
        Collections.sort(arr);

        for(int i = arr.size()-1; i >= 0; i--){
            System.out.println(arr.get(i));
        }
    }
}

