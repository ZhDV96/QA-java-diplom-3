package praktikum;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import praktikum.MainPage;

public class OrderPage extends MainPage {
    //локатор поля ввода имени
    @FindBy(how = How.XPATH,using = ".//div[text()='Имя']/input[@name = 'name']")
    private SelenideElement nameField;
    //локатор поля ввода фамилии
    @FindBy(how = How.XPATH,using = ".//div[text()='Email']/input[@name = 'name']")
    private SelenideElement emailField;
    @FindBy(how = How.XPATH,using = ".//div[text()='Пароль']/input[@type = 'password']")
    private SelenideElement surnameField;
    //локатор поля ввода адреса
    @FindBy(how = How.XPATH,using = ".//input[@placeholder = '* Адрес: куда привезти заказ']")
    private SelenideElement addressField;
    //локатор поля ввода номера
    @FindBy(how = How.XPATH,using = ".//input[@placeholder = '* Телефон: на него позвонит курьер']")
    private SelenideElement phoneNumberField;
    //локатор поля ввода станции метро
    @FindBy(how = How.XPATH,using = ".//input[@placeholder = '* Станция метро']")
    private SelenideElement metroStationField;
    //локатор выбора станции метро
    @FindBy(how = How.XPATH,using = ".//div[text()='Черкизовская']")
    private SelenideElement metroStationButton;
    @FindBy(how = How.XPATH,using = ".//div[text()='Сокольники']")
    private SelenideElement metroStationButtonTwo;
    //локатор кнопки далее первой формы заказа
    @FindBy(how = How.XPATH,using = "html/body/div/div/div/div/button[text() = 'Далее']")
    private SelenideElement orderButtonNext;


    //вторая форма заказа
    //локатор поля выбора даты
    @FindBy(how = How.XPATH,using = ".//input[@placeholder = '* Когда привезти самокат']")
    private SelenideElement timeField;
    //локатор поля выбора кнопки даты
    @FindBy(how = How.XPATH,using = ".//div[@aria-label = 'Choose среда, 16-е февраля 2022 г.']")
    private SelenideElement pickTimeField;
    //локатор поля выбора кнопки даты для набора 2
    @FindBy(how = How.XPATH,using = ".//div[@aria-label = 'Choose четверг, 17-е февраля 2022 г.']")
    private SelenideElement pickTimeFieldTwo;
    //локатор поля выбра срока аренды
    @FindBy(how = How.XPATH,using = ".//div[text()='* Срок аренды']")
    private SelenideElement timePeriodField;
    //локатор поля выпадающего списка срока аренды
    @FindBy(how = How.XPATH,using = ".//div[text()='сутки']")
    private SelenideElement pickTimePeriodField;
    //локатор поля выпадающего списка срока аренды для набора 2
    @FindBy(how = How.XPATH,using = ".//div[text()='двое суток']")
    private SelenideElement pickTimePeriodFieldTwo;
    //локатор поля выбора цвета самоката
    @FindBy(how = How.ID,using = "black")
    private SelenideElement pickColor;
    //локатор поля выбора цвета самоката для набора 2
    @FindBy(how = How.ID,using = "grey")
    private SelenideElement pickColorTwo;
    //локатор заполнения поля для комментария
    @FindBy(how = How.XPATH,using = ".//input[@placeholder = 'Комментарий для курьера']")
    private SelenideElement shortNote;
    //локатор кнопки далее втрой формы заказа
    @FindBy(how = How.XPATH,using = ".//div[@class = 'Order_Buttons__1xGrp']/button[text() = 'Заказать']")
    private SelenideElement secondNextButton;
    //локатор кнопки далее третьей формы заказа
    @FindBy(how = How.XPATH,using = ".//div[@class = 'Order_Buttons__1xGrp']/button[text() = 'Да']")
    private SelenideElement thirdNextButton;


    //первая форма заказа


    //метод заполнения поля ввода имя
    public void setNameField(String name) {
        nameField.setValue(name);
    }
    //метод заполнения поля ввода фамилии
    public void setSurnameField(String surname) {
        surnameField.setValue(surname);
    }
    //метод заполнения поля ввода адреса
    public void setAddressField(String address) {
        addressField.setValue(address);
    }
    //метод заполнения поля ввода телефон
    public void setPhoneNumberField(String phone) {
        phoneNumberField.setValue(phone);
    }
    //метод заполнения поля станции метро
    public void setMetroStationField(String metro) {
        metroStationField.setValue(metro);
    }
    //метод выбора станции метро в списке первого набора данных
    public void clickMetroStationButton() {
        metroStationButton.click();
    }
    //метод выбора станции метро в списке второго набора данных
    public void clickMetroStationButtonTwo() {
        metroStationButtonTwo.click();
    }
    //метод клика по кнопке заказать
    public void clickOrderButtonNext() {
        orderButtonNext.click();
    }
    //метод клика кнопки далее третьей формы
    public void pickThirdNextButton() {
        thirdNextButton.click();
    }

