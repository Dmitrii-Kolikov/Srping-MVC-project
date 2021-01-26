### Запись в мужскую парикмахерскую 

JPA (Java Persistence API) –  это стандартная спецификация, которая описывает систему для управления сохранением Java объектов в таблицы базы данных.
Hibernate – самая популярная реализация спецификации JPA.
Таким образом JPA описывает правила, а Hibernate реализует их.

#### 1) Этап
- Создаем наш проект Spring MVC + Hibernate
- Конфигурация приложения MVC + Hibernate
- Подготовка база данных и таблицы, первый этап просто создаем Базу Данных, в последующем будем добавлять таблицу, в нашу Базу Данных.
- Добавление TomCat
- Добавляем dependency в pom файл (Spring Web MVC, JSTL, Hibernate Core Relocation, MySQL Connector/J, C3P0, Spring Object/Relational Mapping )
- Конфигурация web.xml


#### 2) Этап планируем, какие у нас должны быть поля в таблице:
- Имя клиента
- Номер телефона клиента
- Мастер

#### 3) Этап добавляем нашу таблицу в Базу Данных:

#### 4) Этап: создаем необходимы классы в нашем проекте:
- Класс Сlient
- Интерфейс DAO и класс DAOImpl.
- Паттерн Service Layer (определяет для приложения границу и набор допустимых операций с точки зрения взаимодействующих с ним клиентских. Он инкапсулирует бизнес-логику приложения, управляя транзакциями и управляя ответами в реализации этих операций).
- Дополнительный необходимы файлы для нашего проекта.

#### 5) Этап сделаем метод, который выводит всех клиентов на экран:
- чтобы проверить нашу работу с Базой Данных, добавим нельсколько полей нашу в таблицу данных и отобразим их на экран.

#### 6) Этап добавление наших клиентов:
- Создадим наш метод для добавление клиентов
- Сделаем правила валидации для некоторых полей. 

  Валидация форм Spring MVC:
 Java Standard Bean Validation API – это спецификация, которая описывает правила валидации.
 Hibernate Validator – реализация правил, описанных в Java Standard Bean Validation API.
 Зависимость:dependency (Hibernate Validator Engine Relocation Artifact)


