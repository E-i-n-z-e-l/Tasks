package ArkhitekturaPO.Seminars.Seminar10.dao.EasyDAO;

import java.sql.Connection;
import java.util.List;

/**
 Паттерн "Data Access Object" (DAO) используется для абстрагирования доступа к данным и предоставления
 единообразного интерфейса для работы с данными в приложении.

 Суть этого паттерна заключается в создании класса-объекта доступа к данным (DAO), который инкапсулирует логику
 доступа к данным и предоставляет методы для выполнения операций CRUD (create, read, update, delete) над этими данными.
 Класс-DAO обычно использует слой подключения к базе данных для выполнения операций с базой данных.

 В этом примере интерфейс MyDao определяет методы для выполнения операций CRUD, а класс MyDaoImpl реализует этот
 интерфейс и содержит методы для доступа к данным через объект Connection.

 Таким образом, класс-DAO скрывает детали доступа к данным и предоставляет единый интерфейс для работы с данными.
 Это позволяет упростить код приложения и сделать его более модульным и тестируемым.


public class MyDaoImpl implements MyDao {
    private Connection connection;

    public MyDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Object findById(Long id) {
        // выполнение запроса к базе данных и получение объекта по id
        return object;
    }

    @Override
    public List<Object> findAll() {
        // выполнение запроса к базе данных и получение списка объектов
        return objects;
    }

    @Override
    public void save(Object entity) {
        // выполнение запроса к базе данных и сохранение объекта
    }

    @Override
    public void update(Object entity) {
        // выполнение запроса к базе данных и обновление объекта
    }

    @Override
    public void delete(Object entity) {
        // выполнение запроса к базе данных и удаление объекта
    }
}
*/