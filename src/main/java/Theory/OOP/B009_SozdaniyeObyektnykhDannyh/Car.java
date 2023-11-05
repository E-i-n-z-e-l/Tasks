package Theory.OOP.B009_SozdaniyeObyektnykhDannyh;

public class Car {
    private String maker;
    private String color;
    private String bodyType;

    public Car() {
        maker = "Porsche";
        color = "Серебристый";
        bodyType = "Купе";
    }

    private String accelerate() {
        return "Ускоряется...";
    }

    /**
     * Метод для присваивания значений переданного аргумента каждой из закрытых переменных.
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

    /**
     * Метод, который выводит значения закрытых переменных и вызывает закрытый метод.
     */
    public void getCar() {
        System.out.println(maker + " цвет " + color);
        System.out.println(maker + " тип кузова " + bodyType);
        System.out.println(maker + " " + accelerate() + "\n");
    }
}

class Constructor {
    public static void main(String[] args) {
        Car Porsche = new Car();
        Porsche.getCar();
        Car Ferrari = new Car() ;
        Ferrari.setCar( "Ferrari" , "Красный" , "Спортивный" ) ;
        Ferrari.getCar() ;
    }
}
