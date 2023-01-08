package java.com.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        glue = "com.bdd.glue",
        features = "src/test/resources/features",
        stepNotifications = true,
        tags = "@Search_Laptop"
)
public class RunnerTest {
}
