package tests;

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
        exercisesPage.fillFields("pligina-e", "1234554321999");
        exercisesPage.createFileWithCookie();
        Assert.assertTrue(exercisesPage.presenceOfImageButton(), "����������� �� ������ �������. ��������, ������� ������������ ������");
    }

    @Test(description = "����������� �� ����� www.sql-ex.ru")
    @Severity(SeverityLevel.CRITICAL)
    @Story("����������� � ������� cookie")
    public final void loginWithCookieTest() {
        SQLExercisesPage exercisesPage = new SQLExercisesPage(driver);
        exercisesPage.addCookieForLogin();
        Assert.assertTrue(exercisesPage.presenceOfImageButton(), "����������� �� ������ �������. ��������, cookie ����������� ����������� �� ����");
    }
}
