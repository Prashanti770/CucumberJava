package Stepdefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Loginsteps {
	WebDriver driver;

	@Given("launch browser")
	public void launch_browser() {
		System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("launch browser");
		
	}

	@When("I Open OrangeHrm page")
	public void open_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("open url");
		
	}
/*
	@And("enter username as {string} and password as {string}")
	public void fill_details(String string, String string2) {
		System.out.print("Enter details");
		
	}
*/

	@And("click on Login button")
	public void click_login() {
	
		System.out.println("Click Login");
	}

	@Then("User must be successfully logged in to the dashboard page")
	public void verify_login() {
		
		System.out.println("verify Login");
		
	
	}


}
