package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EMpowerLogOff extends BaseClass {

	public EMpowerLogOff(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "main")
	public static WebElement p_access_profile;

	@FindBy(how = How.ID, using = "P_PO_NO")
	public static WebElement p_po_no;

	@FindBy(how = How.ID, using = "splashBG")
	 // @FindBy(how = How.XPATH, using = "//img[contains(@src,'images/eMpower_new.gif')]")
	// @FindBy(how = How.XPATH, using = "a[contains(@href, 'empower.qc.go2uti.com/uti/logout')]")
	// @FindBy(how = How.XPATH, using = "*[contains(@href, 'empower.qc.go2uti.com/uti/logout')]")
	// @FindBy(how = How.XPATH, using = "//a[contains(@class, 'black') and text() = 'Log Off']")
	 //@FindBy(how = How.XPATH, using="//a[contains(@href,'empower.qc.go2uti.com/uti/logout')]")
	public static WebElement logout;
}
