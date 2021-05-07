package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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

    @FindBy(id = "card_type")
    private WebElement cardType;

    @FindBy(id = "card_number")
    private WebElement number;

    @FindBy(id = "cardholder_name")
    private WebElement holderName;

    @FindBy(id = "verification_code")
    private WebElement verifycode;

    @FindBy(xpath = "//button[contains(text(),'Place Order')]")
    private WebElement placeOrder;



    public void enterCustomerInfoForOutline(String email2, String nam2, String address2){

        staticWait(1);
        email.sendKeys(email2);
        staticWait(1);
        name.sendKeys(nam2);
        staticWait(1);
        address.sendKeys(address2);
        staticWait(1);


    }

    public void enterPaymentInfoForOutline(String cType, String CNumber, String cName, String vCode){
        staticWait(1);
        cardType.sendKeys(cType);
        staticWait(1);
        number.sendKeys(CNumber);
        staticWait(1);
        holderName.sendKeys(cName);
        staticWait(1);
        verifycode.sendKeys(vCode);
        staticWait(1);


    }







    public void setPlaceOrder(){
        staticWait(1);
        placeOrder.click();
    }

    public void setVerifycode(String code){
        staticWait(1);
        verifycode.sendKeys(code);
    }

    public void setHolderName(String cardHolderName){
        staticWait(1);
        holderName.sendKeys(cardHolderName);
    }

    public void setCardNumber(String cardNumber){
        staticWait(1);
        number.sendKeys(cardNumber);
    }

    public void setCardType(String cardType1){
        Select select = new Select(cardType);
        select.selectByVisibleText(cardType1);
        staticWait(1);
    }

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
