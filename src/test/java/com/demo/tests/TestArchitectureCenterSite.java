package com.demo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demo.objects.ArchitectureCenterSitePageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestArchitectureCenterSite {

       WebDriver driver;
       ArchitectureCenterSitePageObjects arch;
       
       @BeforeTest
       public void openWebsite() throws InterruptedException {
              WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
              driver.get("https://www.cleantips.net/");
              driver.manage().window().maximize();
              Thread.sleep(2000);
       }
       
       @AfterTest
       public void terminateDriver() {
              driver.quit();
       }
       
       @Test (priority = 1)
       public void testCardDetails() throws InterruptedException {
              arch = new ArchitectureCenterSitePageObjects(driver);
              arch.clickMenuLink();
              
              Assert.assertEquals("Test First Name", arch.getFirstName());
              Assert.assertEquals("Test Last Name", arch.getLastName());
              Assert.assertEquals("Test PCP", arch.getPCPName());
              Assert.assertEquals("Medical Plan Name", arch.getMedicalPlan());
              Assert.assertEquals("Dental Plan Name", arch.getDentalPlan());
              Assert.assertEquals("Vision Plan Name", arch.getVisionPlan());
       }
       
       
}


