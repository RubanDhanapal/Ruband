package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EMpowerLogin extends BaseClass {

	public EMpowerLogin(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.NAME, using = "P_USER_CD")
	public static WebElement p_user_cd;

	@FindBy(how = How.NAME, using = "P_PASSWORD")
	public static WebElement p_password;

	@FindBy(how = How.XPATH, using = "//img[contains(@src,'images/login.gif')]")
	public static WebElement p_button;

}
