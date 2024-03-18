Материалы для выполнения курсовой работы учениками профессии java-разработчик.

# **Торговой площадка для перепродажи вещей**
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
![Spring](https://img.shields.io/badge/spring-green.svg?style=for-the-badge&logo=spring&logoColor=white)

## **Описание проекта:**
- Торговая площадка представляет возможность стать одним из двух ролей: админ или пользователь<br>
- В ней есть возможность создавать, удалять объявления, а также изменять уже имеющиеся объявления<br>
- Также вы можете просматривать объявления, добавленные другими пользователями, без авторизации на платформе<br>
- Авторизованные пользователи видят полную информацию объявления: Телефон, описание, цену и т.д.

## В проекте использовались следующие технологии:
- Java 17
- Spring Boot 2.7.15
- Spring Web
- Spring Data
- Spring JPA
- PostgreSQL
- HIBERNATE
- MAVEN
- LIQUIBASE
- DOCKER
- LOMBOK

## Рекомендации по запуску проекта:
- Клонируйте проект в среду разработки.
- Настройте базу данных и пропишите значения в файле application.properties
- Настройте путь к файлу с картинками. Пример: `path.to.image.folder=/Users/master/Pictures/image
- Скачайте и установите программу Docker. Запустите проект с помощью программы Docker.
 ---
 Docker-команды для работы с контейнерами фронтенда,для просмотра которого необходимо перейти по адресу [localhost:3000](http://localhost:3000/):
- docker pull ghcr.io/bizinmitya/front-react-avito:v1.21						
- docker run -p 3000:3000 --rm ghcr.io/bizinmitya/front-react-avito:v1.21						
