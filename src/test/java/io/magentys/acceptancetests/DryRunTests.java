package io.magentys.acceptancetests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "io.magentys.cinnamon", "io.magentys" }, features = "src/test/resources/features", format = { "pretty",
        "json:target/cucumber-reports/cucumber.json" }, tags = { "@complete,@accepted,@dev,@wip" })
public class DryRunTests {
}
