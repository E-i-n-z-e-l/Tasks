package Theory.A05_PostroyeniyeInterfeysov.F002_Nasledovanie;

import java.util.Scanner;

/**
 * Создаем класс работника.
 */
public class Rabotnik {
    private String name;
    private int age;
    private int experience;
    private int salary;
    public Rabotnik(String name, int age, int experience, int salary) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getExperience() {
        return experience;
    }
    public int getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "\nИмя: " + getName()
                + "| Возраст: " + getAge()
                + "| Стаж работы: " + getExperience()
                + " | Зарплата: " + getSalary() + "\n";
    }
}
