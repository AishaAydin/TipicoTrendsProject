package com.google.trends.pages;

import com.google.trends.utilities.BrowserUtilities;
import com.google.trends.utilities.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {

    private  final static Logger logger=Logger.getLogger(BasePage.class);
    protected WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
  //  BrowserUtilities browserUtils=new BrowserUtilities();

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
