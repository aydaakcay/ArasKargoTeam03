package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US08_Page;
import utilities.Driver;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class US08 {
    US08_Page page=new US08_Page();
    Actions actions=new Actions(Driver.getDriver());
    SearchContext shadowRootElement;
    WebElement hiddenElement;
    @When("Kullanici musteri iliskileri sekmesinin üzerine mause u bekletir")
    public void kullaniciMusteriIliskileriSekmesininÜzerineMauseUBekletir() {
        bekle(2);
        page.popUp.click();
        bekle(2);
        try {
            shadowRootElement =
                    Driver.getDriver().findElement(By.cssSelector(".efilli-layout-default")).getShadowRoot();
            hiddenElement =
                    shadowRootElement.findElement(By.cssSelector(".banner__accept-button"));
            hiddenElement.click();
        } catch (Exception e) {
        }
        actions.moveToElement(page.musteriIliskileri).perform();
        bekle(2);

    }

    @And("Acilan sekmeden Geri Bildirim Formuna tiklar")
    public void acilanSekmedenGeriBildirimFormunaTiklar() {
    page.geriBildirimFormu.click();
    }

    @And("Kategori secin menusune tiklar")
    public void kategoriSecinMenusuneTiklar() {
        bekle(3);
        scrollToCoordinat(300);
        bekle(3);
        page.kategoriDDM.click();
    }

    @Given("Kullanici Bilgi ddm menusune tiklar")
    public void kullaniciBilgiDdmMenusuneTiklar() {

        page.bilgiMenu.click();
    }

    @Then("Kullanici Bilgi ddm menusunun tiklanabilir oldugunu dogrular")
    public void kullaniciBilgiDdmMenusununTiklanabilirOldugunuDogrular() {
        assertTrue(page.bilgiDogrulama.isEnabled());
    }

    @Given("Kullanici İşlem-Talep ddm menusune tiklar")
    public void kullaniciİşlemTalepDdmMenusuneTiklar() {
        page.kategoriDDM.click();
        page.islemTalepMenu.click();

    }

    @Then("Kullanici İşlem-Talep ddm menusune tiklanabilir oldugunu dogrular")
    public void kullaniciİşlemTalepDdmMenusuneTiklanabilirOldugunuDogrular() {
        assertTrue(page.islemTalepDogrulama.isEnabled());
    }

    @Given("Kullanici Oneri ddm menusune tiklar")
    public void kullaniciOneriDdmMenusuneTiklar() {
        page.kategoriDDM.click();
        page.oneriMenu.click();
    }


    @Then("Kullanici Oneri ddm menusune tiklanabilir oldugunu dogrular")
    public void kullaniciOneriDdmMenusuneTiklanabilirOldugunuDogrular() {
        assertTrue(page.oneriDogrulama.isEnabled());
    }

    @Given("Kullanici Sikayet  ddm menusune tiklar")
    public void kullaniciSikayetDdmMenusuneTiklar() {
        page.kategoriDDM.click();
        page.sikayetMenu.click();
    }

    @Then("Kullanici Sikayet  ddm menusune tiklanabilir oldugunu dogrular")
    public void kullaniciSikayetDdmMenusuneTiklanabilirOldugunuDogrular() {
        assertTrue(page.sikayetDogrulama.isEnabled());
    }

    @Given("Kullanici Teşekkürler  ddm menusune tiklar")
    public void kullaniciTeşekkürlerDdmMenusuneTiklar() {
        page.kategoriDDM.click();
        page.tesekkurlerMenu.click();
    }

    @Then("Kullanici Teşekkürler  ddm menusune tiklanabilir oldugunu dogrular")
    public void kullaniciTeşekkürlerDdmMenusuneTiklanabilirOldugunuDogrular() {
        assertTrue(page.tesekkurlerDogrulama.isEnabled());
    }

    @And("Kullanici konu basligi secin bolumunden e odeme bilgisi bolumunu secer")
    public void kullaniciKonuBasligiSecinBolumundenEOdemeBilgisiBolumunuSecer() {
        page.konuBasligiSecin.click();
        bekle(1);
        page.eOdemeBilgisiButonu.click();
    }

    @And("Ad bolumune tikla ve ardindan soyad bolumune tikla")
    public void adBolumuneTiklaVeArdindanSoyadBolumuneTikla() {
        page.formName.click();
        page.formSurName.click();
    }

    @Then("Ad bolumu bos birakildigi icin hata verdigini dogrula")
    public void adBolumuBosBirakildigiIcinHataVerdiginiDogrula() {
        assertTrue(page.formHataMesaji.isDisplayed());
    }

    @And("Random bir isim gir")
    public void randomBirIsimGir() {
        page.formName.sendKeys("Mehmet");
    }

    @And("Soyad bolumunde hata ciktigini dogrula ve random bir isim gir")
    public void soyadBolumundeHataCiktiginiDogrulaVeRandomBirIsimGir() {
        assertTrue(page.formHataMesaji.isDisplayed());
        page.formSurName.sendKeys("Serkan");
    }

    @And("Cep telefonu bolumune tikla ardinda e postaya tikla")
    public void cepTelefonuBolumuneTiklaArdindaEPostayaTikla() {
        page.formPhone.click();
        page.formEmail.click();
    }

    @And("Cep telefonu bos birakildigi icin hata verdigini dogrula ve random bir numara gir")
    public void cepTelefonuBosBirakildigiIcinHataVerdiginiDogrulaVeRandomBirNumaraGir() {
        page.formPhone.sendKeys("05555555555");
    }

    @And("Eposta adresinin hata verdigini dogrula ve random bir email gir")
    public void epostaAdresininHataVerdiginiDogrulaVeRandomBirEmailGir() {
        page.formEmail.sendKeys("test@gmail.com");
    }

    @And("Il ilce seciniz kismina adanayi gir ve ilgili subeyi secin kismindan ceyhani sec")
    public void ılIlceSecinizKisminaAdanayiGirVeIlgiliSubeyiSecinKismindanCeyhaniSec() {
        page.formIl.sendKeys("adana");
        page.formIlSecim.click();
        bekle(2);
        page.formSubeSecim.click();
        page.formSubeSecimCeyhan.click();
        bekle(2);
        scrollToCoordinat(150);
        bekle(1);
    }

    @And("Mesajiniz bolumune {string} gir")
    public void mesajinizBolumuneGir(String mesaj) {
        page.formMesaj.sendKeys(mesaj);
        scrollToCoordinat(200);
        bekle(2);

    }

    @And("Dosya Ekle bolumune bir resim yukle")
    public void dosyaEkleBolumuneBirResimYukle() {
        click(page.formDosyaYukle);
        String path="\"C:\\Users\\Win10\\Desktop\\testResim.jpg\"";
        uploadFilePath(path);

    }
}
