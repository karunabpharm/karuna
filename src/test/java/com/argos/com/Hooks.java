package com.argos.com;

import com.argos.com.drivers.BroserLaunch;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    BroserLaunch broserLaunch=new BroserLaunch();
    @Before
    public void setUp() {
        broserLaunch.openBrowser();

    }

    @After
    public void tearDown() {
        broserLaunch.closeBrowser();
    }
}
