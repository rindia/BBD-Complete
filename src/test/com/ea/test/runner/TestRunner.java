package com.ea.test.runner;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import com.ea.framework.config.Settings;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.model.CucumberTagStatement;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Iterator;
import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/com/ea/test/features/"}, glue = {"com/ea/test/steps"},format = {"pretty"}
,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/myreport.html"},monochrome = true,dryRun = false)
public class TestRunner extends AbstractTestNGCucumberTests{


    //private TestNGCucumberRunner testNGCucumberRunner;

   /* @BeforeClass()
    public void setUpClass() {
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath("output/myreport.html");
    }*/

/*
    @Test(dataProvider = "features")
    public void runTests(CucumberFeatureWrapper cucumberFeatureWrapper) {

        List<CucumberTagStatement> elements = cucumberFeatureWrapper.getCucumberFeature().getFeatureElements();

        for (Iterator<CucumberTagStatement> element = elements.iterator(); element.hasNext(); ) {
            //ToDo: Bring the scenario name from Excel sheet using the out-of-box library we have in utilities package
            //Pass the hardcoded scenario name

            CucumberTagStatement scenarioName = element.next();
            if (!scenarioName.getVisualName().equals("Scenario: Check Web page is open")) {
                element.remove();
            }

            //ToDo:Verify and store the scenario name in a collection and then store the feature name and retrive the value to perform operation
          //  Settings.ScenarioContext = scenarioName.getVisualName();
        }

       // Settings.FeatureContext = cucumberFeatureWrapper.getCucumberFeature().getGherkinFeature().getName();


        testNGCucumberRunner.runCucumber(cucumberFeatureWrapper.getCucumberFeature());
    }*/


   /* @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }*/

    @AfterClass()
    public void afterClass() {
        Reporter.loadXMLConfig(new File("src/test/com/ea/test/features/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 10");
        for (String s : org.testng.Reporter.getOutput()) {
            Reporter.setTestRunnerOutput(s);
        }
      //  testNGCucumberRunner.finish();
    }


}





