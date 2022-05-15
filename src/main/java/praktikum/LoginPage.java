package praktikum;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.time.Duration;

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

    public void logoMainPageLink() {
        logoMainPageLink.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    public void checkSingInButtonOnLoginPage() {
        signInLoginPage.shouldBe(Condition.appear, Duration.ofSeconds(8000));
    }

    public void signInLoginPage(String email, String password) {
        setLoginEmailField(email);
        setLoginPasswordField(password);
        clickSingInButtonOnLoginPage();
    }

    public void clickSingUpButtonOnLoginPage() {
        singUpLoginPage.scrollIntoView(true).click();
    }

    public void clickRecoverPasswordLink() {
        recoverPasswordLink.scrollIntoView(true).click();
    }

    public void clickSingInButtonOnLoginPage() {
        signInLoginPage.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    public void setLoginEmailField(String email) {
        loginEmailField.setValue(email);
    }

    //метод заполнения поля пароля
    public void setLoginPasswordField(String password) {
        loginPasswordField.setValue(password);
    }


}
