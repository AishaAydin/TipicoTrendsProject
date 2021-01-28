package com.google.trends.Pages;

import com.google.trends.Utilities.ConfigurationReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TrendsMainPage extends BasePage {


    private final static Logger logger = Logger.getLogger(TrendsMainPage.class);

    @FindBy(id = "input-254")
    private WebElement searchButton;


    public void searchItem(String word) {
        logger.info("Word: " + ConfigurationReader.getProperty("firstWord"));
        wait.until(ExpectedConditions.visibilityOf(searchButton)).sendKeys(word, Keys.ENTER);

    }
}
