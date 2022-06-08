package com.raftds;

import io.cucumber.java.en.*;
import org.junit.Assert;

import static com.raftds.WebDriverSettings.chromeDriver;
import static com.raftds.MainPage.*;

public class Steps {

    @Given("User opens {string} page in browser")
    public void user_opens_page_in_browser(String url) {
        chromeDriver.get(url);
        Assert.assertEquals("RAFT", chromeDriver.getTitle());
    }

    @When("User clicks {string} element")
    public void user_clicks_element(String element) {
        switch (element){
            case ("About"):
                aboutButton.click();
                break;
            case ("Services"):
                servicesButton.click();
                break;
            case ("Expertise"):
                expertiseButton.click();
                break;

        }
    }

    @Then("{string} block is visible on the page")
    public void block_is_visible_on_the_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
