import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CreateCustomerPage;
import pages.CustomerPage;
import pages.HomePage;

public class MyStepdefs {

    WebDriver driver;
    HomePage homePage;
    CustomerPage customerPage;
    CreateCustomerPage createCustomerPage;
    @Before
    public void start(){
        driver = TestRunner.driver;
        homePage = new HomePage(driver);
        customerPage = new CustomerPage(driver);
        createCustomerPage = new CreateCustomerPage(driver);
    }

    @Given("^Admin is in landing page$")
    public void adminIsInLandingPage() {
        Assert.assertTrue(driver.findElement((By.name("username"))).isDisplayed());
    }

    @When("^he logins as valid admin to the application$")
    public void heLoginsAsValidAdminToTheApplication() {
        homePage.adminLogin();
    }

    @Then("^he should see the dashboard$")
    public void heShouldSeeTheDashboard() {
        Assert.assertTrue(driver.findElement(By.className("sidebar-toggle")).isDisplayed());
    }

    @Given("admin is in create customers page")
    public void adminIsInCreateCustomersPage() {
        homePage.adminLogin();
        customerPage.navigateToCustomerPage();
    }

    @When("he creates the customer with fields {string},{string},{string},{string},{string}")
    public void heCreatesTheCustomerWithFields(String customerName, String phoneNumber, String email, String password, String bloodGroup) {
        customerPage.createNewRecord();
        createCustomerPage.addNewCustomer(customerName,phoneNumber,email,password,bloodGroup);
    }

    @Then("the customer should be created")
    public void theCustomerShouldBeCreated() {
        Assert.assertTrue(driver.findElement(By.className("column-customer_name")).isDisplayed());
    }

    @Then("he should logout")
    public void heShouldLogout() {
        driver.navigate().to("http://karehealth.menpaniproducts.com/admin/auth/logout");
    }
}
