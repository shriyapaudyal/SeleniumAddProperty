package com.braindigit.AddProperty;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AddPropertyClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\backup\\geckodriver.exe");
		
		
			WebDriver driver = new FirefoxDriver();
			
			driver.get("http://lb25.braindigit.com/qa18/");

			
			driver.findElement(By.xpath("//a[contains(.,'Login')]")).click();
			driver.findElement(By.id("modlgn-username")).clear();
			driver.findElement(By.id("modlgn-username")).sendKeys("lina1");
			driver.findElement(By.id("modlgn-passwd")).clear();
			driver.findElement(By.id("modlgn-passwd")).sendKeys("brain");

			Thread.sleep(500);
			driver.findElement(By.id("modlgn-passwd")).click();
		

			driver.findElement(By.name("Submit")).click();
			Thread.sleep(9000);
			
			driver.findElement(By.xpath("html/body/div[1]/aside/div/section/ul/li[4]/a/span[contains(.,'Properties')]")).click();
			Thread.sleep(5000);
			for(int i=0;i<=2;i++)
			{
									
				if(i==0)
				{
					Thread.sleep(9000);
					
					driver.findElement(By.xpath("html/body/div[1]/div[2]/section[2]/div[1]/div/div/a[contains(.,'New')]")).click() ;
					Thread.sleep(9000);
					
					driver.findElement(By.id("title")).sendKeys("house selenium "+i);
					
					Select category = new Select(driver.findElement(By.id("category_id")));
					category.selectByVisibleText("House");
					
					driver.findElement(By.name("area")).sendKeys("250");
					Thread.sleep(5000);			

					Select purpose = new Select(driver.findElement(By.id("purpose_id")));
					purpose.selectByVisibleText("Residential");
					
					driver.findElement(By.xpath(".//*[@id='exfBEDROOM_NUMBER']")).sendKeys("2");
					driver.findElement(By.xpath(".//*[@id='exfBATHROOM_NUMBER']")).sendKeys("1");
					Select garage = new Select(driver.findElement(By.id("exfGARAGE")));
					garage.selectByVisibleText("1");
					
					driver.findElement(By.xpath("html/body/div[1]/div[2]/section[2]/form/section[5]/div/div[1]/label[2]/span")).click();
					driver.findElement(By.xpath(".//*[@id='price_contact_agent']")).sendKeys("shri@m.co");

					Thread.sleep(500);
				}
				else if(i==1)
				{
					Thread.sleep(9000);
					
					driver.findElement(By.xpath("html/body/div[1]/div[2]/section[2]/div[1]/div/div/a[contains(.,'New')]")).click() ;
					Thread.sleep(5000);
					
					driver.findElement(By.id("title")).sendKeys("Apartment selenium "+i);
					
					Select category = new Select(driver.findElement(By.id("category_id")));
										category.selectByVisibleText("Apartment");
										
					driver.findElement(By.name("area")).sendKeys("300");		
					
					Thread.sleep(5000);
					driver.findElement(By.xpath(".//*[@id='exfBEDROOM_NUMBER']")).sendKeys("6");
					driver.findElement(By.xpath(".//*[@id='exfBATHROOM_NUMBER']")).sendKeys("6");
					Select garage = new Select(driver.findElement(By.id("exfGARAGE")));
					garage.selectByVisibleText("5+");
					
					driver.findElement(By.xpath("html/body/div[1]/div[2]/section[2]/form/section[5]/div/div[1]/label[4]/span")).click();
					driver.findElement(By.xpath(".//*[@id='price_for_offer']")).sendKeys("550000");					
					Thread.sleep(500);
				}
				else
				{
					Thread.sleep(9000);
					
					driver.findElement(By.xpath("html/body/div[1]/div[2]/section[2]/div[1]/div/div/a[contains(.,'New')]")).click() ;
					Thread.sleep(5000);
					
					driver.findElement(By.id("title")).sendKeys("Bungalow selenium "+i);
					
					Select category = new Select(driver.findElement(By.id("category_id")));
					category.selectByVisibleText("Bungalow");
					
					driver.findElement(By.name("area")).sendKeys("150");					
					Thread.sleep(5000);
					
					driver.findElement(By.xpath(".//*[@id='exfBEDROOM_NUMBER']")).sendKeys("4");
					driver.findElement(By.xpath(".//*[@id='exfBATHROOM_NUMBER']")).sendKeys("3");
					Select garage = new Select(driver.findElement(By.id("exfGARAGE")));
					garage.selectByVisibleText("1");
					
					driver.findElement(By.xpath(".//*[@id='price']")).sendKeys("150000");

					
					Thread.sleep(500);
				}		
				Thread.sleep(500);					
				
				Select state = new Select(driver.findElement(By.id("property_region")));
				state.selectByVisibleText("New South Wales");
				Thread.sleep(2000);
				Select region = new Select(driver.findElement(By.id("area_id")));
				region.selectByVisibleText("- Sydney CBD");
				
							
				driver.findElement(By.name("saveProperty")).click();
				Thread.sleep(10000);
				
				driver.navigate().refresh();
			
		
			}
			

			driver.quit();
	}  
		
		
}



