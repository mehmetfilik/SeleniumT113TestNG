package tests.day14_TestNGFrameworkOlusturma;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C03_DependsOnMethods {

    /*
        DependsOnMethods oncelik sirasina karismaz

        dependsOnMethods bir test methodunun calismasini
        baska bir method'un calisip test olmasina baglar

        baglanilan method calismaz veya calisir ama failed olursa
        baglanan method hic calismaz
     */

    @Test(dependsOnMethods = "wiseTesti")
    public void youtubeTesti(){
        System.out.println("Youtube");

    }

    @Test(priority = 3)
    public void wiseTesti(){
        System.out.println("Wise Quarter");
        Assert.assertTrue(8==3); // failed
    }

    @Test(dependsOnMethods = "youtubeTesti")
    public void amazonTesti(){ // priority yazilmazsa 0 degeri alir
        System.out.println("Amazon");
    }
}
