package ru.yandex.praktikum.selenium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.selenium.step.OrderScooterStep;

@RunWith(Parameterized.class)
public class OrderTest extends BaseTest {
    private final boolean isTopButton;
    private final String name;
    private final String lastName;
    private final String address;
    private final String phoneNumber;
    private final String date;
    public OrderTest(boolean isTopButton, String name, String lastName, String address, String phoneNumber, String date) {
        this.isTopButton = isTopButton;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.date = date;
    }
    @Parameterized.Parameters
    public static Object[][] createOrder() {
        return new Object[][] {
                {true, "Валентин", "Серов", "Лаврушинский пер., 10", "79918651911", "15.07.2023"},
                {false, "Казимир", "Малевич", "Крымский вал, 10", "+79918791935", "19.07.2023"},
        };
    }
    @Test
    public void checkOrderScooter() {
        if(isTopButton) {
            mainPage.clickOrderTopButtonOnMainPage();
        } else {
            mainPage.clickOrderBottomButtonOnMainPage();
        }
        OrderScooterStep orderScooterStep = new OrderScooterStep(webDriver);
        orderScooterStep.orderScooter(name, lastName, address, phoneNumber, date);
    }
}
