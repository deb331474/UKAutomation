package in.debasish.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.debasish.pageObjects.HomePage;
import in.debasish.pageObjects.LandingPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginToApp() {
		
		HomePage hp=new HomePage(driver);
		hp.clickOnSignLink();
		log.info("Clicked on the signIn link");
		LandingPage lp=hp.getlandingPage("prusethdebasish@gmail.com", "debudon@211");
		log.info("Successfully logged into the application");
		Assert.assertTrue(lp.islogoDisplayedorNot());
		
		
	}

}
