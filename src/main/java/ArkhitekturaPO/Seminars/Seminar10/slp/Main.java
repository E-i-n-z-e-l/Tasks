package ArkhitekturaPO.Seminars.Seminar10.slp;

import java.util.List;

/**
 Этот код использует паттерн программирования "Service Layer", который позволяет разделить логику приложения
 на слои и управлять ими независимо друг от друга.

 Класс Main содержит метод main, который создает объект ProductService, создает два объекта Product,
 добавляет эти объекты в ProductService с помощью метода addProductWithLogic, получает список всех продуктов
 с помощью метода getAllProducts и выводит его на экран.

 Таким образом, паттерн "Service Layer" позволяет разделить логику приложения на слои и управлять ими независимо
 друг от друга, что упрощает поддержку и расширение приложения. Кроме того, этот паттерн может повысить безопасность
 приложения, так как слой сервисов может выполнять проверки и валидацию данных перед их сохранением в базе данных.

 */
public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();

        Product product1 = new Product(1, "Laptop");
        Product product2 = new Product(2, "");

        // Добавляем продукты с бизнес-логикой через сервисный слой
        productService.addProductWithLogic(product1);
        productService.addProductWithLogic(product2);

        // Получаем все продукты через сервисный слой
        List<Product> products = productService.getAllProducts();

        System.out.println("All Products: " + products);
    }
}