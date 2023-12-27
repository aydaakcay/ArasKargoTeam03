package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.US08_Page;
import utilities.Driver;

import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.click;

public class US08 {
    US08_Page page=new US08_Page();
    Actions actions=new Actions(Driver.getDriver());
    @When("Kullanici musteri iliskileri sekmesinin üzerine mause u bekletir")
    public void kullaniciMusteriIliskileriSekmesininÜzerineMauseUBekletir() {
        bekle(2);
        page.popUp.click();
        bekle(2);
        actions.moveToElement(page.musteriIliskileri).perform();
        bekle(2);
    }

    @And("Acilan sekmeden Geri Bildirim Formuna tiklar")
    public void acilanSekmedenGeriBildirimFormunaTiklar() {
    page.geriBildirimFormu.click();
    }

    @And("Kategori secin menusune tiklar")
    public void kategoriSecinMenusuneTiklar() {
        page.kategoriDDM.click();
    }

    @Given("Kullanici Bilgi ddm menusune tiklar")
    public void kullaniciBilgiDdmMenusuneTiklar() {
        page.bilgiMenu.click();
    }
}
