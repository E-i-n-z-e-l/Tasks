package Theory.A06_Generics.G001_ProstoyPrimer;

public class PrimerGenerics {
    public static void main(String[] args) {
        Box<Integer> intBox1 = new Box<>(); // Создаем объект типа Box<Integer>;
        Box<Integer> intBox2 = new Box<>(); // Создаем объект типа Box<Integer>;

        intBox1.setValue(10); // Присваеваем ему значение как 10;
        intBox2.setValue(5);

        int value1 = intBox1.getValue(); // Получаем значение value1;
        int value2 = intBox2.getValue();

        System.out.println(value2);
        System.out.println(value1);
        System.out.println(value1 + value2);

        Box<String> stringBox = new Box<>(); // Создаем объект типа Box<String>;
        stringBox.setValue("Hello"); // Устанавливаем его значение на "Hellow";
        String message = stringBox.getValue(); // Получаем значение;
        System.out.println(message);
    }
}
