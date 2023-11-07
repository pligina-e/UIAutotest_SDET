package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabsPage extends BasePage {
    @FindBy(css = "iframe")
    WebElement frame;
    @FindBy(xpath = "//*[text()='New Browser Tab']")
    WebElement link;

    public TabsPage(final WebDriver webDriver) {
        super(webDriver);
    }

    @Step("������ �� ������, ������� �� ����� ������� � ������� ���������� �������� �������")
    public int clickLinkAndGoToNewTab(int count) {
        link.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            count++;
        }
        return count;
    }
    @Step("������� �� ������ � ��������� �� ����� ������� �2, ����� ���������� ���-�� �������� �������")
    public int getCountOfOpenTabsHandles() {
        int count = 0;
        driver.switchTo().frame(frame);
        clickLinkAndGoToNewTab(count);
        return clickLinkAndGoToNewTab(count);
    }
}
