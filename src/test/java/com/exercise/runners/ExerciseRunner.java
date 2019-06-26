package com.exercise.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "html:target/default-cucumber-report"},

        features ="src/test/resources/codefeatures",
        glue = "com/exercise/step_definitions/"
        , dryRun = false)

public class ExerciseRunner {
}
