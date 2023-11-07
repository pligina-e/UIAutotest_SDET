package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TabsPage;

@Epic("������������ �������� frames-and-windows.php")
@Feature("��� ������� �� ������ ���������� ������� �� ����� ����������� �������")
public class TabsTest extends BaseTest {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("������������ �������� �� ������, ����� ������� �� ����� �������")
    public final void tabsTest() {
        TabsPage tabsPage = new TabsPage(driver);
        Assert.assertEquals(3, tabsPage.getCountOfOpenTabsHandles(), "���-�� �������� ������� �� ����� ���");
    }
}
