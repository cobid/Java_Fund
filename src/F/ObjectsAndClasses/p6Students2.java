package F.ObjectsAndClasses;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;


public class p6Students2 {
    static class Student {
        String firstName;
        String secondName;
        String age;
        String town;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }

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

            if (isStudentExisting(studentsList, firstName, secondName) != null) {
                Student foundStudent = isStudentExisting(studentsList, firstName, secondName);
                foundStudent.setAge(age);
                foundStudent.setTown(town);
            } else {
                Student newStudent = new Student(firstName, secondName, age, town);
                studentsList.add(newStudent);
            }
            input = scanner.nextLine();
        }
        String city = scanner.nextLine().trim();
        for (Student s : studentsList) {
            if (s.getTown().equals(city)) {
                System.out.printf("%s %s is %s years old%n", s.getFirstName(), s.getSecondName(), s.getAge());
            }

        }


    }

    private static Student isStudentExisting(List<Student> studentList, String firstName, String secondName) {
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)) {
                return student;
            }
        }
        return null;
    }

    //rivate static Student getStudent(List<Student> studentList, String firstName, String secondName) {
    //   Student existingStudent = null;
    //   for (Student student : studentList) {
    //       if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)) {
    //           existingStudent = student;
    //       }
    //   }
    //   return existingStudent;


}



