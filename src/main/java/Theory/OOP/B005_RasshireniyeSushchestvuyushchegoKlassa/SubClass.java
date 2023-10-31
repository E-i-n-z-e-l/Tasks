package Theory.OOP.B005_RasshireniyeSushchestvuyushchegoKlassa;

class SubClass extends SuperClass {
    public static void hello() {
        System.out.println("Привет из Подкласса");
    }

    public static void main(String[] args) {
        hello();
        SuperClass.hello();
        echo("Привет лично от меня!");
    }

}
