package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Задание №15. Создайте ArrayList объектов класса Employee (с полями name, department и salary) и напишите
 * программу, которая найдет среднюю зарплату по каждому отделу.
 */
public class Task15 {
    public static class Employee {
        private final String name;
        private final String department;
        private final int salary;

        public Employee(String name, String department, int salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "| \nИмя: " + name + " Отдел: " + department + " Заработная плата: " + salary;
        }

        public static void middleSalary(ArrayList<Employee> list) {
            Map<String, Double> averageSalaryByDepartment = list.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,
                            Collectors.averagingDouble(Employee::getSalary)));

            for (String department : averageSalaryByDepartment.keySet()) {
                System.out.println("Средняя зарплата в отделе " + department + ": " + averageSalaryByDepartment.get(department));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Alex", "01", 10000));
        list.add(new Employee("Malex", "01", 20000));
        list.add(new Employee("Hex", "02", 25000));
        list.add(new Employee("Lex", "01", 30000));
        list.add(new Employee("Pex", "03", 30000));
        System.out.println(list);
        Employee.middleSalary(list);
    }
}
