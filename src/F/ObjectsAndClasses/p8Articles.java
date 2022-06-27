package F.ObjectsAndClasses;

import java.util.Scanner;

public class p8Articles {
    private String title;

    private String content;

    private String author;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public p8Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] articlesParts = input.split(", ");
        String title = articlesParts[0].trim();
        String content = articlesParts[1].trim();
        String author = articlesParts[2].trim();

        p8Articles articles = new p8Articles(title, content, author);
        int commandNum = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= commandNum; i++) {
            String[] commands = scanner.nextLine().split(": ");
            String command = commands[0].trim();
            String text = commands[1];
            switch (command){
                case "Edit":
                    articles.setContent(text);
                    break;
                case "ChangeAuthor":
                    articles.setAuthor(text);
                    break;
                case "Rename":
                    articles.setTitle(text);
                    break;
            }

        }
        System.out.printf("%s - %s: %s",articles.getTitle(), articles.getContent(), articles.getAuthor());

    }
}
