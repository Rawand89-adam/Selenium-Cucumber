package renastech.pages;

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
