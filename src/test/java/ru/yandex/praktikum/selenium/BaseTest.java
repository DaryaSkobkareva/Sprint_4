package ru.yandex.praktikum.selenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.selenium.configuration.WebDriverFactory;
import ru.yandex.praktikum.selenium.pageobject.MainPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver webDriver;
    MainPage mainPage;
    @Before
    public void startUp() {
        webDriver = WebDriverFactory.createDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage = new MainPage(webDriver);
        mainPage.clickAcceptCookiesButton();
    }
    @After
    public void clean() {
        webDriver.quit();
    }
}