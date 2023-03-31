package NeoStocks;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class WebsiteAutomation {
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
//SETUP CHROME BROWSER
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//NAVIGATE TO GOOGLE WEBSITE		
		driver.get("https://www.google.com/");
        Thread.sleep(5000);
		WebElement VALUE = driver.findElement(By.xpath("//input[@class='gLFyf']"));

//LAUNCH NEOSTOX IN GOOGLE		
		VALUE.sendKeys("neostox.com");
		Thread.sleep(5000);
		
		//Click on enter
		VALUE.sendKeys(Keys.RETURN);
		Thread.sleep(5000);
		
		//Click on NeoStock link
		driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
		Thread.sleep(5000);
		
		//Click on Sign in
		driver.findElement(By.xpath("(//a[@class='nav-link'])[4]")).click();
		Thread.sleep(5000);
		
		//Enter Mobile No
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$signinsignup$txt_mobilenumber']")).sendKeys("9970849507");
        Thread.sleep(5000);
        //Click on Sign In
        driver.findElement(By.xpath("//a[@href='javascript:WebForm_DoPostBackWithOptions(new WebForm_PostBackOptions(\"ctl00$MainContent$signinsignup$lnk_signup1\", \"\", true, \"valg_signup1\", \"\", false, true))']")).click();
        Thread.sleep(5000);
        
        //Enter Password
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$_wp_enteraccesspin$txt_accesspin']")).sendKeys("7777");
        Thread.sleep(5000);
        
        //Enter on Submit
        driver.findElement(By.xpath("//a[@id='lnk_submitaccesspin']")).click();
        Thread.sleep(5000);
        
        //Click On Logout
        driver.findElement(By.xpath("//a[text()='Log Out']")).click();
        
        //Quit from browser
        driver.quit();
        
        
        
				
		

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
