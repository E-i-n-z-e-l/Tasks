package Theory.A03_Functions.C001_RabotaSFaylami;

import java.io.File;
import java.io.IOException;
/**
 * Обратите внимание, что при создании объекта File
 * в действительности файл не создается, а происходит лишь представление конкретного элемента файловой системы
 */
public class RabotaSFaylami {
    public static void main(String[] args) throws IOException {
        File dir = new File("data.txt");

        // boolean created = dir.createNewFile(); А ВОТ ТУТ УЖЕ СОЗДАЕТСЯ ФАЙЛ.

        if (dir.exists()) { // Проверяем существует ли файл.
            String[] files = dir.list(); // Эта строка создает массив строк, содержащий имена файлов и
                                        // подкаталогов в каталоге, представленном объектом "dir".
            System.out.println(files.length + " файлов найдено...");
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        } else {
            System.out.println("Каталог не найден.");
        }
    }
}
