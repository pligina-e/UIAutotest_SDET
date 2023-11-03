package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MultiformPage;

@Epic("������������ �������� multiform")
@Feature("������� ������� � ����������� �������� ������")
public class FormProfileTest extends BaseTest {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("������������ ����� ������ ����� � ���� �����, � ����� ������� ������ �� ��������")
    public final void multiformPageTest() {
        MultiformPage multiformPage = new MultiformPage(driver);
        Assert.assertTrue(multiformPage.presenceOfScroll(), "������ �� ������ �� ��������");
        Assert.assertTrue(multiformPage.removeFocus(), "����� �� ����� � ���� �����");
    }
}
