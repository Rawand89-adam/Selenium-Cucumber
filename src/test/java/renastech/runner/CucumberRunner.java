package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources",
        glue = "/renastech/stepsDefinitions",
        dryRun=false,  //When it is false it is inactive
        tags = "@TC_5"


)
public class CucumberRunner {


    // Feature file
    // runner Class
    // steps Definition
    // utils pack ( Browserutils, Driver)
    // Pom.Xml

    //And finaly run one test case we run in class,
    // make sure framework is running










}
