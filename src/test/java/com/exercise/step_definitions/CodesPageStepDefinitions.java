package com.exercise.step_definitions;

import com.exercise.pages.Codes;
import com.exercise.utilities.ConfigurationReader;
import com.exercise.utilities.Driver;
import com.exercise.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;

public class CodesPageStepDefinitions {

    Pages pages = new Pages();
    WebDriver driver= Driver.getDriver();

    @Given("^User on Main Page")
    public void user_on_Main_Page()  {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Then("Assert item same as expected from pulldown menu")
    public void assert_item_same_as_expected_from_pulldown_menu()  {



        pages.codes().title.click();
        pages.codes().title.findElement(By.cssSelector("#quicksearch > option:nth-child(3)")).click();



        Assert.assertEquals("TV Episodes",
                pages.codes().title.findElement(By.cssSelector("#quicksearch > option:nth-child(3)")).getText() );

    }

    @Then("Assert text in textbox same as expected")
    public void assert_text_in_textbox_same_as_expected() throws InterruptedException {
        pages.codes().textbox.sendKeys("Hello World");


        Thread.sleep(3000);

        Assert.assertEquals(pages.codes().textbox.findElement
                        (By.xpath("//*[@id='navbar-suggestionsearch']/div[1]/a/div[2]/span[1]")).getText(),
               "Hello World");



    }

    @Then("Assert button clicked")
    public void assert_button_clicked()  {

        pages.codes().searchButton.click();

       Assert.assertTrue(pages.codes().searchButton.isEnabled());

    }

    @Then("Assert opened page same as expected")
    public void assert_opened_page_same_as_expected()  {
        pages.codes().link.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://help.imdb.com/imdb?ref_=cons_nb_hlp");

    }

    @Then("Assert value same as expected")
    public void assert_value_same_as_expected()  {


    }
}
