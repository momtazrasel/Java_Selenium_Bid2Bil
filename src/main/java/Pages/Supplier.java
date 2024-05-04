package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Supplier {
    public WebDriver driver;

    public Supplier(WebDriver driver) {
        this.driver = driver;
    }

    public By supplierPage = By.xpath("(//h1[normalize-space()='Supplier'])[1]");

    public void getSupplierPage() throws InterruptedException {

        ReusableMethod.isElementDisplayed(supplierPage);
    }
}
