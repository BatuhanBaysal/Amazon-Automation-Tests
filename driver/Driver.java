package org.amazon.driver;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;

    @BeforeEach
    public void before(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr/");
    }
}
