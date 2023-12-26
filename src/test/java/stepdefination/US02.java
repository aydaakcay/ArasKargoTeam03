package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US02Pages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US02 {
    US02Pages us02Pages = new US02Pages();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanıcı {string} e gider.")
    public void kullanıcı_e_gider(String string) {

        Driver.getDriver().get(string);

//        Driver.clickWithJS(ambalajUrunleriPage.popUpAccept);
//        Driver.getDriver().get(ConfigReader.getProperty("url"));
////        CEREZ CIKAN ARKADARLAR ICIN, CEREZI OKEYLEYELIM
//        try{
//            Driver.clickWithJS(ambalajUrunleriPage.popUpAccept);
//        }catch (Exception e){
//        }
    }

    @When("Kullanıcı Hizmetlerimiz butonu üzerine gelir")
    public void kullanıcı_hizmetlerimiz_butonu_üzerine_gelir() throws InterruptedException {
        ReusableMethods.click(us02Pages.closeButon);
        ReusableMethods.bekle(1);
        ReusableMethods.hover(us02Pages.hizmetlerimizButon);
        ReusableMethods.bekle(2);
    }
    @When("Kullanıcı acılan sekmede Ambalaj ürünlerimiz butonuna tıklar")
    public void kullanıcı_acılan_sekmede_ambalaj_ürünlerimiz_butonuna_tıklar() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(us02Pages.ambalajUrunlerimizButon);

    }
    @When("Kullanıcı ambalaj fiyatları pdf butonuna tıklar")
    public void kullanıcı_ambalaj_fiyatları_pdf_butonuna_tıklar() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.hover(us02Pages.ambalajUrunleriPdfButon);
        ReusableMethods.bekle(2);
        ReusableMethods.click(us02Pages.ambalajUrunleriPdfButon);

    }
    @Then("Kullanıcı ambalaj fiyatları listesini goruntuler")
    public void kullanıcı_ambalaj_fiyatları_listesini_goruntuler() throws IOException {
        ReusableMethods.bekle(2);
        ReusableMethods.switchToWindow("Aras_Hizmetler_fiyat_listesi_2023_ikinci_yari_yil_yeni_kdv_24_07_23.pdf");
    }

}
