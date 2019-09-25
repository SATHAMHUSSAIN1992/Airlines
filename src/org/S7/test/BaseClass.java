package org.S7.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
public static WebDriver driver;
	public static WebDriver getbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\S7Airlines\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		}

	public static void loadurl(String url) {
		driver.get(url);
		}

	public static  WebElement findelementById(String value){
		WebElement findElement2 = driver.findElement(By.id(value));
		return findElement2;
	}
	public static void typetext(WebElement element,String value) {
		element.sendKeys(value);
	}

	public static void btnclick(WebElement btn) {
		btn.click();
	}

	public static  WebElement findelementByxpath(String value){
		WebElement findElement3 = driver.findElement(By.xpath(value));
		return findElement3;
	}
	
	public static void robotab() throws AWTException {
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	
	public static void robotenter() throws AWTException {
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void robokeyup() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
	
	public static void robokeydown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}



}



