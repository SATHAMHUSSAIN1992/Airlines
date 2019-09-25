package org.S7.test;

import java.awt.AWTException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Croatia extends BaseClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		getbrowser();
		loadurl("https://www.croatiaairlines.com/");
		driver.manage().window().maximize();
		
			//Booking Source
			
			WebElement a = findelementByxpath("(//i[@class='icon icon-menulist'])[1]");
			JavascriptExecutor jk=(JavascriptExecutor)driver;
			jk.executeScript("arguments[0].scrollIntoView(true)",a);
			Thread.sleep(2000);
			a.click();
			WebElement oway = findelementByxpath("(//input[@type='radio'])[2]");
			oway.click();
			Thread.sleep(2000);
			WebElement adult = findelementByxpath("(//button[@class='btn btn-default'])[2]");
			adult.click();
			
			//from 
			
			Thread.sleep(2000);
			WebElement from = findelementByxpath("(//input[@class='ui-autocomplete-input'])[1]");
			from.click();
			WebElement cname = findelementByxpath("//a[text()='MYKONOS (JMK), GREECE']");
			cname.click();
			
			//to 
			
			WebElement to = findelementByxpath("(//input[@class='ui-autocomplete-input'])[2]");
			to.click();
			Thread.sleep(2000);
			WebElement cn = findelementByxpath("//a[text()='KOS (KGS), GREECE']");
			cn.click();
			
		    //date
			
			WebElement date = findelementByxpath("(//a[@class='mainIcons calendar'])[1]");
			date.click();
			WebElement dat = findelementByxpath("//a[@class='ui-state-default']");
			dat.click();
		
			WebElement search = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		    search.click();

		    //clear captcha

		    Scanner sn=new Scanner(System.in);
		    System.out.println("Enter the captcha");
		    String clear = sn.next();
		    System.out.println(clear);

		    Thread.sleep(3000);


		WebElement textv = findelementByxpath("//div[text()='Wed 25 Sep']");
		jk.executeScript("arguments[0].scrollIntoView(true)",textv);

		//choose category

		WebElement category = findelementByxpath("//span[text()='2,780.00']");
		category.click();
		Thread.sleep(4000);
		WebElement continu = findelementByxpath("//span[text()='continue']");
		continu.click();

		Thread.sleep(3000);

		//Passenger details 1

		WebElement title = findelementByxpath("(//select[@name='IDEN_TitleCode'])[1]");
		Select s=new Select(title);
		s.selectByVisibleText("Mr");

		WebElement fname = findelementByxpath("(//input[@name='IDEN_FirstName'])[1]");
		fname.sendKeys("Satham");

		WebElement lname = findelementByxpath("(//input[@name='IDEN_LastName'])[1]");
		lname.sendKeys("hussain");

		Thread.sleep(3000);

		//Details 2

		WebElement title2 = findelementByxpath("(//select[@name='IDEN_TitleCode'])[1]");
		Select s1=new Select(title2);
		s1.selectByVisibleText("Mr");

		WebElement namee = findelementByxpath("(//input[@name='IDEN_FirstName'])[2]");
		namee.sendKeys("Sana");

		WebElement lnamee= findelementByxpath("(//input[@name='IDEN_LastName'])[2]");
		lnamee.sendKeys("hussain");

		driver.close();
	}	
	}