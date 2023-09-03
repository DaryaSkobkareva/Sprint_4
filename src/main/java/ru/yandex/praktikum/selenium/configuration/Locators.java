package ru.yandex.praktikum.selenium.configuration;

public class Locators {
    /*
        Локаторы для главной странинцы (MainPage):
            Кнопка куки "да все привыкли" = acceptCookiesButton
                By.xpath(".//button[@id='rcc-confirm-button']")
            Кнопка "Заказать" вверху страницы = orderTopButtonOnMainPage
                By.xpath(".//button[@class='Button_Button__ra12g']")
            Кнопка "Заказать" внизу страницы = orderBottomButtonOnMainPage
                By.xpath(".//div[@class='Home_FinishButton__1_cWm']//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
            Выпадающий список в разделе "Вопросы о важном" = accordion
                By.xpath(".//div[@class='accordion']")
            Вопрос = accordionQuestion
                By.xpath(String.format(".//div[@id='accordion__heading-%d']", index))
            Ответ = accordionAnswer
                By.xpath(String.format(".//div[@id='accordion__panel-%d']/p", index))
            Кнопка "Статус заказа" = orderStatusButton
                By.xpath(".//button[@class='Header_Link__1TAG7']")
            Поле для ввода номера заказа = orderNumberInput
                By.xpath(".//input[@placeholder='Введите номер заказа']")
            Кнопка "Go!" = goButton
                By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']")

         Локаторы для страницы "Для кого cамокат" (AboutClientPage):
            Поле "Имя" = nameInput
                By.xpath(".//input[@placeholder='* Имя']")
            Поле "Фамилия" = lastNameInput
                By.xpath("///input[@placeholder='* Фамилия']")
            Поле "Адрес" = addressInput
                By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']")
            Поле "Станция метро" = metroStationSelect
                By.xpath(".//input[@placeholder='* Станция метро']")
            Станция метро из выпадающего списка = metroStation
                By.xpath(".//div[@class='select-search__select']//li[17]");
            Поле "Телефон" = phoneNumberInput
                By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']")
            Кнопка "Далее" = nextButton
                By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")

         Локаторы для страницы "Про аренду" (AboutRentPage):
            Поле "Когда привеззти самокат" = dateInput
                By.xpath(".//input[@placeholder='* Когда привезти самокат']")
            Поле "Срок аренды" = rentalPeriodSelect
                By.xpath(".//div[@class='Dropdown-placeholder']")
            Срок аренды из выпадающего списка = rentalPeriod
                By.xpath(".//div[@class='Dropdown-menu']//div[text()='четверо суток']");
            Поле "Цвет самоката" = colorScooter
                By.xpath
            Поле "Комментарий для курьера" = commentForCourier
                By.xpath
            Кнопка "Заказать" = orderButtonOnAboutRentPage
                By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']")
            Всплывающее окно "Хотите оформить заказ?" = orderConfirmation
                By.xpath("//div[@class='Order_Modal__YZ-d3']")
            Кнопка "Да" = yesButtonOrderConfirmation
                By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']")
            Всплывающее окно "Заказ оформлен" = orderResult
                By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']")


         Локаторы для страницы "Статус заказа" (OrderStatusPage)
            Блок "Такого заказа нет" = trackNotFoundContainer
                By.xpath(".//div[@class='Track_NotFound__6oaoY']")
     */
}
