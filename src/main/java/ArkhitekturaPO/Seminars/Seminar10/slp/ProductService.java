package ArkhitekturaPO.Seminars.Seminar10.slp;

import java.util.List;

/**
 Класс ProductService представляет собой сервис продуктов, который содержит объект ProductRepository и имеет
 методы для добавления нового продукта с логикой (addProductWithLogic) и получения всех продуктов (getAllProducts).

 Метод addProductWithLogic в ProductService проверяет, что имя продукта не является пустой строкой или null,
 и только в этом случае добавляет продукт в репозиторий с помощью метода addProduct.

 Метод getAllProducts в ProductService просто вызывает метод getAllProducts у объекта ProductRepository и
 возвращает список всех продуктов.
 */
public class ProductService {
    private ProductRepository productRepository = new ProductRepository();

    // Метод для добавления продукта с бизнес-логикой
    public void addProductWithLogic(Product product) {
        if (product.getName() != null && !product.getName().isEmpty()) {
            productRepository.addProduct(product);
        }
    }

    // Метод для получения всех продуктов через репозиторий
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
}
