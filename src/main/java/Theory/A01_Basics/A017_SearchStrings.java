package Theory.A01_Basics;

/**
                                Поиск строк

 startsWith()  - метод проверяет, начинается ли строка с указанной подстроки.

 endsWith()    - метод проверяет, заканчивается ли строка указанной подстрокой.

 substring()   - метод возвращает подстроку из исходной строки, начиная с указанного
                 индекса и до конца строки или до указанного индекса.

 indexOf()     - метод возвращает индекс первого вхождения указанного символа или
                 подстроки в строке. Если символ или подстрока не найдены, то метод возвращает -1.
 */
public class A017_SearchStrings {
    public static void main(String[] args) {
        String[] books =    // Создаем строковый массив.
                {"Java in easy steps", "XML in easy steps",
                        "HTML in easy steps", "CSS in easy steps",
                        "Gone With the Wind", "Drop the Defense"};

        int counter1 = 0, counter2 = 0, counter3 = 0; // Создаем счетчики.
        for (int i = 0; i < books.length; i++) {                // Проходим по всем строкам. Выводим
                                                               //  первые 4 символа в кажой строке
            System.out.print(books[i].substring(0, 4) + " | ");
            if (books[i].endsWith("in easy steps")) counter1++; // Считаем количество окончаний.
            if (books[i].startsWith("Java")) counter2++;       // Считаем количество начал строк.
            if (books[i].indexOf("easy") == -1) counter3++;   // Считаем количество строк в которых нет easy.
        }
        System.out.println("\nНайдено " + counter1 + " названий из этой серии");
        System.out.println("Найдено " + counter2 + " названий с Java");
        System.out.println("Найдено " + counter3 + " других названий");

    }
}
