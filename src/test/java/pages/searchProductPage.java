package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchProductPage {
	
	WebDriver driver;
	
	public searchProductPage(WebDriver dr) {
		
		driver = dr;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "APjFqb")
	WebElement searchbar;
	
	@FindBy(name = "btnK")
	WebElement searchButton;
	
	@FindBy(id = "result-stats")
	WebElement searchresult;
	
	public void enterProductName(String productName) {
		searchbar.sendKeys(productName);
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	public boolean isSearchResultDisplayed() {
		return searchresult.isDisplayed();
	}
	
	
	
	

}
