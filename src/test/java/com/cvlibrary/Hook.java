package com.cvlibrary;

import com.cvlibrary.propertyreader.PropertyReader;
import com.cvlibrary.utilities.Utility;
import org.junit.After;
import org.junit.Before;

public class Hook extends Utility
{
    @Before
    public void setUp()
    {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
