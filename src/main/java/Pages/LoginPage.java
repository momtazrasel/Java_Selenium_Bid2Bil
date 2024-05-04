package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public By username =By.xpath("(//input[@id='username'])[1]");
    public By password =By.xpath("(//input[@id='password'])[1]");
    public By loginButton =By.xpath("(//button[normalize-space()='Log in'])[1]");
    public By passwordOne =By.xpath("//input[@id = 'input_wp_protect_password']");
    public By enterButton =By.xpath("//input[@class = 'button button-primary button-login']");


    public void getUsername() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(username).sendKeys("madhu.rajan@transcpginc.com");
    }


    public void getPassword() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(password).sendKeys("##Bid2Bill$$");
        Thread.sleep(1000);
    }

    public void getPasswordOne() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(passwordOne).sendKeys("#2ndmay2024#");
        Thread.sleep(1000);
    }

    public void getLogin() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(loginButton).click();
        Thread.sleep(1000);
    }

    public void getEnterButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(enterButton).click();
        Thread.sleep(1000);
    }
}
