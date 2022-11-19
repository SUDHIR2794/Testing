package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.record.ContinueRecord;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingSep22 {
	
	@AfterSuite
	private void tc0() {
		System.out.println("0");

	}
	@AfterTest
	private void tc1() {
		System.out.println("1");

	}
	@AfterClass
	private void tc2() {
		System.out.println("2");

	}
	@AfterMethod
	private void tc3() {
		System.out.println("3");

	}
	@Test
	private void tc4() {
		System.out.println("4");

       
		
	}
	@BeforeMethod
	private void tc5() {
		System.out.println("5");

	}
	@BeforeTest
	private void tc6() {
		System.out.println("6");

	}
	@BeforeClass
	private void tc7() {
		System.out.println("7");

	}
	@BeforeSuite
	private void tc8() throws IOException, InterruptedException {
		System.out.println("8");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		File f = new File("C:\\Users\\Its We\\Desktop\\Recording\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fs);
		Sheet sheet = w.getSheet("Sheet1");
		
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(stringCellValue);
		      
		Cell cell2 = row.getCell(1);
		String stringCellValue2 = cell2.getStringCellValue();
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(stringCellValue2);
		
		WebElement loginbutton = driver.findElement(By.id("login"));
		loginbutton.click();
		
		WebElement dropdown = driver.findElement(By.id("location"));
		dropdown.click();
		
		Select s = new Select(dropdown);
		Thread.sleep(2000);
		s.selectByIndex(5);

		WebElement hotel = driver.findElement(By.id("hotels"));
		hotel.click();
		Select s1 = new Select(hotel);
		Thread.sleep(2000);
		s1.selectByValue("Hotel Creek");
		
		WebElement room = driver.findElement(By.id("room_type"));
		room.click();

		Select s2 = new Select(room);
		Thread.sleep(2000);
		s2.selectByVisibleText("Standard");
		
		WebElement roomno = driver.findElement(By.id("room_nos"));
		roomno.click();

		Select s3 = new Select(roomno);
		Thread.sleep(2000);
		s3.selectByIndex(2);
		
		Cell cell3 = row.getCell(2);
		String stringCellValue3 = cell3.getStringCellValue();

		Thread.sleep(2000);
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys(stringCellValue3);

		Cell cell4 = row.getCell(3);
		String stringCellValue4 = cell4.getStringCellValue();

		Thread.sleep(2000);
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys(stringCellValue4);

		Thread.sleep(2000);
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		adultroom.click();
		
		Select s4 = new Select(adultroom);
		Thread.sleep(2000);
		s4.selectByIndex(2);
	
		WebElement childroom = driver.findElement(By.id("child_room"));
		childroom.click();

		Select s5 = new Select(childroom);
		Thread.sleep(2000);
		s5.selectByIndex(2);
		
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
		Thread.sleep(2000);
		WebElement finish = driver.findElement(By.id("radiobutton_0"));
		finish.click();

		Thread.sleep(2000);
		WebElement continue1 = driver.findElement(By.id("continue"));
		continue1.click();

		Cell cell5 = row.getCell(4);
		String stringCellValue5 = cell5.getStringCellValue();

        WebElement firstname = driver.findElement(By.id("first_name"));
        firstname.sendKeys(stringCellValue5);
        
        Cell cell6 = row.getCell(5);
        String stringCellValue6 = cell6.getStringCellValue();
        
        WebElement lastname = driver.findElement(By.id("last_name"));
        lastname.sendKeys(stringCellValue6);
        
        Cell cell7 = row.getCell(6);
        String stringCellValue7 = cell7.getStringCellValue();
        
        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys(stringCellValue7);
        
        Cell cell8 = row.getCell(7);
        String stringCellValue8 = cell8.getStringCellValue();
        
        WebElement creditcard = driver.findElement(By.id("cc_num"));
        creditcard.sendKeys(stringCellValue8);

        WebElement cctype = driver.findElement(By.id("cc_type"));
        cctype.click();
        
        Select s6 = new Select(cctype);
        Thread.sleep(2000);
        s6.selectByVisibleText("VISA");
		
        Thread.sleep(2000);
        WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
        expmonth.click();
        
        Select s7 = new Select(expmonth);
        Thread.sleep(2000);
        s7.selectByIndex(2);
        
        WebElement expyear = driver.findElement(By.id("cc_exp_year"));
        expyear.click();
        
        Select s8 = new Select(expyear);
        Thread.sleep(2000);
        s8.selectByIndex(12);
        
        Cell cell9 = row.getCell(8);
        String stringCellValue9 = cell9.getStringCellValue();
        
        WebElement cvvnumber = driver.findElement(By.id("cc_cvv"));
        cvvnumber.sendKeys(stringCellValue9);
        
        WebElement book = driver.findElement(By.id("book_now"));
        book.click();
        
     
        WebElement itinerary = driver.findElement(By.id("my_itinerary"));
        itinerary.click();
        
        
        Thread.sleep(5000);
        TakesScreenshot ts = (TakesScreenshot)driver;
        File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        System.out.println(screenshotAs);
        FileUtils.copyFile(screenshotAs, new File("C:\\Users\\Its We\\Desktop\\Recording\\image.jpg"));
        

			
		
			
		
         


        
        
        
         
         
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
