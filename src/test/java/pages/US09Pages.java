package pages;


import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US09Pages {
    public US09Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = " (//*[text()=' Size nasıl yardımcı olabilirim? '])[1]")
    public WebElement sizeNasılYardımcıOlabilirimButon;

    @FindBy(xpath = "//*[@href='https://bot.pisano.com.tr/web_feedback?node_id=1d858237-2392-44ae-a08b-8111a7265555']")
    public WebElement devamButonu;

    @FindBy(xpath = "//*[@id='pisano-text-input-9611e55f-7b0e-436b-9c29-88d7abd03910']")
    public WebElement adSoyadButonu;

    @FindBy(xpath = "//*[@class='pisano-send-button margin-top-5']")
    public WebElement gönderButonu;

    @FindBy(xpath = "//*[@id='pisano-text-input-7788fbbc-3d63-4b29-b934-79868db3ae52']")
    public WebElement telNoButonu;

    @FindBy(xpath = "//*[@id='pisano-text-input-c80939ef-b825-442c-a5a2-f2102cb6eeea']")
    public WebElement emailButonu;

    @FindBy(xpath = "//*[@id='pisano-text-input-7c196174-2857-48f6-b103-c0b88a1c05ba']")
    public WebElement islemSecenegiButon;

    @FindBy(xpath = "//*[@id='pisano-text-input-23ec80dd-36f1-41c1-9483-1d0c8816ae54']")
    public WebElement cıkısButon;

    @FindBy(xpath = "//*[@id='pisano-text-input-2b752ddd-aea4-473c-8db6-685f1a9189e3']")
    public WebElement ekBilgiButonu;

    @FindBy(xpath = "//div[@class='popup-close']//*[@xmlns='http://www.w3.org/2000/svg']")
    public WebElement popUpClose;

    @FindBy(xpath = "//p//br")
    public List<WebElement> islemMetniList;

    @FindBy(xpath = "//*[text()='Bizimle iletişime geçtiğiniz için teşekkür ederiz.']")
    public WebElement tesekkurYazısı;
}
