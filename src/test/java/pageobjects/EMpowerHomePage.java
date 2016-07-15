package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EMpowerHomePage extends BaseClass {

	public EMpowerHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.LINK_TEXT, using = "Login")
	public static WebElement log_in;

	@FindBy(how = How.LINK_TEXT, using = "Forgot Password")
	public static WebElement forgot_password;
	
}
