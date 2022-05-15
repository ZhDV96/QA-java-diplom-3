package praktikum;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.time.Duration;
import static com.codeborne.selenide.Condition.attribute;

public class ForgotPasswordPage {

    //локатор кнопки авторизации
    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    private SelenideElement signInForgotPasswordPage;

    //локатор перехода на страницу авторизации
    public void clickSignInForgotPasswordPage() {
        signInForgotPasswordPage.scrollIntoView(true).click();
    }

}
