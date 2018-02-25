package runnerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

@CucumberOptions(features = {"features"}, glue = {"stepDefinitionPackage"})
public class TestRunner extends AbstractTestNGCucumberTests {

	public static WebDriver driver;
	@BeforeTest
		public void setup() {
		WebDriverManager.chromedriver().setup();
		//Use webdriver manager to specify which driver to use
		driver = new ChromeDriver();
		System.out.println("Set commit");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
