package ru.yandex.praktikum.selenium.pageobject;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.containsString;

public class AboutRentPage {
    WebDriver webDriver;
    public AboutRentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    private By dateInput = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private By rentalPeriodSelect = By.xpath(".//div[@class='Dropdown-placeholder']");
    private By rentalPeriod = By.xpath(".//div[@class='Dropdown-menu']//div[text()='четверо суток']");
    private By orderButtonOnAboutRentPage = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    private By orderConfirmation = By.xpath(".//div[@class='Order_Modal__YZ-d3']");
    private By yesButtonOrderConfirmation = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    private By orderResult = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");

    //Ввести дату
    public AboutRentPage setDate (String date) {
        webDriver.findElement(dateInput).sendKeys(date);
        return this;
    }
    //Выбрать период аренды
    public AboutRentPage selectRentalPeriod() {
        webDriver.findElement(rentalPeriodSelect).click();
        webDriver.findElement(rentalPeriod).click();
        return this;
    }
    //Нажать кнопку "Заказать"
    public AboutRentPage clickOrderButtonOnAboutRentPage() {
        webDriver.findElement(orderButtonOnAboutRentPage).click();
        return this;
    }
    //Нажать кнопку "Да" на форме подтверждения заказа
    public AboutRentPage clickYesButtonOrderConfirmation() {
        webDriver.findElement(yesButtonOrderConfirmation).click();
        return this;
    }
    //Проверить, что заказ оформлен
    public void checkSuccessOfOrder() {
        MatcherAssert.assertThat(webDriver.findElement(orderResult).getText(), containsString("Заказ оформлен"));
    }
}
