package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;

import static Theory.A04_SpiskiIMapu.D001_ArrayList.Task09.Student.average;

/**
 * Задача №9. Создайте ArrayList объектов класса Student (с полями name, age и averageGrade) и напишите программу,
 * которая найдет студента с самым высоким средним баллом.
 */
public class Task09 {
    public static class Student {
        private final String name;
        private final int age;
        private final double averageGrade;

        public Student(String name, int age, double averageGrade) {
            this.name = name;
            this.age = age;
            this.averageGrade = averageGrade;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getAverageGrade() {
            return averageGrade;
        }

        public String toString() {
            return "\nStudent [name = " + name + ", age = " + age + ", averageGrade = " + averageGrade + "]";
        }

        public static void average(ArrayList<Student> students) {
            double maxAverage = 0;
            for (Student s : students) {
                if (s.getAverageGrade() > maxAverage) {
                    maxAverage = s.getAverageGrade();
                }
            }
            for (Student s : students) {
                if (maxAverage == s.getAverageGrade()) {
                    System.out.println(s);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Tanya", 21, 4.5));
        students.add(new Student("Alex", 27, 3.2));
        students.add(new Student("Jess", 22, 4.0));
        students.add(new Student("Stass", 17, 3.8));
        students.add(new Student("Evgenya", 18, 4.8));
        System.out.println(students);
        average(students);
    }
}
