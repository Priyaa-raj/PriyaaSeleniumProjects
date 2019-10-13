package runnerPackage;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/fearturePackage/FeatureFile.feature",
glue="stepDefinitionPackage",
monochrome=true)
public class RunTest extends AbstractTestNGCucumberTests{

}
