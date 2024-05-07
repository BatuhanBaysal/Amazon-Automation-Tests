package org.amazon.test1;

import org.amazon.driver.Driver;
import org.amazon.methods.Methods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginTest extends Driver {
    Methods methods;
    //Amazon.com.tr sitesinde amazon hesabı olma ön koşuluyla profile adres ekleme testi.
    //Test of adding an address to the profile on Amazon.com.tr, with the prerequisite of having an Amazon account.

    @Test
    public void loginTest(){
        methods = new Methods();
        //Amazon.com.tr sayfasında uye girisi yapılır. - Membership is made on the Amazon.com.tr page.
        methods.hoverElement(By.id("nav-link-accountList"));
        Assertions.assertTrue(methods.isElementVisible(By.id("nav-flyout-ya-signin"), 10), "Login button not found!!!");
        methods.click(By.id("nav-flyout-ya-signin"));
        methods.waitByMilliSeconds(2);
        methods.click(By.id("ap_email"));
        methods.waitByMilliSeconds(2);
        methods.sendKeys(By.id("ap_email"), "YOUR_MAIL_ADDRESS"); //Amazon Mail *****
        methods.waitByMilliSeconds(2);
        methods.click(By.id("continue"));
        methods.waitByMilliSeconds(2);
        methods.click(By.id("ap_password"));
        methods.waitByMilliSeconds(2);
        methods.sendKeys(By.id("ap_password"), "YOUR_PASSWORD"); //Amazon Password *****
        methods.waitByMilliSeconds(2);
        methods.click(By.id("signInSubmit"));
        methods.waitByMilliSeconds(2);

        //After logging in, the user can add a new address.
        methods.hoverElement(By.id("nav-link-accountList"));
        methods.waitByMilliSeconds(2);
        methods.click(By.id("nav-link-accountList"));
        methods.waitByMilliSeconds(2);
        methods.click(By.cssSelector("[data-card-identifier='AddressesAnd1Click_T1'].a-box.ya-card--rich"));
        methods.waitByMilliSeconds(2);
        methods.click(By.id("ya-myab-plus-address-icon"));
        methods.waitByMilliSeconds(20);

        methods.click(By.id("address-ui-widgets-enterAddressFullName"));
        methods.waitByMilliSeconds(20);
        methods.click(By.cssSelector("span.a-button-text.a-declarative > span.a-dropdown-prompt"));
        methods.waitByMilliSeconds(20);
        methods.click(By.id("address-ui-widgets-countryCode-dropdown-nativeId_226"));
        methods.waitByMilliSeconds(20);
        methods.sendKeys(By.id("address-ui-widgets-enterAddressFullName"), "Batuhan Baysal");
        methods.waitByMilliSeconds(20);
        methods.sendKeys(By.id("address-ui-widgets-enterAddressPhoneNumber"), "5377978810");
        methods.waitByMilliSeconds(20);
        methods.sendKeys(By.id("address-ui-widgets-enterAddressLine1"), "Ataköy 7-8-9-10, E5 Karayolu Üzeri");
        methods.waitByMilliSeconds(20);
        methods.sendKeys(By.id("address-ui-widgets-enterAddressLine2"), "Ataköy Yerleşkesi, 34158 Bakırköy");
        methods.waitByMilliSeconds(20);
        methods.sendKeys(By.id("address-ui-widgets-enterAddressCity"), "İstanbul");
        methods.waitByMilliSeconds(20);

        //methods.sendKeys(By.id("address-ui-widgets-enterAddressStateOrRegion"), "Bakırköy");
        WebElement stateOrRegionInput = driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion"));
        stateOrRegionInput.sendKeys("Bakırköy");
        methods.waitByMilliSeconds(20);
        stateOrRegionInput.sendKeys(Keys.ENTER);
        methods.click(By.cssSelector("ul.autoCompleteResult.autoCompleteScroll li.autoOp"));
        methods.waitByMilliSeconds(20);

        //methods.sendKeys(By.id("address-ui-widgets-enterAddressDistrictOrCounty"), "Ataköy 7-8-9-10 Mh.");
        WebElement DistrictOrCounty = driver.findElement(By.id("address-ui-widgets-enterAddressDistrictOrCounty"));
        DistrictOrCounty.sendKeys("Ataköy 7-8-9-10 Mh.");
        methods.waitByMilliSeconds(20);
        DistrictOrCounty.sendKeys(Keys.ENTER);
        methods.click(By.id("address-ui-widgets-enterAddressDistrictOrCounty"));
        methods.waitByMilliSeconds(20);
        DistrictOrCounty.sendKeys(Keys.ENTER);
        methods.click(By.cssSelector("ul.autoCompleteResult.autoCompleteScroll li.autoOp"));
        methods.waitByMilliSeconds(2);

        methods.click(By.id("address-ui-widgets-form-submit-button"));
        methods.waitByMilliSeconds(2);
    }
}
