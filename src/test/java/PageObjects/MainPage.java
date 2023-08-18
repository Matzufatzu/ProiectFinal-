package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement inputEmailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement elementSubmitButton;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement enrollmentButton;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement whatYouLearn;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement questions;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement readMoreLearnFundamentals;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement readMoreHybridHeader;



    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void inputValueEmailField(String string) {

        inputEmailField.sendKeys(string);
    }

    public void clickOnSubmitButton() {
        elementSubmitButton.click();
    }

    public void clickEnrollmentButton() {
        enrollmentButton.click();
    }

    public void clickWhatYouLearn() {
        whatYouLearn.click();
    }

    public void clickQuestions() {
        questions.click();
    }

    public void clickReadMoreLearnFundamentals() {readMoreLearnFundamentals.click();}

    public void clickReadMoreHybridHeader(){readMoreHybridHeader.click();}






    public WebElement whatYouLearn(){return readMoreLearnFundamentals;}




    public WebElement getReadMoreLearnFundamentals(){
        return readMoreLearnFundamentals;
    }


    public WebElement getReadMoreHybridHeader() {
        return readMoreHybridHeader;
    }
}
