package mercurystep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mercurystep {
	
	
	public WebDriver d;
	public WebElement date;

	
	
	
	@Given("^Laundh Site$")
	public void laundh_Site() throws Throwable
	
	{
	   
		WebDriverManager.firefoxdriver().setup();
		d= new FirefoxDriver();
		d.get("https://www.mercurytravels.co.in");
		d.manage().window().maximize();
		
	
	}

	@When("^Click on Holidays button$")
	public void click_on_Holidays_button() throws Throwable 
	{
		
	WebElement holiday = d.findElement(By.xpath("//*[@id=\'holidays\']"));
	holiday.click();
			    
	}

	@When("^Enter Destination$")
	public void enter_Destination() throws Throwable 
	{
	   
		WebElement destination = d.findElement(By.xpath("//*[@id=\'holiday_category_id\']"));
		destination.sendKeys("Manali,India(504)");
		
	}

	@When("^Enter Start Date$")
	public void enter_Start_Date() throws Throwable 
	{
		date= d.findElement(By.xpath("//*[@id=\'dphh1\']"));
		date.click();
		
		WebElement cal = d.findElement(By.xpath("/html/body/div[15]/div[1]/table/tbody/tr[3]/td[5]"));
		cal.click();
		
	}

	
	@When("^Chosse Duration$")
	public void chosse_Duration() throws Throwable
	{
		WebElement dropd = d.findElement(By.xpath("//*[@id=\'duration_d\']"));
		Select ddn = new Select (dropd);
		ddn.selectByValue("8Nights / 9Days");
	}

	@When("^Choose type of Holiday$")
	public void choose_type_of_Holiday() throws Throwable 
	{
	    
		WebElement dropd1 = d.findElement(By.xpath("//*[@id=\'themes\']"));
		Select ddn1= new Select (dropd1);
		ddn1.selectByVisibleText("Adventure");
	}

	
	@When("^Click on Search Holidays button$")
	public void click_on_Search_Holidays_button() throws Throwable
	{
	    
		WebElement search = d.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div/div/div[2]/div/div[4]/form/div/div/div[3]/div/div/button"));
		search.click();
		
		
	}

	@Then("^Search result should be displayed$")
	public void search_result_should_be_displayed() throws Throwable 
	{
	    
		System.out.println("Result Should Get Searched");
		
		
	}

	
}
