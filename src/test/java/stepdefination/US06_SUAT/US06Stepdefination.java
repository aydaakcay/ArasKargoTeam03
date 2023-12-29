package stepdefination.US06_SUAT;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_05_06.Araskargopage_suat;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US06Stepdefination {

    Araskargopage_suat suat = new Araskargopage_suat();
    Actions actions = new Actions(Driver.getDriver());



    @Given("Kullanici araskargo anasayfasina gider")
    public void kullaniciAraskargoAnasayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("araskargoUrl"));
        ReusableMethods.bekle(2);
        suat.bilgilendirmeyazısıkapatbutton.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @When("mavi dashboarddaki  ücret  hesapla  butonuna  tıklar")
    public void maviDashboarddakiÜcretHesaplaButonunaTıklar() {

        suat.ücrethesaplabutton.click();
        ReusableMethods.bekle(2);


    }

    @Then("acılan sayfada  yurt dışı  seçer")
    public void acılanSayfadaYurtDışıSeçer() {

        suat.YURTDIŞI.click();
        ReusableMethods.bekle(2);

    }

    @And("Random  bir  ülke  seçer")
    public void randomBirÜlkeSeçer() {


       // ReusableMethods.click(suat.yurtdışınereyeülkebutonu);
        ReusableMethods.bekle(2);
        ReusableMethods.click(suat.Okişareti);
        ReusableMethods.bekle(2);
       // suat.Okişareti.sendKeys("AFGANİSTAN"+Keys.ENTER);
        suat.ÜLKEOK.click();
        ReusableMethods.bekle(2);
        suat.AFGANİSTAN.click();
        ReusableMethods.bekle(2);




    }
    @And("dosya ve  evrak ikonuna   tıklar")
    public void dosyaVeEvrakIkonunaTıklar() {
        ReusableMethods.scroll(suat.EVRAKİKONUBUTTON);
        ReusableMethods.bekle(2);

        ReusableMethods.click(suat.EVRAKİKONUBUTTON);
        ReusableMethods.bekle(3);

    }
    @And("gönderi  detayından  ücretin  görüntülendiği  doğrulanır standart  bedel")
    public void gönderiDetayındanÜcretinGörüntülendiğiDoğrulanırStandartBedel() {

        Assert.assertTrue(suat.toplamtutarbutton.getText().contains("tutargörüldü"));

    }


        // ReusableMethods.scroll(suat.dosyaevrakbutton);

    @And("KUTU  KOLİ  ikonuna  tıklar")
    public void kutuKOLİIkonunaTıklar() {
        suat.KUTUKOLİBUTTON.click();
    }
    @And("Desi Kğ  hesapla  butonuna  tıklanır")
    public void desiKğHesaplaButonunaTıklanır() {
        suat.desikğbutton.click();
    }
    @And("gönderi  detayından  ücretin  görüntülendiği  doğrulanır")
    public void gönderiDetayındanÜcretinGörüntülendiğiDoğrulanır() {
        Assert.assertTrue(suat.toplamtutarbutton.getText().contains("tutargörüldü"));
    }
    @And("{string}  {string}  {string}  {string}  bilgileri girilir")
    public void bilgileriGirilir(String ağırlık, String boy, String yükseklik, String en) {
        suat.ağırlıkbutton.sendKeys("10"+ Keys.ENTER);
        ReusableMethods.bekle(2);
        suat.Boybutton.sendKeys("5" + Keys.ENTER);
        ReusableMethods.bekle(3);
        suat.yükseklikbutton.sendKeys("5"+Keys.ENTER);
        ReusableMethods.bekle(3);
        suat.Enbutton.sendKeys("5" + Keys.ENTER);
        ReusableMethods.bekle(3);
    }








    //  @And("{string}  {string}  {string}  {string}  bilgileri girilir")
    // public void bilgileriGirilir(String ağırlık, String boy, String yükseklik, String en) {
