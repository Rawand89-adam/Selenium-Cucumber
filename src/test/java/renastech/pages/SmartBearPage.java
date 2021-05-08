package renastech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import renastech.utils.BrowserUtils;

public class SmartBearPage extends BrowserUtils {

    public SmartBearPage(){

        PageFactory.initElements(driver,this);

    }



    @FindBy(id = "ctl00_MainContent_username")
    private WebElement username;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement password;

    @FindBy(id = "ctl00_MainContent_login_button")
    private WebElement submitButton;

    @FindBy(xpath = "//a[contains(text(),'Order')]")
    private WebElement orderSection;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    private WebElement productType;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    private WebElement amount;

    @FindBy(xpath = "//input[@value='Calculate']")
    private WebElement calculateButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    private WebElement customerNameButton;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    private WebElement streetNameBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    private WebElement cityNameBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    private WebElement stateBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    private WebElement zipBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_1")
    private WebElement cardTypeBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    private WebElement cardNumberBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    private WebElement expireDateBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    private WebElement processButton;


    public void setAddressInformation(String CName, String street, String city, String state, String zip){
        staticWait(1);
        customerNameButton.sendKeys(CName);
        staticWait(1);
        streetNameBox.sendKeys(street);
        staticWait(1);
        cityNameBox.sendKeys(city);
        staticWait(1);
        stateBox.sendKeys(state);
        staticWait(1);
        zipBox.sendKeys(zip);
    }

    public void setPaymentInformation(String CType, String CNumber, String Expire){
        cardTypeBox.sendKeys(CType);
        switch (CType){
            case "Visa" :
                driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
                break;
            case "MasterCard":
                driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1")).click();
                break;
            case "AmericanExpress":
                driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2")).click();
                break;
        }
        staticWait(1);
        cardNumberBox.sendKeys(CNumber);
        staticWait(1);
        expireDateBox.sendKeys(Expire);
        staticWait(1);
        processButton.click();
    }
    public void setProductInfo(String product, String quantity){
        Select select = new Select(productType);
        select.selectByVisibleText(product);
        staticWait(1);

        amount.sendKeys(quantity);
        staticWait(1);

        calculateButton.click();

    }



    public void setOrderSection(){
        staticWait(1);
        orderSection.click();
    }

    public void setLogin(){

        staticWait(2);
        username.sendKeys("Tester");
        staticWait(1);
        password.sendKeys("test");
        staticWait(1);
        submitButton.click();
    }









}
