package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class US03_US12Pages {

    public US03_US12Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[26]")
    public WebElement musteriiliskileri;

    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[31]")
    public WebElement SSS;

    @FindBy(xpath = "//div[text()='Kargom ne zaman gelir?']")
    public WebElement kargomNezamanGelir;

    @FindBy(xpath = "//a[text()='kargo takip']")
    public WebElement kargoTakip;

    @FindBy(xpath = "//span[@class='ng-tns-c2690051721-3 toggle-opened']")
    public WebElement kargoTakiptoggle;

    @FindBy(xpath ="//div[text()='Aras Tahsilatlı ile ürün bedeli nasıl tahsil edilir?']")
    public WebElement arasTahsilat;

    @FindBy(xpath = "//div[@class='mat-expansion-panel-body ng-tns-c1859850774-60']")
    public WebElement arasTahsilatCevap;

    @FindBy(xpath = "//*[@class='ng-tns-c2690051721-61 toggle-opened']")
    public WebElement arasTahsilatCevapToggle;


    @FindBy(xpath = "//div[text()='Aras Kargo ile nasıl e-ödeme yaparım?']")
    public WebElement arasEodeme;

    @FindBy(xpath = "//*[@class='mat-expansion-panel-body ng-tns-c1859850774-72']")
    public WebElement arasEodemeCevap;

    @FindBy(xpath = "//span[@class='ng-tns-c2690051721-73 toggle-opened']")
    public WebElement arasEOdemeCevapToggle;



    @FindBy(xpath = "//div[@class='popup-close']")
    public WebElement mesajKapat;


    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[20]")
    public WebElement isOrtagimizOl;

     @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[21]")
    public  WebElement acentemizOl;


    @FindBy(xpath = "(//button[@class='small-btn'])[2]")
    public WebElement hemenbasvur;


    @FindBy(xpath = "//img[@class='ng-tns-c2842056177-2']")
    public WebElement basvurusec;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[25]")
    public WebElement basvuruilisec;


    @FindBy(xpath ="//a[@class='add-location-btn ng-star-inserted']")
    public WebElement lokasyonEkle;

    @FindBy(xpath ="//*[@formcontrolname='Name']")
    public WebElement isimgir;

    @FindBy(xpath = "//*[@formcontrolname='SurName']")
     public WebElement   soyisimgir;

    @FindBy(xpath = "//*[@formcontrolname='AgeRange']")
    public WebElement yasgir;

    @FindBy(xpath = "//*[@formcontrolname='Mobilphone']")
    public WebElement telnogir;



    @FindBy(xpath = "//*[@formcontrolname='Email']")
    public WebElement emailgir;

    @FindBy(xpath = "//img[@class='ng-tns-c2842056177-20']")
    public WebElement egitimdurumunusec;
    @FindBy(xpath = "//span[text()=' Lisans ']")
    public WebElement egitimturusec;


    @FindBy(xpath = "(//*[@class='ng-star-inserted'])[4]")
    public WebElement guvenlikKoduSifresi;
    @FindBy(xpath = "//input[@class='captcha-code ng-pristine ng-valid ng-touched']")
    public  WebElement guvenlikKodu;

    @FindBy(xpath = "(//div[@class='ng-star-inserted'])[2]")
    public WebElement basvurugonderr;

    @FindBy(xpath = "//a[@class='sms-btn']")
    public WebElement anasayfayadon;

    @FindBy(xpath = "//div[@class='form form-result__dialog']")
    public WebElement mesajgorunurlugu;

    @FindBy(xpath = "(//*[@class='error-block ng-star-inserted'])[1]")
    public WebElement yasinizhatali;

    @FindBy(xpath = "(//*[@class='error-block ng-star-inserted'])[2]")
    public WebElement telno1hatali;

    @FindBy(xpath = "(//*[@class='error-block ng-star-inserted'])[3]")
    public WebElement emailhatali;

    @FindBy(xpath = "(//*[@class='error-block ng-star-inserted'])[4]")
    public WebElement egitimdurumusec;





}

