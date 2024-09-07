package in.debasish.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.debasish.AbstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents{

	public LandingPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//img[@alt='Test Store']")
	WebElement testStrLogo;
	
	public boolean islogoDisplayedorNot() {
		return testStrLogo.isDisplayed();
	}
	
}
