package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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


















//    Address 2 =       address_secondary_address
//    city=        address_city
//    select state= address_state
//    zipcode = address_zip_code
//       country=     address_country_canada/address_country_us
//    birthday= address_birthday
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