    //группа методов для заказа с помощью кнопки "заказать" в хэдере
    //метод оформения заказа: объединяет ввод данных и клик по кнопке далее для первого набора даннных
    public void order(String name, String surname, String address, String phone, String metro){
        clickOrderButtonTop();
        setNameField(name);
        setSurnameField(surname);
        setAddressField(address);
        setPhoneNumberField(phone);
        setMetroStationField(metro);
        clickMetroStationButton();
        clickOrderButtonNext();
    }
    //метод оформения заказа: объединяет ввод данных и клик по кнопке далее для второго набора даннных
    public void orderTwo(String name, String surname, String address, String phone, String metro){
        clickOrderButtonTop();
        setNameField(name);
        setSurnameField(surname);
        setAddressField(address);
        setPhoneNumberField(phone);
        setMetroStationField(metro);
        clickMetroStationButtonTwo();
        clickOrderButtonNext();
    }


    //группа методов для заказа с помощью кнопки "заказать" в хэдере
    //метод оформения заказа: объединяет ввод данных и клик по кнопке далее для первого набора даннных
    public void orderButtonBottom(String name, String surname, String address, String phone, String metro){
        clickOrderButtonBottom();
        setNameField(name);
        setSurnameField(surname);
        setAddressField(address);
        setPhoneNumberField(phone);
        setMetroStationField(metro);
        clickMetroStationButton();
        clickOrderButtonNext();
    }
    //метод оформения заказа: объединяет ввод данных и клик по кнопке далее для второго набора даннных
    public void orderTwoButtonBottom(String name, String surname, String address, String phone, String metro){
        clickOrderButtonBottom();
        setNameField(name);
        setSurnameField(surname);
        setAddressField(address);
        setPhoneNumberField(phone);
        setMetroStationField(metro);
        clickMetroStationButtonTwo();
        clickOrderButtonNext();
    }


    //вторая форма заказа
    //метод открытия календаря
    public void pickTimeField() {
        timeField.scrollIntoView(true).click();
    }
    //метод выбора даты в календаре для первого набора данных
    public void buttonPickTimeField() {
        pickTimeField.click();
    }
    //метод выбора даты в календаре для второго набора данных
    public void buttonPickTimeFieldTwo() {
        pickTimeFieldTwo.click();
    }
    //метод открытия списка аренды
    public void pickTimePeriodField() {
        timePeriodField.click();
    }
    //метод выбора срока аренды  для первого набора данных
    public void buttonPickTimePeriodField() {
        pickTimePeriodField.click();
    }
    //метод выбора срока аренды  для второго набора данных
    public void buttonPickTimePeriodFieldTwo() {
        pickTimePeriodFieldTwo.click();
    }
    //метод выбора цвета самоката  для первого набора данных
    public void pickColorButton() {
        pickColor.click();
    }
    //метод выбора цвета самоката  для второго набора данных
    public void pickColorButtonTwo() {
        pickColorTwo.click();
    }
    //метод заполнения поля комментария
    public void setShortNote(String note) {
        shortNote.setValue(note);
    }
    //метод клика кнопки далее второй формы
    public void pickSecondNextButton() {
        secondNextButton.click();
    }


    //метод заполнения второй формы заказа для первого набора данных
    public void orderNext(String note) {
        pickTimeField();
        buttonPickTimeField();
        pickTimePeriodField();
        buttonPickTimePeriodField();
        pickColorButton();
        setShortNote(note);
        pickSecondNextButton();
        pickThirdNextButton();
    }

    //метод заполнения второй формы заказа для первого набора данных
    public void orderNextTwo(String note) {
        pickTimeField();
        buttonPickTimeFieldTwo();
        pickTimePeriodField();
        buttonPickTimePeriodFieldTwo();
        pickColorButtonTwo();
        setShortNote(note);
        pickSecondNextButton();
        pickThirdNextButton();
    }
}
