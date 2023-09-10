package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Introduction {


    public static void main(String[] args) {


        WebDriver driver =new ChromeDriver();
       // WebDriver driver =new SafariDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
    }
}
