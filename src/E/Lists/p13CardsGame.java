package E.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p13CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> cardsPlayer1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> cardsPlayer2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        while (cardsPlayer1.size() != 0 && cardsPlayer2.size() != 0) {
            int firstPlayCard1 = cardsPlayer1.get(0);
            int secondPlayCard2 = cardsPlayer2.get(0);
            if (firstPlayCard1 > secondPlayCard2) {
                cardsPlayer1.add(firstPlayCard1);
                cardsPlayer1.add(secondPlayCard2);
                cardsPlayer1.remove(0);
                cardsPlayer2.remove(0);
            } else if (secondPlayCard2 > firstPlayCard1) {
                cardsPlayer2.add(secondPlayCard2);
                cardsPlayer2.add(firstPlayCard1);
                cardsPlayer1.remove(0);
                cardsPlayer2.remove(0);
            }else{
                cardsPlayer1.remove(0);
                cardsPlayer2.remove(0);
            }


        }
        if (cardsPlayer1.size() == 0) {
            System.out.printf("Second player wins! Sum: %d", sumCounts(cardsPlayer2));
        } else if (cardsPlayer2.size() == 0) {
            System.out.printf("First player wins! Sum: %d", sumCounts(cardsPlayer1));
        }


    }

    private static int sumCounts(List<Integer> leftCard) {
        int sum = 0;
        for (int number : leftCard) {
            sum += number;
        }
        return sum;
    }
}
