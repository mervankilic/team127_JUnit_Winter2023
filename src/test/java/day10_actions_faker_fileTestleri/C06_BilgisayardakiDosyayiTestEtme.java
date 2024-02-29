package day10_actions_faker_fileTestleri;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C06_BilgisayardakiDosyayiTestEtme {

    @Test
    public void test01(){

        // Downloads'da logo.png oldugunu test edin

        String dosyaYolu = "C:\\Users\\CENTRAL GSM\\Downloads\\luminoslogo.png";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


        // Herkeste farkli olan
        //          C:\Users\CENTRAL GSM
        // Herkeste ayni olan
        //          \Downloads\luminoslogo.png

        String dinamikDosyaYolu = System.getProperty("user.home") +
                                    "\\Downloads\\luminoslogo.png";

        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));

    }
}
