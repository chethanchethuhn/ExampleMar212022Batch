package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	private static WebDriver obrowser=null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimize();
		createcustomer();
		createproject();
		createtasks();
		deletetasks();
		deleteproject();
		deletetecustomer();
		logout();
		closeapllication();
	}
	private static void launchbrowser()
	{
		try {

			System.setProperty("webdriver.chrome.driver","C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
			obrowser.manage().window().maximize();
			
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
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);


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
			Thread.sleep(2000);
			//Going to add new
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			//Going to new customer
			obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			//Creating new customer
			obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("chethan");
			Thread.sleep(2000);
			//Clicking new customer
			obrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']")).click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createproject()
	{
		try {
			

			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			//Entering project name
			obrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("precissssion life science labs");
			Thread.sleep(2000);
			//Clicking creae project button
			obrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(2000);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createtasks()
	{
		try {
			
			
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys("Task1");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[5]/div/input")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createTasksPopup_commitBtn']/div")).click();
			Thread.sleep(2000);
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	private static void deletetasks()
	{
		try {
			
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'taskPanel_deleteConfirm_submitBtn\']/div")).click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			
		}
	}
	private static void deleteproject()
	{
		try {
			
			
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			
			
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			
			obrowser.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitBtn\']/div")).click();
			Thread.sleep(2000);
			
			
			
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
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(2000);
			
			

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
	