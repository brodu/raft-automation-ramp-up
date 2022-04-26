package com.raftds;

import org.junit.Assert;
import org.junit.Test;
import com.raftds.WebDriverSettings;

public class Steps extends WebDriverSettings {

    @Test
    public void test() {
        chromeDriver.get("https://raftds.com/");
        Assert.assertEquals("RAFT", chromeDriver.getTitle());
    }
}
