package com.cvlibrary.pages;

import com.cvlibrary.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage extends Utility
{
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;
    public void verifyTheResult(String expected)
    {
        getTextFromElement(resultText);
        Assert.assertEquals(getTextFromElement(resultText),expected,"Message is not coming");
    }
}
