package ArkhitekturaPO.Practocal.Practical04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVContactWriter implements ContactWriter{
    private final String csvFile;
    public CSVContactWriter(String csvFile) {
        this.csvFile = csvFile;
    }

    /**
     * <p>
     *  - Конструктор CSVContactWriter: принимает имя файла, в который будут записываться контакты.
     *  <p>
     *  <p>
     * - Метод writeContact: записывает новый контакт в файл. Принимает имя, фамилию и номер телефона контакта.
     * <p>
     * @return Метод writeContact не возвращает значения (void).
     * @pre Для работы метода writeContact является передача корректных данных (имя, фамилия и номер телефона).
     * @post  Успешная запись контакта в файл.
     * @param name
     * @param surname
     * @param phone
     */
    @Override
    public void writeContact(String name, String surname, String phone) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(csvFile, true);
            // записываем заголовок, если файл пустой
            if (new File(csvFile).length() == 0) {
                writer.write("Имя,\t\t\tФамилия,\t\t\tТелефон\n");
            }

            writer.append(name + ",\t\t" + surname + ",\t\t" + phone + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Данные успешно записаны в файл.");
    }
}

