package org.example;

import PageObjects.ContactInformation;
import PageObjects.MainPage;
import PageObjects.PersonalInformation;
import PageObjects.CourseOptions;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitions {

    private WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    MainPage mainPage;
    PersonalInformation personalInformation;

    ContactInformation contactInformation;
    CourseOptions  courseOptions;


    public StepDefinitions() {
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        personalInformation = new PersonalInformation(driver);
        contactInformation = new ContactInformation(driver);
        courseOptions = new CourseOptions(driver);
    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///C:/Users/sergi/Downloads/Testing-Env-master/Testing-Env-master/index.html");
    }

    @When("the email value of {string} is inputted")
    public void input_email_to_field(String string){

        mainPage.inputValueEmailField(string);
    }

    @When("the submit button is clicked")
    public void click_submit_button() {

        mainPage.clickOnSubmitButton();
    }
    @Then("the newsletter confirmation pop-up appears")
    public void TheNewsletterConfirmationPopUpAppears(){
        driver.switchTo().alert().accept();
    }


    @When("I click enrollment button")
    public void I_click_enrollment_button(){

        mainPage.clickEnrollmentButton();
    }
    @Then("Personal information page is open")
    public void personalInformationPageIsOpen() {
        Assertions.assertEquals("Personal information", personalInformation.personalInformationHeaderText());

    }

    @When("I click what you'll learn")
    public void WhatYouLearn() {

        mainPage.clickWhatYouLearn();
    }
    @Then("the learn the fundamentals appears")
    public void LearnTheFundamentalsAppears(){

    }



    @When("I click questions")
    public void Questions(){
        Utils.scrollToElement(driver,mainPage.getReadMoreHybridHeader());
        mainPage.clickQuestions();
    }
    @Then("the frequently asked questions appears")
    public void FrequentlyAskedQuestionsAppears(){

    }


    @When("I click read more learn fundamentals")
    public void ReadMoreLearnFundamentals(){
        Utils.scrollToElement(driver, mainPage.getReadMoreHybridHeader());
        mainPage.clickReadMoreLearnFundamentals();
    }
    @Then("the fundamentals page opens")
    public void TheFundamentalsPageOpens(){

    }

    @Given("I am on the enrolment page")
    public void iAmOnTheEnrolmentPage() {
        driver.get("file:///C:/Users/sergi/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
    }

    @When("the first name is populated with the value of {string}")
    public void theFirstNameIsPopulatedWithTheValueOfString(String string) {
        personalInformation.inputFirstName(string);
    }

    @When("the last name is populated with the value of {string}")
    public void theLastNameIsPopulatedWithTheValue(String string) {
        personalInformation.inputLastName(string);

    }
    @When("the username is populated with the value of{string}")
    public void theUsernameIsPopulatedWithTheValue(String string){
        personalInformation.inputUserName(string);
    }

    @When("the password is populated with the value of{string}")
    public void thePasswordIsPopulatedWithTheValue(String string){
        personalInformation.inputPassword(string);

    }
    @When("the confirm password is populated with the value of{string}")
    public void theConfirmPasswordIsPopulatedWithTheValue(String string){
        personalInformation.inputConfirmPassword(string);
    }

    @When("next personal information is clicked")
    public void theNextPersonalInformation(){
        personalInformation.clickNextPersonalInformation();
    }

    @Given("I am on the contact information page")
    public void iAmOnTheContactInformationPage() {
        driver.get("file:///C:/Users/sergi/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.fillInPersonalInformation();
    }
    @When("the email is populated with the value of{string}")
    public void theEmailPopulatedWithTheValue(String string){
        contactInformation.inputEmailField(string);


    }
    @When("the phone is populated with the value of{string}")
    public void thePhonePopulatedWithTheValue(String string){
        contactInformation.inputPhoneField(string);
    }
    @When("the country is populated with the value of{string}")
    public void theCountryPopulatedWithTheValue(String string){
        contactInformation.inputCountryField(string);

    }
    @When("the city is populated with the value of{string}")
    public void theCityPopulatedWithTheValue(String string){
        contactInformation.inputCityField(string);
    }

    @When("the post code is populated with the value of{string}")
    public void thePostCodePopulatedWithTheValue(String string){
        contactInformation.inputPostCodeField(string);
    }

    @When("next contact information is clicked")
    public void theNextContactInformation(){contactInformation.clickNextContactInformation();
    }
    @Then("the contact information is open")
    public void theContactInformationIsOpen() {
        Assertions.assertEquals("Contact information", contactInformation.contactInformationHeaderText());
    }


    @Given("I am on course options page")
    public void iAmOnCourseOptionsPage() {
        driver.get("file:///C:/Users/sergi/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.fillInPersonalInformation();
        contactInformation.fillInContactInformation();

    }
    @When("software testing automation tester is clicked")
    public void clickOnAutomationCourseOptions(){courseOptions.setClickOnAutomationCourseButton();}


    @When("software testing manual tester certificate is clicked")
    public void softwareTestingManualTesterCertificateIsClicked() {
    }

    @Then("the course options appear")
    public void theCourseOptionsAppear() {
        Assertions.assertEquals("Software Testing | Enrollment",driver.getTitle());
    }

    @When("I selected one options")
    public void iSelectedOneOptions() {

    }

    @Then("I remain on the personal information page")
    public void iRemainOnThePersonalInformationPage() {
        Assertions.assertEquals("Personal information", personalInformation.personalInformationHeaderText());
    }

    @After
    public void cleanUp(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/jpg", "");
        }
        driver.quit();
    }
}















