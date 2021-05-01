package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import renastech.utils.BrowserUtils;

public class Addresses extends BrowserUtils {


    public Addresses(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "address_first_name")
    private WebElement firstName;

    @FindBy(id = "address_last_name")
    private WebElement lastname;

    @FindBy(id = "address_street_address")
    private WebElement address1 ;

    @FindBy(id = "address_secondary_address")
    private WebElement address2;

    @FindBy(id = "address_city")
    private WebElement city;

    @FindBy(id = "address_state")
    private WebElement state;

    @FindBy(id = "address_zip_code")
    private WebElement zipcode;

    @FindBy(id = "address_country_canada")
    private WebElement country;

    @FindBy(id = "address_birthday")
    private WebElement birthday;

    @FindBy(id = "address_age")
    private WebElement age;

    @FindBy(xpath = "//input[@value='Create Address']")
    private WebElement submitButton;

    public void clickSubmitButton(){
        wait(1);
        submitButton.click();
    }

    public void setZipcode(String zipcodeName){
        wait(1);
        zipcode.sendKeys(zipcodeName);
    }
    public void setCountry(String countryName){
        wait(1);
        country.click();
    }

    public void setBirthday(String birthdayDate){
        wait(1);
        birthday.sendKeys(birthdayDate);
    }
    public void setAge(String age1){
        wait(1);
        age.sendKeys(age1);
    }


    public void setState(String stateName){
        wait(1);
        Select select = new Select(state);
        select.selectByVisibleText(stateName);


    }


    public void setCity(String cityName){
        wait(1);
        city.sendKeys(cityName);
    }
    public void setFirstName(String name){
        wait(1);
        firstName.sendKeys(name);
    }

    public void setLastname(String lastName){
        wait(1);
        lastname.sendKeys(lastName);
    }

    public void setAddress1(String address){
        wait(1);
        address1.sendKeys(address);
    }

    public void setAddress2(String address){
        wait(1);
        address2.sendKeys(address);
    }









//       age =      address_age
//    website= address_website
//    phone= address_phone
//
//common=
//    address_interest_dance
//            address_interest_climb
//    address_interest_read
//
//    notr= address_note
//
//   button=  //input[@name='commit']

}
