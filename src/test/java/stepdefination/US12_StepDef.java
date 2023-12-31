package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.hr.Kad;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US03_US12Pages;
import utilities.Driver;
import utilities.ReusableMethods;

public class US12_StepDef {

    US03_US12Pages us03ayda = new US03_US12Pages();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Acilan pencereden Müsteri iliskileri üzerine gelir")
    public void acilan_pencereden_müsteri_iliskileri_üzerine_gelir() {
        actions.dragAndDrop(us03ayda.musteriiliskileri,us03ayda.SSS).perform();
        ReusableMethods.bekle(3);
    }

    @Then("DDM den SSS sekmesine tiklar")
    public void ddm_den_sss_sekmesine_tiklar() {
        ReusableMethods.click(us03ayda.SSS);
        ReusableMethods.bekle(3);
    }

    @Then("Gelen Sikca Sorulan Sorular sayfasinda {string} sorusuna tiklar")
    public void gelen_sikca_sorulan_sorular_sayfasinda_sorusuna_tiklar(String string) {
        ReusableMethods.click(us03ayda.kargomNezamanGelir);
        ReusableMethods.bekle(3);

    }

    @Then("Cevabın gorunurlugu dogrulanir")
    public void cevabın_gorunurlugu_dogrulanir() {
        Assert.assertTrue(us03ayda.kargoTakip.isDisplayed());
        ReusableMethods.click(us03ayda.kargoTakiptoggle);
        ReusableMethods.bekle(3);


    }

    @Then("Gelen Sıkça Sorulan Sorular sayfasında {string} sorusuna tıklar,")
    public void gelenSıkçaSorulanSorularSayfasındaSorusunaTıklar(String arg0) {
        ReusableMethods.click(us03ayda.arasTahsilat);
        ReusableMethods.bekle(3);
    }

    @Then("Doğru yönlendirme ve cevabın olduğunu görür.")
    public void doğru_yönlendirme_ve_cevabın_olduğunu_görür() {
        Assert.assertTrue(us03ayda.arasTahsilatCevap.isDisplayed());
        ReusableMethods.click(us03ayda.arasTahsilatCevapToggle);
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();


    }

    @Then("Gelen Sıkça Sorulan Sorular sayfasinda {string} sorusuna tıklar,")
    public void gelenSıkçaSorulanSorularSayfasindaSorusunaTıklar(String arg0) {
        ReusableMethods.click(us03ayda.arasEodeme);
        ReusableMethods.bekle(3);

    }

    @Then("Dogru yonlendirme ve cevabin oldugunu gorur.")
    public void dogruYonlendirmeVeCevabinOldugunuGorur() {
        Assert.assertTrue(us03ayda.arasEodemeCevap.isDisplayed());
        ReusableMethods.click(us03ayda.arasEOdemeCevapToggle);
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
}
