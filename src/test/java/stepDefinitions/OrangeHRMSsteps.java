package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSsteps {

    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DULLAH\\Downloads\\chromedriver_win32.zip" );
        driver=new ChromeDriver();  // Launch Chrome browser

    }

    @When("I open the orange hrm homepage")
    public void i_open_the_orange_hrm_homepage() {
        driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

    }

    @Then("I can verify the logo is present on the page")
    public void i_can_verify_the_logo_is_present_on_the_page() {

       boolean status= driver.findElement(By.xpath("/html/body/nav/div/a/img")). isDisplayed();
        Assert.assertTrue(status);

    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.quit();

    }
}
