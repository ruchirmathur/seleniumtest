package com.demo.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArchitectureCenterSitePageObjects {

       WebDriver driver;

       public ArchitectureCenterSitePageObjects(WebDriver driver) {
              this.driver = driver;
       }

       By menuLink = By.xpath("//*[contains(text(), 'Link 1')]");
       By firstName = By.xpath("//*[@id='firstnameid']");
       By lastName = By.xpath("//*[@id='lastnameid']");
       By pcpName = By.xpath("//*[@id='pcpnameid']");
       By medicalPlan = By.xpath("//*[@id='medicalplanid']");
       By dentalPlan = By.xpath("//*[@id='dentalplanid']");
       By visionPlan = By.xpath("//*[@id='visionplanid']");
       
       public void clickMenuLink() {
              driver.findElement(menuLink).click();
       }
       
       public String getFirstName() {
              return driver.findElement(firstName).getText();
       }
       
       public String getLastName() {
              return driver.findElement(lastName).getText();
       }
       
       public String getPCPName() {
              return driver.findElement(pcpName).getText();
       }
       
       public String getMedicalPlan() {
              return driver.findElement(medicalPlan).getText();
       }
       
       public String getDentalPlan() {
              return driver.findElement(dentalPlan).getText();
       }
       
       public String getVisionPlan() {
              return driver.findElement(visionPlan).getText();
       }
       
}


