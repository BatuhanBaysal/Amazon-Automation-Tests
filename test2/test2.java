package org.amazon.test2;

import org.amazon.driver.Driver;
import org.amazon.methods.Methods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class test2 extends Driver {
    Methods methods;
    //Amazon.com.tr sayfasında Airpod'ların sepete eklenmesi ve ürün ödeme sayfasına girilmesi test ediliyor.
    //Testing adding Airpods to the cart and entering the product payment page.

    @Test
    public void loginTest() {
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

        String searchKeyword = "airpods"; // Arama yapılacak kelime - search word
        methods.sendKeys(By.id("twotabsearchtextbox"), searchKeyword + Keys.ENTER);
        methods.waitByMilliSeconds(2);

        // İlk ürünü seçin ve detay sayfasına gidin - Select the first product and go to the detail page
        WebElement firstProduct = driver.findElement(By.cssSelector("[data-asin][data-index='0']"));
        firstProduct.click();
        methods.waitByMilliSeconds(50);

        // Ürünü sepete ekleyin - Add the product to the cart
        methods.click(By.id("add-to-cart-button"));
        methods.waitByMilliSeconds(30);

        // Sepete gidin ve ödeme yapmaya devam edin - Go to cart and proceed to checkout
        methods.click(By.id("desktop-ptc-button-celWidget"));
        methods.waitByMilliSeconds(2);

        // Ödeme sayfasınıa kadar gelindi. - You have reached the payment page.
    }
}
