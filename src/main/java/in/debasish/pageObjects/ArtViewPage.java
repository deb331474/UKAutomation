package in.debasish.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.debasish.AbstractComponents.AbstractComponents;

public class ArtViewPage extends AbstractComponents{

	public ArtViewPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(css = ".dropdown-item[href='http://teststore.automationtesting.co.uk/9-art']")
	WebElement artLnk;
	
	@FindBy(css = ".ui-slider-range.ui-widget-header.ui-corner-all")
	WebElement sliderPriceLnk;
	
	//"slider-range_58206"
	
	@FindBy(css = ".filter-block")
	WebElement activeFilterText;
	
	public void clickOnArtLink() {
		waitforElementToBeClickable(artLnk);
		artLnk.click();
	}
	
	public void sliderActivationBar() {
		waitforElementToBeVisible(sliderPriceLnk);
		
	}
	
	

}
