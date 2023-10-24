package ArkhitekturaPO.Practocal.Practical10;

import ArkhitekturaPO.Seminars.Seminar10.dao.User;

import java.util.List;
// Интерфейс будущих методов
public interface InterfaceProduct {
    Product findById(int id);
    List<Product> findAll();
    void add(Product product);
    void save(Product product);
    void delete(int id);
}
