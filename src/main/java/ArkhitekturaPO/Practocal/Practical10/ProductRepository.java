package ArkhitekturaPO.Practocal.Practical10;

import java.util.List;

// В данном классе мы создаем объект WorkInProduct и используем его методы для доступа к данным.
public class ProductRepository {
    private InterfaceProduct workInProduct;
    public ProductRepository() {
        workInProduct = new WorkInProduct();
    }
    // Для добавления продукта мы проверяем корректность данных и вызываем метод add у объекта WorkInProduct.
    public void addProduct(Product product) {
        if (product == null || product.getName() == null || product.getName().isEmpty() || product.getPrice() <= 0) {
            throw new IllegalArgumentException("Неверные данные о товаре");
        }
        workInProduct.add(product);
    }
    // Для удаления продукта мы проверяем, существует ли продукт с заданным id, и вызываем метод delete у объекта WorkInProduct.
    public void deleteProduct(int id) {
        if (workInProduct.findById(id) == null) {
            throw new IllegalArgumentException("Товар не найден");
        }
        workInProduct.delete(id);
    }
    // Для получения всех продуктов мы вызываем метод findAll у объекта WorkInProduct.
    public List<Product> getAllProducts() {
        return workInProduct.findAll();
    }
}
