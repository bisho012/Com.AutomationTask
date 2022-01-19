package com.automation.tests;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingDetailsPage extends PageBase {
    public BookingDetailsPage(WebDriver driver) {
        super(driver);
    }

    private By lblHotel = By.id("bp-property-details__title");
    private By lblCheckIn = By.xpath("(//span[@class='bui-date__title'])[1]");
    private By lblCheckOut = By.xpath("(//span[@class='bui-date__title'])[2]");

    public void assertHotelTitle(){
        String expectedHotelTitle = "Tolip Hotel Alexandria";
        Assert.assertEquals(expectedHotelTitle,driver.findElement(lblHotel).getText());
    }

    public void assertCheckIn(){
        String expectedHotelTitle = "Fri, Apr 1, 2022";
        Assert.assertEquals(expectedHotelTitle,driver.findElement(lblCheckIn).getText());
    }

    public void assertCheckOut(){
        String expectedHotelTitle = "Thu, Apr 14, 2022";
        Assert.assertEquals(expectedHotelTitle,driver.findElement(lblCheckOut).getText());
    }

}
