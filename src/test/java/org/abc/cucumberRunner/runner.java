package org.abc.cucumberRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
      glue = {"org.abc.StepDefinitions"},
      plugin = {"pretty",
              "html:target/cucumber.html",
              "json:target/cucumber.json",
              "junit:target/cucumber.xml",
              "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
      },
      monochrome = true,

//dryRun = false)
//tags = "@main")
//tags = "not @savi")
//tags = "@imp or @savi")
//tags = "@savi")
//tags = "@login or @invalid_login and @savi")
//tags = "@login or @invalid_login and @savi")
       // tags="@Datadriven or @main",
        //tags="@login and @savi"
        tags="@Datadriven"
         )
public class runner {
}
