package praktikum;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import io.qameta.allure.Step;

public class ForgotPasswordPage {

    //локатор кнопки авторизации
    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    private SelenideElement signInForgotPasswordPage;

    //локатор перехода на страницу авторизации
    @Step("Клик по кнопке авторизации на странице восстановления пароля")
    public void clickSignInForgotPasswordPage() {
        signInForgotPasswordPage.scrollIntoView(true).click();
    }

}
