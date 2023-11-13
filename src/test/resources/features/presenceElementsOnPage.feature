# language: ru

Функция: Отображение элементов на главной странице
  Как пользователь
  Я хочу видеть на странице хидер, горизонтальное меню, блок сертификации, блок с курсами, футер

  Предыстория: Открываем браузер и переходим на тестируемый сайт
    Дано Открываем страницу "https://www.way2automation.com/"

  Сценарий: Элементы присутствуют на странице
    Когда Пользователь проверяет наличие хидера с реквизитами для связи
    И Пользователь проверяет наличие горизонтального меню
    И Пользователь проверяет наличие блока с сертификацией
    И Пользователь проверяет наличие блока с курсами
    И Пользователь проверяет наличие футера
    Тогда Title открытой страницы содержит "Way2Automation"
    И Хидер виден на странице и содержит соответствующие реквизиты для связи
    И Горизонтальное меню видно на странице и оно содержит соответствующие ссылки
    И Блок с сертификацией виден на странице и содержит текст "Best Selenium Certification Course Online"
    И Блок с курсами виден на странице и содержит текст "Most Popular Software Testing Courses"
    И Футер виден на странице