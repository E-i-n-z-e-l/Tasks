package Theory.Mnogopotochnost.PrimerSeminara.Task02;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
/*  В рамках выполнения задачи необходимо:
            1. 3 бегуна должны прийти к старту гонки;
            2. Программа должна гарантировать, что гонка начнется только когда все три участника будут на старте;
            3. Программа должна отсчитать “На старт”, “Внимание”, “Марш”;
            4. Программа должна завершиться когда все участники закончат гонку;
            5. Подумайте об использовании примитива синхронизации. */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);
        // Создаются три экземпляра класса Runner с разными именами и передается экземпляр countDownLatch;
        Runner runnerOne = new Runner("Roma", countDownLatch);
        Runner runnerTwo = new Runner("Ivan", countDownLatch);
        Runner runnerThree = new Runner("Mikhail", countDownLatch);

        runnerOne.start();
        runnerTwo.start();
        runnerThree.start();

        while (countDownLatch.getCount() != 1) {
            Thread.sleep(100);
        }

        System.out.println("На старт");
        Thread.sleep(1000);
        System.out.println("Внимание");
        Thread.sleep(1000);
        System.out.println("Марш");

        countDownLatch.countDown();
    }
}
