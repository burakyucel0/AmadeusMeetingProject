package stepdefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pageobjects.formPageObjects;

public class formStepDefinitions
{
    formPageObjects formPageObjects = new formPageObjects();

    @When("I clicked form button")
    public void iClickedFormButton() {
     formPageObjects.formButton.click();
    }

    @When("I clicked practice form button")
    public void iClickedPracticeFormButton() {
        formPageObjects.practiceFormButton.click();
    }

    @When("I enter name and password")
    public void iEnterNameAndPassword() {
        formPageObjects.firstNameInput.sendKeys("Burak");
        formPageObjects.lastNameInput.sendKeys("Yücel");
    }

    @When("I enter email")
    public void iEnterEmail() {
        formPageObjects.emailInput.sendKeys("b@b");
    }

    @When("I select male gender")
    public void iSelectMaleGender() {
        formPageObjects.maleGenderRadioButton.click();
    }

    @When("I enter mobile phone")
    public void iEnterMobilePhone() {
        formPageObjects.phoneNumber.sendKeys("5555555555");
    }

    @When("I clicked date of birth")
    public void iClickedDateOfBirth() {
        formPageObjects.dateOfBirthInput.click();
    }

    @When("I select year")
    public void iSelectYear() {
        formPageObjects.yearSelection.click();
        var yearSelection = formPageObjects.yearSelection;
        Select Year = new Select(yearSelection);
        Year.selectByValue("1996");
    }

    @When("I select month")
    public void iSelectMonth() {
        formPageObjects.monthSelection.click();
        var monthSelection = formPageObjects.monthSelection;
        Select Month = new Select(monthSelection);
        Month.selectByValue("August");
    }

    @When("I select day")
    public void iSelectDay() {
        formPageObjects.daySelection.click();
        var daySelection = formPageObjects.daySelection;
        Select Day = new Select(daySelection);
        Day.selectByValue("23");
    }

    @When("I enter subject")
    public void iEnterSubject() {
        formPageObjects.subjectsContainer.sendKeys("subject");
    }

}
