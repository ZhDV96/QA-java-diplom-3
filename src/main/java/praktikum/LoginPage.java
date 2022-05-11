package praktikum;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    //локатор кнопки регистрации
    @FindBy(how = How.XPATH,using = ".//a[text() = 'Зарегистрироваться']")
    private SelenideElement singUpLoginPage;
    @FindBy(how = How.XPATH, using = ".//button[text()='Войти']")
    private SelenideElement signInLoginPage;
    //локатор поля ввода email
    @FindBy(how = How.XPATH,using = ".//fieldset[1]//input")
    private SelenideElement loginEmailField;
    //локатор поля ввода пароля
    @FindBy(how = How.XPATH,using = ".//input[@type='password']")
    private SelenideElement loginPasswordField;

    public void clickSingUpButtonOnLoginPage() {
        singUpLoginPage.scrollIntoView(true).click();
    }

    public void clickSingInButtonOnLoginPage() {
        signInLoginPage.scrollIntoView(true).click();
    }

    public void setLoginEmailField(String email) {
        loginEmailField.setValue(email);
    }

    public void setLoginPasswordField(String password) {
        loginPasswordField.setValue(password);
    }


}
