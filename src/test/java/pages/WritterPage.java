package pages;

import org.openqa.selenium.By;

public class WritterPage extends BasePage{
    public By writter_element =By.xpath("//a[@id='js--authors']");
    public By writter_humayan = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
    public By somokalin_text = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public By rochona_text = By.xpath("//label[@for='rok-filter-categoryIds-1321']");
    public By add_cross_btn = By.xpath("//span[@aria-hidden='true']");
}
