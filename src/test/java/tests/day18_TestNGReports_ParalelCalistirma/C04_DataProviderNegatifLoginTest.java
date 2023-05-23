package tests.day18_TestNGReports_ParalelCalistirma;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_DataProviderNegatifLoginTest {
    @DataProvider
    public static Object[][] YanlisKullaniciAdlariListesi() {

        String[][] kullaniciBilgileriArrayi = {{"Memre","12345"},{"filik","12345"},{"Mustafa","12345"},{"Asli","23456"}};

        return kullaniciBilgileriArrayi;
    }
    // verilen 10 kullanici bilgisi ile sisteme giris yapilamadigini test edin

    @Test(dataProvider = "YanlisKullaniciAdlariListesi")
    public void gecersizIsimTesti(String kullaniciAdi, String password){
        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        // login linkine tiklayin
        qualitydemyPage.ilkLoginLinki.click();
        // gecersiz username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys(kullaniciAdi);
        qualitydemyPage.passwordKutusu.sendKeys(password);

        // login butonuna basin
        qualitydemyPage.loginButonu.click();


        // basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());
        // sayfayi kapatin
        Driver.closeDriver();
    }
}
