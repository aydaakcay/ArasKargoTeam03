package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US10Pages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US10 {
    US10Pages us10Pages = new US10Pages();
    Actions actions = new Actions(Driver.getDriver());

    @When("Kullanıcı Kariyer sekmesine tıklar.")
    public void kullanıcı_kariyer_sekmesine_tıklar() {

        ReusableMethods.hover(us10Pages.kariyerButon);
        ReusableMethods.bekle(2);
    }
    @When("Kullanıcı Gelecegin Bizde Önem Tasır butonunu tıklar")
    public void kullanıcıGeleceginBizdeÖnemTasırButonunuTıklar() {
        ReusableMethods.click(us10Pages.geleceginÖnemTasırButon);
        ReusableMethods.bekle(2);
    }
    @When("Kullanıcı Aras Kargo İş Basvuruları yazan alana gelir")
    public void kullanıcı_aras_kargo_iş_basvuruları_yazan_alana_gelir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @When("Kullanıcı Linkedin butonuna tıklar")
    public void kullanıcı_linkedin_butonuna_tıklar() {
        ReusableMethods.click(us10Pages.linkedinButon);
        ReusableMethods.bekle(2);

    }

    @Then("Kullanıcı Linkedinde Aras Kargo sayfasını göruntuler")
    public void kullanıcı_linkedinde_aras_kargo_sayfasını_göruntuler() throws IOException {
        ReusableMethods.bekle(2);
        ReusableMethods.switchToWindow("https://www.linkedin.com/company/aras-kargo/jobs/");


    }

    @When("Kullanıcı Kariyer.net butonuna tıklar")
    public void kullanıcıKariyerNetButonunaTıklar() {

        ReusableMethods.click(us10Pages.kariyerNetButon);
        ReusableMethods.bekle(2);

    }

    @Then("Kullanıcı Kariyer.net sayfasını göruntuler")
    public void kullanıcıKariyerNetSayfasınıGöruntuler() throws IOException {
        ReusableMethods.bekle(2);
        ReusableMethods.switchToWindow("https://www.kariyer.net/firma-profil/aras-kargo-3079-40011");


    }

    @When("Kullanıcı Secretcv butonuna tıklar")
    public void kullanıcıSecretcvButonunaTıklar() {
        ReusableMethods.click(us10Pages.secretCvButon);
        ReusableMethods.bekle(2);
    }

    @Then("Kullanıcı Secretcv sayfasını göruntuler")
    public void kullanıcıSecretcvSayfasınıGöruntuler() throws IOException {
        ReusableMethods.bekle(2);
        ReusableMethods.switchToWindow("https://www.secretcv.com/firma/aras-kargo-is-ilanlari");
    }

    @When("Kullanıcı elemannet butonuna tıklar")
    public void kullanıcıElemannetButonunaTıklar() {
        ReusableMethods.click(us10Pages.elemanNetButon);
        ReusableMethods.bekle(2);
    }

    @Then("Kullanıcı elemannet sayfasını goruntuler")
    public void kullanıcıElemannetSayfasınıGoruntuler() throws IOException {
        ReusableMethods.bekle(2);
        ReusableMethods.switchToWindow("https://www.eleman.net/firma/aras-kargo-f295113");
    }
}
