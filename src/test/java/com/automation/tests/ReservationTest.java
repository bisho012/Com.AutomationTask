package com.automation.tests;

import Utils.ExcelFileManager;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class ReservationTest extends TestBase {

    @Test
    public void Reserve() throws IOException, InterruptedException {
        homePage.setTxtDestination(ExcelFileManager.setDataFromExcelFile(0, 1));
        homePage.clickCheckInOut();
        homePage.clickNextPage();
        homePage.clickNextPage();
        homePage.clickCheckIn();
        homePage.clickCheckOut();
        // homePage.setTxtCheckIn(ExcelFileManager.setDataFromExcelFile(2,1));
        // homePage.setTxtCheckOut(ExcelFileManager.setDataFromExcelFile(3,1));
        homePage.clickSearch();
        searchResultPage.clickHotel();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        hotelPage.clickBed();
        hotelPage.selectAmount();
        hotelPage.clickIWillReserve();
        bookingDetailsPage.assertHotelTitle();
        bookingDetailsPage.assertCheckIn();
        bookingDetailsPage.assertCheckOut();
    }
}
