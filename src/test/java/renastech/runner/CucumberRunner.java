package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources",
        glue = "/renastech/stepsDefinitions",
        dryRun=true,  //When it is false it is inactive
        tags = "@TC_10"


)
public class CucumberRunner {

    //Hooks


}
