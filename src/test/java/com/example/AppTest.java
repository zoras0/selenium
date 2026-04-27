package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testGoogle() {

        System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");

        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}