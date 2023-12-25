package pages.US_05_06;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Araskargopage_suat {
    public Araskargopage_suat() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = ("//*[text()=' Yurt Dışı '])"))
    public WebElement YURTDIŞI;

    @FindBy(xpath =("//*[@class='mat-form-field-flex ng-tns-c2842056177-19']"))
    public WebElement nereyeikonu;
    @FindBy(xpath = ("//*[@class='ng-tns-c2842056177-19']"))
    public WebElement nereyeikonuokişareti;

    @FindBy(xpath = ("//*[@class='mat-option-text']"))
    public WebElement okişaretiafganistan;


    @FindBy(xpath = ("//*[@class='selectable-box_left']"))
    public WebElement KUTUKOLİBUTTON;

    @FindBy(xpath = ("//*[@class='mat-form-field-infix ng-tns-c2842056177-48']"))
    public WebElement ağırlıkbutton;

    @FindBy(xpath = ("//*[@class='mat-form-field-infix ng-tns-c2842056177-49']"))
    public WebElement Boybutton;

    @FindBy(xpath = ("//*[@class='mat-form-field-infix ng-tns-c2842056177-50']"))
    public WebElement yükseklikbutton;

    @FindBy(xpath = ("//*[@class='mat-form-field-infix ng-tns-c2842056177-51']"))
    public WebElement Enbutton;

    @FindBy(xpath = ("//*[@class='desi-btn']"))
    public WebElement desikğbutton;

    @FindBy(xpath = ("//*[@class='selectable-box selectable-box-active']"))
    public WebElement dosyaevrakbutton;

    @FindBy(xpath = ("//*[text()='Yeni Hesaplama Yap']"))
    public WebElement yenihesaplamayapbutton;


    @FindBy(xpath = ("//*[@href=\"/kargo-ucreti-hesaplama\"]"))
    public WebElement ücrethesaplabutton;

    @FindBy(xpath = ("//*[@class='aras-form-date-shower_content']"))
    public WebElement gönderibelirtilensüredeteslimedilecektirbutton;

    @FindBy(xpath = ("//*[@CLASS='aras-form-inputgroup_hint aras-form-inputgroup_hint--bottom pt-3 ng-tns-c2842056177-21']"))
    public WebElement YURTİÇİNEREYEBUTTON;

    @FindBy(xpath = ("//*[@class='mat-input-element mat-form-field-autofill-control mat-autocomplete-trigger aras-form-input ng-tns-c2842056177-18 ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched']"))
    public WebElement YURTİÇİNEREDENBUTTON;

    @FindBy(xpath = ("//*[@class='aras-form-inputgroup_hint aras-form-inputgroup_hint--bottom pt-3 ng-tns-c2842056177-20']"))
    public WebElement YURTİÇİNEREDENdetayNBUTTON;

    @FindBy(xpath = ("//*[@class='aras-form-inputgroup_hint aras-form-inputgroup_hint--bottom pt-3 ng-tns-c2842056177-21']"))
    public WebElement adresdeteyınereyeNBUTTON;

    @FindBy(xpath = ("//*[@class='desi-btn']"))
    public WebElement sorumluşubebulBUTTONU;

    @FindBy(xpath = ("//*[@class='mat-form-field-infix ng-tns-c2842056177-25']"))
    public WebElement şubeyiseçinbutton;

    @FindBy(xpath = ("selectable-box selectable-box-active"))
    public WebElement yurtiçigönderikutukolibutton;


    @FindBy(xpath = ("//*[@class='selectable-service selectable-service__active ng-star-inserted']"))
    public WebElement arasstandartbutton;

    @FindBy(xpath = ("//*[@class='popup-close']"))
    public WebElement bilgilendirmeyazısıkapatbutton;

    @FindBy(xpath = ("//*[@class='info-box__line']"))
    public WebElement toplamtutarbutton;



}

