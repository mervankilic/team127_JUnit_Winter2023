package day13_excelOtomasyon_getScreenshot;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C04_ScreenshotIleAramaTesti extends TestBase {

    @Test
    public void aramaTesti(){

        // testotomasyonu anasayfaya gidin

        driver.get("https://www.testotomasyonu.com");
        // dress icin arama yapin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("dress" + Keys.ENTER);
        // arama sonucunda urun bulunabildigini test edin
        WebElement aramaSonucElementi = driver.findElement(By.className("product-count-text"));

        String unExpectedAramaSonucu = "0 Products Found";
        String actualAramaSonucu = aramaSonucElementi.getText();
        Assert.assertNotEquals(unExpectedAramaSonucu,actualAramaSonucu);

        ReusableMethods.bekle(3);
        // tum sayfanin screenshot'ini kaydedin

        ReusableMethods.tumSayfaTakeScreenshot("aramaTesti",driver);


    }
}
