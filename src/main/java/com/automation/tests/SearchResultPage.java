package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends PageBase {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickHotel(){
        int index = 1;
        while (driver.getPageSource().contains("Tolip") && index < 25) {
            By hotelList = By.xpath("(//div[@data-testid='property-card'])["+ index +"]");
            By btnHotel = By.xpath("(//div[@data-testid='availability-cta'])[ " + index + "]");
            index++;
            if (driver.findElement(hotelList).getText().contains("Tolip")){
                click(btnHotel);
            }
        }
    }
}
