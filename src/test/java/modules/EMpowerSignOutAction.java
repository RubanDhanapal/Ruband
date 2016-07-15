package modules;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import helpers.Log;
import pageobjects.EMpowerLogOff;

public class EMpowerSignOutAction {
	public static void Execute(WebDriver driver) throws Exception {

		// driver.switchTo().window(driver.getWindowHandle());
		driver.switchTo().defaultContent();
		System.out.println(driver.getPageSource());
		System.err.println("asfkdsjnfdsjkf    " + EMpowerLogOff.logout.isDisplayed());

		/*
		 * driver.switchTo().frame("main");
		 * EMpowerLogOff.p_po_no.sendKeys("krishna");
		 */
		Log.info("Sign out is performed");
		Reporter.log("Sign out is performed");
	}
}