package Theory.Serialization.TaskForSeminarTree.Task02;

import java.io.*;

public class MainProgram {
    public static void main(String[] args) {
        // Student studentOne = new Student("Alex", 18, 4.5);
        // Student studentTwo = new Student("Bob", 17, 3.7);
        // Student studentTree = new Student("Candy", 21, 4.9);

        // Сериализация
        try (FileOutputStream fileOut = new FileOutputStream("student.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            Student studentOne = new Student("Alex", 18, 4.5);
            out.writeObject(studentOne);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализация
        try (FileInputStream fileIn = new FileInputStream("student.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Student studentOne = (Student) in.readObject();
            System.out.println("Имя студента: " + studentOne.getName());
            System.out.println("Возраст студента: " + studentOne.getAge());
            System.out.println("Средний балл студента: " + studentOne.getGPA());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
