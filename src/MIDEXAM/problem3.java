package MIDEXAM;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> books = Arrays.stream(scanner.nextLine().split("\\&")).collect(Collectors.toList());
        String line = scanner.nextLine();
        while (!line.equals("Done")) {
            List<String> commands = Arrays.stream(line.split("\\|")).collect(Collectors.toList());
            String firstCommand = commands.get(0).trim();
            String bookName1 = commands.get(1).trim();
            switch (firstCommand) {
                case "Add Book":
                    if (!books.contains(bookName1)) {
                        books.add(0, bookName1);
                    }
                    break;
                case "Take Book":
                    if (books.contains(bookName1)) {
                        books.remove(bookName1);
                    }
                    break;
                case "Swap Books":
                    String bookName2 = commands.get(2).trim();
                    swapBooks(books, bookName1, bookName2);
                    break;
                case "Insert Book":
                    if (!books.contains(bookName1)) {
                        books.add(bookName1);
                    }
                    break;
                case "Check Book":
                    int bookIndex = Integer.parseInt(bookName1);
                    if(isValidIndex(books, bookIndex)){
                        System.out.println(books.get(bookIndex));
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        printBooks(books);
    }
    public static void swapBooks(List<String> books, String book1, String book2) {
        if (books.contains(book1) && books.contains(book2)) {
            int bookForMoveIndex1 = books.indexOf(book1);
            int bookForMoveIndex2 = books.indexOf(book2);
            books.set(bookForMoveIndex1, book2);
            books.set(bookForMoveIndex2, book1);
        }
    }
    public static boolean isValidIndex(List<String> books, int index) {
        return (index >= 0 && index <= books.size() - 1);
    }
    public static void printBooks(List<String> books){
        for (int i = 0; i < books.size() ; i++) {
            if(i!=books.size()-1){
                System.out.print(books.get(i) + ", ");
            }else {
                System.out.println(books.get(i));
            }
        }
    }
}

