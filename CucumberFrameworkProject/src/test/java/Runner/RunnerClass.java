package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features= "/Users/pinkypunjabi/eclipse-workspace/CucumberFrameworkProject/src/test/java/AmazonCumber/SearchClass.java",
		glue= "AmazonCumber"
	
	
		
		)

public class RunnerClass {

}
