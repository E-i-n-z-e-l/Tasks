package Theory.A01_Basics;

import java.util.Date;

public class A019_TekushchiyeVremya {
    public static void main(String[] args) {
        // В результате этого вызова выводятся текущая дата и время:
        System.out.printf("%tc", new Date() );
        System.out.println();
        System.out.printf ("%1$s %2$tB %2$te, %2$tY", "Due date:", new Date());
    }
}
