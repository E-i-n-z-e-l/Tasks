package Theory.Mnogopotochnost.PrimerSeminara.Task03;
//    В рамках выполнения задачи необходимо:
//    Создайте два потока A и B.
//    Поток A меняет значение Boolean переменной switcher с задержкой 1000 миллисекунд
//    (true в состояние false и наоборот).
//    Поток B ожидает состояния true переменной switcher и выводит на консоль обратный отсчет от 100
//    с задержкой 100 миллисекунд и приостанавливает свое действие, как только поток A переключит switcher
//    в состояние false.
//    Условием завершения работы потоков является достижение отсчета нулевой отметки.
public class Main {
    /* В классе Main объявлены две статические переменные типа boolean - switcher и work. Они объявлены как
    volatile, что обеспечивает корректную работу с ними в многопоточной среде. */
    static volatile boolean switcher = true;
    static volatile boolean work = true;

    public static void main(String[] args) {
        /* Поток changer реализован с помощью анонимного класса, реализующего интерфейс Runnable.
        Внутри метода run выполняются следующие действия: */
        Thread changer = new Thread(new Runnable() {
            @Override
            public void run() {
                while (work) {
                    try {
                        Thread.sleep(1000); // выполняет задержку в 1000 миллисекунд (1 секунду) с помощью Thread.sleep();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    switcher = !switcher; // Затем переменная switcher меняет свое значение на противоположное;
                }
            }
        });

        Thread counter = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 100; // Устанавливается начальное значение переменной count равное 100;
                while (count >= 0) { // Проверяется значение switcher. Если оно равно true,
                                     // то выводится значение count, а затем значение count уменьшается на 1;
                    if (switcher) {
                        System.out.println(count--);
                        try {
                            Thread.sleep(100); // Выполняется задержка в 100 миллисекунд с помощью Thread.sleep();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                /* После завершения цикла меняется значение переменной work на противоположное
                (если было true, станет false, и наоборот). */
                work = !work;
            }
        });

        changer.start();
        counter.start();
    }
    /* Что происходит в программе:
        - Поток changer периодически меняет значение переменной switcher между true и false.
        - Поток counter выводит числа от 100 до 0 каждые 100 миллисекунд, только когда значение переменной
        switcher равно true. Когда цикл заканчивается, значение переменной work меняется, что приводит к
        остановке работы потока changer.
        - Таким образом, на выходе мы должны получить последовательное вывод чисел от 100 до 0 в консоль
        с небольшой задержкой между ними. */
}
