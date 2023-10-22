package ArkhitekturaPO.Practocal.Practical10;

import ArkhitekturaPO.Seminars.Seminar10.dao.User;

import java.util.ArrayList;
import java.util.List;
// Базовые методы для работы с Product
public class WorkInProduct implements InterfaceProduct{
    private List<Product> products = new ArrayList<>();
    private int nextId = 1;
    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    @Override
    public void add(Product product) {
        product.setId(nextId++);
        products.add(product);
    }

    @Override
    public void save(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                products.set(i, product);
                return;
            }
        }
    }


    @Override
    public void delete(int id) {
        products.removeIf(user -> user.getId() == id);
    }
}
