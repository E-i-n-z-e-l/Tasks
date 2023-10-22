package ArkhitekturaPO.Practocal.Practical10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        UnitOfWork unitOfWork = productService.getUnitOfWork();

        // Создаем продукты
        Product product1 = new Product(1, "Продукт 1", 500);
        Product product2 = new Product(2, "Продукт 2", 800);
        Product product3 = new Product(3, "Продукт 3", 1200);

        try {
            // Добавляем продукты в рамках транзакции
            unitOfWork.addProduct(product1);
            unitOfWork.addProduct(product2);
            unitOfWork.addProduct(product3);

            // Отменяем транзакцию
            unitOfWork.rollback();

            // Проверяем, что изменения не сохранены
            List<Product> allProducts = unitOfWork.getProductRepository().findAll();
            System.out.println("Список продуктов после отмены транзакции:");
            for (Product product : allProducts) {
                System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice());
            }

            // Выводим список всех продуктов (без изменений)
            allProducts = productService.getAllProducts();
            System.out.println("Список всех продуктов:");
            for (Product product : allProducts) {
                System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice());
            }

            // Завершаем транзакцию
            unitOfWork.commit();

            // Выводим список всех продуктов (с изменениями)
            allProducts = productService.getAllProducts();
            System.out.println("Список всех продуктов после завершения транзакции:");
            for (Product product : allProducts) {
                System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}