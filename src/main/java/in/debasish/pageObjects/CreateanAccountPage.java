package in.debasish.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.debasish.AbstractComponents.AbstractComponents;

public class CreateanAccountPage extends AbstractComponents{

	public CreateanAccountPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath = "//label[normalize-space()='Mr.']")
	WebElement firstradioBtn;
	
	@FindBy(css="input[name='firstname']")
	WebElement firstName;
	
	@FindBy(css="input[name='lastname']")
	WebElement lastName;
	
	@FindBy(css="input[name='email']")
	WebElement email;
	
	@FindBy(css=".js-visible-password")
	WebElement password;
	
	@FindBy(css="input[name='birthday']")
	WebElement birthDate;
	
	@FindBy(css="body > main:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(2) > section:nth-child(1) > section:nth-child(2) > section:nth-child(1) > form:nth-child(2) > section:nth-child(1) > div:nth-child(9) > div:nth-child(2) > span:nth-child(1) > label:nth-child(1)")
	WebElement checkBox;
	
	@FindBy(css = ".btn.btn-primary.form-control-submit.float-xs-right")
	WebElement saveBtn;
	
	
	@FindBy(xpath = "//h2[normalize-space()='Popular Products']")
	WebElement getProductText;
	
	@FindBy(css = ".logout.hidden-sm-down")
	WebElement signOutLink;
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	public void selectRadioBtn() {
		waitforElementToBeVisible(firstradioBtn);
		firstradioBtn.click();
	}

	public void enterFirstName(String fname) {
		waitforElementToBeVisible(firstName);
		firstName.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		waitforElementToBeVisible(lastName);
		lastName.sendKeys(lname);
	}
	public void enterEmail(String emailId) {
		waitforElementToBeVisible(email);
		email.sendKeys(emailId);
	}
	public void enterPassword(String pswd) {
		waitforElementToBeVisible(password);
		password.sendKeys(pswd);
	}
	public void enterBirthDate(String dob) {
		waitforElementToBeVisible(birthDate);
		birthDate.sendKeys(dob);
	}
	public void selectTermsnCondiChekBox() {
		waitforElementToBeVisible(checkBox);
		js.executeScript("arguments[0].scrollIntoView(true);",checkBox);
		checkBox.click();
	}
	
	public void clickonSaveBtn() {
		js.executeScript("arguments[0].scrollIntoView(true);",saveBtn);
		//js.executeScript("arguments[0].click();",saveBtn);
		saveBtn.click();
	}
	
	public String getPopuProductText() {
		waitforElementToBeVisible(getProductText);
		return getProductText.getText();
	}
	
	public void clickOnSignoutLnk() {
		waitforElementToBeVisible(signOutLink);
		signOutLink.click();
	}
	
}
