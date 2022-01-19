package com.automation.tests;

import com.google.common.collect.ImmutableMap;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.ArrayList;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

public class TestBase {
    WebDriver driver;
    HomePage homePage;
    SearchResultPage searchResultPage;
    BookingDetailsPage bookingDetailsPage;
    HotelPage hotelPage;
    private final String url="https://www.booking.com/";

    @BeforeSuite
    void setEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", "Chrome")
                        .put("Browser.Version", "87.0.4280.88")
                        .put("URL", url)
                        .build(), System.getProperty("user.dir")
                        + "/allure-results/");
    }

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
        hotelPage = new HotelPage(driver);
        bookingDetailsPage = new BookingDetailsPage(driver);
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public void switchTab(){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

}
