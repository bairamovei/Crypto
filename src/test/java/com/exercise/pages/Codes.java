package com.exercise.pages;

import com.exercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Codes {
    public Codes(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='quicksearch']")
    public WebElement title;

    @FindBy(xpath = "//*[@id='navbar-query']")
    public WebElement textbox;

    @FindBy(xpath = "//*[@id='navbar-submit-button']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id='nb_extra_nav']/li[3]/a")
    public WebElement link;

    @FindBy(xpath = "//*[@id='top-slot-wrapper']/span/div/div/div/div[1]/div/div/figure/div")
    public WebElement value;


