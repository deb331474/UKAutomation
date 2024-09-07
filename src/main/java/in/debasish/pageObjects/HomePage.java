package in.debasish.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.debasish.AbstractComponents.AbstractComponents;

public class HomePage extends AbstractComponents{
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Sign in'])[1]")
	WebElement signInBtn;
	
	@FindBy(xpath = "//a[normalize-space()='No account? Create one here']")
	WebElement createAccountBtn;
	
	@FindBy(css = "input[class='form-control']")
	WebElement email;
	
	
	@FindBy(css = ".js-visible-password")
	WebElement password;
	
	@FindBy(css = "#submit-login")
	WebElement loginBtn;
	
	
	
	
	public void clickOnSignLink() {
		waitforElementToBeVisible(signInBtn);
		signInBtn.click();
	}
	
	public LandingPage getlandingPage(String uname,String pswd) {
		waitforElementToBeVisible(email).sendKeys(uname);
		waitforElementToBeVisible(password).sendKeys(pswd);
		waitforElementToBeVisible(loginBtn).click();
		return new LandingPage(driver);
	}
	
	  public CreateanAccountPage getcreateAccountPage() {
			waitforElementToBeVisible(createAccountBtn).click();
			return new CreateanAccountPage(driver);
		}
}
