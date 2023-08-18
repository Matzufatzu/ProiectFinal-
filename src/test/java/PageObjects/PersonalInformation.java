package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformation {
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userNameField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement clickNextPersonalInformation;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformationHeader;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[1]/label")
    private WebElement firstNameHeader;



    public PersonalInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void inputFirstName(String string){
        firstNameField.sendKeys(string);
    }


    public void inputLastName(String string){
        lastNameField.sendKeys(string);
    }

    public void inputUserName(String string){ userNameField.sendKeys(string);}

    public void inputPassword(String string){ passwordField.sendKeys(string);}

    public void inputConfirmPassword(String string){ confirmPasswordField.sendKeys(string);}

    public void clickNextPersonalInformation(){ clickNextPersonalInformation.click();
    }

    public void fillInPersonalInformation() {
        inputFirstName("AA");
        inputLastName("AAA");
        inputUserName("AAA");
        inputPassword("AAA");
        inputConfirmPassword("AAA");
        clickNextPersonalInformation();
    }
    public String personalInformationHeaderText(){
        return personalInformationHeader.getText();
    }
    public String firstNameHeaderText(){return firstNameHeader.getText(); }

}








