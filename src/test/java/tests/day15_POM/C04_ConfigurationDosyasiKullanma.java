package tests.day15_POM;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_ConfigurationDosyasiKullanma {
    /*
                Pom'de hedef test sirasinda
                manuel olarak hicbir Test Data'si girmemektir

                Test datalari :
                1- Kullanacagimiz WebDriver : Driver Class'indan dinamik olarak kullaniyoruz
                2- Locate : Locate'leri pages sayfalarindan dinamik olarak kullaniyoruz
                3- kullanilanUrl, aranan kelime, expected icerik, dogru kullanici adi,
                    yanlis kullanici adi, yanlis sifre... gibi datalar
             */
    @Test
    public void ttest01(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

}
