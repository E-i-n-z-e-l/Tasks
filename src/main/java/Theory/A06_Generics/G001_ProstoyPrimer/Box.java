package Theory.A06_Generics.G001_ProstoyPrimer;

/**
 * Простой пример Дженериков. По сути это классы, которые могут быть любым
 * типом данных и работать с любыми типами данных.<p></p>
 * - T - используется для обозначения обобщенных типов.<p></p>
 * - E - используется для обозначения элементов коллекции.<p></p>
 * - K - используется для обозначения ключей.<p></p>
 * - V - используется для обозначения значений.
 * @param <T>
 */
public class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
