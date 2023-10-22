package ArkhitekturaPO.Seminars.Seminar10.uwp.EasyUWP;

/**

 Паттерн "Unit of Work" (единица работы) является шаблоном проектирования, который используется для управления
 транзакциями базы данных. Он позволяет группировать несколько операций базы данных в одну единицу работы,
 которая может быть выполнена как единое целое.

 В Java этот паттерн может быть реализован с помощью класса "EntityManager", который предоставляется фреймворком
 JPA (Java Persistence API). EntityManager позволяет выполнять операции CRUD (Create, Read, Update, Delete) над
 объектами базы данных и управлять транзакциями.


public class MyService {
    private EntityManager entityManager;

    public MyService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Object entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    public void update(Object entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    public void delete(Object entity) {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }
}

 */