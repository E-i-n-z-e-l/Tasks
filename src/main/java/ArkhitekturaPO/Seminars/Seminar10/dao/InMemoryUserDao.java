package ArkhitekturaPO.Seminars.Seminar10.dao;

import java.util.ArrayList;
import java.util.List;

/**
 Класс InMemoryUserDao реализует интерфейс UserDao и представляет собой DAO для пользователей, который хранит
 список всех пользователей (users) в памяти и имеет реализации методов интерфейса UserDao для работы с этим списком.
 */
public class InMemoryUserDao implements UserDao {
    private List<User> users = new ArrayList<>();
    private int nextId = 1;

    @Override
    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void add(User user) {
        user.setId(nextId++);
        users.add(user);
    }

    @Override
    public void save(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                users.set(i, user);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}
