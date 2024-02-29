package day10_actions_faker_fileTestleri;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_ProjeIcindekiDosyaTesti {

    @Test
    public void fileExistsTesti(){

        // projemiz icerisinde day10 package'i altinda
        // deneme.txt dosyasinin oldugunu test edin

        String dosyaYolu = "C:\\Users\\CENTRAL GSM\\IdeaProjects\\com.team127_JUnit\\src\\test\\java\\day10_actions_faker_fileTestleri\\denem.txt";


        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        // Herkeste farkli olan kisim ==> user.dir
        //            "C:\\Users\\CENTRAL GSM\\IdeaProjects\\com.team127_JUnit
        // Herkeste ayni olan kısım ==> projenin icindeki dosya yolu
        //            \\src\\test\\java\\day10_actions_faker_fileTestleri\\denem.txt";
        String dinamikDosyaYolu = System.getProperty("user.dir") +
                                    "\\src\\test\\java\\day10_actions_faker_fileTestleri\\denem.txt";


        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));


    }
}
