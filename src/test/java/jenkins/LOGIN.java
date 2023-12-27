package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LOGIN {
	 WebDriver driver;

	    @BeforeTest
	    public void setup() {

	        System.out.println("launching app on chrome browser -----using TestNG");
	        driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	        driver.manage().window().maximize();
	    }

	    @AfterTest
	    public void close() {
	    	driver.close();
	        System.out.println("closing an app");

	    }
	    @Test
	    public void login() throws Exception {
	    	Thread.sleep(1000);
	    	WebElement username= driver.findElement(By.cssSelector("[name='username']"));
	    	username.click();
	    	username.sendKeys("Admin");
	    	Thread.sleep(2000);
	    	
	    	
	    	WebElement password= driver.findElement(By.cssSelector("[name='password']"));
	    	password.click();
	    	password.sendKeys("admin123");
	    	Thread.sleep(2000);
	    	

	    	WebElement login_btn = driver.findElement(By.cssSelector("[type='submit']"));
	    	login_btn.click();
	    	
	    	driver.findElement(By.cssSelector("[class='oxd-userdropdown-tab']")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("[//a[text()='Logout']")).click();
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.cssSelector("[class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
	    	Thread.sleep(2000);
	    	
	    	
	    	
	    	
	    }


}

