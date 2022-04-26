package com.raftds;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "/Users/brodu/Webdrivers/chromedriver");
        ChromeDriver chromeDriver;
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://raftds.com/");
        Assert.assertEquals("RAFT", chromeDriver.getTitle());
        chromeDriver.quit();
    }
}
