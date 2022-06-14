package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	private static WebDriver obrowser=null;

	public static void main(String[] args) {

		launchbrowser();
		navigate();
		login();
		minimize();
		createuser();
		modifyuser();
		deleteuser();
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

	private static void createuser()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("dharashan");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Demo");
			Thread.sleep(2000);
			obrowser.findElement(By.name("email")).sendKeys("user@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Zacii123");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuser()
	{
		try {
			obrowser.findElement(By.xpath("//span[text()='Demo, dharashan']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("Darshannewuser");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert oalert=obrowser.switchTo().alert();
			String content=oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(1000);
		} catch (Exception e) {
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