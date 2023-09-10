package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Dropdown {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        /// Static dropdown means Select Class & Select Tag-name

        WebElement staticWebelement = driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));



        System.out.println("This is the ID " + staticWebelement.getAttribute("id") );

        driver.quit();


    }
}
