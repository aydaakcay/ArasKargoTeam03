package stepdefination.US06_SUAT;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US_05_06.Araskargopage_suat;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class US06_TC01StepDefination {


    Araskargopage_suat suat = new Araskargopage_suat();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Kullanici araskargo anasayfasina gider")
    public void kullaniciAraskargoAnasayfasinaGider() {



        Driver.getDriver().get(ConfigReader.getProperty("https://www.araskargo.com.tr/"));
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @When("mavi dashboarddaki  ücret  hesapla  butonuna  tıklar")
    public void maviDashboarddakiÜcretHesaplaButonunaTıklar() {

        suat.ücrethesaplabutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Then("acılan sayfada  yurt dışı  seçer")
    public void acılanSayfadaYurtDışıSeçer() {
        suat.YURTDIŞI.click();

    }

    @And("Random  bir  ülke  seçer")
    public void randomBirÜlkeSeçer() {
        suat.okişaretiafganistan.click();

    }

    @And("dosya ve  evrak ikonuna   tıklar")
    public void dosyaVeEvrakIkonunaTıklar() {
        suat.dosyaevrakbutton.click();
    }


    @And("gönderi  detayından  ücretin  görüntülendiği  doğrulanır\\(standart  bedel)")
    public void gönderiDetayındanÜcretinGörüntülendiğiDoğrulanırStandartBedel() {

        Assert.assertTrue(suat.toplamtutarbutton.getText().contains("tutargöründü"));
    }


    @Given("Kullanici {string} e gider")
    public void kullaniciEGider(String arg0) {
    }
}




