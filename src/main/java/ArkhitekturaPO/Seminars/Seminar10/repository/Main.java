package ArkhitekturaPO.Seminars.Seminar10.repository;

import java.util.List;

/**
 Этот код использует паттерн программирования "Repository", который позволяет абстрагироваться от конкретного
 источника данных (например, базы данных) и предоставляет единый интерфейс для работы с данными.
 В данном случае, есть три класса: User, InMemoryUserRepository и Main.

 Класс Main содержит метод main, который создает объект InMemoryUserRepository, добавляет два объекта User
 в репозиторий с помощью метода add, получает пользователя с id=1 с помощью метода getById и выводит его имя
 на экран, получает список всех пользователей с помощью метода getAll и выводит его на экран,
 обновляет пользователя с id=1 на новый объект User с именем "Alicia" с помощью метода update и удаляет пользователя
 с id=2 с помощью метода delete.
 */
public class Main {
    public static void main(String[] args) {
        Repository<User> userRepository = new InMemoryUserRepository();

        userRepository.add(new User(1, "Alice"));
        userRepository.add(new User(2, "Bob"));

        User user = userRepository.getById(1);
        System.out.println("User with ID 1: " + user.getName());

        List<User> allUsers = userRepository.getAll();
        System.out.println("All Users:");
        for (User u : allUsers) {
            System.out.println(u.getId() + ": " + u.getName());
        }

        userRepository.update(new User(1, "Alicia"));

        userRepository.delete(2);
    }
}

/**
 Таким образом, паттерн "Repository" позволяет абстрагироваться от конкретного источника данных и предоставляет
 единый интерфейс для работы с данными, что упрощает поддержку и расширение приложения.
 Кроме того, этот паттерн может повысить безопасность приложения, так как слой репозитория может выполнять проверки
 и валидацию данных перед их сохранением в базе данных.
 */