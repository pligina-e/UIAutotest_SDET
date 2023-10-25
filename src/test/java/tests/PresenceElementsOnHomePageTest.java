package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class PresenceElementsOnHomePageTest extends BaseTest {
    @Test(description = "Проверка наличия элементов главной страницы")
    public final void homePageElementsTest() {
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage(driver);
        softAssert.assertTrue(driver.getTitle().contains("Way2Automation"),"Title страницы не содержит \"Way2Automation\". Открылась не главная страница");

        String coursesBlockText = homePage.titleOfCoursesBlock();
        String certificationBlockText = homePage.titleOfCertificationBlock();
        List<String> actualListOfHeaderLinks = List.of("+919711-111-558", "+919711-191-558", "+1 646-480-0603", "seleniumcoaching", "trainer@way2automation.com");
        List<String> actualListOfMenuLinks = List.of("Home", "All Courses", "Video Tutorial", "Resources", "Careers", "Lifetime Membership", "Blog", "Forum", "Member Login");
        ArrayList<String> expectedListOfHeaderLinks = homePage.getContactDetailsOfHeader();
        ArrayList<String> expectedListOfHMenuLinks = homePage.getLinksOfHorizontalMenu();

        softAssert.assertTrue(homePage.presenceOfHeader(), "Хидер не найден на странице");
        softAssert.assertTrue(homePage.presenceOfMenu(), "Горизонтальное меню не найдено на странице");
        softAssert.assertEquals(actualListOfHeaderLinks, expectedListOfHeaderLinks, "Хидер с реквизитами для связи некорректен");
        softAssert.assertEquals(actualListOfMenuLinks, expectedListOfHMenuLinks, "Горизонтальное меню некорректно");
        softAssert.assertEquals("Best Selenium Certification Course Online", certificationBlockText, "Некорректное название блока сертификации");
        softAssert.assertTrue(homePage.presenceOfCertificationBlock(), "Блок сертификации не найден на странице");
        softAssert.assertEquals("Most Popular Software Testing Courses", coursesBlockText, "Некорректное название блока курсов");
        softAssert.assertTrue(homePage.presenceOfCoursesBlock(), "Блок с курсами не найден на странице");
        softAssert.assertTrue(homePage.presenceOfFooter(), "Футер не найден на странице");
        softAssert.assertAll();
    }
}
