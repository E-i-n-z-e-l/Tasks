package Theory.OOP;

/**
 * Область видимости.
 * Переменная, которая объявляется внутри метода, доступна только в пределах этого метода — ее так называемая
 * область видимости ограничена данным методом, в котором она объявлена. Это означает, что
 * в другом методе можно объявить переменную с точно таким же именем без какого-либо конфликта.
 */
public class B003_OblastVidimosti {
    final static String txt = "Это глобальная переменная класса Scope";

    public static void sub() {
        String txt = "Это локальная переменная метода sub";
        System.out.println(txt);

    }

    public static void main(String[] args) {
        String txt = "Это локальная переменная метода main";
        System.out.println(txt);
        sub();
        System.out.println(B003_OblastVidimosti.txt);
    }
}
