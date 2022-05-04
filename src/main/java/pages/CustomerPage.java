package pages;

import org.openqa.selenium.WebDriver;

public class CustomerPage extends basePage{
    public String currentURL = "http://karehealth.menpaniproducts.com/admin/customers";
    public CustomerPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToCustomerPage(){
        driver.get(currentURL);
    }
}
