package com.pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class fbLogin 
{
	public static void main(String[] args) throws InterruptedException
{
	ExtentHtmlReporter htmlreport=new ExtentHtmlReporter("extent.html");
	
	ExtentReports extent=new ExtentReports();
	extent.attachReporter(htmlreport);
	ExtentTest test=extent.createTest("my first extent report");
	
	System.setProperty("webdriver.chrome.driver", "C://Users//Sreenithgoud//Downloads//Compressed//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
test.log(Status.INFO, "open fb page details ");
	driver.get("http://www.fb.com");
test.log(Status.PASS, "got to fb page");
String title=driver.getTitle();

System.out.println(title);

 
	
	driver.findElement(By.xpath("//input[@id='email']")).clear();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pabbusrinu376@gmail.com");
	test.log(Status.PASS, "go to password");
	driver.findElement(By.xpath("//input[@id='pass']")).clear();
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mounika@7886");
	test.log(Status.PASS, "go to submit button");
	driver.findElement(By.xpath("//input[@id='pass']")).submit();
	
	System.out.println(driver.getTitle());
	
	Thread.sleep(2000);
ExtentTest test2=extent.createTest("this is the second extent report");
	

test2.log(Status.INFO, "open fb1 page details ");
	driver.get("http://www.fb.com");
test2.log(Status.PASS, "got to google page");
String title1=driver.getTitle();

 

Thread.sleep(2000);

ExtentTest test3=extent.createTest("this is the google title test");
test3.log(Status.INFO, "google will open or not");
driver.navigate().to("http://www.google.com");

test3.log(Status.PASS,"print the google title");

System.out.println(driver.getTitle());

Thread.sleep(2000);

driver.navigate().back();
ExtentTest test4=extent.createTest("this is 4th test case detail");

test4.log(Status.INFO, "return fb");
System.out.println(driver.getTitle());

test4.log(Status.PASS, "print the title");


	extent.flush();
	
	driver.quit();
	
	
}
}
