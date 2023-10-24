package ArkhitekturaPO.Seminars.Seminar10.repository;

/**
 Класс User представляет собой модель пользователя, которая содержит два поля: id и name.
 */
public class User {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}