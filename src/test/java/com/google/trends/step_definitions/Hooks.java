package com.google.trends.step_definitions;

import com.google.trends.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    private final static Logger logger=Logger.getLogger(Hooks.class);
    @Before(order = 2)
    public void setup() {
        logger.info("::: STARTING AUTOMATION :::");
        logger.info("Test setup");
        Driver.getDriver().manage().window().maximize();
    }

    @Before(value = "@driver", order = 1)
    public void specialSetup() {
        logger.info("Setup for driver only");
    }

    @After("@driver")
    public void specialTearDown() {
        logger.info("Tear down for driver only");
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            logger.info("Taking a screenshot");
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
        logger.info("::: Ending automation :::");
    }

}
