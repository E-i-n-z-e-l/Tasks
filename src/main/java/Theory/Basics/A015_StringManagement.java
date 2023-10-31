package Theory.Basics;

/**
 Управление строками. Складывание строк.
 */
public class A015_StringManagement {
    public static void main(String[] args) {
        String lang = "Java";
        String series = " in easy steps";
        String titl = lang + series;
        System.out.println(titl);

        String title = lang.concat(series);
        System.out.print("\"" + title + "\" содержит ");
        System.out.println(title.length() + " символов");

    }
}
