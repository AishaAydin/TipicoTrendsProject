package com.google.trends.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"

        },
        features = "src/test/Resource/Feauture",
        glue = "com/google/trends/step_definitions",
        dryRun = false,
        tags = "@trends"


)
@RunWith(Cucumber.class)
public class TestRunner {

}
