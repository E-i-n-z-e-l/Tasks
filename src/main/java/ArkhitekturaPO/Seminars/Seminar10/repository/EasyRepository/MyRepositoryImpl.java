package ArkhitekturaPO.Seminars.Seminar10.repository.EasyRepository;

import java.util.List;

/**
 Паттерн "Repository" (репозиторий) является шаблоном проектирования, который используется для абстрагирования
 доступа к данным и предоставления единообразного интерфейса для работы с данными/

 Суть этого паттерна заключается в создании класса-репозитория, который инкапсулирует логику доступа к данным и
 предоставляет методы для выполнения операций CRUD (create, read, update, delete) над этими данными.
 Класс-репозиторий обычно использует слой доступа к данным (DAO) для выполнения операций с базой данных.

 В этом примере интерфейс MyRepository определяет методы для выполнения операций CRUD, а класс MyRepositoryImpl
 реализует этот интерфейс и содержит методы для доступа к данным через объект MyDao.

 Таким образом, класс-репозиторий скрывает детали доступа к данным и предоставляет единый интерфейс для работы
 с данными. Это позволяет упростить код приложения и сделать его более модульным и тестируемым.

 */

/**
Пример:


public class MyRepositoryImpl implements MyRepository {
    private MyDao myDao;

    public MyRepositoryImpl(MyDao myDao) {
        this.myDao = myDao;
    }

    @Override
    public Object findById(Long id) {
        return myDao.findById(id);
    }

    @Override
    public List<Object> findAll() {
        return myDao.findAll();
    }

    @Override
    public void save(Object entity) {
        myDao.save(entity);
    }

    @Override
    public void update(Object entity) {
        myDao.update(entity);
    }

    @Override
    public void delete(Object entity) {
        myDao.delete(entity);
    }
}
 */
