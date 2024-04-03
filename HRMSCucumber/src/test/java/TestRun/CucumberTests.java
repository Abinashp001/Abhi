package TestRun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",features = {"src/test/resources/Features/AddEmp.feature"},
glue = {"StepDef"},
plugin = {"pretty","html:target/HRMS.AdEmp.htmlreport.html"}
 )
public class CucumberTests extends AbstractTestNGCucumberTests{

}
