package ArkhitekturaPO.Practocal.Practical10;

import java.util.List;
// В данном классе мы создаем объект ProductRepository и используем его методы для выполнения операций с продуктами.
public class ProductService {
    private UnitOfWork unitOfWork;
    private InterfaceProduct productRepository;
    public ProductService() {
        productRepository = new WorkInProduct();
        unitOfWork = new UnitOfWork(productRepository);
    }
    // Для добавления продукта мы дополнительно проверяем цену продукта и вызываем метод addProduct у объекта ProductRepository.
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
    // Для удаления продукта и получения всех продуктов мы вызываем соответствующие методы у объекта ProductRepository.
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
    // Сервисный слой ProductService абстрагирован от сложностей доступа к данным и предоставляет интерфейс
    // для работы с продуктами. Кроме того, мы добавили бизнес-логику для проверки цены продукта, что позволяет
    // управлять данными на более высоком уровне абстракции.
}
