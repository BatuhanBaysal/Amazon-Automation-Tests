package org.amazon.methods;

import org.amazon.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.swing.*;
import java.time.Duration;

public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> fluentWait;

    public Methods(){
        driver = Driver.driver;
        fluentWait = setFluentWait(10);
    }

    //WebDriverWait
    //FluentWait
    public FluentWait<WebDriver> setFluentWait(long timeout){
        return new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
    }

    public WebElement findElements(By by){
        return driver.findElement(by);
    }

    public WebElement findElement(By by){
        return  fluentWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click(By by){
        findElement(by).click();
    }

    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }

    public String getText(By by){
        return findElement(by).getText();
    }

    public void hoverElement(By by){
        WebElement element = findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public boolean isElementVisible(By by, long timeout){
        try {
            setFluentWait(timeout).until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void waitBySeconds(long seconds){
        waitByMilliSeconds(1000*seconds);
    }

    public void waitByMilliSeconds(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
