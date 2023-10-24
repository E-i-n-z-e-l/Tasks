package ArkhitekturaPO.Seminars.Seminar10.repository;

import java.util.ArrayList;
import java.util.List;

/**
 Класс InMemoryUserRepository представляет собой репозиторий пользователей, который содержит список всех
 пользователей (users) и имеет методы для получения пользователя по id (getById), получения всех пользователей
 (getAll), добавления нового пользователя (add), обновления пользователя (update) и удаления пользователя (delete).
 */
public class InMemoryUserRepository implements Repository<User> {
    private List<User> users = new ArrayList<>();
    private int nextId = 1;

    @Override
    public User getById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void add(User user) {
        user.setId(nextId++);
        users.add(user);
    }

    @Override
    public void update(User user) {
        //TODO
    }

    @Override
    public void delete(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}
