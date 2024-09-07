package in.debasish.pageObjects;

import java.util.List;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import in.debasish.AbstractComponents.AbstractComponents;

public class PrductDetailsPage extends AbstractComponents {

	public PrductDetailsPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//div[@class='products']//article")
	List<WebElement> allItems;

	@FindBy(xpath = "//a[text()='Mug The best is yet to come']")
	WebElement product;

	@FindBy(xpath = "//div[@class='current-price']/span")
	WebElement currentPrice;

	public void getAlltheProducts() {

		allItems.stream().map(WebElement::getText).forEach(System.out::println);
	}

	public String getParticularProduct(String prodName) {
		return allItems.stream().map(WebElement::getText).filter(prod -> prod.equalsIgnoreCase(prodName)).findFirst()
				.orElse("Product Not Found");
	}

	public void clickonParticularProd(String prodName) {

		WebElement pr = driver.findElement(By.xpath("//a[text()='" + prodName + "']"));
		waitforElementToBeVisible(pr);
		pr.click();

	}

	public void getthePriceofTheProduct() {
		waitforElementToBeVisible(currentPrice);
		System.out.println(currentPrice.getText());
	}

	public void getMoreQuantity(int times) {
		WebElement upSpinBtn = driver.findElement(By.xpath("//button[contains(@class,'touchspin-up')]"));
		for (int i = 0; i < times; i++) {
			upSpinBtn.click();
			if(i==3)
				break;
		}
	}
	
	public void getLessQuantity(int times) {
		WebElement upSpinBtn = driver.findElement(By.xpath("//button[contains(@class,'touchspin-down')]"));
		for (int i = 1; i < times; i++) {
			upSpinBtn.click();
			if(i==2)
				break;
		}
	}
	
	public void increaseQuantity(int times) {
		 
		WebElement upSpinBtn=driver.findElement(By.xpath("//button[contains(@class,'touchspin-up')]"));
		IntStream.range(0, times).forEach(i->upSpinBtn.click());
	}
	
	public void decreaseQuantity(int times) {
		 
		WebElement downSpinBtn=driver.findElement(By.xpath("//button[contains(@class,'touchspin-down')]"));
		IntStream.range(0, times).forEach(i->downSpinBtn.click());
	}

}
