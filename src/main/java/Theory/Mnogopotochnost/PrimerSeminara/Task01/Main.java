package Theory.Mnogopotochnost.PrimerSeminara.Task01;
/*В рамках выполнения задачи необходимо:
        1. Создать два класса ObjectA, ObjectB
        2. Реализовать класс в котором два потока при запуске провоцируют DeadLock для объектов ObjectA, ObjectB*/
public class Main {
    public static void main(String[] args) {
        ObjectA objectA = new ObjectA();
        ObjectB objectB = new ObjectB();

        Thread firstThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (objectA) {
                    System.out.println(Thread.currentThread().getName() + " object a is locked");
                    synchronized (objectB) {
                        System.out.println(Thread.currentThread().getName() + " object b is locked");
                    }
                }
            }
        });

        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (objectB) {
                    System.out.println(Thread.currentThread().getName() + " object b is locked");
                    synchronized (objectA) {
                        System.out.println(Thread.currentThread().getName() + " object a is locked");
                    }
                }
            }
        });

        firstThread.start();
        secondThread.start();

        System.out.println("hello from main");
    }
}
/* Многопоточность позволяет выполнять несколько потоков одновременно в рамках одной программы.
В данном случае мы создаем два потока и выполняем код в каждом из них параллельно.

Ключевое слово synchronized используется для синхронизации доступа к объектам. Когда объект блокируется
ключевым словом synchronized, другие потоки должны ожидать, пока объект не будет разблокирован, прежде
чем они смогут получить доступ к нему. Это позволяет избежать гонок данных и проблем с параллельным доступом. */
