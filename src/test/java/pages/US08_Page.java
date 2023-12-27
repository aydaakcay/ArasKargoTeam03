package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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




}
