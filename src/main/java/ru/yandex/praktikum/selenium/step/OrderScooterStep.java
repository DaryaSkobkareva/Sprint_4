package ru.yandex.praktikum.selenium.step;

import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.selenium.pageobject.AboutClientPage;

public class OrderScooterStep {
    WebDriver webDriver;
    public OrderScooterStep(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void orderScooter(String name, String lastName, String address, String phoneNumber, String date) {
        AboutClientPage aboutClientPage = new AboutClientPage(webDriver);
        aboutClientPage.setName(name)
                .setLastName(lastName)
                .setAddress(address)
                .selectMetroStation()
                .setPhoneNumber(phoneNumber)
                .clickNextButton()
                .selectRentalPeriod()
                .setDate(date)
                .clickOrderButtonOnAboutRentPage()
                .clickYesButtonOrderConfirmation()
                .checkSuccessOfOrder();
    }
}
