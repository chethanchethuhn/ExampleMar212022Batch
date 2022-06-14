package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	private static WebDriver obrowser=null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimize();
		createcustomer();
		modifycustomer();
		deletetecustomer();
		logout();
		closeapllication();
		

	}
	private static void launchbrowser()
	{
		try {

			System.setProperty("webdriver.chrome.driver","C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			obrowser.get("http://localhost:81/login.do");
		} catch (Exception e) {

		}
	}
	private static void login()
	{
		try {
			obrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(3000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try {
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createcustomer()
	{
		try {
			
			//Going to tasks
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[1]")).click();
			Thread.sleep(3000);
			//Going to add new
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(3000);
			//Going to new customer
			obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(3000);
			//Creating new customer
			obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("chethan");
			Thread.sleep(3000);
			//Clicking new customer
			obrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']")).click();
			Thread.sleep(3000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void modifycustomer()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")).clear();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")).sendKeys("niranjan");
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletetecustomer()
	{

		try
		{
			
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(3000);
			
			

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			obrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	private static void closeapllication()
	{
		try {
			obrowser.quit();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}

}
