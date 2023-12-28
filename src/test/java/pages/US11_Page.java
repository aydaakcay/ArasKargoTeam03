package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US11_Page {
    public US11_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='popup-close']")
    public WebElement popUpSSS;
    @FindBy(xpath = "//mat-expansion-panel-header[@role='button']")
    public List<WebElement> sikcaSorulanSorularList;
    @FindBy(xpath = "//div/mat-panel-description")
    public List<WebElement> sikcaSorulanSorularCevapList;
    @FindBy(xpath = "//*[text()='İş Ortağımız Olun']")
    public WebElement isOrtagimizOlunButon;
    @FindBy(xpath = "//*[text()='Sık Sorulan Sorular']")
    public WebElement SSSButon;
    @FindBy(xpath = "//*[text()=' ARAS BURASI NOKTASI OLUN ']")
    public WebElement arasBurasiNoktasiOlunButon;
    @FindBy(xpath = "//*[text()=' ESNAF KURYE OLUN ']")
    public WebElement esnafKuryeOlunButon;
    @FindBy(xpath = "//*[text()=' ARACINIZI KİRALAYIN ']")
    public WebElement araciniziKiralayinButonu;








}
