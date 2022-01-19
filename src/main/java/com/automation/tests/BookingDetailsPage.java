package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingDetailsPage extends PageBase {
    public BookingDetailsPage(WebDriver driver) {
        super(driver);
    }

    private By lblHotel = By.id("bp-property-details__title");
    private By lblCheckIn = By.xpath("(//span[@class='bui-date__title'])[1]");
    private By lblCheckOut = By.xpath("(//span[@class='bui-date__title'])[2]");

    public String getHotelName(){
        return getContent(lblHotel);
    }

    public String getCheckIn(){
        return getContent(lblCheckIn);
    }

    public String getCheckOut(){
        return getContent(lblCheckOut);
    }
}
