package pages;

import org.openqa.selenium.By;

public class WritterPage extends BasePage{
    public By writter_element =By.xpath("//a[@id='js--authors']");
    public By writter_humayan = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
    public By somokalin_text = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public By rochona_text = By.xpath("//label[@for='rok-filter-categoryIds-1321']");
    public By add_cross_btn = By.xpath("//span[@aria-hidden='true']");
    public By page_arrow_btn = By.xpath("//div[@class='browse-page']//a[4]");
    public By second_page_btn = By.xpath("//a[normalize-space()='2']");
    public By cart_kothau_keu_nai = By.xpath("//h4[contains(text(),'কোথাও কেউ নেই')]");
    public By add_cart_btn = By.xpath("//div[@title='কোথাও কেউ নেই হুমায়ূন আহমেদ']//div[1]//div[3]//button[1]");
    public By cart_quantity = By.xpath("//span[@class='js--cart-quantity']");
}
