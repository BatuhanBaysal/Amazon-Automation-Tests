package org.amazon.test3;

import org.amazon.driver.Driver;
import org.amazon.methods.Methods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class test3 extends Driver {
    Methods methods;
    //Amazon.com.tr sayfasında ürüne yorum ekleme.
    //Adding a comment to the product on Amazon.com.tr.

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

        // Ürün sayfasına gidin ve müşteri yorumlarına erişin - Go to the product page and access customer reviews
        driver.get("https://www.amazon.com.tr/Apple-AirPods-Bluetooth-Kulaklık-Garantili/dp/B07QB4FG6B/ref=sr_1_5?crid=2E32063UMT4D4&dib=eyJ2IjoiMSJ9.f1eR0-B9N84wWOJ6ZDs-kdxjnU3lHoR30TcpNG5JlS3tyagyEPLHvjGR7W_Gbpu1G75WSgPrkPvSoDGtMXEbEVKHZzpzBvUowF3JXD4Rx-CU4evOTW8fcGLG5GvQ0GisOm6RRi1-A1ZlzungfOGpP7R98dpF20JKwPFb5avoX51WiJpaTX2ebmMoNqPg8ONn61Xs2klQvDB5IBUs_iS4vaT6VHilMxqrCfIHWFvamyqBJYU6UyM0pj6mDdv4N-puLRp6eQ7xPRp0zypK2YE2P2WqmFvpFDcnfdEN6a0gktQ.ZCEaEEIoh1N9anN1XPezhPrc41CPiMeUEeX5fPTqd44&dib_tag=se&keywords=airpods&qid=1715100102&sprefix=airpo%2Caps%2C147&sr=8-5"); // Örnek bir kitap sayfasının URL'sini buraya ekleyin
        methods.click(By.id("customerReviews"));

        // Yorum ekleme sayfasına gidin - Go to the comment adding page
        Assertions.assertTrue(methods.isElementVisible(By.id("a-autoid-17-announce"), 10), "Login button not found!!!");
        methods.click(By.id("a-autoid-17-announce"));

        // Yorumu doldurun - Fill in the comment
        methods.sendKeys(By.id("reviewTitle"), "Comments");
        methods.sendKeys(By.id("reviewText"), "Airpods");

        // Derecelendirme yapın - Rate
        methods.click(By.xpath("//span[@class='a-star-5']"));

        // Yorumu gönderin - Submit comment
        methods.click(By.id("submit-review-button"));
    }
}
