package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeTestHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load url
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://acme-test.uipath.com/login");
		//enter email as 'kumar.testleaf@gmail.com'  
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		//Enter the password as leaf@12    //input[@name='password']
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("leaf@12");
		//click login button //button[contains(text(), 'Login')]
		driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
		//get title of the page and print
		String title = driver.getTitle();
		System.out.println(title);
		//click on logout //a[text()='Log Out']
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		//close the browser(user driver.close())
		driver.close();
	}

}
