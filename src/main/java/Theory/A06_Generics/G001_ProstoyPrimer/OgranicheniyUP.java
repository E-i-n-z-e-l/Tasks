package Theory.A06_Generics.G001_ProstoyPrimer;

/**
 * Ограниечения сверху (upper bound).
 *  В данном примере ограничение T extends Number означает, что параметр типа T должен быть подтипом
 *  класса Number или самим классом Number. Мы создаем объект intBox типа Box<Integer> и вычисляем
 *  квадрат значения, используя метод square(). Благодаря ограничению сверху, мы можем использовать
 *  метод doubleValue() класса Number, без необходимости явного приведения типов.
 * @param <T>
 */
public class OgranicheniyUP<T extends Number> {
    private T value;

    public OgranicheniyUP(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public double square() {
        return value.doubleValue() * value.doubleValue();
    }
}

/**
 * В примере с ограничением сверху (upper bound), где параметр типа T extends Number, переменной value класса
 * Box может быть присвоено только числовое значение или его подтипы.
 * <p>
 * Поскольку класс Number является базовым классом для различных числовых типов в Java, таких как Integer,
 * Double и т.д., ограничение T extends Number позволяет использовать эти числовые типы и их подтипы в качестве
 * аргумента типа T для класса Box.
 */
class Main {
    public static void main(String[] args) {
        OgranicheniyUP<Integer> intBox = new OgranicheniyUP<>(5);
        System.out.println("Square: " + intBox.square()); // Output: Square: 25.0
    }
}

