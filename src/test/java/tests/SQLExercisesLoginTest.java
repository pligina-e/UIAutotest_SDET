package tests;

import helpers.Cookies;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SQLExercisesPage;

@Epic("������������ ������� �������� ����� www.sql-ex.ru")
@Feature("�����������")
public class SQLExercisesLoginTest extends BaseTest {
    @Test(description = "����������� �� ����� www.sql-ex.ru")
    @Severity(SeverityLevel.CRITICAL)
    @Story("������������ ������ ������ � ���� ����� � ������, ����� �������� �� ������ �����, ����� ����������������")
    public final void loginTest() {
        SQLExercisesPage exercisesPage = new SQLExercisesPage(driver);
        Cookies cookies = new Cookies(driver);
        exercisesPage.fillFields("pligina-e", "1234554321999");
        cookies.createFileWithCookie(driver, "PHPSESSID");
        Assert.assertTrue(exercisesPage.presenceOfImageButton(), "����������� �� ������ �������. ��������, ������� ������������ ������");
    }

    @Test(description = "����������� �� ����� www.sql-ex.ru")
    @Severity(SeverityLevel.CRITICAL)
    @Story("����������� � ������� cookie")
    public final void loginWithCookieTest() {
        SQLExercisesPage exercisesPage = new SQLExercisesPage(driver);
        Cookies cookies = new Cookies(driver);
        cookies.addCookieForLogin(driver, "PHPSESSID");
        Assert.assertTrue(exercisesPage.presenceOfImageButton(), "����������� �� ������ �������. ��������, cookie ����������� ����������� �� ����");
    }
}
