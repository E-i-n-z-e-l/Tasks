package ArkhitekturaPO.Seminars.Seminar10.slp;

import java.util.ArrayList;
import java.util.List;

/**
 Класс Product представляет собой модель продукта, которая содержит два поля: id и name.
 */
public class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
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
