package Theory.A02_OOP.B008_InkapsulyatsiyaSvoystv;

/**
 * Инкапсуляция свойств.
 * Когда нужно описать переменные и методы объекта и защитить их от обработки внешним программным кодом,
 * используется ключевое слово private (закрытый).
 * <p>
 * Для вызова значений переменных, а также вызова методов, в объект можно включать общедоступные методы.
 * <p>
 * Данный прием инкапсулирует переменные и методы внутри структуры объекта.
 */
public class Car {
    private String maker;
    private String color;
    private String bodyType;

    private String accelerate() {
        return "Ускоряется...";
    }

    /**
     * Общедоступный метод для присваивания значения переданного аргумента каждой из закрытых переменных.
     *
     * @param brand
     * @param paint
     * @param style
     */
    public void setCar(String brand, String paint, String style) {
        maker = brand;
        color = paint;
        bodyType = style;
    }

    public void getCar() {
        System.out.println(maker + " цвет " + color);
        System.out.println(maker + " тип кузова " + bodyType);
        System.out.println(maker + " " + accelerate() + "\n");
    }
}

class SafeInstance {
    public static void main(String[] args) {
        Car Porsche = new Car(); // Создаем новые объекты.
        Car Bentley = new Car();

        Porsche.setCar("Porsche", "Красный", "Купе"); // Описываем эти объекты.
        Bentley.setCar("Bentley", "Зеленый", "Седан");

        Bentley.getCar(); // Показывам эти объекты в терминале.
        Porsche.getCar();
    }
}
