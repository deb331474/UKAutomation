package in.debasish.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.debasish.pageObjects.CreateanAccountPage;
import in.debasish.pageObjects.HomePage;
import in.debasish.utilities.TestUtil;

public class CreateAccountTest extends BaseTest{
	
	@Test(dataProviderClass = TestUtil.class,dataProvider = "dp")
	public void createAccountTest(String firstname,String lastname,String email,String password,String dob) {
		HomePage homePage=new HomePage(driver);
		homePage.clickOnSignLink();
		CreateanAccountPage createanAccountPage=homePage.getcreateAccountPage();
		createanAccountPage.selectRadioBtn();
		createanAccountPage.enterFirstName(firstname);
		createanAccountPage.enterLastName(lastname);
		createanAccountPage.enterEmail(email);
		createanAccountPage.enterPassword(password);
		createanAccountPage.enterBirthDate(dob);
		createanAccountPage.selectTermsnCondiChekBox();
		createanAccountPage.clickonSaveBtn();
		Assert.assertEquals(createanAccountPage.getPopuProductText().trim(),"POPULAR PRODUCTS");
		createanAccountPage.clickOnSignoutLnk();
	}

}
