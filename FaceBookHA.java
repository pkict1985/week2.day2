package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookHA {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Click on CreateNew Account button
		driver.findElement(By.xpath("//a[contains(text(), 'Create New')]")).click();
		//Enter the firstname 
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ranjani");
		//Enter the lastname 
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shekar");
		//enter the email
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("pravee.jks@gmail.com");
		//renter email
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("pravee.jks@gmail.com");
		//enter the password //input[@id='password_step_input']
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("67ghtyu");
		//Handle ddl1 day//select[@id='day'] selectbyval 18
		WebElement webElementDay = driver.findElement(By.name("birthday_day"));
		Select day=new Select(webElementDay);
		day.selectByValue("18");
	    //select[@id='month']  selectbyvisibletext Feb
		WebElement webElementMonth = driver.findElement(By.name("birthday_month"));
		Select month=new Select(webElementMonth);
		month.selectByVisibleText("Feb");
		//select[@id='year']  selectbyvisibletext 1986
		WebElement webElementYear = driver.findElement(By.name("birthday_year"));
		Select year=new Select(webElementYear);
		year.selectByVisibleText("1986");
		//Handle ddl1 gender //label[text()='Female']
		//select the radio button "Female"
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		//A normal click will do for this step  //button[text()='Sign Up']
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}

}
