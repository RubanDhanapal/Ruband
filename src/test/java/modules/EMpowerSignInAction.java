package modules;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import helpers.Log;
import pageobjects.EMpowerLogin;

public class EMpowerSignInAction {

	public static void Execute(WebDriver driver, HashMap<String, String> map) throws Exception {

		EMpowerLogin.p_user_cd.sendKeys(map.get("username"));
		Log.info(" is entered in UserName text box");

		EMpowerLogin.p_password.sendKeys(map.get("password"));
		Log.info(" is entered in Password text box");

		EMpowerLogin.p_button.click();
		Log.info("Click action is performed on Submit button");

		Reporter.log("SignIn Action is successfully perfomred");
	}
}
