package F.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P4Articles2 {
    private String title;
    private String content;
    private String author;


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
    }

    public P4Articles2(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<P4Articles2> listBooks = new ArrayList<>();
        int numOfBooks = Integer.parseInt(scanner.nextLine());
        for (int books = 1; books <= numOfBooks; books++) {
            String input = scanner.nextLine();
            String[] book = input.split(", ");
            String title = book[0].trim();
            String content = book[1].trim();
            String author = book[2].trim();
            P4Articles2 newBook = new P4Articles2(title, content, author);
            listBooks.add(newBook);
        }
        String secondInput = scanner.nextLine();
        if (secondInput.equals("title")||secondInput.equals("content")||secondInput.equals("author")){
            for(P4Articles2 item : listBooks){
                System.out.println(item);
            }
        }



    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}


