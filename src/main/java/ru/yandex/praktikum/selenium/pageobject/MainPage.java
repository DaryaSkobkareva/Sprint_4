package ru.yandex.praktikum.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static ru.yandex.praktikum.selenium.configuration.AppURL.URL;

public class MainPage {
    WebDriver webDriver;
    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(URL);
    }
    private By acceptCookiesButton = By.xpath(".//button[@id='rcc-confirm-button']");
    private By orderTopButtonOnMainPage = By.xpath(".//button[@class='Button_Button__ra12g']");
    private By orderBottomButtonOnMainPage = By.xpath(".//div[@class='Home_FinishButton__1_cWm']//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By accordion = By.xpath(".//div[@class='accordion']");
    private By orderStatusButton = By.xpath(".//button[@class='Header_Link__1TAG7']");
    private By orderNumberInput = By.xpath(".//input[@placeholder='Введите номер заказа']");
    private By goButton = By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']");

    //Принять куки
    public void clickAcceptCookiesButton() {
        if(webDriver.findElement(acceptCookiesButton).isEnabled()) {
            webDriver.findElement(acceptCookiesButton).click();
        }
    }
    //Нажать кнопку "Заказать" вверху страницы
    public void clickOrderTopButtonOnMainPage() {
        webDriver.findElement(orderTopButtonOnMainPage).click();
    }
    //Нажать кнопку "Заказать" внизу страницы
    public void clickOrderBottomButtonOnMainPage() {
        WebElement element = webDriver.findElement(orderBottomButtonOnMainPage);
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();", element);
        webDriver.findElement(orderBottomButtonOnMainPage).click();
    }
    //Получить текст ответа в разделе "Вопросы о важном"
    public String getAccordionAnswerText(int index) {
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(accordion));
        WebElement element = webDriver.findElement(accordion);
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();", element);
        webDriver.findElement(By.xpath(String.format(".//div[@id='accordion__heading-%d']", index))).click();
        return webDriver.findElement(By.xpath(String.format(".//div[@id='accordion__panel-%d']/p", index))).getText();
    }
    //Нажать кнопку "Статус заказа"
    public MainPage clickOrderStatusButton() {
        webDriver.findElement(orderStatusButton).click();
        return this;
    }
    //Ввести номер заказа
    public MainPage inputOrderNumber(String orderNumber) {
        webDriver.findElement(orderNumberInput).sendKeys(orderNumber);
        return this;
    }
    //Нажать кнопку "Go!"
    public OrderStatusPage clickGoButton() {
        webDriver.findElement(goButton).click();
        return new OrderStatusPage(webDriver);
    }
}
