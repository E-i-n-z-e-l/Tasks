package Theory.A03_Functions.C006_RabotaSDatoy;

import java.time.LocalDateTime;

/**
 *               Работа с временем и датой
 * <p>
 * Основные методы:
 * <p>
 * getYear() - получить текущий год;
 * <p>
 * getMonth() - получить текущий месяц;
 * <p>
 * getMonthValue() - получить номер текущего месяца;
 * <p>
 * getDayOfWeek() - получить текущий день недели;
 * <p>
 * getDayOfMonth() - получить текущий номер дня в месяце;
 * <p>
 * getDayOfYear() - получить текущий номер дня в году;
 * <p>
 * getHour() - получить текущий час;
 * <p>
 * getMinute() - получить текущию минуту;
 * <p>
 * getSecond() - получить текущую секунду.
 */
public class DateTime {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now(); // Записываем в date текущее время.

        System.out.println("\nСейчас " + date); // Выводим в терминал текущее время.

        date = date.withYear(2018); // Изменяем год.
        System.out.println("\nТеперь текущее время " + date);

        String fields = "\nГод:\t\t\t" + date.getYear();
        fields += "\nМесяц:\t\t\t" + date.getMonth();
        fields += "\nНомер месяца:\t\t" + date.getMonthValue();
        fields += "\nДень недели:\t\t" + date.getDayOfWeek();
        fields += "\nДень месяца:\t\t" + date.getDayOfMonth();
        fields += "\nДень в году:\t\t" + date.getDayOfYear();
        fields += "\nЧас (0-23):\t\t" + date.getHour();
        fields += "\nМинута:\t\t\t" + date.getMinute();
        fields += "\nСекунда:\t\t" + date.getSecond();
        System.out.println(fields);
    }
}
