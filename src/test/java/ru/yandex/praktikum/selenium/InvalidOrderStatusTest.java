package ru.yandex.praktikum.selenium;

import org.junit.Test;

public class InvalidOrderStatusTest extends BaseTest{
    String invalidOrderNumber = "9182";
    @Test
    public void checkInvalidOrderStatus() {
        mainPage.clickOrderStatusButton()
                .inputOrderNumber(invalidOrderNumber)
                .clickGoButton()
                .checkTrackNotFoundContainer();
    }
}
