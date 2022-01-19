package com.automation.tests;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By txtDestination = By.id("ss");
    private By txtCheckIn = By.xpath("//div[@data-mode='checkin']");
    private By txtCheckOut = By.xpath("//div[@data-mode='checkout']");
    private By btnSearch = By.xpath("//button[@class='sb-searchbox__button ']");
    private By btnCheckInOut = By.xpath("//div[@class='xp__input-group xp__date-time']");
    private By btnDateNextPage = By.xpath("//div[@data-bui-ref='calendar-next']");
    private By btnCheckIn = By.xpath("//td[@data-date='2022-04-01']");
    private By btnCheckOut = By.xpath("//td[@data-date='2022-04-14']");

    @Step("Enter Destination: Alexandria")
    public void setTxtDestination(String destination){
        setText(txtDestination, destination);
    }
    public void clickCheckInOut(){
        click(btnCheckInOut);
    }
    public void clickNextPage(){
        click(btnDateNextPage);
    }
    public void clickCheckIn(){
        click(btnCheckIn);
    }
    public void clickCheckOut(){
        click(btnCheckOut);
    }
    public void clickSearch(){
        click(btnSearch);
    }
}
