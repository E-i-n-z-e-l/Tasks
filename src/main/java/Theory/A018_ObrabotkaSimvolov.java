package Theory;

/**
 Обработка символов
 trim()    - метод удаляет все начальные и конечные пробелы из строки.
 charAt()  - метод возвращает символ, находящийся по указанному индексу в строке.
 replace() - метод заменяет все вхождения указанного символа или подстроки на другой символ или подстроку.
 isEmpty() - метод возвращает true, если строка пустая, иначе false.
 */

public class A018_ObrabotkaSimvolov {
    public static void main(String[] args) {
        String txt = ""; // Создаем пустую строку.
        if (txt.isEmpty()) txt = " Боррокудо "; // Если строка пустая, то txt = " Боррокудо ".

        System.out.println("Строка: " + txt);
        System.out.println("Длина первоначальной строки: " + txt.length()); // Считаем длину строки.

        txt = txt.trim(); // Удаляем все начальные и конечные пробелы из строки.
        System.out.println("Строка: " + txt);
        System.out.println("Длина строки: " + txt.length()); // Длина строки стала меньше из-за убранных пробелов.

        char initial = txt.charAt(0); // Получаем первую букву из строки.
        System.out.println("Первая буква: " + initial);

        initial = txt.charAt((txt.length() - 1)); // Получаем последнию букву из строки.
        System.out.println("Последняя буква: " + initial);

        txt = txt.replace('о', 'а'); // Заменяем все "о" на "а".
        System.out.println("Строка: " + txt);
    }
}
