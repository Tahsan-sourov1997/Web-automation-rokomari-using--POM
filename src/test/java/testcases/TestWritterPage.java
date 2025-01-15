package testcases;

import org.openqa.selenium.interactions.Actions;
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
        homePage.clickElement(homePage.cross_btn);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(writterPage.getElement(writterPage.writter_element)).build().perform();
        Thread.sleep(5000);
        writterPage.clickElement(writterPage.writter_humayan);
        Thread.sleep(3000);
        actions.scrollByAmount(0,1000).build().perform();
        Thread.sleep(5000);




    }

}
