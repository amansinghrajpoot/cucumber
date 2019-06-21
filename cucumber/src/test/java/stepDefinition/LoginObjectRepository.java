package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjectRepository {
	
	WebDriver driver;
	
	public LoginObjectRepository(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(name= "username")
	public static WebElement usern;

	@FindBy(name= "password")
	public static WebElement passw;
	
	@FindBy(className="radius")
	public static WebElement Login;
}