//        suat.ağırlıkbutton.sendKeys("10" + Keys.ENTER);
//        ReusableMethods.bekle(2);
//        suat.Boybutton.sendKeys("5" + Keys.ENTER);
//        ReusableMethods.bekle(3);
//        suat.yükseklikbutton.sendKeys("5" + Keys.ENTER);
//        ReusableMethods.bekle(3);
//        suat.Enbutton.sendKeys("5" + Keys.ENTER);
//        ReusableMethods.bekle(3);


    @And("Desikğ  hesapla  butonuna  tıklanır.")
    public void desikğHesaplaButonunaTıklanır() {
        suat.desikğbutton.click();
        ReusableMethods.bekle(3);
    }


    @And("Yeni Hesaplama Yap butonuna tiklar")
    public void yeniHesaplamaYapButonunaTiklar() {
        suat.yenihesaplamayapbutton.click();
        ReusableMethods.bekle(3);
    }

    @And("Ilgili sayfada olduğunu dogrular")
    public void ılgiliSayfadaOlduğunuDogrular() {
    }

    @And("random bir ulke secer")
    public void randomBirUlkeSecer() {

        ReusableMethods.bekle(3);
    }

    @And("KutuKoli secer")
    public void kutukoliSecer() {
        suat.KUTUKOLİBUTTON.click();
        ReusableMethods.bekle(3);
    }

    @And("AĞIRLIK , YÜKSEKLİK , BOY , EN bilgilerini girer")
    public void ağırlıkYÜKSEKLİKBOYENBilgileriniGirer() {

        suat.ağırlıkbutton.sendKeys("10" + Keys.ENTER);
        ReusableMethods.bekle(2);
        suat.Boybutton.sendKeys("5" + Keys.ENTER);
        ReusableMethods.bekle(3);
        suat.yükseklikbutton.sendKeys("5" + Keys.ENTER);
        ReusableMethods.bekle(3);
        suat.Enbutton.sendKeys("5" + Keys.ENTER);
        ReusableMethods.bekle(3);
    }




    @And("Desi Kg Hesapla butonuna tiklar")
    public void desiKgHesaplaButonunaTiklar() {
        suat.desikğbutton.click();
        ReusableMethods.bekle(3);

    }

    @And("gonderi Detayindan ucret goruntulendigini doğrular")
    public void gonderiDetayindanUcretGoruntulendiginidoğrular() {

        Assert.assertTrue(suat.toplamtutarbutton.getText().contains("tutargörüldü"));

    }



    @Given("Kullanıcı belirtilen Urle gider")
    public void kullanıcıBelirtilenUrleGider() {

        Driver.getDriver().get(ConfigReader.getProperty("araskargoUrl"));
        ReusableMethods.bekle(2);
        suat.bilgilendirmeyazısıkapatbutton.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
    @When("Kullanıcı anasayfada Ucret Hesapla butonunu tiklar")
    public void kullanıcıAnasayfadaUcretHesaplaButonunuTiklar() {
        suat.ücrethesaplabutton.click();
        ReusableMethods.bekle(3);
    }

    @Then("Acilan sayfada Yurt Disi secer")
    public void acilanSayfadaYurtDisiSecer() {
        suat.YURTDIŞI.click();
        ReusableMethods.bekle(3);
    }


    @And("Dosya Evrak tiklar ve hizmet turunu secer")
    public void dosyaEvrakTiklarVeHizmetTurunuSecer() {
        //suat.dosyaevrakbutton.click();
        ReusableMethods.bekle(3);
        suat.YURTDIŞIEXPERSHİZMETİ.click();
        ReusableMethods.bekle(3);
    }
    @And("Gonderi Detayindan ucret goruntulendigini doğrular.")
    public void gonderiDetayindanUcretGoruntulendiginiDoğrular() {
        Assert.assertTrue(suat.toplamtutarbutton.getText().contains("tutargörüldü"));
    }


    @And("ulke bilgisini girer")
    public void ulkeBilgisiniGirer() {
        suat.yurtdışınereyeülkebutonu.click();
        ReusableMethods.bekle(3);

        ReusableMethods.bekle(3);

        // ReusableMethods.scroll(suat.dosyaevrakbutton);

        // actions.sendKeys(Keys.PAGE_DOWN).perform();
        //actions.scrollToElement(suat.dosyaevrakbutton).perform();
        //  suat.yurtdışınereyeülkebutonu.sendKeys("AFGANİSTAN"+Keys.ENTER);
        // suat.AFGANİSTAN_ALT.click();

        ReusableMethods.bekle(2);

    }


    @And("DosyaEvrak tiklarvehizmet turunu secer")
    public void dosyaevrakTiklarvehizmetTurunuSecer() {
        // suat.dosyaevrakbutton.click();
        ReusableMethods.bekle(3);
        suat.YURTDIŞIEXPERSHİZMETİ.click();
        ReusableMethods.bekle(3);

    }

    @And("Gonderi Detayindan ucret goruntulendigini doğrular SADECE  HİZMET  BEDELİ KISMI")
    public void gonderiDetayindanUcretGoruntulendiginiDoğrularSADECEHİZMETBEDELİKISMI() {

        Assert.assertTrue(suat.toplamtutarbutton.getText().contains("tutargörüldü"));
    }

    @Given("Kullanıcı belirtilen Urle git")
    public void kullanıcıBelirtilenUrleGit() {

        Driver.getDriver().get(ConfigReader.getProperty("araskargoUrl"));
        ReusableMethods.bekle(2);
        suat.bilgilendirmeyazısıkapatbutton.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
    @When("Kullanıcı anasayfada Ucret Hesapla butonunu tiklanır")
    public void kullanıcıAnasayfadaUcretHesaplaButonunuTiklanır() {
        suat.ücrethesaplabutton.click();
    }
    @Then("Acilan sayfada Yurt Disi secilir")
    public void acilanSayfadaYurtDisiSecilir() {
        suat.YURTDIŞI.click();
        ReusableMethods.bekle(3);
    }
    @And("random bir ulke secİLİR")
    public void randomBirUlkeSecİLİR() {
        suat.yurtdışınereyeülkebutonu.click();
        ReusableMethods.bekle(3);

        // ReusableMethods.scroll(suat.dosyaevrakbutton);

        // actions.sendKeys(Keys.PAGE_DOWN).perform();
        //actions.scrollToElement(suat.dosyaevrakbutton).perform();
        //  suat.yurtdışınereyeülkebutonu.sendKeys("AFGANİSTAN"+Keys.ENTER);
        // suat.AFGANİSTAN_ALT.click();

        ReusableMethods.bekle(2);
        ReusableMethods.bekle(3);
    }
    @And("Kutu  Koli secilir")
    public void kutuKoliSecilir() {
        suat.KUTUKOLİBUTTON.click();
        ReusableMethods.bekle(3);
    }
    @And("{string} AĞIRLIK girilir")
    public void ağırlıkGirilir(String string) {
        suat.ağırlıkbutton.sendKeys(string);
        ReusableMethods.bekle(3);
    }
    @And("{string} YÜKSEKLİK GİRİLİR")
    public void yükseklikGİRİLİR(String string) {
        suat.yükseklikbutton.sendKeys(string);
        ReusableMethods.bekle(3);
    }
    @And("{string} BOY GİRİLİR")
    public void boyGİRİLİR(String string) {
        suat.Boybutton.sendKeys(string);
        ReusableMethods.bekle(3);
    }
    @And("{string} EN GİRİLİR")
    public void enGİRİLİR(String string) {
        suat.Enbutton.sendKeys(string);
        ReusableMethods.bekle(3);

    }
    @And("Desi Kg Hesapla butonuna tiklanır")
    public void desiKgHesaplaButonunaTiklanır() {
        suat.desikğbutton.click();
        ReusableMethods.bekle(3);
    }


}






//  @And("AĞIRLIK , YÜKSEKLİK , BOY , EN bilgilerini girer")
    // public void ağırlıkYÜKSEKLİKBOYENBilgileriniGirer() {

    //suat.ağırlıkbutton.sendKeys("10" + Keys.ENTER);
    // ReusableMethods.bekle(2);
    //  suat.Boybutton.sendKeys("5" + Keys.ENTER);
    //  ReusableMethods.bekle(3);
    //  suat.yükseklikbutton.sendKeys("5" + Keys.ENTER);
    //   ReusableMethods.bekle(3);
    //   suat.Enbutton.sendKeys("5" + Keys.ENTER);
    //   ReusableMethods.bekle(3);









//    actions = new Actions(Driver.getDriver());
//            actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
//            ReusableMethods.bekle(2);
//    rnd = new Random();
//            try {
//        int randomNumber = rand.nextInt(max - min + 1) + min;
//        ulkelerListesi = uS06page.ulkeIsimleri_List;
//        rndNumber = rnd.nextInt(ulkelerListesi.size()) + 1;
//        ulkelerListesi.get(rndNumber).click();
//    } catch (Exception e) {












