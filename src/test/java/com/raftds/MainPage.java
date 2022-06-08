package com.raftds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.raftds.WebDriverSettings.chromeDriver;

public class MainPage {
    static WebElement aboutButton =
            chromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[2]/ul/li[1]/p"));
    static WebElement servicesButton =
            chromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[2]/ul/li[2]/p"));
    static WebElement expertiseButton =
            chromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[2]/ul/li[3]/p"));
}
