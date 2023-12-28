package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US07_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.lang.module.Configuration;
import java.time.Duration;



public class US07 {

    US07_Pages pages = new US07_Pages();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));


    @Given("Kullanici url'e gider")
    public void kullanici_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("arasKargoUrl"));
    }

    @Then("Kullanici En Yakin Subeler butonuna tiklar")
    public void kullanici_en_yakin_subeler_butonuna_tiklar() {

        pages.popUpClose.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.hover(pages.enYakinSubelerButton);
        ReusableMethods.bekle(3);
        ReusableMethods.click(pages.enYakinSubelerButton);


    }

    @Then("Kullanici arama islemi dropdown Aras Burasi Noktalari secenegini secer")
    public void kullanici_arama_islemi_dropdown_aras_burasi_noktalari_secenegini_secer() {


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(pages.aramaKutusu);
        ReusableMethods.bekle(3);
        actions.moveToElement(pages.arasBurasiSecenegi);
        ReusableMethods.click(pages.arasBurasiSecenegi);

    }

    @Then("Kullanici İl veya İlce giriniz bolumune tiklar")
    public void kullanici_i̇l_veya_i̇lce_giriniz_bolumune_tiklar() {
        ReusableMethods.bekle(3);
        ReusableMethods.click(pages.ilVeyaIlceIkon);


    }

    @Then("Kullanici gecerli il ismi girer.")
    public void kullanici_gecerli_il_ismi_girer() {
        pages.ilVeyaIlceKutu.sendKeys("Ankara");
        ReusableMethods.bekle(5);


    }

    @Then("Kullanici dropdowndan ilce ismi secer")
    public void kullanici_dropdowndan_ilce_ismi_secer() {
        ReusableMethods.bekle(3);
        ReusableMethods.hover(pages.ddmSecim);
        ReusableMethods.click(pages.ddmSecim);
        ReusableMethods.bekle(3);
        pages.ilVeyaIlceKutu.sendKeys(Keys.ENTER);

    }

    @Then("Kullanici ara butonuna basar")
    public void kullanici_ara_butonuna_basar() {
        ReusableMethods.click(pages.araButton);

    }

    @Then("Kullanici sonuclari liste ve haritada isaretli olarak sunuldugunu dogrular.")
    public void kullanici_sonuclari_liste_ve_haritada_isaretli_olarak_sunuldugunu_dogrular() {
        Assert.assertTrue(pages.bulunduYazisi.getText().contains("Bulundu"));
        Assert.assertTrue(pages.haritaIsareti.isDisplayed());
        Driver.quitDriver();

    }

    @Then("Kullanici En Yakin Subelerr butonuna tiklar")
    public void kullaniciEnYakinSubelerrButonunaTiklar() {
        pages.popUpClose.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.hover(pages.enYakinSubelerButton);
        ReusableMethods.bekle(3);
        ReusableMethods.click(pages.enYakinSubelerButton);

    }

    @Then("Kullanici arama islemi dropdown Aras Burasi Noktalarii secenegini secer")
    public void kullaniciAramaIslemiDropdownArasBurasiNoktalariiSeceneginiSecer() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(pages.aramaKutusu);
        ReusableMethods.bekle(3);
        actions.moveToElement(pages.arasBurasiSecenegi);
        ReusableMethods.click(pages.arasBurasiSecenegi);

    }

    @Then("Kullanici İl veya İlcee giriniz bolumune tiklar")
    public void kullaniciİlVeyaİlceeGirinizBolumuneTiklar() {
        ReusableMethods.bekle(3);
        ReusableMethods.click(pages.ilVeyaIlceIkon);

    }

    @Then("Kullanici İl veya İlce giriniz bolumunu bos birakir")
    public void kullaniciİlVeyaİlceGirinizBolumunuBosBirakir() {

    }

    @Then("Kullanici araa butonuna basar")
    public void kullaniciAraaButonunaBasar() {
        actions.moveToElement(pages.araButton);
        ReusableMethods.click(pages.araButton);
    }

    @And("Kullanici uyarı mesajı aldıgını dogrular")
    public void kullaniciUyarıMesajıAldıgınıDogrular() {

        Assert.assertTrue(pages.uyariYazisi.isDisplayed());
        Driver.quitDriver();
    }

    @Then("Kullanici En Yakin Subeler butonuna tiklarr")
    public void kullaniciEnYakinSubelerButonunaTiklarr() {
        pages.popUpClose.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.hover(pages.enYakinSubelerButton);
        ReusableMethods.bekle(3);
        ReusableMethods.click(pages.enYakinSubelerButton);
    }

    @Then("Kullanici arama islemi dropdown Subelerimiz secenegini secer")
    public void kullaniciAramaIslemiDropdownSubelerimizSeceneginiSecer() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(pages.aramaKutusu);
        ReusableMethods.bekle(3);
        actions.moveToElement(pages.subelerimiz);
        ReusableMethods.click(pages.subelerimiz);

    }

    @Then("Kullanici İl veya İlce giriniz bolumune tiklarr")
    public void kullaniciİlVeyaİlceGirinizBolumuneTiklarr() {
        ReusableMethods.bekle(3);
        ReusableMethods.click(pages.ilVeyaIlceIkon);

    }

    @Then("Kullanici gecerli il ismi girerr")
    public void kullaniciGecerliIlIsmiGirerr() {
        ReusableMethods.bekle(3);
        pages.ilVeyaIlceKutu.sendKeys("Ankara");
        ReusableMethods.hover(pages.ddmSecim);
        ReusableMethods.click(pages.ddmSecim);
        ReusableMethods.bekle(3);
        pages.ilVeyaIlceKutu.sendKeys(Keys.ENTER);


    }

    @Then("Kullanıcı adres detay kısmına bilgi girer")
    public void kullanıcıAdresDetayKısmınaBilgiGirer() {
        pages.adresDetay.sendKeys("aras aras");


    }

    @Then("Kullanici ara butonuna basarr")
    public void kullaniciAraButonunaBasarr() {
        ReusableMethods.click(pages.araButton);
        ReusableMethods.bekle(2);

    }

    @Then("Kullanici sonuclari liste ve haritada isaretli olarak sunuldugunu dogrularr.")
    public void kullaniciSonuclariListeVeHaritadaIsaretliOlarakSunuldugunuDogrularr() {
        Assert.assertTrue(pages.bulunduYazisi.getText().contains("Bulundu"));
        Assert.assertTrue(pages.haritaIsareti2.isDisplayed());
        Driver.quitDriver();

    }
    @Then("Kullanici En Yakin Subelerr butonunaa tiklarr")
    public void kullanici_en_yakin_subelerr_butonunaa_tiklarr() {
        pages.popUpClose.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(pages.enYakinSubelerButton);
    }


    @Then("Kullanici arama islemi dropdown Subelerimiz seceneginii secer")
    public void kullaniciAramaIslemiDropdownSubelerimizSeceneginiiSecer() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(pages.aramaKutusu);
        ReusableMethods.bekle(3);
        actions.moveToElement(pages.subelerimiz);
        ReusableMethods.click(pages.subelerimiz);
    }

    @Then("Kullanici İl veya İlce giriniz bolumunee tiklarr")
    public void kullaniciİlVeyaİlceGirinizBolumuneeTiklarr() {
        ReusableMethods.bekle(3);
        ReusableMethods.click(pages.ilVeyaIlceIkon);
    }

    @Then("Kullanici gecerli il ismii girerr")
    public void kullaniciGecerliIlIsmiiGirerr() {

    }

    @Then("Kullanıcı adres detay kısmına bilgii girer")
    public void kullanıcıAdresDetayKısmınaBilgiiGirer() {

    }

    @Then("Kullanici ara butonunaa basarr")
    public void kullaniciAraButonunaaBasarr() {
        ReusableMethods.click(pages.araButton);
        ReusableMethods.bekle(2);
    }


    @And("Kullanici uyarıi mesajı aldıgını dogrular")
    public void kullaniciUyarıiMesajıAldıgınıDogrular() {
        Assert.assertTrue(pages.uyariYazisi.isDisplayed());
        Driver.quitDriver();

    }

}