package Theory.A02_OOP.B006_SozdaniyeObyektnogoKlassa;

public class FirstObject {
    public static void main(String[] args) {
        System.out.println( "Цвет " + Car.color ) ;
        System.out.println( "Тип кузова " + Car.bodyType ) ;
        System.out.println( Car.accelerate() ) ;
    }
}
