package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US07_Pages {

    public US07_Pages() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//a[@href='/subelerimiz'])[1]")
    public WebElement enYakinSubelerButton;

    @FindBy(xpath="//div[@class='popup-close']")
    public WebElement popUpClose;


    @FindBy(xpath = "//*[@src='assets/images/icons/caret_down.svg']")
    public WebElement aramaKutusu;



    @FindBy(xpath= "//*[text()=' Aras Burası Noktaları ']")
    public WebElement arasBurasiSecenegi;

    @FindBy(xpath="(//img[@src='assets/images/form-map-icon.svg'])[5]")
    public WebElement ilVeyaIlceIkon;
    ////*[text()='İl veya İlçe giriniz']

    @FindBy(xpath="(//input[@type='text'])[5]")
    public WebElement ilVeyaIlceKutu;

    @FindBy(xpath="//span[text()=' Ankara - Beypazarı ']")
    public WebElement ddmSecim;

    @FindBy(xpath="(//*[@class='ng-star-inserted'])[4]")
    public WebElement araButton;

    @FindBy(xpath = "//img[@src='assets/images/esnaf_marker.png']")
    public WebElement haritaIsareti;

    @FindBy(xpath="//div[@class='results__header']")
    public WebElement bulunduYazisi;

    @FindBy(xpath="//small[@class='error-block ng-star-inserted']")
    public WebElement uyariYazisi;

    @FindBy(xpath="//*[@formcontrolname='address']")
    public WebElement adresDetay;

    @FindBy(xpath="(//span[@class='mat-option-text'])[2] ")
    public WebElement subelerimiz;

    @FindBy(xpath = "  (//img[@src='assets/images/marker.svg'])[1]")
    public WebElement haritaIsareti2;





}
