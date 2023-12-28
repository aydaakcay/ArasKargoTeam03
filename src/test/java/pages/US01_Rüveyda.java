package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US01_Rüveyda {
    public US01_Rüveyda() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//div[@class='popup-close']")
    public static WebElement PopUpButonu;

    @FindBy(xpath="//div[@class='ng-tns-c588362358-0']")
    public static WebElement ArasKargoButonu;

    @FindBy(xpath="(//a[@class='ng-tns-c588362358-0'])[2]")
    public static WebElement HakkimizdaButonu;

    @FindBy(xpath = "(//*[text()='Hizmetlerimiz'])[1]")
    public static WebElement hizmetlerimizButon;

    @FindBy(xpath = "(//*[text()='Kariyer'])[1]")
    public static WebElement Kariyer;

    @FindBy(xpath = "(//*[text()='Sürdürülebilirlik'])[1]")
    public static WebElement Surdurulebilirlik;

    @FindBy(xpath = "(//*[text()='Geleceğin Bizde Önem Taşır'])[1]")
    public static WebElement geleceginonemTasirButon;

    @FindBy(xpath = "(//*[text()='Ambalaj Ürünlerimiz'])[1]")
    public static WebElement ambalajUrunlerimizButon;

    @FindBy(xpath = "(//*[text()='Vizyon, Misyon ve Politikalar'])[1]")
    public static WebElement visyonumuzVizyonumuzButon;

    @FindBy(xpath = "(//*[text()='Yönetim Ekibimiz'])[1]")
    public static WebElement yonetimEkibimizButon;

    @FindBy(xpath = "(//*[text()='Haberler & Duyurular'])[1]")
    public static WebElement haberlerDuyurularButon;

    @FindBy(xpath = "(//*[text()='Reklamlarımız'])[1]")
    public static WebElement reklamlarimizButon;

    @FindBy(xpath = "(//*[text()='Kurumsal Hizmetlerimiz'])[1]")
    public static WebElement KurumsalHizmetlerimizButon;

    @FindBy(xpath = "(//*[text()='Araslar Bizde Önem Taşır'])[1]")
    public static WebElement AraslarBizdeonemTasirButon;

    @FindBy(xpath = "(//*[text()='Geleceğin Bizde Önem Taşır'])[1]")
    public static WebElement GeleceginBizdeonemTasirButon;

    @FindBy(xpath = "(//*[text()='İyi Bir Dünya Bizde Önem Taşır'])[1]")
    public static WebElement iyiBirDunyaBizdeOnemTasirButon;

    @FindBy(xpath = "(//*[text()='Teknoloji Bizde Önem Taşır'])[1]")
    public static WebElement teknolojiBizdeOnemTasirButon;

    @FindBy(xpath = "(//*[text()='Sürdürülebilirlik Rotası'])[1]")
    public static WebElement getSurdurulebilirlikRotasiButon;

    @FindBy(xpath = "(//*[text()='Sosyal Sorumluluk Platformlarımız'])[1]")
    public static WebElement sosyalSorumlulukPlatformlarimizButon;

    @FindBy(xpath = "(//*[text()='Kalite Yönetim Sistemi'])[1]")
    public static WebElement KaliteYonetimSistemiButon;

    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[20]")
    public WebElement isOrtagimizOlun;

    @FindBy(xpath = "(//*[text()='Acentemiz Olun'])[1]")
    public static WebElement AcentemizOlunButon;

    @FindBy(xpath = "(//*[text()='Aras Burası Noktası Olun'])[1]")
    public static WebElement ArasBurasiNoktasiOlunButon;

    @FindBy(xpath = "(//*[text()='Esnaf Kurye Olun'])[1]")
    public static WebElement EsnafKuryeOlunButon;

    @FindBy(xpath = "(//*[text()='Aracınızı Kiralayın'])[1]")
    public static WebElement AraciniziKiralayinButon;

    @FindBy(xpath = "(//*[text()='Sık Sorulan Sorular'])[1]")
    public static WebElement SikSorulanSorularButon;

    @FindBy(xpath = "(//*[text()='Aras'a Sor'])[1]")
    public static WebElement ArasaSorButon;

    @FindBy(xpath = "(//*[text()='Çağrı Merkezi'])[1]")
    public static WebElement cagriMerkeziButon;

    @FindBy(xpath = "(//*[text()='Hasar Tazmin'])[1]")
    public static WebElement HasarTazminButon;

    @FindBy(xpath = "(//*[text()='Geri Bildirim Formu'])[1]")
    public static WebElement GeriBildirimFormuButon;

    @FindBy(xpath = "(//*[text()='SSS'])[1]")
    public static WebElement SSSButon;

    @FindBy(xpath = "(//*[text()='İş Ortağımız Olun'])[1]")
    public static WebElement IsOrtagimizOlunButon;

    @FindBy(xpath = "(//*[text()='Aras Kargo Spor Kulübü'])[1]")
    public static WebElement ArasKargoSporKulubuButon;

    @FindBy(xpath = "(//*[text()='Müşteri İlişkilerimiz'])[1]")
    public static WebElement musteriliiskilerimizButon;

    @FindBy(xpath = "(//*[text()='Bize Ulaşın'])[1]")
    public static WebElement BizeUlasinButon;

    @FindBy(xpath = "(//*[text()='İletişim'])[1]")
    public static WebElement iletisimButon;

    @FindBy(xpath = "(//*[text()='Genel Müdürlük'])[1]")
    public static WebElement GenelMudurlukButon;

    @FindBy(xpath = "(//*[text()='Bölge Müdürlüklerimiz'])[1]")
    public static WebElement BolgeMudurluklerimizButon;

    @FindBy(xpath = "(//*[text()='Şubelerimiz'])[1]")
    public static WebElement subelerimizButon;

    @FindBy(xpath = "(//*[text()='Aras Burası Noktalarımız'])[1]")
    public static WebElement ArasBurasiNoktamizButon;


    @FindBy(xpath = "(//*[text()='Müşterimiz Olun'])[1]")
    public static WebElement musterimizOlunButon;






}
