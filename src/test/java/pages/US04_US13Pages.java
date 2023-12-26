package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US04_US13Pages {
    public US04_US13Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='popup-close']")
    public WebElement mesajClick;

    @FindBy(xpath = "//div[@class='banner']")
    public WebElement cerezRed;

    @FindBy(xpath = "//span[contains(text(),'Üye Girişi')]")
    public WebElement uyeGiris;

    @FindBy(xpath = "//span[@class='mat-expansion-indicator ng-tns-c2690051721-44 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")
    public WebElement surdurulebilirlik;









}