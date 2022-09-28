package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// http://leaftaps.com/opentaps/control/main

		//	Delete Lead:
		//	1	Launch the browser
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
		//	8	Click on Phone
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		//	9	Enter phone number
		driver.findElement(By.xpath("//input[contains(@name,'phoneAreaCode')]")).sendKeys("44");
		driver.findElement(By.name("phoneNumber")).sendKeys("9090909090");
		//	10	Click find leads button
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		// //td//button[contains(text(),'Find Leads')]
		//	11	Capture lead ID of First Resulting lead
		
		WebElement row = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tbody//tr)[1]//td[1]//a"));
		String leadID = row.getText();
		System.out.println(leadID);  
		
		//right: 13963  wrong: 10270
		//	12	Click First Resulting lead
		//problem here
		//driver.findElement(By.xpath("//td[contains(@class, 'x-grid3-cell-first')]//a")).click();
		driver.findElement(By.linkText("13963")).click();
		
		//	13	Click Delete
		driver.findElement(By.linkText("Delete")).click();
		//	14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//	15	Enter captured lead ID
		driver.findElement(By.name("id")).sendKeys("13963");
		//	16	Click find leads button
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		//	17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		
		//	18	Close the browser (Do not log out)
		//driver.close();

	}

}
