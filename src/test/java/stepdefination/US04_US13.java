package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US04_US13Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US04_US13 {
   US04_US13Pages page = new US04_US13Pages();
    Actions action = new Actions(Driver.getDriver());

    @Given("Kullanici aras kargo sitesine gider")
    public void kullaniciArasKargoSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("arasKargoUrl"));
    }

    @Then("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int arg0) {
        ReusableMethods.bekle(2);
    }

    @When("Kullanici bilgilendirme mesajini kapatir")
    public void kullaniciBilgilendirmeMesajiniKapatir() {
        ReusableMethods.click(page.mesajClick);

        ReusableMethods.bekle(2);

    }

    @Then("Kullanici Uye girisi butonuna tiklar")
    public void kullaniciUyeGirisiButonunaTiklar() {

        ReusableMethods.click(page.uyeGiris);
        ReusableMethods.bekle(2);

    }

    @When("Kullanici acilan sekmenin KURUMSAL KULLANICI GİRİŞİ sayfasi oldugunu dogrular")
    public void kullaniciAcilanSekmeninKURUMSALKULLANICIGİRİŞİSayfasiOldugunuDogrular() {

        ReusableMethods.switchToWindow(1);
       String sayfaUrl = Driver.getDriver().getCurrentUrl();
        String girisUrl = "https://esasweb.araskargo.com.tr/";

        Assert.assertEquals(girisUrl, sayfaUrl);

    }

    @And("Kullanici tum sayfalari kapatir")
    public void kullaniciTumSayfalariKapatir() {
        Driver.getDriver().quit();
    }
//--------------------------US13-------------------------------

    @Then("Kullanici cerezi kapatir")
    public void kullaniciCereziKapatir() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(page.cerezRed);
        ReusableMethods.click(page.cerezRed);
        ReusableMethods.click(page.cerezRed);

    }
}
