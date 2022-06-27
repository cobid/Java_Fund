package F.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p4Songs {
    static class Song {
        String type;
        String name;
        String time;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] info = scanner.nextLine().split("_");

            String type = info[0];
            String name = info[1];
            String time = info[2];

            Song currentSong = new Song();
            currentSong.setType(type);
            currentSong.setName(name);
            currentSong.setTime(time);
            songs.add(currentSong);
        }
        String command = scanner.nextLine();
         if (command.equals("all")){
             for (Song item : songs){
                 System.out.println(item.getName());
             }
         }else {
             for (Song item : songs){
                 if (item.getType().equals(command)){
                 System.out.println(item.getName());
                 }
             }
         }
    }
}
