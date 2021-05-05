package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

public class PassionTea extends BrowserUtils {

    public PassionTea(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//a[@id='wsb-button-00000000-0000-0000-0000-000451955160']//*[contains(text(),'Check Out')]" )
    private WebElement greenTeaCheckout;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "address")
    private WebElement address;

    public void setEmail(String email1){
        staticWait(1);
        email.sendKeys(email1);

    }
    public void setName(String name1){
        staticWait(1);
        name.sendKeys(name1);
    }

    public void setAddress(String address1){
        staticWait(1);
        address.sendKeys(address1);
    }



    public void getDriverForTea(){

        Driver.getDriver().get(ConfigurationsReader.getProperties("url2"));

        System.out.println("=======Working Fine=========");

    }

    public void clickCheckout(){

        greenTeaCheckout.click();

    }







}
