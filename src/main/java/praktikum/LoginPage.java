package praktikum;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.time.Duration;
import io.qameta.allure.Step;

public class LoginPage {

    //страница авторизации
    //локатор сслыки на страницу восстановления пароля
    @FindBy(how = How.XPATH,using = ".//a[text() = 'Восстановить пароль']")
    private SelenideElement recoverPasswordLink;
    //локатор кнопки регистрации
    @FindBy(how = How.XPATH,using = ".//a[text() = 'Зарегистрироваться']")
    private SelenideElement singUpLoginPage;
    //локатор кнопки авторизации
    @FindBy(how = How.XPATH, using = ".//button[text()='Войти']")
    private SelenideElement signInLoginPage;
    //локатор поля ввода email
    @FindBy(how = How.XPATH,using = ".//fieldset[1]//input")
    private SelenideElement loginEmailField;
    //локатор поля ввода пароля
    @FindBy(how = How.XPATH,using = ".//input[@type='password']")
    private SelenideElement loginPasswordField;
    //локатор лого в хэдере
    @FindBy(how = How.XPATH,using = ".//div[@class = 'AppHeader_header__logo__2D0X2']/a")
    private SelenideElement logoMainPageLink;

    @Step("Клик по ссылке 'Конструктор', ведущей на главную страницу")
    public void logoMainPageLink() {
        logoMainPageLink.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    @Step("Проверка наличия кнопки авторизации на странице авторизации")
    public void checkSingInButtonOnLoginPage() {
        signInLoginPage.shouldBe(Condition.appear, Duration.ofSeconds(8000));
    }

    @Step("Метод заполнения полей email и пароль для аворизации")
    public void signInLoginPage(String email, String password) {
        setLoginEmailField(email);
        setLoginPasswordField(password);
        clickSingInButtonOnLoginPage();
    }

    @Step("Клик по кнопке регистрации на странице авторизации")
    public void clickSingUpButtonOnLoginPage() {
        singUpLoginPage.scrollIntoView(true).click();
    }

    @Step("Клик по кнопке 'Восстановить пароль' на странице авторизации")
    public void clickRecoverPasswordLink() {
        recoverPasswordLink.scrollIntoView(true).click();
    }

    @Step("Клик по кнопке авторизации на странице авторизации")
    public void clickSingInButtonOnLoginPage() {
        signInLoginPage.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    @Step("Заполнение поля email")
    public void setLoginEmailField(String email) {
        loginEmailField.setValue(email);
    }

    @Step("Заполнение поля пароль")
    //метод заполнения поля пароля
    public void setLoginPasswordField(String password) {
        loginPasswordField.setValue(password);
    }


}
