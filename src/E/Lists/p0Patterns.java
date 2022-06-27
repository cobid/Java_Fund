package E.Lists;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class p0Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lines = scanner.nextLine();
        //----------------------------------------------------------------------

        String[] guest = scanner.nextLine().split(" ");
        //----------------------------------------------------------------------
        List<Integer> collection = new ArrayList<Integer>();

        //----------------------------------------------------------------------
        List<String> line = Arrays.stream(lines.split(" ")).collect(Collectors.toList());
        //----------------------------------------------------------------------
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //----------------------------------------------------------------------
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());
        //----------------------------------------------------------------
        //     String output = " ";
        //     for (Double item : items) {
        //     output += (new DecimalFormat("0.#").format(item) + delimiter);
        //     }
        // принтиране на масив с FOR:
        for (int i = 0; i < guest.length; i++) {
            System.out.print(guest[i] + " ");
            // с FOREACH:

            // for (int item : guest) {
            //    System.out.print(item + " ");
            //    // с String Join:
            //   System.out.println(String.join(", ", numbersAsStringArr));

            //o Int масив със String.join() – трябва да създаден нов String[], в който да сложим елементите и да
            //ги направим от числа в String

            int[] integerArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            String[] numbersAsStringArr = new String[integerArr.length];
            for (int k = 0; i < integerArr.length; i++) {
                numbersAsStringArr[i] = String.valueOf(integerArr[i]);
            }
            System.out.println(String.join(", ", numbersAsStringArr));

            // o Принтиране с replaceAll() – няма значение какъв е типът на данните в масива

            System.out.println(Arrays.toString(integerArr).replaceAll("[\\[\\]]",
                    ""));


            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
            //-----------------------------------------------------------------
            for (int m = 0; i < numbers.size(); i++) {
                System.out.printf("%d.%s%n", 1 + i, numbers.get(i));
            }
            //------------------------------------------------------------------
            for (int j = 0; i < line.size(); i++) {
                System.out.println(line.get(i));
            }
            //- Методи
            //- integerList.get(index)– връща елемента на индекса, подаден като аргумент в скобите
            //- integerList.size()– връща цяло число – брой на елементите в листа
            //- integerList.indexOf(element) – връща цяло число – Индекс, на който се намира елемента
            //- integerList.isEmpty()– връща булева стойност: true – при празен лист, с 0 елемента
            //- integerList.contains(element) – връща булева стойност: true – ако елемента се съдържа в
            //листа
            //- integerList.add(element) – добавя елемента в края на листа
            //- integerList.add(index, element) – добавя елемента на индекс, който сме подали като
            //аргумент
            //- integerList.set(1, 333) – замества елемент на конкретен индекс с новият елемент
            //- integerList.remove(index) – премахва елемент на даден индекс
            //- integerList.remove(Integer.valueOf(elment)) – премахва елемент, ако съществува в
            //листа. Ако елемента е примитивен тип данни (double, int), чрез ValueOf() трябва да го превърнем в
            //референтен тип данни, за да знае компилатора, че това е елемент. Ако го оставим int компилатора ще
            //припознае числото като индекс, а не като елемент от листа. Ако елемента не съществува няма да ни
            //даде ексепшън, просто ще игнорира командата.
            //- integerList.addAll(numList) – може да добавим всички елементи от една колекция в
            //друга. Добавят се в края на колекцията.
            //- Collections.sort(integerList)- сортираме елементите в листа
            //- Collections.reverse(integerList) – обръщаме реда на елементите в листа, независимо
            //от това дали са сортирани или не.


            //REMOVE ALL
            //Collection<Integer> collection = new ArrayList<Integer>();
            //collection.add(num);
            //nums.removeAll(collection);
            //------------------------------------------------------------------
            //nums.removeAll(Arrays.asList(element));

            //ПРИНТИРАНЕ НА ЛИСТ List<>
            //o принтиране с for

            //for (int i = 0; i < integerList.size(); i++) {
            //System.out.print(integerList.get(i) + " ");

            //o Принтиране с foreach

            //for (int item : integerList) {
            //System.out.print(item + " ");

            //o Принтиране със String.join() – с този метод може да се принтира само String колекция

            //System.out.println(String.join(", ", stringList));
            //o Int лист със String.join() – трябва да създаден нов List<String>, в който да сложим елементите и
            //да ги направим от числа в String
            //

            //o Принтиране с replaceAll() – няма значение какъв е типът на данните в листа

            //for (int i = 0; i < integerList.size(); i++) {
            //System.out.print(integerList.get(i) + " ");
            //}
            //
            //for (int item : integerList) {
            //System.out.print(item + " ");
            //}
            //
            //List<Integer> integerList = Arrays
            //.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
            //.collect(Collectors.toList());
            //List<String> stringList = new ArrayList<>(integerList.size());
            //for (int i = 0; i < integerList.size(); i++) {
            //stringList.add(String.valueOf(integerList.get(i)));
            //}
            //System.out.println(String.join(", ", stringList));
            //System.out.println(String.join(", ", stringList));
            //
            //System.out.println(integerList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}


