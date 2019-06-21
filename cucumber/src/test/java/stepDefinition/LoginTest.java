package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	WebDriver driver;
	@Given("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("user is on home page");
		System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
		System.out.println("user enters username and password");
		LoginObjectRepository.usern.sendKeys("tomsmith");
		LoginObjectRepository.passw.sendKeys("SuperSecretPassword!");
		LoginObjectRepository.Login.click();
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
		System.out.println("user logged in successfully");
	}
}
