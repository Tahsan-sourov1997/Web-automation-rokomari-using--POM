package testcases;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.driverSetup;

public class TestHomePage extends driverSetup {
    HomePage homePage = new HomePage();
    @Test
    public void testHomepage() throws InterruptedException {
        homePage.loadAnWebPage(homePage.home_url);
        homePage.clickElement(homePage.cross_btn);
        homePage.clickElement(homePage.sign_in_btn);
        homePage.clickElement(homePage.google_sign_in_btn);
//        homePage.clickElement(homePage.select_email_btn);
        Thread.sleep(5000);
        homePage.writeElement(homePage.email_field, "tahsanhossain776@gmail.com");
        homePage.clickElement(homePage.next_btn);
        homePage.writeElement(homePage.password_field, "Tahsan1997#");
        homePage.clickElement(homePage.next_btn);


    }
}
