package stepdefination;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US02Pages;
import pages.US09Pages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class US09 {
    US09Pages us09Pages = new US09Pages();
    US02Pages us02Pages = new US02Pages();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    Random random = new Random();


    @When("Kullanıcı Anasayfada Size Nasıl Yardimci olabilirim popUpa tiklar.")
    public void kullanıcıAnasayfadaSizeNasılYardimciOlabilirimPopUpaTiklar() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        ReusableMethods.click(us09Pages.sizeNasılYardımcıOlabilirimButon);
    }

    @When("Kullanıcı {string} adresine gider.")
    public void kullanıcıAdresineGider(String string) throws IOException {
        Driver.getDriver().get(string);
        ReusableMethods.switchToWindow2(1);

    }
    @When("Kullanıcı açilan pencereden Devam butonuna tiklar")
    public void kullanıcıAçilanPenceredenDevamButonunaTiklar() throws IOException {
        ReusableMethods.bekle(2);
        ReusableMethods.click(us09Pages.devamButonu);

    }
    @When("Kullanıcı girmesi gereken ad soyad bilgilerini girer ve gonder butonuna tiklar")
    public void kullanıcı_girmesi_gereken_ad_soyad_bilgilerini_girer_ve_gonder_butonuna_tiklar() {
        ReusableMethods.bekle(2);
        us09Pages.adSoyadButonu.sendKeys("ayse ay"+Keys.ENTER);
        ReusableMethods.bekle(2);
        ReusableMethods.click(us09Pages.gönderButonu);


    }
    @When("Kullanıcı girmesi gereken telefon numarası girer ve gonder butonuna tıklar.")
    public void kullanıcı_girmesi_gereken_telefon_numarası_girer_ve_gonder_butonuna_tıklar() {

        String randomPhoneNo = String.valueOf(268)
                + (random.nextInt(999 - 100) + 100)
                + (random.nextInt(9999 - 1000) + 1000);
        us09Pages.telNoButonu.sendKeys(randomPhoneNo);
        us09Pages.gönderButonu.click();
        ReusableMethods.bekle(2);



    }
    @When("Kullanıcı girmesi gereken mail adresi bilgisini girer ve gönder butonuna tiklar")
    public void kullanıcı_girmesi_gereken_mail_adresi_bilgisini_girer_ve_gönder_butonuna_tiklar() {
        ReusableMethods.bekle(2);
        String mail = faker.internet().emailAddress();
        us09Pages.emailButonu.sendKeys(mail);
        ReusableMethods.bekle(2);
        us09Pages.gönderButonu.click();
        ReusableMethods.bekle(1);


    }
    @When("Kullanici girmesi gereken islem numarasi girer")
    public void kullanici_girmesi_gereken_islem_numarasi_girer() {

        String randomIslemNo = String.valueOf(random.nextInt(us09Pages.islemMetniList.size()) + 1);
        us09Pages.islemSecenegiButon.sendKeys(randomIslemNo);
        ReusableMethods.bekle(2);
        us09Pages.gönderButonu.click();
        ReusableMethods.bekle(2);

    }
    @Then("Kullanıcı Ilgili soruya yönlendirildigini dogrular.")
    public void kullanıcı_ılgili_soruya_yönlendirildigini_dogrular() throws IOException {

        Assert.assertTrue(us09Pages.ilgiliMenuNoText.isDisplayed());

    }


    @Then("Kullanıcı cıkıs yapar ve ilgili uyarı mesajını dogrular")
    public void kullanıcıCıkısYaparVeIlgiliUyarıMesajınıDogrular() {
        us09Pages.cıkısButon.sendKeys("çıkış");
        ReusableMethods.bekle(2);
        ReusableMethods.click(us09Pages.gönderButonu);
        ReusableMethods.bekle(2);
        Assert.assertTrue(us09Pages.tesekkurYazısı.getText().contains("teşekkür"));

    }

    @Then("Kullanıcı sayfayı kapatır.")
    public void kullanıcıSayfayıKapatır() {
        Driver.quitDriver();
    }
}
