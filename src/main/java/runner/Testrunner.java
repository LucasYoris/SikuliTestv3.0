package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/main/java/features",
        glue = ("stepsDefinitions"),
        plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/Reporte.html"}
)
public class Testrunner {

}
