package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US03_Ayda;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;



public class US03_StepDefination {

    US03_Ayda us03ayda = new US03_Ayda();
    Actions actions = new Actions(Driver.getDriver());





    @Given("Kullanici siteye gider")
    public void kullanici_siteye_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("araskargoUrl"));
        ReusableMethods.bekle(3);

      }

    @When("Cikan mesaj kapatilir")
    public void cikan_mesaj_kapatilir() {
    // Driver.getDriver().findElement(By.xpath("//div[@class='popup-close']")).click(); //Eski Yöntem
      //  ReusableMethods.click(us03ayda.mesajKapat); // Method Kullanarak clic yapma
        us03ayda.mesajKapat.click();  // Obje oluşturarark click yapma
        ReusableMethods.bekle(3);

    }

    @Then("Acilan pencereden İs Ortagimiz Olunun üzerine gelir")
    public void acilan_pencereden_is_ortağımız_olunun_üzerine_gelir() {
        actions.dragAndDrop(us03ayda.isOrtagimizOl,us03ayda.acentemizOl).perform();
        //ReusableMethods.click(us03ayda.isOrtagimizOl);
        ReusableMethods.bekle(3);

    }

    @Then("DDM den Acentemiz Olun sekmesine tiklar")
    public void ddm_den_acentemiz_olun_sekmesine_tiklar() {
        ReusableMethods.click(us03ayda.acentemizOl);
        ReusableMethods.bekle(3);
    }

    @Then("Hemen Basvur butonuna tiklar")
    public void hemen_basvur_butonuna_tiklar() {
        ReusableMethods.click(us03ayda.hemenbasvur);
        ReusableMethods.bekle(3);
    }


    @Then("Acente Basvuru Formu sayfasından il DDM den il secer")
    public void acente_basvuru_formu_sayfasından_il_ddm_den_il_secer() {

        //actions.moveToElement(us03ayda.basvuruilisec).perform();
        // ReusableMethods.ddmIndex(us03ayda.basvuruilisec,25);
        ReusableMethods.click(us03ayda.basvurusec);
        ReusableMethods.click(us03ayda.basvuruilisec);
        ReusableMethods.bekle(3);

    }

    @Then("Lokasyon Ekleye tiklar")
    public void lokasyon_ekleye_tiklar() {
        us03ayda.lokasyonEkle.click();
        ReusableMethods.bekle(3);

    }

    @Then("Kullanici gecerli bir isim girer")
    public void kullanici_gecerli_bir_isim_girer() {

        actions.sendKeys(us03ayda.isimgir, "Ceyda")
                .sendKeys(Keys.TAB).perform();

    }

    @Then("Kullanici gecerli bir soyisim girer")
    public void kullanici_gecerli_bir_soyisim_girer() {

        actions.sendKeys(us03ayda.soyisimgir,"Günay")
                .sendKeys(Keys.TAB).perform();

     }

    @Then("Kullanici gecerli bir yas girer")
    public void kullanici_gecerli_bir_yas_girer() {
        us03ayda.yasgir.sendKeys("30");

    }

    @Then("Kullanici gecerli bir telefon numarasi girer")
    public void kullanici_gecerli_bir_telefon_numarasi_girer() {
        us03ayda.telnogir.sendKeys("05523434561");

    }

    @Then("Kullanici gecerli bir e posta girer")
    public void kullanici_gecerli_bir_e_posta_girer() {
        us03ayda.emailgir.sendKeys("ay@gece.com");

    }

    @Then("Egitim durumu DDM den secer")
    public void egitim_durumu_ddm_den_secer() {
        ReusableMethods.click(us03ayda.egitimdurumunusec);
        ReusableMethods.click(us03ayda.egitimturusec);
        ReusableMethods.bekle(3);


    }

    @Then("Güvenlik kodu girer")
    public void güvenlik_kodu_girer() {


    }

    @Then("Basvurunu gönder butonuna tiklar")
    public void basvurunu_gönder_butonuna_tiklar() {

    }

    @Then("{string} mesajini görür")
    public void mesajini_görür(String string) {

    }

    @Then("Ana sayfaya dön butonuna tiklar")
    public void ana_sayfaya_dön_butonuna_tiklar() {

    }


}
