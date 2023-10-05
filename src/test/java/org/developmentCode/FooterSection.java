package org.developmentCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class FooterSection {


    public static void main(String[] args) throws IOException {


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Limited the driver to footer section
        WebElement footDriver =driver.findElement(By.xpath("//div[@id='gf-BIG']"));

        List<WebElement> linkList=  footDriver.findElements(By.xpath("//table/tbody/tr/td"));


         for ( int i =1 ;i<linkList.size(); i++ )
         {


         }







    }
}
