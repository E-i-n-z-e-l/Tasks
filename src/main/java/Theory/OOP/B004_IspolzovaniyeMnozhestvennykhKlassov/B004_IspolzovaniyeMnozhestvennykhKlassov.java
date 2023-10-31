package Theory.OOP.B004_IspolzovaniyeMnozhestvennykhKlassov;

/**
 Использование множественных классов.

 Ключевое слово public разрешает доступ из любого другого класса, а доступ по
 умолчанию разрешает открывать доступ только для классов одного пакета (папки).

 */
public class B004_IspolzovaniyeMnozhestvennykhKlassov {
    public static void main(String[] args) {
        String msg = "Это локальная переменная класса Multi";
        System.out.println(msg);
        System.out.println(Data.txt);
        Data.greeting();
        Draw.line();

    }
}
