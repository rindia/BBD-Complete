package com.ea.test.runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

import java.io.File;

@CucumberOptions(features = {"src/test/com/ea/test/features/"}, glue = {"com/ea/test/steps"},format = {"pretty"}
,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/myreport.html"},monochrome = true,dryRun = false)
public class TestRunner extends AbstractTestNGCucumberTests{

    @AfterClass()
    public void afterClass() {
        Reporter.loadXMLConfig(new File("src/test/com/ea/test/features/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 10");
        for (String s : org.testng.Reporter.getOutput()) {
            Reporter.setTestRunnerOutput(s);
        }
    }


}





