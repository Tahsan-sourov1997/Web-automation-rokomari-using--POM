package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String home_url = "https://www.rokomari.com/book";
    public By sign_in_btn = By.xpath("//a[normalize-space()='Hello, Sign in']");
    public By facebook_sign_in_btn = By.xpath("//button[normalize-space()='Facebook']");
    public By google_sign_in_btn = By.xpath("//button[normalize-space()='Google']");
    public By select_email_btn = By.xpath("//div[normalize-space()='TAHSAN HOSSAIN']");
    public By cross_btn = By.xpath("//button[@class='popup-modal__close-btn close-btn-outside js--popup-modal__close-btn']");
    public By email_field = By.xpath("//input[@id='identifierId']");
    public By next_btn = By.xpath("//span[normalize-space()='Next']");
    public By password_field = By.xpath("//input[@name='Passwd']");



}
