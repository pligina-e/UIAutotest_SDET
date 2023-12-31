package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AuthorizationPage;

import java.util.List;

@Epic("Тестирование вкладки авторизации")
@Feature("Авторизация")
public class AuthorizationTest extends BaseTest {
    @Test(description = "Авторизация через меню Resources -> Practice Site2")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Пользователь вводит корректные данные в поля Username, Password, Description, чтобы успешно авторизироваться")
    public final void authorizationPositiveTest() {
        SoftAssert softAssert = new SoftAssert();
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        List<String> loginDetails = List.of("angular", "password", "description");
        authorizationPage.pressMenuButtons();
        softAssert.assertEquals(driver.getTitle(), "Protractor and AngularJS practice - sample website", "Открылась не та страница при нажатии Resources -> Practice Site2");
        authorizationPage.pressImageRegistration();
        softAssert.assertTrue(driver.getTitle().contains("Registration"), "Title страницы не содержит \"Registration\". Страница авторизации не открылась");
        authorizationPage.fillFields(loginDetails.get(0), loginDetails.get(1), loginDetails.get(2));
        softAssert.assertEquals("Home", authorizationPage.getLabelText(), "Авторизация не прошла успешно");
        softAssert.assertAll();
    }
}
