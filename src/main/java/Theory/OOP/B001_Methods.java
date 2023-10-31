package Theory.OOP;

/**
 Создание методов.
 */
public class B001_Methods {
    // Создаем метод sub.
    public static void sub() {
        System.out.println("Сообщение из метода sub.");
    }

    public static void main(String[] args) {
        System.out.println("Сообщение из главного метода.");
        sub();
    }
}
