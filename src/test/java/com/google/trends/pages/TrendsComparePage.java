package com.google.trends.pages;
import com.google.trends.utilities.BrowserUtilities;
import com.google.trends.utilities.ConfigurationReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TrendsComparePage extends BasePage{

    private final static Logger logger=Logger.getLogger(TrendsComparePage.class);

    @FindBy(xpath = "(//div[@id='compare-pickers-wrapper']//hierarchy-picker)[1]")
    private WebElement locationsDropDown;

    @FindBy(xpath = "(//input[contains(@id,'input-')])[3]")
    private WebElement searchLocation;

    @FindBy(xpath = "//h2[@class='header-sub-title']/span")
    private WebElement pageName;

    @FindBy(xpath = "//div[@id='compare-pickers-wrapper']//custom-date-picker")
    private WebElement timeDropDownClick;

    @FindBy(xpath = "//div[contains(text(),'Past 90 days')]")
    private WebElement timeDropDown;




    public void getPageName(){
        wait.until(ExpectedConditions.visibilityOf(pageName));
    }
    public void selectLocation(String word){
        logger.info("Word: "+ ConfigurationReader.getProperty("location"));
        wait.until(ExpectedConditions.visibilityOf(locationsDropDown)).click();

        wait.until(ExpectedConditions.visibilityOf(searchLocation)).sendKeys(word);

        wait.until(ExpectedConditions.visibilityOf(searchLocation)).sendKeys(Keys.ARROW_DOWN);

        wait.until(ExpectedConditions.visibilityOf(searchLocation)).sendKeys(Keys.ENTER);

    }
    public void  selectTime(){
        logger.info("Selecting time as a Past 90 Days ");
//        try {
//            Thread.sleep(600);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        BrowserUtilities.wait(1);

        wait.until(ExpectedConditions.visibilityOf(timeDropDownClick)).click();

//        try {
//            Thread.sleep(1000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        wait.until(ExpectedConditions.visibilityOf(timeDropDown)).click();


    }

}
