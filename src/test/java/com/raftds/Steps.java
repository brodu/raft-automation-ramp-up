package com.raftds;

import org.junit.Assert;
import org.junit.Test;
import static com.raftds.WebDriverSettings.chromeDriver;

public class Steps {

    @Test
    public void test() {
        chromeDriver.get("https://raftds.com/");
        Assert.assertEquals("RAFT", chromeDriver.getTitle());
    }
}
