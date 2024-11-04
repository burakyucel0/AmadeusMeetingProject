package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class formPageObjects {
    private WebDriver driver;

    public WebElement formButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]"));
    public WebElement practiceFormButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/div"));
    public WebElement firstNameInput = driver.findElement(By.id("firstName"));
    public WebElement lastNameInput = driver.findElement(By.id("lastName"));
    public WebElement emailInput = driver.findElement(By.id("userEmail"));
    public WebElement maleGenderRadioButton = driver.findElement(By.id("gender-radio-1"));
    public WebElement phoneNumber = driver.findElement(By.id("userNumber"));
    public WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
    public WebElement yearSelection = driver.findElement(By.className("react-datepicker__year-select"));
    public WebElement monthSelection = driver.findElement(By.className("month-react-datepicker__month-select"));
    public WebElement daySelection = driver.findElement(By.className("react-datepicker__day--023"));
    public WebElement subjectsContainer = driver.findElement(By.className("subjects-container"));
    public WebElement sportCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
    public WebElement musicCheckBox = driver.findElement(By.id("hobbies-checkbox-3"));
    public WebElement uploadPictureButton = driver.findElement(By.id("uploadPicture"));
    public WebElement currentAddress = driver.findElement(By.id("currentAddress"));
    public WebElement stateDropdown = driver.findElement(By.id("state"));
    public WebElement haryanaSelection = driver.findElement(By.id("react-select-6-input"));
    public WebElement cityInput = driver.findElement(By.id("city"));
    public WebElement karnalSelection = driver.findElement(By.id("react-select-7-input"));
    public WebElement submitButton = driver.findElement(By.id("submit"));



}
