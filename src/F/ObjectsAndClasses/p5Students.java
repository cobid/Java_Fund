package F.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p5Students {
    static class Student {
        String firstName;
        String secondName;
        String age;
        String town;

        public Student(String firstName, String secondName, String age, String town) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.town = town;
        }
        public String getTown() {
            return this.town;
        }
        public String getFirstName() {
            return this.firstName;
        }
        public String getSecondName() {
            return this.secondName;
        }
        public String getAge() {
            return this.age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] student = input.split("\\s+");
            String firstName = student[0].trim();
            String secondName = student[1].trim();
            String age = student[2].trim();
            String town = student[3].trim();

            Student students = new Student(firstName, secondName, age, town);
            studentsList.add(students);

            input = scanner.nextLine();
        }
        String city = scanner.nextLine().trim();
        for (Student s : studentsList) {
            if (s.getTown().equals(city)) {
                System.out.printf("%s %s is %s years old%n", s.getFirstName(),s.getSecondName(), s.getAge());
            }

        }

    }
}
