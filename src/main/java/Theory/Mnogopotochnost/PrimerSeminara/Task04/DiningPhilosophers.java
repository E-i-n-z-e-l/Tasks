package Theory.Mnogopotochnost.PrimerSeminara.Task04;

public class DiningPhilosophers {
    public static void main(String[] args) {
        int numberOfPhilosophers = 5;
        Philosopher[] philosophers = new Philosopher[numberOfPhilosophers];
        Object[] forks = new Object[numberOfPhilosophers];

        for (int i = 0; i < numberOfPhilosophers; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < numberOfPhilosophers; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % numberOfPhilosophers];

            philosophers[i] = new Philosopher(leftFork, rightFork);

            Thread thread = new Thread(philosophers[i], "Philosopher " + (i + 1));
            thread.start();
        }
    }
}
