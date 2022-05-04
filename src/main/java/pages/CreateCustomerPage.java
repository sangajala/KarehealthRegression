package pages;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCustomerPage extends basePage{

    @FindBy(id = "customer_name")
    private WebElement customerNameLocator;

    @FindBy(id = "phone_number")
    private WebElement phoneNumberLocator;

    @FindBy(id = "email")
    private WebElement emailLocator;

    @FindBy(id = "password")
    private WebElement passwordLocator;

    @FindBy(id = "blood_group")
    private WebElement bloodGroupLocator;



    public CreateCustomerPage(WebDriver driver) {
        super(driver);
    }

    public void addNewCustomer(String customerName, String phoneNumber, String email, String password, String bloodGroup) {
        customerNameLocator.sendKeys(customerName);
        phoneNumberLocator.sendKeys(phoneNumber);
        emailLocator.sendKeys(email);
        passwordLocator.sendKeys(password);
        bloodGroupLocator.sendKeys(bloodGroup);
        submit();
    }
}
