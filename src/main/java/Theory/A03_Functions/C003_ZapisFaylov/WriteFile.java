package Theory.A03_Functions.C003_ZapisFaylov;

import java.io.*;

/**
                                         Запись в файл.

 Метод write() перезаписывает весь файл.
 Метод append() добавляет данные в файл.

 В данном контексте, метод append() из класса BufferedWriter, фактически, выполняет почти то же самое,
 что и метод write(). Когда используется BufferedWriter, метод append() вызывает тот же метод write()
 внутри себя для добавления данных в буфер. Таким образом, ключевых различий в их работе нет.

 Поэтому в контексте BufferedWriter, оба метода - write() и append() - работают для добавления строк в файл,
 и вы можете использовать любой из них, в зависимости от вашего стиля кодирования или предпочтений.

 Подводя итог, в случае использования BufferedWriter, методы write() и append() в принципе функционально
 эквивалентны - они оба добавляют строки в буфер для записи в файл.
 */
public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("tam.txt");
            BufferedWriter buffer = new BufferedWriter(file);
            buffer.append("Дул ветер из последних сил,");
            buffer.newLine();
            buffer.append("И град хлестал, и ливень лил,");
            buffer.newLine();
            buffer.append("И вспышки молний тьма глотала,");
            buffer.newLine();
            buffer.append("И небо долго грохотало...");
            buffer.newLine();
            buffer.append("В такую ночь, как эта ночь,");
            buffer.newLine();
            buffer.append("Сам дьявол погулять не прочь.");
            buffer.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка записи");
        }
    }
}
