package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;

/**
 * Создайте ArrayList объектов класса Person (с полями name и age) и напишите программу, которая найдет
 * самого старшего человека в списке.
 */
public class Task03 {
    public static class Human {
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }

        public void getHuman() {
            System.out.println("| Имя " + name + " | Возраст " + age + " |");
        }

    }

    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<Human>();
        list.add(new Human("Alex", 19));
        list.add(new Human("Alex", 81));
        list.add(new Human("Alex", 15));
        list.add(new Human("Alex", 76));
        list.add(new Human("Alex", 90));

        for (Human h : list) {
            h.getHuman();
        }
        int maxAge = 0;
        for (Human h : list) {
            if (maxAge < h.getAge()) {
                maxAge = h.getAge();
            }
        }
        System.out.println(maxAge);

    }
}
