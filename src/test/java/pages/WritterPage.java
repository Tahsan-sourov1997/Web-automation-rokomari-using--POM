package pages;

import org.openqa.selenium.By;

public class WritterPage extends BasePage{
    public By writter_element =By.xpath("//a[@id='js--authors']");
    public By writter_humayan = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
}
