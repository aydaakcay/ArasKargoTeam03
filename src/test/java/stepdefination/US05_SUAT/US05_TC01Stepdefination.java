package stepdefination.US05_SUAT;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US_05_06.Araskargopage_suat;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US05_TC01Stepdefination {

    Araskargopage_suat suat = new Araskargopage_suat();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici olarak gecerli url'ye git")
    public void kullaniciOlarakGecerliUrlYeGit() {
        Driver.getDriver().get(ConfigReader.getProperty("araskargoUrl"));
        ReusableMethods.bekle(2);

    }

    @When("ekrandaki bilgilendirme yazisini kapat")
    public void ekrandakiBilgilendirmeYazisiniKapat() {
        suat.bilgilendirmeyazısıkapatbutton.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();


    }

    @Then("Mavi dashboarddaki Ücret Hesapla butonuna tikla")
    public void maviDashboarddakiÜcretHesaplaButonunaTikla() {
        suat.ücrethesaplabutton.click();
        ReusableMethods.bekle(2);
        
    }

    @And("Ucret hesapla sekmesine gidildigi dogrulanir.")
    public void ucretHesaplaSekmesineGidildigiDogrulanir() {
        Assert.assertTrue(suat.ücrethesaplabutton.getText().contains("tutargörüldü"));

        
    }

    @And("Nereden ve nereye kısımları doldurulur")
    public void neredenVeNereyeKısımlarıDoldurulur() {

        
    }

    @And("Kullanici gonderen ve alici adreslerini doldurur")
    public void kullaniciGonderenVeAliciAdresleriniDoldurur() {
        
    }

    @And("Kullanici sorumlu subeyi bul butonuna tiklar ve bir sube secer.")
    public void kullaniciSorumluSubeyiBulButonunaTiklarVeBirSubeSecer() {
    }
    @And("Kullanici kutukoli secenegini secer.")
    public void kullaniciKutukoliSeceneginiSecer() {
    }
    

    @And("Kullanici gonderilicek paketin boyutlarini girer.")
    public void kullaniciGonderilicekPaketinBoyutlariniGirer() {
        
    }


    @And("Kullanici Desi Kg Hesapla butonuna tiklar.")
    public void kullaniciDesiKgHesaplaButonunaTiklar() {
        
    }

    @And("Kullanici herhangi bir ambalaj secerek ambalajin fiyati etkiledigini dogrular")
    public void kullaniciHerhangiBirAmbalajSecerekAmbalajinFiyatiEtkilediginiDogrular() {
        
    }

    @And("Kullanici bir gonderi seklini secer ve fiyata etki ettigini dogrular.")
    public void kullaniciBirGonderiSekliniSecerVeFiyataEtkiEttiginiDogrular() {
        
    }

    @And("Kullanici teslimat seceneklerinden birini veya  hepsini secer ve  fiyatın  değiştiği doğrulanır")
    public void kullaniciTeslimatSeceneklerindenBiriniVeyaHepsiniSecerVeFiyatınDeğiştiğiDoğrulanır() {
        
    }

    @And("Kullanici ek hizletlerden birini birden fazla veya hicbirini secmeden isleme devam eder")
    public void kullaniciEkHizletlerdenBiriniBirdenFazlaVeyaHicbiriniSecmedenIslemeDevamEder() {
        
    }

    @And("Kullanici toplam fiyati gorur.")
    public void kullaniciToplamFiyatiGorur() {
    }
}
