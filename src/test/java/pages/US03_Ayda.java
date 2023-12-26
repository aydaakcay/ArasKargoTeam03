package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class US03_Ayda {

    public US03_Ayda(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

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

    @FindBy(xpath = "//*[@formcontrolname='MobilePhone']")
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

    @FindBy(xpath = "(//button[@class='small-btn'])[2]]")
    public WebElement  r;






}

