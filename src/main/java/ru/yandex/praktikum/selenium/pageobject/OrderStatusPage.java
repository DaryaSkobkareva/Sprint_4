package ru.yandex.praktikum.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class OrderStatusPage {
    WebDriver webDriver;
    public OrderStatusPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By trackNotFoundContainer = By.xpath(".//div[@class='Track_NotFound__6oaoY']");

    public void checkTrackNotFoundContainer() {
        boolean isDisplayed = webDriver.findElement(trackNotFoundContainer).isDisplayed();
        assertTrue(isDisplayed);
    }
}
