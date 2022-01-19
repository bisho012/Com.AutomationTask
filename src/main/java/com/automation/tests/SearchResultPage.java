package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends PageBase {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
    //private By btnHotel = By.xpath("(//div[@data-testid='availability-cta'])[]");

    public void clickHotel(){
//
//        JavascriptExecutor exe = (JavascriptExecutor)driver;
//        WebElement hotel = driver.findElement(btnHotel);
//        exe.executeScript("arguments[0].scrollIntoView();", hotel );
//        for (int i=1; i < 25; i++){
//            By hotelList = By.xpath("(//div[@data-testid='property-card'])["+i+"]");
//            System.out.println(hotelList);
//            int j;
//            j=i;
//            if (hotelList.toString(). == "Tulip"){
//                By btnHotel = By.xpath("(//div[@data-testid='availability-cta'])["+j+"]");
//            }
//        }
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
