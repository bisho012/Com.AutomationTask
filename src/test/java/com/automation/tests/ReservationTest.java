package com.automation.tests;

import Utils.ExcelFileManager;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ReservationTest extends TestBase {

    String expectedHotelTitle = "Tolip Hotel Alexandria";
    String expectedCheckOut = "Thu, Apr 14, 2022";
    String expectedCheckIn = "Fri, Apr 1, 2022";

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void Reserve() throws IOException, InterruptedException {
        homePage.setTxtDestination(ExcelFileManager.setDataFromExcelFile(0, 1));
        homePage.clickCheckInOut();
        homePage.clickNextPage();
        homePage.clickNextPage();
        homePage.clickCheckIn();
        homePage.clickCheckOut();
        homePage.clickSearch();
        searchResultPage.clickHotel();
        switchTab();
        hotelPage.clickBed();
        hotelPage.selectAmount();
        hotelPage.clickIWillReserve();
        Assert.assertEquals(expectedHotelTitle,bookingDetailsPage.getHotelName());
        Assert.assertEquals(expectedCheckIn,bookingDetailsPage.getCheckIn());
        Assert.assertEquals(expectedCheckOut,bookingDetailsPage.getCheckOut());

    }
}
