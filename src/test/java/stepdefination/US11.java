package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US11_Page;
import utilities.Driver;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class US11 {
    US11_Page page=new US11_Page();
    Actions actions=new Actions(Driver.getDriver());
    SearchContext shadowRootElement;
    WebElement hiddenElement;
    @When("Kullanici is ortagimiz olun sekmesinin üzerine mause u bekletir")
    public void kullaniciIsOrtagimizOlunSekmesininÜzerineMauseUBekletir() {
        bekle(2);
        page.popUpSSS.click();
        bekle(2);
        try {
            shadowRootElement =
                    Driver.getDriver().findElement(By.cssSelector(".efilli-layout-default")).getShadowRoot();
            hiddenElement =
                    shadowRootElement.findElement(By.cssSelector(".banner__accept-button"));
            hiddenElement.click();
        } catch (Exception e) {
        }
        actions.moveToElement(page.isOrtagimizOlunButon).perform();
    }

    @And("Acilan sekmeden sikca sorulan sorular butonuna tiklar")
    public void acilanSekmedenSikcaSorulanSorularButonunaTiklar() {
        page.isOrtagimizOlunButon.click();
    }

    @Then("Kimler aras kargo acentesi olmak icin aday olabilir butonun gorunur oldugunu dogrular")
    public void kimlerArasKargoAcentesiOlmakIcinAdayOlabilirButonunGorunurOldugunuDogrular() {
        scrollToCoordinat(300);
        assertTrue(page.sikcaSorulanSorularList.get(0).isDisplayed());
        page.sikcaSorulanSorularList.get(0).click();
    }

    @And("Acente olmak icin aday sorusunun cevabinin gorundugu dogrulanir")
    public void acenteOlmakIcinAdaySorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(0).isDisplayed());
        page.sikcaSorulanSorularList.get(0).click();
    }

    @Given("Aras Kargoda Acente olmak icin nasıl basvurulur textinin gorunur oldugunu dogrulanir")
    public void arasKargodaAcenteOlmakIcinNasılBasvurulurTextininGorunurOldugunuDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(1).isDisplayed());
        page.sikcaSorulanSorularList.get(1).click();
    }

    @Then("Acenta olmak icin nasıl basvurulur sorusunun cevabinin gorundugu dogrulanir")
    public void acentaOlmakIcinNasılBasvurulurSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(1).isDisplayed());
        page.sikcaSorulanSorularList.get(1).click();
    }

    @Given("Aras Kargo Acentesi olmak icin talep edilen isim hakki bedeli ne kadardir textinin gorunur oldugunu dogrulanir")
    public void arasKargoAcentesiOlmakIcinTalepEdilenIsimHakkiBedeliNeKadardirTextininGorunurOldugunuDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(2).isDisplayed());
        page.sikcaSorulanSorularList.get(2).click();
    }

    @Then("Talep edilen isim hakki bedeli sorusunun cevabinin gorundugu dogrulanir")
    public void talepEdilenIsimHakkiBedeliSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(2).isDisplayed());
        page.sikcaSorulanSorularList.get(2).click();
    }

    @Given("Aras Kargo Acentesi olmak için talep edilen teminat bedeli ne kadardir textinin gorunur oldugunu dogrulanir")
    public void arasKargoAcentesiOlmakIçinTalepEdilenTeminatBedeliNeKadardirTextininGorunurOldugunuDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(3).isDisplayed());
        page.sikcaSorulanSorularList.get(3).click();
    }

    @Then("Talep edilen teminat bedeli sorusunun cevabinin gorundugu dogrulanir")
    public void talepEdilenTeminatBedeliSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(3).isDisplayed());
        page.sikcaSorulanSorularList.get(3).click();
    }

    @Given("Aras Kargo Acentesi olmak icin teminat olarak ne verebilirim textinin gorunur oldugunu dogrulanir")
    public void arasKargoAcentesiOlmakIcinTeminatOlarakNeVerebilirimTextininGorunurOldugunuDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(4).isDisplayed());
        page.sikcaSorulanSorularList.get(4).click();
    }

    @Then("Teminat olarak ne verebilirim sorusunun cevabinin gorundugu dogrulanir")
    public void teminatOlarakNeVerebilirimSorusununCevabininGorunduguDogrulanir() {
        scrollToCoordinat(300);
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(4).isDisplayed());
        page.sikcaSorulanSorularList.get(4).click();
    }

    @Given("Aras Kargo subesi olmayan bir yerde ilce veya lokasyon acente acabilirmiyim textinin gorunur oldugunu dogrulanir")
    public void arasKargoSubesiOlmayanBirYerdeIlceVeyaLokasyonAcenteAcabilirmiyimTextininGorunurOldugunuDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(5).isDisplayed());
        page.sikcaSorulanSorularList.get(5).click();
    }

    @Then("Acente acabilirmiyim sorusunun cevabinin gorundugu dogrulanir")
    public void acenteAcabilirmiyimSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(5).isDisplayed());
        page.sikcaSorulanSorularList.get(5).click();
    }

    @Given("Kargo acenteligi yapabilmek için alinmasi zorunlu olan yetki belgesi var mı textinin gorunur oldugunu dogrulanir")
    public void kargoAcenteligiYapabilmekIçinAlinmasiZorunluOlanYetkiBelgesiVarMıTextininGorunurOldugunuDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(6).isDisplayed());
        page.sikcaSorulanSorularList.get(6).click();
    }

    @Then("Yetki belgesi varmi sorusunun cevabinin gorundugu dogrulanir")
    public void yetkiBelgesiVarmiSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(6).isDisplayed());
        page.sikcaSorulanSorularList.get(6).click();
    }

    @Given("Tuzel kisi uzerine Aras Kargo acentesi alinabilir mi Alinabilirse kosullari ne olur textinin gorunur oldugunu dogrulanir")
    public void tuzelKisiUzerineArasKargoAcentesiAlinabilirMiAlinabilirseKosullariNeOlurTextininGorunurOldugunuDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(7).isDisplayed());
        page.sikcaSorulanSorularList.get(7).click();
    }

    @Then("Kosullar sorusunun cevabinin gorundugu dogrulanir")
    public void kosullarSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(7).isDisplayed());
        page.sikcaSorulanSorularList.get(7).click();
    }

    @Given("Adi ortaklikla Aras Kargo acentesi alinabilir mi textinin gorunur oldugunu dogrulanir")
    public void adiOrtakliklaArasKargoAcentesiAlinabilirMiTextininGorunurOldugunuDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(8).isDisplayed());
        page.sikcaSorulanSorularList.get(8).click();
    }

    @Then("Adi Ortaklikla Aras Kargo Acentesi alinabilirmi sorusunun cevabinin gorundugu dogrulanir")
    public void adiOrtakliklaArasKargoAcentesiAlinabilirmiSorusununCevabininGorunduguDogrulanir() {
        scrollToCoordinat(300);
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(8).isDisplayed());
        page.sikcaSorulanSorularList.get(8).click();
    }

    @Given("Web sitesinden Aras Kargo Acente basvurusu yaptim ne zaman aranirim textinin gorunur oldugunu dogrulanir")
    public void webSitesindenArasKargoAcenteBasvurusuYaptimNeZamanAranirimTextininGorunurOldugunuDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(9).isDisplayed());
        page.sikcaSorulanSorularList.get(9).click();
    }

    @Then("Ne zaman aranirim sorusunun cevabinin gorundugu dogrulanir")
    public void neZamanAranirimSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(9).isDisplayed());
        page.sikcaSorulanSorularList.get(9).click();
    }

    @Given("Başvuru sürecinde birebir görüsme asamasinda hangi evraklar istenir textinin gorunur oldugunu dogrulanir")
    public void başvuruSürecindeBirebirGörüsmeAsamasindaHangiEvraklarIstenirTextininGorunurOldugunuDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(10).isDisplayed());
        page.sikcaSorulanSorularList.get(10).click();
    }

    @Then("Hangi evraklar istenir sorusunun cevabinin gorundugu dogrulanir")
    public void hangiEvraklarIstenirSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(10).isDisplayed());
        page.sikcaSorulanSorularList.get(10).click();
    }

    @Given("Kullanici Aras Burasi Noktasi Olun Butonuna tiklar")
    public void kullaniciArasBurasiNoktasiOlunButonunaTiklar() {
        scrollHome();
        bekle(2);
        page.arasBurasiNoktasiOlunButon.click();
    }

    @When("Aras Burasi noktasi oldugunda elde edilecek gelir ne olacak textinin gorunur oldugu dogrulanir")
    public void arasBurasiNoktasiOldugundaEldeEdilecekGelirNeOlacakTextininGorunurOlduguDogrulanir() {
        scrollToCoordinat(300);
        bekle(1);
        assertTrue(page.sikcaSorulanSorularList.get(0).isDisplayed());
        page.sikcaSorulanSorularList.get(0).click();
    }

    @Then("Elde edilecek gelir ne olacak sorusunun cevabinin gorundugu dogrulanir")
    public void eldeEdilecekGelirNeOlacakSorusununCevabininGorunduguDogrulanir() {
        bekle(1);
        assertTrue(page.sikcaSorulanSorularCevapList.get(0).isDisplayed());
        page.sikcaSorulanSorularList.get(0).click();
    }

    @Given("Aras Burasi noktasina gelen kargo tipi nasildir textinin gorunur oldugu dogrulanir")
    public void arasBurasiNoktasinaGelenKargoTipiNasildirTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(1).isDisplayed());
        page.sikcaSorulanSorularList.get(1).click();
    }

    @Then("Kargo tipi sorusunun cevabinin gorundugu dogrulanir")
    public void kargoTipiSorusununCevabininGorunduguDogrulanir() {
        scrollToCoordinat(100);
        bekle(1);
        assertTrue(page.sikcaSorulanSorularCevapList.get(1).isDisplayed());
        page.sikcaSorulanSorularList.get(1).click();
    }

    @Given("Aras Burasi noktasi olarak teslimat nasil yapilacak textinin gorunur oldugu dogrulanir")
    public void arasBurasiNoktasiOlarakTeslimatNasilYapilacakTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(2).isDisplayed());
        page.sikcaSorulanSorularList.get(2).click();
    }

    @Then("Teslimat nasil yapilacak sorusunun cevabinin gorundugu dogrulanir")
    public void teslimatNasilYapilacakSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(2).isDisplayed());
        page.sikcaSorulanSorularList.get(2).click();
    }

    @Given("Birden fazla firmanin teslimat noktasi olabilirmiyim textinin gorunur oldugu dogrulanir")
    public void birdenFazlaFirmaninTeslimatNoktasiOlabilirmiyimTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(3).isDisplayed());
        page.sikcaSorulanSorularList.get(3).click();
    }

    @Then("Birden fazla firmanin teslimat noktasi olabilirmyim sorusunun cevabinin gorundugu dogrulanir")
    public void birdenFazlaFirmaninTeslimatNoktasiOlabilirmyimSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(3).isDisplayed());
        page.sikcaSorulanSorularList.get(3).click();
    }

    @Given("Aras Burasi noktasi olarak musterilerden iade kargolar nasıl alinacak textinin gorunur oldugu dogrulanir")
    public void arasBurasiNoktasiOlarakMusterilerdenIadeKargolarNasılAlinacakTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(4).isDisplayed());
        page.sikcaSorulanSorularList.get(4).click();
    }

    @Then("Iade kargolar nasil alinacak sorusunun cevabinin gorundugu dogrulanir")
    public void ıadeKargolarNasilAlinacakSorusununCevabininGorunduguDogrulanir() {
        bekle(1);
        assertTrue(page.sikcaSorulanSorularCevapList.get(4).isDisplayed());
        page.sikcaSorulanSorularList.get(4).click();
    }

    @Given("Aras Burasi basvuru surecinde dikkat edilmesi gereken hususlar textinin gorunur oldugu dogrulanir")
    public void arasBurasiBasvuruSurecindeDikkatEdilmesiGerekenHususlarTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(5).isDisplayed());
        page.sikcaSorulanSorularList.get(5).click();
    }

    @Then("Dikkat edilmesi gereken hususlar sorusunun cevabinin gorundugu dogrulanir")
    public void dikkatEdilmesiGerekenHususlarSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(5).isDisplayed());
        page.sikcaSorulanSorularList.get(5).click();
    }

    @Given("Aras Burasi sureci basladiginda iletisim kurulacak kisilere nasil ulasabilirim textinin gorunur oldugu dogrulanir")
    public void arasBurasiSureciBasladigindaIletisimKurulacakKisilereNasilUlasabilirimTextininGorunurOlduguDogrulanir() {
        scrollToCoordinat(300);
        bekle(2);
        assertTrue(page.sikcaSorulanSorularList.get(6).isDisplayed());
        page.sikcaSorulanSorularList.get(6).click();
    }

    @Then("Iletisim kurulacak kisilere nasil ulasabilirim sorusunun cevabinin gorundugu dogrulanir")
    public void ıletisimKurulacakKisilereNasilUlasabilirimSorusununCevabininGorunduguDogrulanir() {
        bekle(1);
        assertTrue(page.sikcaSorulanSorularCevapList.get(6).isDisplayed());
        page.sikcaSorulanSorularList.get(6).click();
    }

    @Given("Aras Burasi uygulamasina iliskin onerileri nasil paylasabilirim textinin gorunur oldugu dogrulanir")
    public void arasBurasiUygulamasinaIliskinOnerileriNasilPaylasabilirimTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(7).isDisplayed());
        page.sikcaSorulanSorularList.get(7).click();
    }

    @Then("Onerileri nasil paylasabilirim sorusunun cevabinin gorundugu dogrulanir")
    public void onerileriNasilPaylasabilirimSorusununCevabininGorunduguDogrulanir() {
        bekle(1);
        assertTrue(page.sikcaSorulanSorularCevapList.get(7).isDisplayed());
        page.sikcaSorulanSorularList.get(7).click();
    }

    @Given("Aras Burasi uygulamasina iliskin egitim sureci nasil isleyecek textinin gorunur oldugu dogrulanir")
    public void arasBurasiUygulamasinaIliskinEgitimSureciNasilIsleyecekTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(8).isDisplayed());
        page.sikcaSorulanSorularList.get(8).click();
    }

    @Then("Egitim sureci nasil isleyecek sorusunun cevabinin gorundugu dogrulanir")
    public void egitimSureciNasilIsleyecekSorusununCevabininGorunduguDogrulanir() {
        scrollToCoordinat(100);
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(8).isDisplayed());
        page.sikcaSorulanSorularList.get(8).click();
    }

    @Given("Aras Burasi hakedis sureci nasil calisacak textinin gorunur oldugu dogrulanir")
    public void arasBurasiHakedisSureciNasilCalisacakTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(9).isDisplayed());
        page.sikcaSorulanSorularList.get(9).click();
    }

    @Then("Hakedis sureci nasil calisacak sorusunun cevabinin gorundugu dogrulanir")
    public void hakedisSureciNasilCalisacakSorusununCevabininGorunduguDogrulanir() {
        bekle(1);
        assertTrue(page.sikcaSorulanSorularCevapList.get(9).isDisplayed());
        page.sikcaSorulanSorularList.get(9).click();
    }

    @Given("Esnaf Temsilcimizin yapisal degişikliklerde ne yapmasi gerekiyor textinin gorunur oldugu dogrulanir")
    public void esnafTemsilcimizinYapisalDegişikliklerdeNeYapmasiGerekiyorTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(10).isDisplayed());
        page.sikcaSorulanSorularList.get(10).click();
    }

    @Then("Esnaf temsilcimizin yapisal degisiklerde ne yapmasi gerekiyor sorusunun cevabinin gorundugu dogrulanir")
    public void esnafTemsilcimizinYapisalDegisiklerdeNeYapmasiGerekiyorSorusununCevabininGorunduguDogrulanir() {
        bekle(1);
        assertTrue(page.sikcaSorulanSorularCevapList.get(10).isDisplayed());
        page.sikcaSorulanSorularList.get(10).click();
    }

    @Given("Kullanici Esnaf Kurye Olun butonuna tiklar")
    public void kullaniciEsnafKuryeOlunButonunaTiklar() {
        bekle(1);
        scrollHome();
        page.esnafKuryeOlunButon.click();
    }

    @Then("Nasıl Aras Kargo Esnaf Kurye olabilirim textinin gorunur oldugu dogrulanir")
    public void nasılArasKargoEsnafKuryeOlabilirimTextininGorunurOlduguDogrulanir() {
        scrollToCoordinat(300);
        assertTrue(page.sikcaSorulanSorularList.get(0).isDisplayed());
        page.sikcaSorulanSorularList.get(0).click();
    }

    @And("Nasıl Aras Kargo Esnaf Kurye olabilirim sorusunun cevabinin gorundugu dogrulanir")
    public void nasılArasKargoEsnafKuryeOlabilirimSorusununCevabininGorunduguDogrulanir() {
        bekle(1);
        assertTrue(page.sikcaSorulanSorularCevapList.get(0).isDisplayed());
        page.sikcaSorulanSorularList.get(0).click();
    }

    @Given("Kimler Aras Kargo Esnaf Kurye olabilir textinin gorunur oldugu dogrulanir")
    public void kimlerArasKargoEsnafKuryeOlabilirTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(1).isDisplayed());
        page.sikcaSorulanSorularList.get(1).click();
    }

    @Then("Kimler Aras Kargo Esnaf Kurye olabilir sorusunun cevabinin gorundugu dogrulanir")
    public void kimlerArasKargoEsnafKuryeOlabilirSorusununCevabininGorunduguDogrulanir() {
        bekle(1);
        assertTrue(page.sikcaSorulanSorularCevapList.get(1).isDisplayed());
        page.sikcaSorulanSorularList.get(1).click();
    }

    @Given("Aras Kargo Esnaf Kurye olmak icin nasil bir araca sahip olmaliyim textinin gorunur oldugu dogrulanir")
    public void arasKargoEsnafKuryeOlmakIcinNasilBirAracaSahipOlmaliyimTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(2).isDisplayed());
        bekle(1);
        page.sikcaSorulanSorularList.get(2).click();
    }

    @Then("Nasil bir araca sahip olmaliyim sorusunun cevabinin gorundugu dogrulanir")
    public void nasilBirAracaSahipOlmaliyimSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(2).isDisplayed());
        page.sikcaSorulanSorularList.get(2).click();
    }

    @Given("Aras Kargo Esnaf Kurye aylik ne kadar kazanir textinin gorunur oldugu dogrulanir")
    public void arasKargoEsnafKuryeAylikNeKadarKazanirTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(3).isDisplayed());
        page.sikcaSorulanSorularList.get(3).click();
    }

    @Then("Aras Kargo Esnaf Kurye aylik ne kadar kazanir sorusunun cevabinin gorundugu dogrulanir")
    public void arasKargoEsnafKuryeAylikNeKadarKazanirSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(3).isDisplayed());
        page.sikcaSorulanSorularList.get(3).click();
    }

    @Given("Teslimatini sagladigim kargo basina ne kadar kazaniyorum textinin gorunur oldugu dogrulanir")
    public void teslimatiniSagladigimKargoBasinaNeKadarKazaniyorumTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(4).isDisplayed());
        page.sikcaSorulanSorularList.get(4).click();
    }

    @Then("Nekadar kazaniyorum sorusunun cevabinin gorundugu dogrulanir")
    public void nekadarKazaniyorumSorusununCevabininGorunduguDogrulanir() {
        bekle(1);
        assertTrue(page.sikcaSorulanSorularCevapList.get(4).isDisplayed());
        page.sikcaSorulanSorularList.get(4).click();
    }

    @Given("Aras Kargo Esnaf Kurye olarak teslimatlari nasil sagliyorum textinin gorunur oldugu dogrulanir")
    public void arasKargoEsnafKuryeOlarakTeslimatlariNasilSagliyorumTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(5).isDisplayed());
        page.sikcaSorulanSorularList.get(5).click();
    }

    @Then("Teslimatlari nasil sagliyorum sorusunun cevabinin gorundugu dogrulanir")
    public void teslimatlariNasilSagliyorumSorusununCevabininGorunduguDogrulanir() {
        bekle(1);
        assertTrue(page.sikcaSorulanSorularCevapList.get(5).isDisplayed());
        page.sikcaSorulanSorularList.get(5).click();
    }

    @Given("Aras Kargo Esnaf Kurye calisma saatleri nedir textinin gorunur oldugu dogrulanir")
    public void arasKargoEsnafKuryeCalismaSaatleriNedirTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(6).isDisplayed());
        page.sikcaSorulanSorularList.get(6).click();
    }

    @Then("Calisma saatleri sorusunun cevabinin gorundugu dogrulanir")
    public void calismaSaatleriSorusununCevabininGorunduguDogrulanir() {
        bekle(1);
        assertTrue(page.sikcaSorulanSorularCevapList.get(6).isDisplayed());
        page.sikcaSorulanSorularList.get(6).click();
    }

    @Given("Kullanici Aracinizi Kiralayin butonuna tiklar")
    public void kullaniciAraciniziKiralayinButonunaTiklar() {
        scrollHome();
        bekle(1);
        page.araciniziKiralayinButonu.click();
        scrollToCoordinat(350);
    }

    @Then("Aras Kargoya arac nasil kiralanir textinin gorunur oldugu dogrulanir")
    public void arasKargoyaAracNasilKiralanirTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(0).isDisplayed());
        page.sikcaSorulanSorularList.get(0).click();
    }

    @And("Arac nasil kiralanir sorusunun cevabinin gorundugu dogrulanir")
    public void aracNasilKiralanirSorusununCevabininGorunduguDogrulanir() {
        bekle(1);
        assertTrue(page.sikcaSorulanSorularCevapList.get(0).isDisplayed());
        page.sikcaSorulanSorularList.get(0).click();
    }

    @Given("Aras Kargoya arac kiralamak icin nasil bir araca sahip olmaliyim textinin gorunur oldugu dogrulanir")
    public void arasKargoyaAracKiralamakIcinNasilBirAracaSahipOlmaliyimTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(1).isDisplayed());
        page.sikcaSorulanSorularList.get(1).click();
    }

    @Given("Aras Kargoya kiralanan arac masraflari kim tarafindan karsilaniyor textinin gorunur oldugu dogrulanir")
    public void arasKargoyaKiralananAracMasraflariKimTarafindanKarsilaniyorTextininGorunurOlduguDogrulanir() {
        assertTrue(page.sikcaSorulanSorularList.get(2).isDisplayed());
        page.sikcaSorulanSorularList.get(2).click();
    }

    @Then("Arac masraflari kim tarafindan karsilaniyor sorusunun cevabinin gorundugu dogrulanir")
    public void aracMasraflariKimTarafindanKarsilaniyorSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(2).isDisplayed());
        page.sikcaSorulanSorularList.get(2).click();
    }

    @Given("Aras Kargoya kiralik arac ile calisma saatleri nelerdir textinin gorunur oldugu dogrulanir")
    public void arasKargoyaKiralikAracIleCalismaSaatleriNelerdirTextininGorunurOlduguDogrulanir() {

        assertTrue(page.sikcaSorulanSorularList.get(3).isDisplayed());
        page.sikcaSorulanSorularList.get(3).click();
    }

    @Then("Arac ile calisma saatleri nelerdir sorusunun cevabinin gorundugu dogrulanir")
    public void aracIleCalismaSaatleriNelerdirSorusununCevabininGorunduguDogrulanir() {
        bekle(2);
        assertTrue(page.sikcaSorulanSorularCevapList.get(3).isDisplayed());
        page.sikcaSorulanSorularList.get(3).click();
    }

    @Then("Aras kargoya Arac kiralamak icin Nasil bir araca sahip olmaliyim sorusunun cevabinin gorundugu dogrulanir")
    public void arasKargoyaAracKiralamakIcinNasilBirAracaSahipOlmaliyimSorusununCevabininGorunduguDogrulanir() {
        bekle(1);
        assertTrue(page.sikcaSorulanSorularCevapList.get(1).isDisplayed());
        page.sikcaSorulanSorularList.get(1).click();

    }
}
