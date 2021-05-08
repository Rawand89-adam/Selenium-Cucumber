package renastech.stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks  extends BrowserUtils{


    @Before
    public void setup(){
          Driver.getDriver();
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          driver.get(ConfigurationsReader.getProperties("url3"));

    }

    @After
    public void tearsDown(){

      //  driver.quit();

    }






}
