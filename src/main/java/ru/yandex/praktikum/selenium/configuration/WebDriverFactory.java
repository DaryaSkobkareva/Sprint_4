package ru.yandex.praktikum.selenium.configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver createDriver() {
        WebDriver webDriver;
        String browserName = System.getProperty("browserName");
        switch(browserName) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().clearDriverCache().setup();
                webDriver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Browser is not detected");
        }
        return webDriver;
    }
}
