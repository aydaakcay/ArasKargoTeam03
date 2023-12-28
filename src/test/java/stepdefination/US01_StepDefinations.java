package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US01_Rüveyda;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US01_StepDefinations {
    WebDriver driver;

    US01_Rüveyda page01 = new US01_Rüveyda();
    Actions action = new Actions(Driver.getDriver());

    @Given("Kullanıcı {string} adresine gider")
    public void kullanıcı_adresine_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("arasKargoUrl"));
        ReusableMethods.bekle(2);
    }
    @When("Kullanıcı ana sayfaya erişir")
    public void kullanıcı_ana_sayfaya_erişir() {

        ReusableMethods.bekle(2);
        US01_Rüveyda.PopUpButonu.click();
        ReusableMethods.bekle(2);


    }
    @When("Kullanıcı Hakkımızda butonuna tıklar")
    public void kullanıcı_hakkımızda_butonuna_tıklar() {

       //String xpathExpression = "/html/body/app-root/app-main-layout/app-header/header/div/div[2]/ul[1]/li[1]/a";
       //WebElement hakkimizdaButton = driver.findElement(By.xpath(xpathExpression));
       //hakkimizdaButton.click();


        ReusableMethods.bekle(2);
        US01_Rüveyda.HakkimizdaButonu.click();
        ReusableMethods.bekle(2);

    }
    @Then("Kullanıcı {string} sayfasına erişebilmelidir")
    public void kullanıcı_sayfasına_erişebilmelidir(String string) {


        WebElement welcomeMessage = Driver.getDriver().findElement(By.xpath("(//a[@class='ng-tns-c588362358-0'])[2]"));
        String expectedMessage = "Hakkımızda";
        String actualMessage = welcomeMessage.getText();

        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Başarılı giriş doğrulandı: " + actualMessage);
        } else {
            System.out.println("Başarılı giriş doğrulanamadı.");
        }
        Driver.getDriver();
    }


    @Given("Kullanıcı https:\\/\\/www.araskargo.com.tr\\/ gider.")
    public void kullanıcı_https_www_araskargo_com_tr_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("arasKargoUrl"));
        ReusableMethods.bekle(2);

    }
    @Then("Kullanıcı Ana sayfaya erişır.")
    public void kullanıcı_ana_sayfaya_erişır() {
        US01_Rüveyda.PopUpButonu.click();

    }
    @Then("Kullanıcı Hizmetlerimiz butonuna tıklar.")
    public void kullanıcı_hizmetlerimiz_butonuna_tıklar() {


        US01_Rüveyda.hizmetlerimizButon.click();

    }
    @Then("Kullanıcı, oturum açmış veya kayıtlı olmasa da {string} sayfasına erişebilmelidir.")
    public void kullanıcı_oturum_açmış_veya_kayıtlı_olmasa_da_sayfasına_erişebilmelidir(String string) {

        WebElement welcomeMessage = Driver.getDriver().findElement(By.xpath("(//a[@class='ng-tns-c588362358-0'])[7]"));
        String expectedMessage = "Hizmetlerimiz";
        String actualMessage = welcomeMessage.getText();

        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Başarılı giriş doğrulandı: " + actualMessage);
        } else {
            System.out.println("Başarılı giriş doğrulanamadı.");
        }
        Driver.getDriver();

    }

    @Then("Kullanıcı Kariyer butonuna tıklar.")
    public void kullanıcı_kariyer_butonuna_tıklar() {

        US01_Rüveyda.Kariyer.click();
    }

    @Then("Kullanıcı Sürdürülebilirlik  butonuna tıklar.")
    public void kullanıcı_sürdürülebilirlik_butonuna_tıklar() {

        US01_Rüveyda.subelerimizButon.click();
    }


    @Then("Kullanıcı Iş Ortağımız Olun  butonuna tıklar.")
    public void kullanıcı_ış_ortağımız_olun_butonuna_tıklar() {

        US01_Rüveyda.IsOrtagimizOlunButon.click();

    }

    @Then("Kullanıcı Müşteri İlişkileri  butonuna tıklar.")
    public void kullanıcı_müşteri_ilişkileri_butonuna_tıklar() {

        US01_Rüveyda.musterimizOlunButon.click();

    }

    @Then("Aras Kargo Spor Kulubü  butonuna tıklar.")
    public void aras_kargo_spor_kulubü_butonuna_tıklar() {


        US01_Rüveyda.ArasKargoSporKulubuButon.click();
    }

    @Then("Bize Ulaşın butonuna  butonuna tıklar.")
    public void bize_ulaşın_butonuna_butonuna_tıklar() {


    }

    @Then("Vizyon,Misyon ve Politikalar butonunu tıklanabilmeli butonuna tıklar.")
    public void vizyon_misyon_ve_politikalar_butonunu_tıklanabilmeli_butonuna_tıklar() {
        US01_Rüveyda.visyonumuzVizyonumuzButon.click();
    }

    @Then("Yönetim Ekibimiz butonunu tıklanabilmeli butonuna tıklar.")
    public void yönetim_ekibimiz_butonunu_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.yonetimEkibimizButon.click();

    }

    @Then("Haberler ve Duyurular  butonunu tıklanabilmeli butonuna tıklar.")
    public void haberler_ve_duyurular_butonunu_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.haberlerDuyurularButon.click();

    }

    @Then("Reklamlarımız butonunu tıklanabilmeli butonuna tıklar.")
    public void reklamlarımız_butonunu_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.reklamlarimizButon.click();

    }

    @Then("Bireysel Hizmetlerimiz butonunu tıklanabilmeli butonuna tıklar.")
    public void bireysel_hizmetlerimiz_butonunu_tıklanabilmeli_butonuna_tıklar() {


    }

    @Then("Kurumsal Hizmetlerimiz butonunu tıklanabilmeli butonuna tıklar.")
    public void kurumsal_hizmetlerimiz_butonunu_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.KurumsalHizmetlerimizButon.click();

    }

    @Then("Ambalaj Hizmetlerimiz butonunu tıklanabilmeli butonuna tıklar.")
    public void ambalaj_hizmetlerimiz_butonunu_tıklanabilmeli_butonuna_tıklar() {


        US01_Rüveyda.ambalajUrunlerimizButon.click();
    }

    @Then("Araslar Bizde Önem Taşır butonunu tıklanabilmeli butonuna tıklar.")
    public void araslar_bizde_önem_taşır_butonunu_tıklanabilmeli_butonuna_tıklar() {


        US01_Rüveyda.AraslarBizdeonemTasirButon.click();

    }

    @Then("Geleceğin Bizde Önem Taşır butonunu tıklanabilmeli butonuna tıklar.")
    public void geleceğin_bizde_önem_taşır_butonunu_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.geleceginonemTasirButon.click();

    }

    @Then("İyi Bir Dünya Bizde Önem Taşır butonunu tıklanabilmeli butonuna tıklar.")
    public void iyi_bir_dünya_bizde_önem_taşır_butonunu_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.iyiBirDunyaBizdeOnemTasirButon.click();

    }

    @Then("Teknoloji Bizde Önem Taşır butonunu tıklanabilmeli butonuna tıklar.")
    public void teknoloji_bizde_önem_taşır_butonunu_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.teknolojiBizdeOnemTasirButon.click();

    }

    @Then("Sürdürülebilirlik Rotası butonunu tıklanabilmeli butonuna tıklar.")
    public void sürdürülebilirlik_rotası_butonunu_tıklanabilmeli_butonuna_tıklar() {


        US01_Rüveyda.getSurdurulebilirlikRotasiButon.click();

    }

    @Then("Sosyal Sorumluluk Platformlarımız butonunu tıklanabilmeli butonuna tıklar.")
    public void sosyal_sorumluluk_platformlarımız_butonunu_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.sosyalSorumlulukPlatformlarimizButon.click();

    }

    @Then("Kalite Yönetim Sistemi butonunu tıklanabilmeli butonuna tıklar.")
    public void kalite_yönetim_sistemi_butonunu_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.KaliteYonetimSistemiButon.click();

    }

    @Then("Acentemiz Olun butonunu tıklanabilmeli butonuna tıklar.")
    public void acentemiz_olun_butonunu_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.AcentemizOlunButon.click();

    }

    @Then("Aras Burası Noktası Olsun tıklanabilmeli butonuna tıklar.")
    public void aras_burası_noktası_olsun_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.ArasBurasiNoktasiOlunButon.click();
    }

    @Then("Esnaf Kurye Olun tıklanabilmeli butonuna tıklar.")
    public void esnaf_kurye_olun_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.EsnafKuryeOlunButon.click();
    }

    @Then("Aracınızı Kiralayın tıklanabilmeli butonuna tıklar.")
    public void aracınızı_kiralayın_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.AraciniziKiralayinButon.click();
    }

    @Then("Sık Sorulan Sorular tıklanabilmeli butonuna tıklar.")
    public void sık_sorulan_sorular_tıklanabilmeli_butonuna_tıklar() {


        US01_Rüveyda.SikSorulanSorularButon.click();
    }

    @Then("Aras'a Sor tıklanabilmeli butonuna tıklar.")
    public void aras_a_sor_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.ArasaSorButon.click();

    }

    @Then("Çağrı Merkezi tıklanabilmeli butonuna tıklar.")
    public void çağrı_merkezi_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.cagriMerkeziButon.click();

    }

    @Then("Hasar Tazmin tıklanabilmeli butonuna tıklar.")
    public void hasar_tazmin_tıklanabilmeli_butonuna_tıklar() {
        US01_Rüveyda.HasarTazminButon.click();

    }

    @Then("Geri Bildirim Formu tıklanabilmeli butonuna tıklar.")
    public void geri_bildirim_formu_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.GeriBildirimFormuButon.click();

    }

    @Then("SSS  tıklanabilmeli butonuna tıklar.")
    public void sss_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.SSSButon.click();

    }

    @Then("Aras Kargo Spor Kulübu tıklanabilmeli butonuna tıklar.")
    public void aras_kargo_spor_kulübu_tıklanabilmeli_butonuna_tıklar() {


        US01_Rüveyda.ArasKargoSporKulubuButon.click();
    }

    @Then("İletişim  tıklanabilmeli butonuna tıklar.")
    public void iletişim_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.iletisimButon.click();

    }

    @Then("Genel Müdürlük  tıklanabilmeli butonuna tıklar.")
    public void genel_müdürlük_tıklanabilmeli_butonuna_tıklar() {


        US01_Rüveyda.GenelMudurlukButon.click();
    }

    @Then("Bölge Müdürlüklerimiz tıklanabilmeli butonuna tıklar.")
    public void bölge_müdürlüklerimiz_tıklanabilmeli_butonuna_tıklar() {


        US01_Rüveyda.BolgeMudurluklerimizButon.click();
    }

    @Then("Şubelerimiz  tıklanabilmeli butonuna tıklar.")
    public void şubelerimiz_tıklanabilmeli_butonuna_tıklar() {

        US01_Rüveyda.subelerimizButon.click();

    }

    @Then("Aras Burası Noktalarımız tıklanabilmeli butonuna tıklar.")
    public void aras_burası_noktalarımız_tıklanabilmeli_butonuna_tıklar() {


        US01_Rüveyda.ArasBurasiNoktamizButon.click();
    }

    @Then("Müşterimiz Olun tıklanabilmeli butonuna tıklar.")
    public void müşterimiz_olun_tıklanabilmeli_butonuna_tıklar() {


        US01_Rüveyda.musterimizOlunButon.click();
    }



}

