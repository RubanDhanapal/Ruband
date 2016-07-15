package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderMang extends BaseClass {

	public OrderMang(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.LINK_TEXT, using = "uORDER")
	public static WebElement uorder;
}
