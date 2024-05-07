package pagepkg;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TestData {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"send2\"]")
	WebElement signIn;

	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/nav/ul/li[3]/a/span[2]")
	WebElement menItems;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/ul/li[1]/a/span[2]")
	WebElement menTops;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/ul/li[1]/ul/li[1]/a/span")
	WebElement tank;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[5]/div/a/span/span/img")
	WebElement selectedItem;
	
	@FindBy(xpath="//*[@id=\"option-label-size-143-item-167\"]")
	WebElement size;
	
	@FindBy(xpath="//*[@id=\"qty\"]")
	WebElement quantity;
	
	@FindBy(xpath="//*[@id=\"option-label-color-93-item-49\"]")
	WebElement selectColor;
	
	@FindBy(xpath="//*[@id=\"product-addtocart-button\"]")
	WebElement addToCart;
	
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[1]/a")
	WebElement viewCartButton;
	
	@FindBy(xpath="//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span")
	WebElement viewCart;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/ul/li[1]/button")
	WebElement proceedOption;
	
	@FindBy(xpath="//*[@id=\"S443A8J\"]")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"JOPSW64\"]")
	WebElement street;
	
	@FindBy(xpath="//*[@id=\"CLOW7TN\"]")
	WebElement region;
	
	@FindBy(xpath="//*[@id=\"OIP6H64\"]")
	WebElement zipcode;
	
	@FindBy(xpath="//*[@id=\"XSGVIUL\"]")
	WebElement country;
	
	@FindBy(xpath="//*[@id=\"LU0CJEM\"]")
	WebElement phoneNumber;
	
	@FindBy(xpath="//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[2]/td[1]/input")
	WebElement radioButtonFixed;
	
	@FindBy(xpath="/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")
	WebElement next;
	
	@FindBy(xpath="/html/body/div[3]/main/div[2]/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button")
	WebElement placeOrder;
	
	public TestData(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login()
	{
		login.click();
		email.sendKeys("varsha@gmail.com");
		password.sendKeys("Varsha@1997");
		signIn.click();
	}
	
	public void clickTab()
	{
		Actions act=new Actions(driver);
		act.moveToElement(menItems).perform();
		act.moveToElement(menTops).perform();
		act.moveToElement(tank).perform();
		tank.click();
	}
	
	public void selectItems()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectedItem);
		selectedItem.click();
		size.click();
		quantity.clear();
		quantity.sendKeys("2");
		selectColor.click();
		addToCart.click();
	}
	
	public void cartFunctions() throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor javas= (JavascriptExecutor) driver;
		javas.executeScript("arguments[0].scrollIntoView(true);", viewCartButton);
		viewCartButton.click();
		viewCart.click();
		proceedOption.click();
	}
	
	public void shipping() throws Exception 
	{
		Thread.sleep(3000);
		JavascriptExecutor jas = (JavascriptExecutor) driver;
	    jas.executeScript("arguments[0].scrollIntoView(true);", next);
		next.click();
	}
	public void finalPlaceOrder()throws Exception
	{
		
		Thread.sleep(3000);
		JavascriptExecutor javs = (JavascriptExecutor) driver;
	    javs.executeScript("arguments[0].scrollIntoView(true);", placeOrder);
		placeOrder.click();
	}
}
