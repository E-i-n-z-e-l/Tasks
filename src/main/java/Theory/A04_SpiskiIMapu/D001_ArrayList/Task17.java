package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Задача № 17. Создайте ArrayList объектов класса Car (с полями brand, model и year) и напишите программу, которая
 * отсортирует список по году выпуска автомобилей.
 */
public class Task17 {
    public static class Car implements Comparable<Car> {
        private final String brand;
        private final String model;
        private final int year;

        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
        public String getBrand() {
            return brand;
        }
        public String getModel() {
            return model;
        }
        public int getYear() {
            return year;
        }
        public String toString() {
            return "\nМарка машины: " + brand + "; Модель машины " + model + "; Год выпуска машины: " + year;
        }

        @Override
        public int compareTo(Car o) {
            return this.getYear() - o.getYear(); // Учим сравнивать даты выпуска машин.
        }
    }

    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Car("BMW", "A4", 2015));
        carList.add(new Car("BMW", "A5", 2020));
        carList.add(new Car("BMW", "A3", 2009));
        carList.add(new Car("BMW", "A1", 2000));
        carList.add(new Car("BMW", "A2", 2007));
        System.out.println(carList);
        Collections.sort(carList);
        System.out.println(carList);
    }
}
/**
 Мы берем один объект машины (this), год выпуска этой машины и вычитаем из него год выпуска другой машины
 (той, с которой сравниваем объект). Если год выпуска первой машины больше, метод вернет int > 0.
 А значит, машина this > машины о.

 Если наоборот — год выпуска второй машины (о) больше, значит метод вернет отрицательное число,
 а следовательно, о > this.

 Ну а если они равны, метод вернет 0.

 Такого простого механизма уже достаточно, чтобы сортировать коллекции объектов Car! Больше ничего делать не нужно.
 */
