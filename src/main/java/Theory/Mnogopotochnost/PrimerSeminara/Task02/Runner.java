package Theory.Mnogopotochnost.PrimerSeminara.Task02;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Runner extends Thread {
    private final String name;
    private final CountDownLatch countDownLatch; // Экземпляр класса CountDownLatch, используемый для синхронизации потоков;
    private final Random rnd = new Random(); // Экземпляр класса Random, используется для генерации случайного времени задержки;

    public Runner(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }
    /* В методе run, который переопределяет метод из класса Thread, выполняются следующие действия: */
    @Override
    public void run() {
        try {
            toStart(); // Вызывается метод toStart() для подготовки к старту;
            countDownLatch.await(); // Через вызов countDownLatch.await() поток ожидает, пока счетчик
                                    // countDownLatch не будет уменьшен до 0 другими потоками
            toFinish(); // После этого вызывается метод toFinish() для завершения бега;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    /* Метод toStart() отвечает за подготовку к старту и имеет следующие действия: */
    public void toStart() throws InterruptedException {
        System.out.println(name + " move to start"); // Выводится сообщение о том, что бегун движется к старту;
        Thread.sleep(rnd.nextInt(1000,2000)); // Выполняется задержка случайной продолжительности
                                                          // от 1000 до 2000 миллисекунд с помощью Thread.sleep(),
                                                          // чтобы имитировать задержку в подготовке
        System.out.println(name + " ready"); // Выводится сообщение о том, что бегун готов;
        countDownLatch.countDown(); // Счетчик countDownLatch уменьшается на 1 с помощью countDownLatch.countDown();
    }
    /* Метод toFinish() отвечает за завершение бега и имеет следующие действия: */
    public void toFinish() throws InterruptedException {
        System.out.println(name + " move to finish"); // Выводится сообщение о том, что бегун движется к финишу;
        Thread.sleep(rnd.nextInt(1000,2000));  //  Выполняется задержка случайной продолжительности
                                                           // от 1000 до 2000 миллисекунд с помощью Thread.sleep(),
                                                           // чтобы имитировать время прохождения дистанции;
        System.out.println(name + " finished"); // Выводится сообщение о том, что бегун финишировал;
    }
}