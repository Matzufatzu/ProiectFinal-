package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.Element;


public class ContactInformation {
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailField;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phoneField;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement countryField;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement cityField;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postCodeField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement clickNextContanctInformation;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInformationHeader;




 public ContactInformation(WebDriver driver){PageFactory.initElements(driver,this);}

    public void inputEmailField(String string){emailField.sendKeys(string);}

    public void inputPhoneField(String string){phoneField.sendKeys(string);}

    public void inputCountryField(String string){countryField.sendKeys(string);}

    public void inputCityField(String string){cityField.sendKeys(string);}

    public void inputPostCodeField(String string){postCodeField.sendKeys(string);}

    public void clickNextContactInformation() {clickNextContanctInformation.click();
    }
    public void fillInContactInformation() {
        inputEmailField("AA");
        inputPhoneField("AAA");
        inputCountryField("AAA");
        inputCityField("AAA");
        inputPostCodeField("AAA");
        clickNextContactInformation();
 }
 public String contactInformationHeaderText(){
      return contactInformationHeader.getText();
 }

}




