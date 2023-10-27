# UIAutotest_SDET
Автоматизированное тестирование сайта [way2automation.com](https://www.way2automation.com/)
## Используемые инструменты:
1. Язык программирования *Java 17*
2. IntelliJ IDEA Community Edition 2023.2
3. Selenium WebDriver (браузер Chrome)
4. Тестовый фреймворк *TestNG*
5. Сборщик *Maven*
6. Паттерн проектирования *Page Object Model* и *Page Factory*
7. Библиотека *WebDriverManager*
8. Библиотека *Lombok*
9. Фреймворк *Allure*
## Чек-лист
#### Объект тестирования:
[https://www.way2automation.com/](https://www.way2automation.com/)
#### Чек-лист:
1. Проверка наличия элементов на главной странице
2. Скроллинг с отображением основного меню в шапке на главной
3. Проверка перехода по меню на любую из страниц
4. Авторизация пользователя
## Тест-кейс. Проверка наличия элементов
#### Предусловие:
1. Открыть браузер
2. Перейти на страницу: [https://www.way2automation.com/](https://www.way2automation.com/)
#### Шаги:
1. Проверить наличие *хидера с реквизитами для связи*
2. Проверить наличие *горизонтального меню*
3. Проверить наличие *блока с сертификацией*
4. Проверить наличие *блока с курсами*
5. Проверить наличие *футера*
#### Ожидаемый результат:
1. Title открытой страницы содержит *"Way2Automation"*
2. Хидер виден на странице и содержит соответствующие реквизиты для связи
3. Горизонтальное меню видно на странице и оно содержит соответствующие ссылки
4. Блок с сертификацией виден на странице и содержит текст *"Best Selenium Certification Course Online"*
5. Блок с курсами виден на странице и содержит текст *"Most Popular Software Testing Courses"*
6. Футер виден на странице
## Тест-кейс. Скроллинг с отображением основного меню в шапке на главной
#### Предусловие:
1. Открыть браузер
2. Перейти на страницу: [https://www.way2automation.com/](https://www.way2automation.com/)
#### Шаги:
Проскроллить несколько раз страницу
#### Ожидаемый результат:
1. Title открытой страницы содержит *"Way2Automation"*
2. Горизонтальное меню видно в шапке на странице и оно содержит соответствующие ссылки
## Тест-кейс. Проверка перехода по меню на любую из страниц
#### Предусловие:
1. Открыть браузер
2. Перейти на страницу: [https://www.way2automation.com/](https://www.way2automation.com/)
#### Шаги:
1. Нажать на кнопку **Resources**
2. В раскрывшемся меню нажать на пункт **Practice Site 1**
#### Ожидаемый результат:
Title открытой страницы содержит текст *"Welcome to the Test Site"*
## Тест-кейс. Авторизация пользователя
#### Предусловие:
1. Открыть браузер
2. Перейти на страницу: [https://www.way2automation.com/](https://www.way2automation.com/)
#### Шаги:
1. Нажать на кнопку **Resources**
2. В раскрывшемся меню нажать на пункт **Practice Site 2**
3. Нажать на кнопку **Registration**
4. Ввести значение *angular* в поле **Username**
5. Ввести значение *password* в поле **Password**
6. Ввести значение *angular* в поле **Username\***
7. Нажать на кнопку **Login**
#### Ожидаемый результат:
Открылась страница с текстом *Home*
## Автор
Работу выполнила *Плигина Эвелина*
