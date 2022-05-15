package praktikum;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class RegisterPage extends LoginPage {

    //страница регистрации
    //локатор поля ввода имени
    @FindBy(how = How.XPATH,using = ".//fieldset[1]//input")
    private SelenideElement registerNameField;
    //локатор поля ввода email
    @FindBy(how = How.XPATH,using = ".//fieldset[2]//input")
    private SelenideElement registerEmailField;
    //локатор поля ввода пароля
    @FindBy(how = How.XPATH,using = ".//input[@type='password']")
    private SelenideElement registerPasswordField;
    //локатор кнопки подтверждения регистрации
    @FindBy(how = How.XPATH,using = ".//button[text()='Зарегистрироваться']")
    private SelenideElement confirmRegistrationButton;
    //локатор ссылки на страницу авторизации
    @FindBy(how = How.XPATH,using = ".//a[text()='Войти']")
    private SelenideElement signUpRegisterPage;
    //локатор оповещения о некорректном пароле
    @FindBy(how = How.XPATH,using = ".//fieldset[3]/div/p")
    private SelenideElement incorrectPasswordNotification;


    //метод заполнения поля ввода имя
    public void setNameField(String name) {
        registerNameField.setValue(name);
    }
    //метод заполнения поля ввода email
    public void setSurnameField(String email) {
        registerEmailField.setValue(email);
    }
    //метод заполнения поля ввода пароля
    public void setAddressField(String password) {
        registerPasswordField.setValue(password);
    }
    //метод клика по кнопке регистрации с указанными данными
    public void clickConfirmationButton() {
        confirmRegistrationButton.click();
    }
    //метод клика по кнопке регистрации с указанными данными
    public void clickSignUpRegisterPage() {
        signUpRegisterPage.click();
    }
    //метод клика по кнопке регистрации с указанными данными
    public String checkNotificationIncorrectValue() {
        incorrectPasswordNotification.shouldBe(Condition.appear, Duration.ofSeconds(8000));
        return incorrectPasswordNotification.getText();
    }

    //группа методов для заказа с помощью кнопки "войти" в хэдере
    //метод оформения заказа: объединяет ввод данных и клик по кнопке далее для первого набора даннных
    public void registerAndAuthorization(String name, String email, String password) {
        setNameField(name);
        setSurnameField(email);
        setAddressField(password);
        clickConfirmationButton();
    }
    //метод оформения заказа: объединяет ввод данных и клик по кнопке "Зарегистрировать" для первого набора даннных
    public void registerWithIncorrectValue(String name, String email, String password) {
        setNameField(name);
        setSurnameField(email);
        setAddressField(password);
        clickConfirmationButton();
    }

}
