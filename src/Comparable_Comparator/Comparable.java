package Comparable_Comparator;
import java.util.Comparator;
import java.util.Arrays;

class Student implements java.lang.Comparable<Student> {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other){
        return Integer.compare(this.age, other.age);
    }





}

public class Comparable {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Aman", 22),
                new Student(2, "Priya", 19),
                new Student(3, "Raj", 21)
        };
        Arrays.sort(students);
        System.out.println("Natural ordering (age):");
        for (Student student : students) {
            System.out.println(
                    student.rollno + " " + student.name + " " + student.age
            );
        }

        Comparator<Student> byRoll = new Comparator<Student>() {
            @Override
            public int compare(Student first, Student second) {
                return Integer.compare(first.rollno, second.rollno);
            }
        };
        Arrays.sort(students, byRoll);
        System.out.println("\nSorted by roll number:");
        for (Student student : students) {
            System.out.println(
                    student.rollno + " " + student.name + " " + student.age
            );
        }


        Comparator<Student> byName = new Comparator<Student>() {
            @Override
            public int compare(Student first, Student second) {
                return first.name.compareTo(second.name);
            }
        };

        Arrays.sort(students, byName);
        System.out.println("\nSorted by name:");
        for (Student student : students) {
            System.out.println(
                    student.rollno + " " + student.name + " " + student.age
            );
        }

        Comparator<Student> byAge = new Comparator<Student>() {
            @Override
            public int compare(Student first, Student second) {
                return Integer.compare(first.age, second.age);
            }
        };

        Arrays.sort(students, byAge);

        System.out.println("\nSorted by age:");
        for (Student student : students) {
            System.out.println(
                    student.rollno + " " + student.name + " " + student.age
            );
        }


    }
}
