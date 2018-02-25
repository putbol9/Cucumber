package stepDefinitionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runnerPackage.TestRunner;

public class stepDefinition extends TestRunner{
	WebElement search_box; 
	@Given("^I navigate to google homepage$")
		public void i_navigate_to_google_homepage(){
		    // Write code here that turns the phrase above into concrete actions
		    driver.get("http://google.com");
		}

		@When("^I enter a keyword to search$")
		public void i_enter_a_keyword_to_search(){
		    // Write code here that turns the phrase above into concrete actions
			search_box = driver.findElement(By.name("q"));
			search_box.sendKeys("Porsche");
			 
		}

		@When("^I click on the search button$")
		public void i_click_on_the_search_button(){
		    // Write code here that turns the phrase above into concrete actions
			search_box = driver.findElement(By.xpath("//html//span[1]/span[1]/input[1]"+Keys.ENTER));
			
		}

		@Then("^I should be able to see the title contains the keyword$")
		public void i_should_be_able_to_see_the_title_contains_the_keyword() {
		    // Write code here that turns the phrase above into concrete actions
			Assert.assertTrue(driver.getTitle().contains("porsche"));
		}
}
