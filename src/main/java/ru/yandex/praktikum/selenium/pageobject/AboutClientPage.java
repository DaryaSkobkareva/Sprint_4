package ru.yandex.praktikum.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutClientPage {
    WebDriver webDriver;
    public AboutClientPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    private By nameInput = By.xpath(".//input[@placeholder='* Имя']");
    private By lastNameInput = By.xpath("//input[@placeholder='* Фамилия']");
    private By addressInput = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metroStationSelect = By.xpath(".//input[@placeholder='* Станция метро']");
    private By metroStation = By.xpath(".//div[@class='select-search__select']//li[17]");
    private By phoneNumberInput = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By nextButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Ввести имя
    public AboutClientPage setName(String name) {
        webDriver.findElement(nameInput).sendKeys(name);
        return this;
    }
    //Ввести фамилию
    public AboutClientPage setLastName(String lastName) {
        webDriver.findElement(lastNameInput).sendKeys(lastName);
        return this;
    }
    //Ввести адрес
    public AboutClientPage setAddress(String address) {
        webDriver.findElement(addressInput).sendKeys(address);
        return this;
    }
    //Выбрать станцию метро
    public AboutClientPage selectMetroStation() {
        webDriver.findElement(metroStationSelect).click();
        webDriver.findElement(metroStation).click();
        return this;
    }
    //Ввести номер телефона
    public AboutClientPage setPhoneNumber(String phoneNumber) {
        webDriver.findElement(phoneNumberInput).sendKeys(phoneNumber);
        return this;
    }
    //Нажать кнопку "Далее"
    public AboutRentPage clickNextButton() {
        webDriver.findElement(nextButton).click();
        return new AboutRentPage(webDriver);
    }
}
