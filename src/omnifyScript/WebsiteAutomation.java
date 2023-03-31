package omnifyScript;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class WebsiteAutomation {
	
	//I AM USING X-PATH LOCATOR IN THIS SCRIPT 
	//I HAVE KNOWLEDGE OF OTHER LOCATORES ASLO
	
	public static void main(String[] args) throws InterruptedException 
	{
//SETUP CHROME BROWSER
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
//NAVIGATE OMNIFY WEBSITE		
		driver.get("https://OMNIFY.com/");
		
//ENTER USERNAME AND PASSWORD FOR LOGIN AS ADMIN
	//ENTER USERNAME	
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']")).sendKeys("Shreyas");
	//ENTER PASSWORD
		driver.findElement(By.xpath("//input[XPATH EXPREESION]")).sendKeys("******");
	//CLICK ON LOGIN BUTTON
		driver.findElement(By.xpath("//button[XPATH EXPREESION]")).click();
		
//CLICK ON CREATE CLASS BUTTON	
		WebElement CreateClassButton = driver.findElement(By.xpath("//button[XPATH EXPREESION]"));
		CreateClassButton.click();
		
//ENTER CLASS DETAILS
	//ENTER TITLE(YOGA CLASS WITH SHREYAS)
		driver.findElement(By.xpath("//input[XPATH EXPREESION]")).sendKeys("YOGA CLASS WITH SHREYAS");
	//ENTER DESCRIPTION
		driver.findElement(By.xpath("//input[XPATH EXPREESION]")).sendKeys("IT IS ONE OF THE BEST CLASS IN THE WORLD FOR BEGINEER AND EXPERIENCED PERSON");
	//ENTER CLASS COLOUR
		driver.findElement(By.xpath("//input[XPATH EXPREESION]")).sendKeys("BLUE");
	//ENTER IMAGE
		driver.findElement(By.xpath("//input[XPATH EXPREESION]")).sendKeys("PATH/TO/IMAGE.JPG");
	//CLICK ON UPOLAD IMAGE BUTTON
		driver.findElement(By.xpath("//button[XPATH EXPREESION]")).click();
		
		
//ENTER CLASS DETAILS
	//SELECT CLASS LOCATION ONLINE/OFFLINE
		WebElement location =driver.findElement(By.xpath("//select[@id='location']"));
		Select s1= new Select(location);
		s1.selectByVisibleText("Online");  //select as per requirements
		//s1.selectByVisibleText("Offline");  //If online enter location in text field
		//driver.findElement(By.xpath("//input[XPATH EXPREESION]")).sendKeys("PUNE");
		
	//ENTER TRAINER NAME
		driver.findElement(By.xpath("//input[XPATH EXPREESION]")).sendKeys("SHREYAS");
		
	//SELECT SERVICE TYPE
		WebElement ServiceType =driver.findElement(By.xpath("//select[@id='Service type']"));
		Select s2= new Select(ServiceType);
		s2.selectByVisibleText("Free");  //select as per requirements
		//s1.selectByVisibleText("Paid"); //if paid we have to enter further details like UPI 
		
//ENTER CLASS SHEDULE
	//SELECT NO. OF DAYS
		WebElement NoOfDays =driver.findElement(By.xpath("//select[@id='date']"));
		Select s4= new Select(NoOfDays);
		s4.selectByVisibleText("45");
	//SELECT START DATE (DAY/MONTH/YEAR)
		WebElement StartDate =driver.findElement(By.xpath("//select[@id='date']"));
		Select s3= new Select(StartDate);
		s3.selectByVisibleText("1");
		s3.selectByVisibleText("April");
		s3.selectByVisibleText("2023");
	//ENTER START TIME OF CLASS
		driver.findElement(By.xpath("//input[XPATH EXPREESION]")).sendKeys("8am");		
	//SELECT END DATE (DAY/MONTH/YEAR)			//It can be automatically calculated and displayed as we give start date and No. of days
	//ENTER END TIME OF CLASS
		driver.findElement(By.xpath("//input[XPATH EXPREESION]")).sendKeys("10am");	
		
//ENTER BOOKING WINDOWS DETAILS
	//ENTER BOOKING WINDOW OPEN BEFORE NO.OF DAYS
		driver.findElement(By.xpath("//input[XPATH EXPREESION]")).sendKeys("7");
	//EMTER BOOKING WINDOW CLOSE BEFORE NO. OF DAYS
		driver.findElement(By.xpath("//input[XPATH EXPREESION]")).sendKeys("1");	

//CLICK ON SUBMIT BUTTON AND SUCCESS MESSAGE SHOULD DISPLAYED
		driver.findElement(By.xpath("//button[XPATH EXPREESION]")).click();
	//SWITCH ON ALERT POP UP
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText()); //Text Should be New Yoga class created with Omnify
		alt.dismiss();		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
