# UIAutotest_SDET
Автоматизированное тестирование сайтов: [way2automation.com](https://www.way2automation.com/), [https://www.sql-ex.ru/](https://www.sql-ex.ru/).
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

## В раскрывающемся списке ниже описаны тест-кейсы, которые были автоматизированы
<details>
<summary>Чек-листы и тест-кейсы</summary>
    
## Чек-лист
#### Объект тестирования:
[https://www.way2automation.com/](https://www.way2automation.com/)
#### Чек-лист:
1. Проверка наличия элементов на главной странице
2. Скроллинг с отображением основного меню в шапке на главной
3. Проверка перехода по меню на любую из страниц
4. Авторизация пользователя
5. Наличие скролла и возможность убирания фокуса
6. Успешное перетаскивание мышкой элемента на странице
7. Переход на новую открывшуюся вкладку при нажатии на ссылку
8. Отображение текста, введенного в alert, на странице
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
| Вводимое значение                                                      | Ожидаемый результат                                          |
| ---------------------------------------------------------------------- |--------------------------------------------------------------|
| Логин - **angular**, Пароль - **password**, Описание - **description** | Открылась страница с текстом *Home*                          |
| Логин - **Anne**, Пароль - **12345abc**, Описание - **description**    | Страница содержит ошибку *Username or password is incorrect* |
| Логин - **Tomas**, Пароль - **Tomas**, Описание - **My name is Tomas** | Страница содержит ошибку *Username or password is incorrect* |

## Тест-кейс. Наличие скролла и возможность убирания фокуса
#### Предусловие:
1. Открыть браузер
2. Перейти на страницу: [https://www.way2automation.com/angularjs-protractor/multiform/#/form/profile](https://www.way2automation.com/angularjs-protractor/multiform/#/form/profile)
#### Шаги:
1. Проверить наличие скролла, прокрутив страницу колёсиком мышки
2. Нажать на input-поле **Name**
3. Нажать на input-поле **Email**
#### Ожидаемый результат:
1. Скролл виден на странице
2. Фокус убран с поля ввода **Name**
## Тест-кейс. Успешное перетаскивание мышкой элемента на странице
#### Предусловие:
1. Открыть браузер
2. Перейти на страницу: [http://way2automation.com/way2auto_jquery/frames-and-windows.php](http://way2automation.com/way2auto_jquery/frames-and-windows.php)
#### Шаги:
Перетащить мышкой элемент **Drag me to my target** в принимающий элемент **Drop here**
#### Ожидаемый результат:
Текст принимающего элемента изменился на *Dropped!*
## Тест-кейс. Переход на новую открывшуюся вкладку при нажатии на ссылку
#### Предусловие:
1. Открыть браузер
2. Перейти на страницу: [http://way2automation.com/way2auto_jquery/frames-and-windows.php](http://way2automation.com/way2auto_jquery/frames-and-windows.php)
#### Шаги:
1. Нажать на ссылку **New Browser Tab**
2. На новой открывшейся вкладке нажать на ссылку **New Browser Tab**
#### Ожидаемый результат:
Открыты три вкладки в браузере
## Тест-кейс. Отображение текста, введенного в alert, на странице
#### Предусловие:
1. Открыть браузер
2. Перейти на страницу: [http://way2automation.com/way2auto_jquery/alert.php](http://way2automation.com/way2auto_jquery/alert.php)
#### Шаги:
1. Нажать на ссылку **Input Alert**
2. Нажать на кнопку **Click the button to demonstrate the Input box.**
3. Ввести кастомный текст
4. Нажать на кнопку **Ок**
#### Ожидаемый результат:
Введенный в alert текст отобразился на странице
## Чек-лист
#### Объект тестирования:
[https://www.sql-ex.ru/](https://www.sql-ex.ru/)
#### Чек-лист:
1. Успешная авторизация пользователя
## Тест-кейс. Успешная авторизация пользователя
#### Предусловие:
1. Открыть браузер
2. Перейти на страницу: [https://www.sql-ex.ru/](https://www.sql-ex.ru/)
#### Шаги:
1. Ввести значение *pligina-e* в поле **Логин**
2. Ввести значение *1234554321999* в поле **Пароль**
3. Нажать на кнопку **Вход**
#### Ожидаемый результат:
На странице отображается кнопка "Выход..."
## Чек-лист
#### Объект тестирования:
[https://www.httpwatch.com/](https://www.httpwatch.com/)
#### Чек-лист:
1. Успешная авторизация пользователя
## Тест-кейс. Успешная авторизация пользователя
#### Предусловие:
1. Открыть браузер
2. Перейти на страницу: [https://www.httpwatch.com/httpgallery/authentication/#showExample10](https://www.httpwatch.com/httpgallery/authentication/#showExample10)
#### Шаги:
1. Нажать на кнопку **Display Image**
2. Пройти авторизацию (логин - **httpwatch**, пароль- **httpwatch**)
3. Нажать на кнопку **Вход**
#### Ожидаемый результат:
Появляется картинка с введенными ранее данными

</details>

## Реализация формирования отчетов Allure
Для формирования отчетов Allure необходимо в файле *pom.xml* прописать специальные разделы сборки.
#### Необходимые команды для генерации отчетов:
1. `mvn clean test` - проведите тесты
2. `mvn allure:serve` - создать отчет

Таким образом откроется окно в браузере с информацией по отчету Allure.
#### Поддержка скриншотов в Allure:
С помощью класса **TestAllureListener** производится скриншот при падении теста и записывается в отчет Allure. Над тестовым классом необходимо прописать строку **@Listeners({TestAllureListener.class})**.
В файл **testng.xml** необходимо добавить listener:

`<listeners>
    <listener class-name="helpers.TestAllureListener" />
</listeners>`

В качестве примера в классе **PracticeSitePageTest** содержатся два теста, которые падают из-за несоответствия тайтлу при проверке.

## Параметризация
#### DataProvider
В классе **VariousAuthorizationTest** в качестве источника разных параметров для авторизации используется TestNG DataProvider. Он позволяет запускать тесты одних и тех же тестовых методов множество раз с разными наборами данных. То есть **DataProvider** — это один из способов передачи параметров в тестовые методы.
#### Аннотация параметров в TestNG
Аннотация параметров в TestNG — это метод, используемый для передачи значений методам тестирования в качестве аргументов с использованием файла *.xml*.
В тесте нужно добавить аннотацию @Parameters, а в *.xml* файлах добавить необходимые параметры в тегах `<parameter>`.

Реализоано в **testng_browsers.xml**, **testng_browsers_grid.xml**, в классе **BaseTest** для запуска тестов на разных браузерах, без/с GRID.

## Параллельный запуск тестов
Для параллельного выполнения тестов в *TestNG* можyj использовать атрибут **parallel** в *testng.xml*.

Укажем в качестве атрибута **parallel** тега suite значение **tests**, благодаря которому все тесты, находящиеся в теге *\<test>* файла *testng.xml*, будут выполняться параллельно. Значение количества потоков **thread-count** играет важную роль, поскольку, если количество потоков меньше числа тестов, тестам придется ждать выполнения других тестов. 

Написана testng.xml конфигурация для многопоточного запуска тестов - **testng_regression.xml**. Параллельно запускаются четыре теста.

## Перезапуск упавших тестов
Для запуска только упавших кейсов с предыдущего прогона достаточно запустить файл **testng-failed.xml**, который автоматически генерируется на основе прошлого запуска тестов и хранит в себе информацию упавших тестов.

Чтобы повторить неудачный тест, можно использовать интерфейс **IRetryAnalyzer**. Он повторно запускает тесты Selenium TestNG в случае их провала. Можно указать количество перезапуска тестовых случаев.

Настроен автоматический повторный запуск упавших кейсов (2 попытки перезапуска) с помощью классов **AnnotationTransformer** и **RetryFailedTests**, а также указания *listener* в файле **testng_regression.xml**.
Написан скрипт в файле **retryFailedTests.bat** для выполнения только упавших кейсов с предыдущего прогона.

## Selenium GRID
Selenium Grid — это интеллектуальный прокси-сервер, который позволяет легко запускать тесты параллельно на нескольких машинах.
Selenium Grid использует формат **TOML** для конфигурационных файлов. Конфигурационный файл состоит из разделов, каждый из которых имеет опции и соответствующие значения.

Написаны скрипты (в *seleniumGrid.bat* и *seleniumGrid.sh* файлах) для развертывания Selenium GRID (hub и node).

Написан скрипт в файле *launchOnDifferentBrowsersGrid.bat* для запуска тестов в разных браузерах *параллельно* (chrome, firefox, edge).

Обязательно скачать пакет *Selenium Server Standalone*, необходимый для запуска Grid.
## Автор
Работу выполнила *Плигина Эвелина*
