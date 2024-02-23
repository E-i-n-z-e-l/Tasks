package Theory.Mnogopotochnost.PrimerSeminara.Task04;

public class Philosopher implements Runnable{
    private Object leftFork;
    private Object rightFork;

    public Philosopher(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }
    private void doAction(String action) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + action);
        Thread.sleep((int) (Math.random() * 100));
    }
    @Override
    public void run() {
        try {
            while (true) {
                // размышления
                doAction("thinking");

                synchronized (leftFork) {
                    // взять левую вилку
                    doAction("picked up left fork");

                    synchronized (rightFork) {
                        // взять правую вилку
                        doAction("picked up right fork - eating");
                        // есть
                        doAction("put down right fork");
                    }

                    // положить левую вилку
                    doAction("put down left fork");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}
