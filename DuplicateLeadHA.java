package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadHA {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//http://leaftaps.com/opentaps/control/main

		//		1	Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//	2	Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//	3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//	4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//	5	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//	6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		//	7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//		8	Click on Email
		driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		//		9	Enter Email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("arshath722@gmail.com");
		//		10	Click find leads button
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		//		11	Capture name of First Resulting lead
		WebElement row = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tbody//tr)[1]//td[2]//a"));
		String name = row.getText();
		System.out.println(name);  
		
		//		12	Click First Resulting lead
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		//		13	Click Duplicate Lead
		
		//		14	Verify the title as 'Duplicate Lead'
		driver.getTitle();
		//		15	Click Create Lead
		
		//		16	Confirm the duplicated lead name is same as captured name
		
		//		17	Close the browser (Do not log out)
		//driver.close();

	}

}
