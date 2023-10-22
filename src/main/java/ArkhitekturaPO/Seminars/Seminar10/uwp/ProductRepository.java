package ArkhitekturaPO.Seminars.Seminar10.uwp;

import java.util.ArrayList;
import java.util.List;

/**
 Класс ProductRepository представляет собой репозиторий продуктов, который содержит список всех продуктов (products),
 список новых продуктов (newProducts) и список удаленных продуктов (deletedProducts). Класс имеет методы для добавления
 нового продукта (addNewProduct), удаления продукта (deleteProduct), подтверждения изменений (commit) и получения всех
 продуктов (getAllProducts).

 * Метод addNewProduct добавляет новый продукт в список newProducts.

 * Метод deleteProduct удаляет продукт из списка products и добавляет его в список deletedProducts.

 * Метод commit объединяет списки products, newProducts и deletedProducts и сохраняет изменения в базе данных.

 * Метод getAllProducts возвращает копию списка products.


 */
public class ProductRepository {
    private List<Product> products = new ArrayList<>();
    private List<Product> newProducts = new ArrayList<>();
    private List<Product> deletedProducts = new ArrayList<>();

    // Метод для добавления продукта в список новых продуктов
    public void addNewProduct(Product product) {
        newProducts.add(product);
    }

    // Метод для удаления продукта из списка продуктов
    public void deleteProduct(Product product) {
        products.remove(product);
        deletedProducts.add(product);
    }

    // Метод для сохранения всех изменений
    public void commit() {
        products.addAll(newProducts);
        products.removeAll(deletedProducts);
        newProducts.clear();
        deletedProducts.clear();
    }

    // Метод для получения всех продуктов
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
}
