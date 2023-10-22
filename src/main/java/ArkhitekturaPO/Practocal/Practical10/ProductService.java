package ArkhitekturaPO.Practocal.Practical10;

import java.util.List;

public class ProductService {
    private UnitOfWork unitOfWork;
    private InterfaceProduct productRepository;
    public ProductService() {
        productRepository = new WorkInProduct();
        unitOfWork = new UnitOfWork(productRepository);
    }

    public void addProduct(Product product) {
        // Дополнительная бизнес-логика для проверки цены продукта
        if (product.getPrice() > 1000) {
            throw new IllegalArgumentException("Цена слишком высока");
        }

        unitOfWork.addProduct(product);
    }
    public UnitOfWork getUnitOfWork() {
        return unitOfWork;
    }

    public InterfaceProduct getProductRepository() {
        return productRepository;
    }
    public void deleteProduct(int id) {
        Product product = unitOfWork.getProductRepository().findById(id);
        if (product == null) {
            throw new IllegalArgumentException("Товар не найден");
        }

        unitOfWork.deleteProduct(product);
    }

    public List<Product> getAllProducts() {
        return unitOfWork.getProductRepository().findAll();
    }

    public void commitChanges() {
        unitOfWork.commit();
    }
}
