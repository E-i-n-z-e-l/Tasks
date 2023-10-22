package ArkhitekturaPO.Seminars.Seminar10.slp.EasySLP;


import ArkhitekturaPO.Seminars.Seminar10.dao.EasyDAO.MyDao;

/**
 Паттерн "Service Layer" (слой сервисов) является шаблоном проектирования, который используется для разделения
 бизнес-логики и операций с базой данных на два отдельных слоя: слой контроллеров и слой сервисов.

 Слой сервисов представляет собой набор классов, которые реализуют бизнес-логику приложения и взаимодействуют
 с базой данных через слой доступа к данным (DAO). Этот слой обычно содержит методы для выполнения операций CRUD
 и других операций, связанных с бизнес-логикой приложения.

 В этом примере интерфейс MyService определяет методы для выполнения операций CRUD, а класс MyServiceImpl реализует
 этот интерфейс и содержит методы для выполнения бизнес-логики приложения. MyServiceImpl также содержит ссылку на
 объект MyDao, который используется для выполнения операций с базой данных.
 */
public class MyServiceImpl implements MyService {
    private MyDao myDao;

    public MyServiceImpl(MyDao myDao) {
        this.myDao = myDao;
    }

    @Override
    public void save(Object entity) {
        // выполнение бизнес-логики при сохранении объекта
        myDao.save(entity);
    }

    @Override
    public void update(Object entity) {
        // выполнение бизнес-логики при обновлении объекта
        myDao.update(entity);
    }

    @Override
    public void delete(Object entity) {
        // выполнение бизнес-логики при удалении объекта
        myDao.delete(entity);
    }
}

