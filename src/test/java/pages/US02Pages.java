package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US02Pages {
    public US02Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='popup-close']//*[@xmlns='http://www.w3.org/2000/svg']")
    public WebElement closeButon;
    @FindBy(xpath = "//*[@class='popup-close']")
    public WebElement closeButon2;

    @FindBy(xpath = "(//*[text()='Hizmetlerimiz'])[1]")
    public WebElement hizmetlerimizButon;

    @FindBy(xpath = "(//*[text()='Ambalaj Ürünlerimiz'])[1]")
    public WebElement ambalajUrunlerimizButon;

    @FindBy(xpath = "//*[text()=' Ambalaj fiyatları ']")
    public WebElement ambalajUrunleriPdfButon;

    @FindBy(linkText = "HEPSİNİ REDDET")
    public WebElement popUpAccept;
}
