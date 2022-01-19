package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelPage extends PageBase{
    public HotelPage(WebDriver driver) {
        super(driver);
    }

    private By btnBed = By.xpath("(//i[@class='bicon bicon-double'])[1]");
    private By ddlAmount = By.xpath("(//select[contains(@class,'hprt-nos-select js-hprt-nos-select')])[1]");
    private By btnIWillReserve = By.xpath("//span[contains(@class,'bui-button__text js-reservation-button')]");

    public void clickBed() {
        click(btnBed);
    }
    public void clickIWillReserve(){
        click(btnIWillReserve);
    }
    public void selectAmount(){
        selectData(ddlAmount,1);
    }
}
