package F.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class p7AdvertisementMessage {
    private  String laudatoryPhrase;
    private  String event;
    private  String author;
    private  String city;

    public String getLaudatoryPhrase() {
        return laudatoryPhrase;
    }

    public void setLaudatoryPhrase(String laudatoryPhrase) {
        this.laudatoryPhrase = laudatoryPhrase;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    public p7AdvertisementMessage(String laudatoryPhrase, String event, String author, String city) {
        this.laudatoryPhrase = laudatoryPhrase;
        this.event = event;
        this.author = author;
        this.city = city;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles.I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva" };
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        int numMessage = Integer.parseInt(scanner.nextLine());
        Random rnd = new Random();


        for (int i = 1; i <= numMessage ; i++) {
            int randomPhraseNum = rnd.nextInt(phrases.length);
            int randomEventsNum = rnd.nextInt(events.length);
            int randomCitiesNum = rnd.nextInt(cities.length);
            int randomAuthorNum = rnd.nextInt(author.length);
            System.out.println(phrases[randomPhraseNum] + " " + events[randomEventsNum] + " " + author[randomAuthorNum] + " - " +  cities[randomCitiesNum]);


        }





    }
}
