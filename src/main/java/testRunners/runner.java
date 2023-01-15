package testRunners;

import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import util.DriverFactory;


@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions", "util"},
        tags = "",
        plugin = {
                "summary", "pretty", "html:Reports/CucumberReport/Reports.html",
        }
)
public class runner extends AbstractTestNGCucumberTests {
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!burada çalıştırma!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //Parallel.xml e git
    //<test name="appiumProject"> olduguna dikkat et yani proje ismi ile aynı olmalı
    //sag tikla orada ve run et
    static AppiumDriver driver = DriverFactory.getDriver();

}
