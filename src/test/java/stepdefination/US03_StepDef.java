package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US03_US12Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;



public class US03_StepDef {

    US03_US12Pages us03ayda = new US03_US12Pages();
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
        ReusableMethods.bekle(2);

    }

    @Then("Kullanici gecerli bir soyisim girer")
    public void kullanici_gecerli_bir_soyisim_girer() {

        actions.sendKeys(us03ayda.soyisimgir,"Günay")
                .sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(2);

     }

    @Then("Kullanici gecerli bir yas girer")
    public void kullanici_gecerli_bir_yas_girer() {
        us03ayda.yasgir.sendKeys("30");
        actions.sendKeys(Keys.TAB,"05523434561").perform();

    }

    @Then("Kullanici gecerli bir telefon numarasi girer")
    public void kullanici_gecerli_bir_telefon_numarasi_girer() {
        //us03ayda.telnogir.sendKeys("05523434561");
        actions.sendKeys(Keys.TAB).perform();
    }

    @Then("Kullanici gecerli bir e posta girer")
    public void kullanici_gecerli_bir_e_posta_girer() {
        us03ayda.emailgir.sendKeys("ay@gece.com");

    }

    @Then("Egitim durumu DDM den secer")
    public void egitim_durumu_ddm_den_secer() {
        ReusableMethods.click(us03ayda.egitimdurumunusec);
        ReusableMethods.click(us03ayda.egitimturusec);
        ReusableMethods.bekle(10);


    }

    @Then("Güvenlik kodu girer")
    public void güvenlik_kodu_girer() {

    }

    @Then("Basvurunu gönder butonuna tiklar")
    public void basvurunu_gönder_butonuna_tiklar() {

        ReusableMethods.click(us03ayda.basvurugonderr);
    }

    @Then("{string} mesajini görür")
    public void mesajini_görür(String string) {

        Assert.assertTrue(us03ayda.mesajgorunurlugu.isDisplayed());
    }

    @Then("Ana sayfaya dön butonuna tiklar")
    public void ana_sayfaya_dön_butonuna_tiklar() {

        ReusableMethods.click(us03ayda.anasayfayadon);

    }



    @Then("İsim kutucuguna harf,rakam ve özel karakterlerden oluşan bir isim girer")
    public void isimKutucugunaHarfRakamVeÖzelKarakterlerdenOluşanBirIsimGirer() {
        us03ayda.isimgir.sendKeys(ConfigReader.getProperty("TC02-isim"));
       // us03ayda.isimgir.sendKeys("ay23");

    }

    @Then("Soyisim kutucuguna harf,rakam ve özel karakterlerden oluşan bir soyisim girer")
    public void soyisimKutucugunaHarfRakamVeÖzelKarakterlerdenOluşanBirSoyisimGirer() {

        us03ayda.soyisimgir.sendKeys(ConfigReader.getProperty("TC02-soyisim"));
    }

    @Then("Yaş kutucuguna {int}' den küçük bir sayı girer")
    public void yaşKutucugunaDenKüçükBirSayıGirer(int arg0) {

        us03ayda.yasgir.sendKeys(ConfigReader.getProperty("TC02-yas"));

    }

    @Then("{string} uyarısını aldığını dogrular")
    public void uyarısınıAldığınıDogrular(String arg0) {
        Assert.assertTrue(us03ayda.yasinizhatali.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @Then("Telefon No kutucuguna {string} ile başlamayan bir numara girer")
    public void telefonNoKutucugunaIleBaşlamayanBirNumaraGirer(String arg0) {
        us03ayda.telnogir.sendKeys(ConfigReader.getProperty("TC02-telno1"));
        us03ayda.telnogir.clear();

    }

    @Then("{string} uyarısını aldığını doğrular")
    public void uyarısınıAldığınıDoğrular(String arg0) {
        Assert.assertTrue(us03ayda.telno1hatali.isDisplayed());
    }


    @Then("Telefon No kutucuguna TR'de geçerli cep telefonu kodları haricinde kodla telefon numarası girer")
    public void telefonNoKutucugunaTRDeGeçerliCepTelefonuKodlarıHaricindeKodlaTelefonNumarasıGirer() {
        us03ayda.telnogir.sendKeys(ConfigReader.getProperty("TC02-telno2"));
        us03ayda.telnogir.clear();

    }

    @Then("Telefon No kutucuguna eksik numara ile kayıt yapmayı girer")
    public void telefonNoKutucugunaEksikNumaraIleKayıtYapmayıGirer() {
        us03ayda.telnogir.sendKeys(ConfigReader.getProperty("TC02-telno3"));

    }


    @Then("Mail kutucuguna @ işaretinden sonra herhangi bir karakter ile mail girer")
    public void mailKutucugunaIşaretindenSonraHerhangiBirKarakterIleMailGirer() {
        us03ayda.emailgir.sendKeys(ConfigReader.getProperty("TC02-mail"));
    }


    @Then("Egitim durumu DDM den secmeden girer {string} mesajını alir")
    public void egitimDurumuDDMDenSecmedenGirerMesajınıAlir(String arg0) {
        Assert.assertTrue(us03ayda.egitimdurumusec.isDisplayed());
        ReusableMethods.bekle(10);

    }

    @Then("Güvenlik Kodu sekmesine, ekranda görünen Güvenlik kodunu girer.")
    public void güvenlikKoduSekmesineEkrandaGörünenGüvenlikKodunuGirer() {

    }


    @Then("{string} uyarisini aldigini dogrular")
    public void uyarisiniAldiginiDogrular(String arg0) {
        Assert.assertTrue(us03ayda.emailhatali.isDisplayed());
    }

    @Then("{string} uyarisini  aldıgını dogrular")
    public void uyarisiniAldıgınıDogrular(String arg0) {
        Assert.assertTrue(us03ayda.telno1hatali.isDisplayed());
    }
}
