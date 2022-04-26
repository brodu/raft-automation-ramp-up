package com.raftds;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    public ChromeDriver chromeDriver;

    @Before
    public void beforeHook() {
        System.setProperty("webdriver.chrome.driver", "/Users/brodu/Webdrivers/chromedriver");
        chromeDriver = new ChromeDriver();
    }

    @After
    public void afterHook() {
        chromeDriver.quit();
    }

    @Test
    public void test() {
        chromeDriver.get("https://raftds.com/");
        Assert.assertEquals("RAFT", chromeDriver.getTitle());
    }
}
