package Theory.Functions.C007_FormatirovaniyeChisel;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;

/**
 * Форматирование чисел
 * <p>
 * NumberFormat - это абстрактный класс, предназначенный для форматирования чисел в различных стилях,
 * таких как обычное число, валюта и проценты.
 * <p>
 * — метод getNumberInstance() — возвращает объект NumberFormat, который форматирует числа в общем стиле
 * без учета валюты или процентов.
 * <p>
 * —  getCurrencyInstance() — возвращает объект NumberFormat, который форматирует числа в стиле валюты,
 * учитывая локальные настройки для отображения валюты.
 * <p>
 * —  getPercentInstance() — возвращает объект NumberFormat, который форматирует числа в стиле процентов,
 * учитывая локальные настройки для отображения процентов.
 * <p>
 * Форматирование применяется указанием числового значения, которое нужно отформатировать,
 * в качестве аргумента методу format() объекта NumberFormat.
 * <p>
 * Для форматирования объектов, содержащих дату и время, используется пакет java.time.format, в котором имеется
 * класс DateTimeFormat.
 * <p>
 * Объект DateTimeFormatter содержит шаблон форматирования, который указывается в качестве строкового аргумента
 * методу ofPattern().
 * <p>
 * Шаблон форматирования включает буквы, определенные в документации, а также символы для разделителей, которые
 * выбираете вы сами. Например, шаблон M/d/y определяет месяц, день и год, разделенные слешем. Формат применяется
 * указанием шаблона форматирования в качестве аргумента методу format() объекта java.time.
 */

public class Formats {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getNumberInstance(); // Разделит число на группы по 3 цифры.
        System.out.println("\nЧисло: " + nf.format(123456789));

        NumberFormat cf = NumberFormat.getCurrencyInstance();
        System.out.println("\nВалюта: " + cf.format(1234.50f)); // Форматирует число в рубли.

        NumberFormat pf = NumberFormat.getPercentInstance();
        System.out.println("\nПроцент: " + pf.format(0.75f)); // Форматирует число в %.

        java.time.LocalDateTime now = java.time.LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM d, yyy"); // Указывает текущую дату.
        System.out.println("\nДата: " + now.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:m a"); // Указывает текущее время.
        System.out.println("\nВремя: " + now.format(tf));
    }
}
