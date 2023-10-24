package ArkhitekturaPO.Seminars.Seminar10.slp;

import java.util.ArrayList;
import java.util.List;

/**
 Класс ProductRepository представляет собой репозиторий продуктов, который содержит список всех продуктов
 (products) и имеет методы для добавления нового продукта (addProduct) и получения всех продуктов (getAllProducts).
 */
public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    // Метод для добавления продукта
    public void addProduct(Product product) {
        products.add(product);
    }

    // Метод для получения всех продуктов
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
}
