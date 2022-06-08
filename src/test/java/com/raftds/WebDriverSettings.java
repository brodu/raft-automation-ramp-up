package com.raftds;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public static ChromeDriver chromeDriver;

    @Before
    public void beforeHook() {
        System.setProperty("webdriver.chrome.driver", "/Users/brodu/Webdrivers/chromedriver");
        chromeDriver = new ChromeDriver();
    }

    @After
    public void afterHook() {
        chromeDriver.quit();
    }
}
