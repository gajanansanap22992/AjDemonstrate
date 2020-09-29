package Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmdocxTestSteps {
	public static WebDriver driver;
	
	
	@Given("User Launch browser--")
	public void user_Launch_browser() 
	{
	   System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Given("User Open Url {string}")
	public void user_Open_Url(String url) 
	{
	    driver.get(url);
	}

	@Then("User validate homePage Title as {string}")
	public void user_validate_homePage_Title_as(String title) {
	 // Assert.assertEquals(driver.getTitle(), title);
	}

	@Then("user click on Myaccount button")
	public void user_click_on_Myaccount_button() {
		
		driver.findElement(By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']")).click();
	   
	}

	@Then("User select Sign up Option by clicking on it")
	public void user_select_Sign_up_Option_by_clicking_on_it() {
	   driver.findElement(By.xpath("//a[contains(text(),'Sign Up') and @class='dropdown-item tr']")).click();
	}

	@Then("User verify the Sign Up page by this Url {string}")
	public void user_verify_the_Sign_Up_page_by_this_Url(String url) {
	   Assert.assertEquals(driver.getCurrentUrl(), url);
	}

	@Then("User provide the sign Up details")
	public void user_provide_the_sign_Up_details() {
		
		driver.findElement(By.xpath("//span[contains(text(),'First Name')]")).sendKeys("gajanan");
		driver.findElement(By.xpath("//span[contains(text(),'Last Name')]")).sendKeys("sanap");
		
		driver.findElement(By.xpath("//span[contains(text(),'Mobile')]")).sendKeys("99999999999");
        driver.findElement(By.xpath("//span[contains(text(),'Email')]")).sendKeys("gnsanap@gmail.com");	
        driver.findElement(By.xpath("//input[ @name='password']")).sendKeys("gs123@test");
        driver.findElement(By.xpath("//input[ @name='confirmpassword']")).sendKeys("gs123@test");
        driver.findElement(By.xpath("//div[@class='form-group']//button[ @type='submit']")).click();
	}


	
	

}
