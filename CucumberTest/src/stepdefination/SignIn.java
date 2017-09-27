package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignIn {
	
	public static WebDriver driver;
	
	By sSignPage = By.linkText("SIGN-ON");
	By sUserName = By.name("userName");
	By sUserPassword = By.name("password");
	By sLogin = By.name("login");
	
	@Given("^User access the Mercury Tour site$")
	public void user_access_the_Mercury_Tour_site() throws Throwable {
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@When("^User Navigate to SignIn Page$")
	public void user_Navigate_to_SignIn_Page() throws Throwable {
		driver.findElement(sSignPage).click();
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(sUserName).sendKeys("ajitkp@gmail.com");
		driver.findElement(sUserPassword).sendKeys("ajity050");
	}

	@When("^User click singIn$")
	public void user_click_singIn() throws Throwable {
		driver.findElement(sLogin).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
