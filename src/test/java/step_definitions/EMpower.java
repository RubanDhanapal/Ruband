package step_definitions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.EMpowerSignInAction;
import modules.EMpowerSignOutAction;
import pageobjects.EMpowerHomePage;
import pageobjects.EMpowerLogOff;
import pageobjects.EMpowerLogin;

public class EMpower {
	public WebDriver driver;
	public static List<LinkedHashMap<String, String>> datamap = null;

	public EMpower() {
		driver = Hooks.driver;
		datamap = new ArrayList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> sampleData = new LinkedHashMap<String, String>();
		sampleData.put("username", "hclmba");
		sampleData.put("password", "Ahmed2427");
		System.out.println("Current data" + sampleData);
		datamap.add(sampleData);
	}

	@When("^I open empower website$")
	public void i_open_empower_website() throws Throwable {
		driver.get("https://empower.qc.go2uti.com");
	}

	@When("^I empowerSign in$")
	public void i_sign_in() throws Throwable {
		PageFactory.initElements(driver, EMpowerHomePage.class);
		PageFactory.initElements(driver, EMpowerLogin.class);
		EMpowerSignInAction.Execute(driver, datamap.get(0));
	}

	@When("^I entered into Ordermang$")
	public void i_entered_into_ordermang() throws Throwable {
		//PageFactory.initElements(driver, OrderMang.class);
		//OrderMangAction.Execute(driver);
	}

	@Then("^I empowerSign out$")
	public void i_sign_out() throws Throwable {
		PageFactory.initElements(driver, EMpowerLogOff.class);
		EMpowerSignOutAction.Execute(driver);
	}

}