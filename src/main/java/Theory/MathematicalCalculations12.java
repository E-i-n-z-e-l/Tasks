package Theory;

/**
 Константы математических операций - число Pi и возведение в степень.
 */
public class MathematicalCalculations12 {
    public static void main(String[] args) {
        float radius = Float.parseFloat("2");
        float shortPi = (float) Math.PI;

        float circ = shortPi * ( radius + radius );
        float area = shortPi * ( radius * radius );

        System.out.print( "Если число Пи рассчитано в диапазоне от " + Math.PI ) ;
        System.out.println( " до " + shortPi + "..." ) ;
        System.out.println( "Окружность с радиусом " + radius + " см");
        System.out.print( "имеет длину " + circ + " см" ) ;
        System.out.println( " и площадь " + area + " кв.см" ) ;

        // ________________________________________________________________

        int num = Integer.parseInt("5" );
        int square = (int) Math.pow(num , 2);
        int cube = (int) Math.pow(num , 3);
        int sqrt = (int) Math.sqrt(num);
        System.out.println( num + " в квадрате равно " + square ) ;
        System.out.println( num + " в кубе равно " + cube ) ;
        System.out.println( "Квадратный корень из " + num + " равен "+ sqrt );
    }
}
