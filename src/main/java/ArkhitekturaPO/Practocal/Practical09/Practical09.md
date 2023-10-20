# **<center>Практическое задание №9</center>**

> Сделать дополнительные страницы к веб-приложению.

### **Страница заказа экскурсии**

![Выбор экскурсии](https://i.ibb.co/b137LvL/image.png)

### **Страница оформления заказа**

![Оформление экскурсии](https://i.ibb.co/p162TfX/image.png)
![Оформление экскурсии](https://i.ibb.co/vQB2P4T/image.png)

> Разработать полную ERD домена.

![Таблички](https://i.ibb.co/NYT0vX5/image.png)

* Связь "один ко многим" между сущностями "Пользователь" и "Заказ". Один пользователь может сделать несколько заказов, но каждый заказ принадлежит только одному пользователю.
* Связь "один ко многим" между сущностями "Пользователь" и "Комментарий". Один пользователь может оставить несколько комментариев, но каждый комментарий принадлежит только одному пользователю.
* Связь "один ко многим" между сущностями "Экскурсия" и "Заказ". Одна экскурсия может быть заказана несколько раз, но каждый заказ относится только к одной экскурсии.
* Связь "один ко многим" между сущностями "Администратор" и "Статья". Один администратор может создавать и изменять несколько статей, но каждая статья относится только к одному администратору.
* Связь "один ко многим" между сущностями "Администратор" и "Заказ". Один администратор может подтверждать несколько заказов, но каждый заказ относится только к одному администратору.
* Связь "многие ко многим" между сущностями "Пользователь" и "Экскурсия". Один пользователь может заказывать несколько экскурсий, а одна экскурсия может быть заказана несколькими пользователями.