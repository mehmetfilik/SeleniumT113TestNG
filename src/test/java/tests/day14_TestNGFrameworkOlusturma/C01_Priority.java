package tests.day14_TestNGFrameworkOlusturma;

import org.testng.annotations.Test;

public class C01_Priority {
    /*
        JUnit framework'de testlerin calisma sirasi
        ONGORULEMEZ ve DUZENLENEMEZ

        TestNG testleri harf sirasina gore calistirir

        Ayrica priority degeri girerek testleri istedigimiz sira ile calistirabiliriz
        (KONTROL EDILEBILIR SIRALAMA)

        priority sayisal olarak kucukten buyuge dogru testleri calistirir
     */

    @Test(priority = 57)
    public void youtubeTesti(){
        System.out.println("Youtube");
    }

    @Test(groups = "minireg1")
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }

    @Test(groups = {"smoke", "minireg1"})
    public void amazonTesti(){ // priority yazilmazsa 0 degeri alir
        System.out.println("Amazon");
    }



}
