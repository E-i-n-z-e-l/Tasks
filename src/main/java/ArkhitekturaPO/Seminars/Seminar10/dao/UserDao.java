package ArkhitekturaPO.Seminars.Seminar10.dao;

import java.util.List;

/**
 Интерфейс UserDao определяет методы для доступа к данным пользователей: получения пользователя по id (findById),
 получения всех пользователей (findAll), добавления нового пользователя (add), обновления пользователя (save) и
 удаления пользователя (delete).
 */
public interface UserDao {
    User findById(int id);
    List<User> findAll();
    void add(User user);
    void save(User user);
    void delete(int id);
}
