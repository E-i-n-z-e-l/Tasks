package ArkhitekturaPO.Practocal.Practical10;

import java.util.List;

public class ProductRepository {
    private InterfaceProduct workInProduct;
    public ProductRepository() {
        workInProduct = new WorkInProduct();
    }
    public void addProduct(Product product) {
        if (product == null || product.getName() == null || product.getName().isEmpty() || product.getPrice() <= 0) {
            throw new IllegalArgumentException("Неверные данные о товаре");
        }
        workInProduct.add(product);
    }
    public void deleteProduct(int id) {
        if (workInProduct.findById(id) == null) {
            throw new IllegalArgumentException("Товар не найден");
        }
        workInProduct.delete(id);
    }
    public List<Product> getAllProducts() {
        return workInProduct.findAll();
    }
}
