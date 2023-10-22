package ArkhitekturaPO.Seminars.Seminar10.uwp;

/**
 Этот код использует паттерн программирования "Unit of Work", который позволяет группировать операции над объектами
 в единую транзакцию и сохранять изменения в базе данных только после успешного завершения этой транзакции.

 В этом примере есть три класса: Product, ProductRepository и Main.

 Класс Main содержит метод main, который создает объект ProductRepository и два объекта Product.
 Затем он добавляет эти объекты в ProductRepository, выводит список всех продуктов до подтверждения изменений,
 вызывает метод commit для сохранения изменений и выводит список всех продуктов после подтверждения изменений.

 Таким образом, паттерн "Unit of Work" позволяет группировать операции над объектами в единую транзакцию и
 сохранять изменения в базе данных только после успешного завершения этой транзакции. Это позволяет уменьшить
 количество запросов к базе данных и повысить производительность приложения.
 */
public class Main {
    //Unit of Work Pattern
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();

        Product product1 = new Product(1, "Laptop");
        Product product2 = new Product(2, "Smartphone");

        productRepository.addNewProduct(product1);
        productRepository.addNewProduct(product2);

        System.out.println("Products (before commit): " + productRepository.getAllProducts());

        // Сохраняем все изменения (выполняем транзакцию)
        productRepository.commit();

        System.out.println("Products (after commit): " + productRepository.getAllProducts());
    }
}