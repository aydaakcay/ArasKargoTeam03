package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US08_Page {
    public US08_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Müşteri İlişkileri']")
    public WebElement musteriIliskileri;
    @FindBy(xpath = "//*[text()='Geri Bildirim Formu']")
    public WebElement geriBildirimFormu;
    @FindBy(xpath = "//*[@id='mat-select-0']")
    public WebElement kategoriDDM;
    @FindBy(xpath = "//*[text()=' BİLGİ ']")
    public WebElement bilgiMenu;
    @FindBy(xpath = "//div[@class='popup-close']")
    public WebElement popUp;
    @FindBy(xpath = "//*[text()='BİLGİ']")
    public WebElement bilgiDogrulama;
    @FindBy(xpath = "//*[text()=' İŞLEM - TALEP ']")
    public WebElement islemTalepMenu;
    @FindBy(xpath = "//*[text()='İŞLEM - TALEP']")
    public WebElement islemTalepDogrulama;
    @FindBy(xpath = "//*[text()=' ÖNERİ ']")
    public WebElement oneriMenu;
    @FindBy(xpath = "//*[text()='ÖNERİ']")
    public WebElement oneriDogrulama;
    @FindBy(xpath = "//*[text()=' ŞİKAYET - PROBLEM ']")
    public WebElement sikayetMenu;
    @FindBy(xpath = "//*[text()=' ŞİKAYET - PROBLEM ']")
    public WebElement sikayetDogrulama;
    @FindBy(xpath = "//*[text()=' TEŞEKKÜRLER ']")
    public WebElement tesekkurlerMenu;
    @FindBy(xpath = "//*[text()='TEŞEKKÜRLER']")
    public WebElement tesekkurlerDogrulama;
    @FindBy(xpath = "//*[text()=' E-ÖDEME BİLGİSİ ']")
    public WebElement eOdemeBilgisiButonu;
    @FindBy(xpath = "//*[@formcontrolname='SubjectID']")
    public WebElement konuBasligiSecin;
    @FindBy(xpath = "//*[@formcontrolname='Name']")
    public WebElement formName;
    @FindBy(xpath = "//*[@formcontrolname='SurName']")
    public WebElement formSurName;
    @FindBy(xpath = "//*[@formcontrolname='MPhone']")
    public WebElement formPhone;
    @FindBy(xpath = "//*[@formcontrolname='Email']")
    public WebElement formEmail;
    @FindBy(xpath = "(//*[@aria-haspopup='listbox'])[5]")
    public WebElement formIl;
    @FindBy(xpath = "//*[text()=' Adana - Ceyhan ']")
    public WebElement formIlSecim;
    @FindBy(xpath = "(//*[@role='combobox'])[8]")
    public WebElement formSubeSecim;
    @FindBy(xpath = "//*[text()=' CEYHAN ']")
    public WebElement formSubeSecimCeyhan;
    @FindBy(xpath = "//*[@formcontrolname='Message']")
    public WebElement formMesaj;
    @FindBy(xpath = "(//*[@type='file'])[1]")
    public WebElement formDosyaYukle;
    @FindBy(xpath = "//*[@class='error-block ng-star-inserted']")
    public WebElement formHataMesaji;
}
