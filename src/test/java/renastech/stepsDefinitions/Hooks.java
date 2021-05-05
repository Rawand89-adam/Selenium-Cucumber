package renastech.stepsDefinitions;

import io.cucumber.java.Scenario;
import org.junit.Before;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks  {


    @Before
    public void setup(Scenario scenario){

        Driver.getDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigurationsReader.getProperties("url2"));

    }




}
