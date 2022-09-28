package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		http://leaftaps.com/opentaps/control/main

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
		//click name and id button
		driver.findElement(By.xpath("//span[contains(text(), 'Name and ID')]")).click();
		//	8	Enter first name
		driver.findElement(By.xpath("(//input[contains(@name, 'firstName')])[3]")).sendKeys("Karthik");
		//	9	Click Find leads button
		WebElement btnFindLead=driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]"));
		System.out.println(btnFindLead.isEnabled());
		btnFindLead.click();


		//	10 Click on first resulting lead

		WebElement row = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tbody//tr)[1]//td[1]//a"));
		System.out.println(row.getText());

		//12107
		driver.findElement(By.linkText("12107")).click();

		//	11 Verify title of the page
		driver.getTitle();
		//	12 Click Edit
		driver.findElement(By.linkText("Edit")).click();
		//	13 Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("New me");
		//	14 Click Update
		driver.findElement(By.className("smallSubmit")).click();
		//	15 Confirm the changed name appears
		System.out.println("Record with 12107 updated");
		//	16 Close the browser (Do not log out)
		//driver.close();
	}

}
