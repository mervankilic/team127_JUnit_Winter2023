package day06_JUnitAssertions;

import org.junit.Assert;
import org.junit.Test;

public class C03_Assertions {

    @Test
    public void test01(){

        // emeklilik yası 65 olsun

        // 70 yasındaki bir kişinin emekli olabildigini test edin

        int yas = 70;

        Assert.assertTrue(yas>65); // test passed


        int sayi1 = 20 ;
        int sayi2 = 30 ;

        // Assert.assertTrue(sayi1 > sayi2); // FAILED


        Assert.assertFalse(sayi1>sayi2); // PASSED

        System.out.println("assertion failed olursa bu satır calısmaz");


        String actualUrl = "https://www.testotomasyonun.com/";

        // Url'in testotomasyonu içerdigini test edin

        Assert.assertTrue(actualUrl.contains("testotomasyonu")); // PASSED

        // Url'in wisequarter içermedigini test edin

        Assert.assertFalse(actualUrl.contains("wisequarter")); // PASSED

        // Url'in https://www.testotomasyonun.com/ oldugunu test edin

        Assert.assertEquals("https://www.testotomasyonun.com/",actualUrl); // PASSED

        Assert.assertTrue("https://www.testotomasyonun.com/".equals(actualUrl)); // PASSED
        // 'assertTrue()' can be simplified to 'assertEquals()'

        // Url'in https://www.testotomasyonun.com/ olmadıgını test edin

        Assert.assertNotEquals("https://www.testotomasyonun.com/",actualUrl); // PASSED

        Assert.assertFalse("https://www.testotomasyonun.com/".equals(actualUrl)); // PASSED




    }
}
