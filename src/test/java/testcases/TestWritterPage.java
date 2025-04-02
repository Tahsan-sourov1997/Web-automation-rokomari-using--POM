package testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.WritterPage;
import utilities.driverSetup;

public class TestWritterPage extends driverSetup{
    HomePage homePage = new HomePage();
    WritterPage writterPage = new WritterPage();
    @Test
    public void testWritterPage() throws InterruptedException {
        homePage.loadAnWebPage(homePage.home_url);
        Thread.sleep(20000);
//        homePage.clickElement(homePage.cross_btn);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(writterPage.getElement(writterPage.writter_element)).build().perform();
        Thread.sleep(5000);
        writterPage.clickElement(writterPage.writter_humayan);
        Thread.sleep(3000);
        actions.scrollToElement(writterPage.getElement(writterPage.rochona_text)).build().perform();
        Thread.sleep(5000);
//        writterPage.clickElement(writterPage.add_cross_btn);
        writterPage.clickElement(writterPage.somokalin_text);
        actions.scrollToElement(writterPage.getElement(writterPage.rochona_text)).build().perform();
        writterPage.clickElement(writterPage.rochona_text);
        actions.moveToElement(writterPage.getElement(writterPage.page_arrow_btn)).build().perform();
        Thread.sleep(5000);
        writterPage.clickElement(writterPage.second_page_btn);
        actions.scrollToElement(writterPage.getElement(writterPage.rochona_text)).build().perform();
        actions.moveToElement(writterPage.getElement(writterPage.cart_basor));
        Thread.sleep(3000);
        actions.moveToElement(writterPage.getElement(writterPage.cart_basor)).build().perform();
        writterPage.clickElement(writterPage.add_cart_btn);
        Thread.sleep(4000);
        String cart_number = writterPage.getElement(writterPage.cart_quantity).getText();
//        System.out.println(cart_number);
        Assert.assertEquals(cart_number, "1");
        writterPage.clickElement(writterPage.cart_quantity);
        Thread.sleep(3000);
        writterPage.clickElement(writterPage.checkout_btn);







    }

}
