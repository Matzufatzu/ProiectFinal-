package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class CourseOptions {

    @FindBy(xpath = "/html/body/div[1]/div/section/div/form/div[3]/div[1]/label")
     private WebElement clickOnManualTestingCourseButton;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[2]/label")
    private WebElement clickOnAutomationCourseButton;



     public CourseOptions(WebDriver driver){PageFactory.initElements(driver,this);}

     public void clickOnManualTestingCourseButton(){ clickOnManualTestingCourseButton.click();}

     public void setClickOnAutomationCourseButton() {clickOnAutomationCourseButton.click();}
 }










