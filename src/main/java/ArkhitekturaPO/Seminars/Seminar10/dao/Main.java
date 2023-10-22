package ArkhitekturaPO.Seminars.Seminar10.dao;

import java.util.List;

/**
 Этот код использует паттерн программирования "Data Access Object" (DAO), который позволяет абстрагироваться
 от конкретного источника данных (например, базы данных) и предоставляет единый интерфейс для работы с данными.
 В данном случае, есть четыре класса: User, UserDao, InMemoryUserDao и Main.

 Класс Main содержит метод main, который создает объект InMemoryUserDao, добавляет два объекта User в DAO с
 помощью метода add, получает пользователя с id=1 с помощью метода findById и выводит его имя на экран,
 получает список всех пользователей с помощью метода findAll и выводит его на экран, обновляет пользователя с id=1
 на новый объект User с именем "Alicia" с помощью метода save и удаляет пользователя с id=2 с помощью метода delete.


 */
public class Main {
    public static void main(String[] args) {
        UserDao userDao = new InMemoryUserDao();

        userDao.add(new User(1, "Alice"));
        userDao.add(new User(2, "Bob"));

        User user = userDao.findById(1);
        System.out.println("User with ID 1: " + user.getName());

        List<User> allUsers = userDao.findAll();
        System.out.println("All Users:");
        for (User u : allUsers) {
            System.out.println(u.getId() + ": " + u.getName());
        }

        User updatedUser = new User(1, "Alicia");
        userDao.save(updatedUser);

        userDao.delete(2);
    }
}

/**
 Таким образом, паттерн "DAO" позволяет абстрагироваться от конкретного источника данных и предоставляет
 единый интерфейс для работы с данными, что упрощает поддержку и расширение приложения. Кроме того, этот
 паттерн может повысить безопасность приложения, так как слой DAO может выполнять проверки и валидацию
 данных перед их сохранением в базе данных.
 */