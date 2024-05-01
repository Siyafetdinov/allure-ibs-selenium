package ru.ibs.steps;

import io.qameta.allure.Step;
import ru.ibs.managers.PageManager;
import ru.ibs.pages.CreateBusinessTrip;

import java.time.LocalDate;

public class CreateBusinessTripSteps {

    /**
     * Заполняем поле подразделение
     *
     * @param businessUnit подразделение
     */
    @Step("Заполняем поле подразделение, значением: \"{0}\"")
    public CreateBusinessTripSteps selectBusinessUnit(String businessUnit) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.selectBusinessUnit(businessUnit);
        return this;
    }

    /**
     * Заполняем поле принимающая организация
     *
     * @param nameCompany название компании
     */
    @Step("Заполняем поле принимающая организация, значением: \"{0}\"")
    public CreateBusinessTripSteps selectCompany(String nameCompany) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.selectCompany(nameCompany);
        return this;
    }

    /**
     * Проставляем чекбокс заказа билетов
     */
    @Step("Проставляем чек-бокс, у поля заказа билетов")
    public CreateBusinessTripSteps selectOrderTickets() {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.selectOrderTickets();
        return this;
    }

    /**
     * Заполняем поле город выбытия
     *
     * @param nameCity Город
     */
    @Step("Заполняем поле город выбытия, значением: \"{0}\"")
    public CreateBusinessTripSteps fieldDepartureCity(String nameCity) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.fieldDepartureCity(nameCity);
        return this;
    }

    /**
     * Заполняем поле город прибытия
     *
     * @param nameCity Город
     */
    @Step("Заполняем поле город выбытия, прибытия: \"{0}\"")
    public CreateBusinessTripSteps fieldArrivalCity(String nameCity) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.fieldArrivalCity(nameCity);
        return this;
    }

    /**
     * Заполняем поле планируемая дата выезда
     *
     * @param date Дата
     */
    @Step("Заполняем поле дата выезда")
    public CreateBusinessTripSteps fieldDepartureDatePlan(LocalDate date) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.fieldDepartureDatePlan(date);
        return this;
    }

    /**
     * Заполняем поле планируемая дата возвращения
     *
     * @param date Дата
     */
    @Step("Заполняем поле дата возвращения")
    public CreateBusinessTripSteps fieldReturnDatePlan(LocalDate date) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.fieldReturnDatePlan(date);
        return this;
    }

    /**
     * Нажимаем на кнопку сохранения
     */
    @Step("Нажимаем на кнопку сохранить и выйти")
    public CreateBusinessTripSteps clickSaveBtn() {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.clickBtnSaveAndExit();
        return this;
    }


    /**
     * Проверяем заполненные поля в форме
     *
     * @param nameField наименование поля
     * @param value     ожидаемое значение
     */
    @Step("Проверяем, что в поле \"{0}\", введено значение \"{1}\"")
    public CreateBusinessTripSteps checkField(String nameField, String value) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.checkField(nameField, value);
        return this;
    }

    /**
     * Проверяем что ошибки есть на странице
     *
     * @param errorText текст ошибки
     */
    @Step("Проверяем, что на странице отображается ошибка(и): \"{0}\"")
    public CreateBusinessTripSteps checkErrorMessage(String errorText) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.checkError(errorText);
        return this;
    }
}
