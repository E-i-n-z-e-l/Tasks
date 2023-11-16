package Theory.Functions.С002_ChteniyeKonsolnogoVvoda;

import java.io.*;

/**
 Чтение консольного ввода
 */
public class ReadString {
    public static void main(String[] args) {
        System.out.print("Введите название данной книги: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        String input = "";
        try {
            input = buffer.readLine();
            buffer.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода");
        }
        System.out.println("\nСпасибо, вы читаете " + input);
    }
}

/**
                                            ВАЖНО!!!!!!!!
 ### Scanner:
 Scanner в Java обычно используется для чтения ввода из различных источников, включая стандартный ввод (System.in).
 Он умеет читать и разбирать ввод, содержащий различные типы данных, такие как числа, строки, булевы значения и т.д.
 Scanner обеспечивает удобный способ взаимодействия с различными типами ввода.

 ### BufferedReader + InputStreamReader:
 BufferedReader и InputStreamReader используются в паре для более низкоуровневого чтения ввода. InputStreamReader
 преобразует байтовый ввод в символьный ввод, а BufferedReader позволяет буферизировать ввод, что повышает
 производительность при чтении больших объемов данных из входного потока.

 ### Различия:
 1. Удобство использования: Scanner обеспечивает более простой и прямолинейный способ чтения различных типов данных,
 в то время как BufferedReader + InputStreamReader предоставляют более гибкий, но более низкоуровневый подход к
 чтению ввода.

 2. Обработка ошибок: Scanner обеспечивает удобную обработку ошибок ввода, в то время как
 BufferedReader + InputStreamReader требует более ручной обработки исключений.

 3. Работа со строками и разделителями: Scanner позволяет удобно обрабатывать строки и использовать различные
 разделители, в то время как при использовании BufferedReader + InputStreamReader эти операции могут потребовать
 более ручной работы.

 Таким образом, Scanner и BufferedReader + InputStreamReader оба предоставляют способы для ввода данных, но с
 разными уровнями абстракции и функциональными возможностями.
 */
