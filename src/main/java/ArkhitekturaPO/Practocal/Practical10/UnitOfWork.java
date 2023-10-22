package ArkhitekturaPO.Practocal.Practical10;

import java.util.ArrayList;
import java.util.List;

public class UnitOfWork {
    private InterfaceProduct productRepository;
    private List<Product> addedProducts;
    private List<Product> updatedProducts;
    private List<Product> deletedProducts;

    public UnitOfWork(InterfaceProduct productRepository) {
        this.productRepository = productRepository;
        addedProducts = new ArrayList<>();
        updatedProducts = new ArrayList<>();
        deletedProducts = new ArrayList<>();
    }
    public void rollback() {
        addedProducts.clear();
        updatedProducts.clear();
        deletedProducts.clear();
    }

    public void addProduct(Product product) {
        addedProducts.add(product);
    }

    public void updateProduct(Product product) {
        updatedProducts.add(product);
    }

    public void deleteProduct(Product product) {
        deletedProducts.add(product);
    }

    public void commit() {
        for (Product product : addedProducts) {
            productRepository.add(product);
        }
        for (Product product : updatedProducts) {
            productRepository.save(product);
        }
        for (Product product : deletedProducts) {
            productRepository.delete(product.getId());
        }
    }

    public InterfaceProduct getProductRepository() {
        return productRepository;
    }
}

