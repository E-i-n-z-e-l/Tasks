package Theory.Serialization.TaskForSeminarTree;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", 25);

        person.serialize("person.ser"); // Сериализация;

        Person deserializedPerson = Person.deserialize("person.ser"); // Десериализация;

        System.out.println("Имя: " + deserializedPerson.getName());
        System.out.println("Возраст: " + deserializedPerson.getAge());
    }
}