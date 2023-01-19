package GroupPractice;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class Q1 extends TestBase {

    /*
    1) Bir class oluşturun: BestBuyAssertions
    2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak
    asagidaki testleri yapin
    ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    ○ logoTest => BestBuy logosunun görüntülendigini test edin
    ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
     */


    @Test
    public void test01(){
        driver.get("https://www.bestbuy.com/");

        String expected="https://www.bestbuy.com/";
        String actual= driver.getCurrentUrl();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test02(){
        driver.get("https://www.bestbuy.com/");
        System.out.println(driver.getTitle());
        String title="Rest";
        String actualtittle= driver.getTitle();

        Assert.assertFalse(title.contains(actualtittle));

    }


}
