package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US10Pages {
    public US10Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[text()='Kariyer'])[1]")
    public WebElement kariyerButon;

    @FindBy(xpath = "(//*[text()='Geleceğin Bizde Önem Taşır'])[1]")
    public WebElement geleceginÖnemTasırButon;

    //  @FindBy(className = " Aras Kargo İş Başvuruları")
//  public WebElement isBasvurularıYazısı;

    @FindBy(xpath = "//*[@title='LinkedIn']")
    public WebElement linkedinButon;

    @FindBy(xpath = "//*[@title='Kariyer net logo']")
    public WebElement kariyerNetButon;

    @FindBy(xpath = "//*[@title='Secretcv logo']")
    public WebElement secretCvButon;

    @FindBy(xpath = "//*[@title='Eleman net logo']")
    public WebElement elemanNetButon;
}
