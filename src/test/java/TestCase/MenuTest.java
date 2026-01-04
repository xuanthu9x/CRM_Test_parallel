package TestCase;

import Common.BaseTest;
import Pages.BasePage;
import Pages.LoginPage;
import driver.DriverFactory;
import keywords.Common;
import org.testng.annotations.Test;

public class MenuTest extends BaseTest {
    LoginPage login;
    BasePage basePage;
    @Test()
    public void checkMenuList() throws InterruptedException {
        System.out.println("Verify menu list");
        login = new LoginPage();
        basePage = login.Login("admin@example.com","123456");
        BasePage.checkMenuList();
        BasePage.checkSaleSubMenu();
        BasePage.checkUtilitiesSubMenu();
        BasePage.checkReportsSubMenu();
    }
    @Test()
    public void verifyNavigateCustomerPage() throws InterruptedException {
        System.out.println("Verify navigate to Customer page");
        login = new LoginPage();
        basePage = login.Login("admin@example.com","123456");
        BasePage.verifyNavigateCustomePage();
    }
}
