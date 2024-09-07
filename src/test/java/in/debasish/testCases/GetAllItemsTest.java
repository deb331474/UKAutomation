package in.debasish.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.debasish.pageObjects.HomePage;
import in.debasish.pageObjects.LandingPage;
import in.debasish.pageObjects.PrductDetailsPage;

public class GetAllItemsTest extends BaseTest{
	
	@Test
	public void getAlltheContent() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.clickOnSignLink();
		log.info("Clicked on the signIn link");
		LandingPage lp=hp.getlandingPage("prusethdebasish@gmail.com", "Debudon@211");
		log.info("Successfully logged into the application");
		Assert.assertTrue(lp.islogoDisplayedorNot());
		PrductDetailsPage pdp= new PrductDetailsPage(driver);
		pdp.getAlltheProducts();
		pdp.getParticularProduct("Mug The best is yet to come");
		pdp.clickonParticularProd("Mug The best is yet to come");
		pdp.getthePriceofTheProduct();
		//pdp.getMoreQuantity(4);
		//pdp.getLessQuantity(2);
		pdp.increaseQuantity(8);
		pdp.decreaseQuantity(3);
		Thread.sleep(3000);
	}

}
