package praktikum;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class MainPage {

    //главная страница
    //локатор кнопки авторизации в шапке
    @FindBy(how = How.XPATH,using = ".//p[contains(@class,'AppHeader_header__linkText__3q_va ml-2') and contains(text(),'Личный Кабинет')]")
    private SelenideElement orderTopBottom;
    //локатор кнопки авторизации в футере
    @FindBy(how = How.XPATH, using = ".//button[contains(@class,'button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg') and contains(text(),'Войти в аккаунт')]")
    private SelenideElement orderButtonBottom;
    //локатор поля соглашения cookie
    @FindBy(how = How.XPATH,using = ".//div[text() = 'Зарегистрироваться']")
    private SelenideElement singUp;


    //метод клика по кнопке заказа в шапке сайта
    public void clickOrderButtonTop() {
        orderButtonTop.click();
    }

    //метод клика по кнопке заказа в футере сайта
    public void clickOrderButtonBottom() {
        orderButtonBottom.scrollIntoView(true).shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    //метод поля соглашения cookie
    public void clickCookieButton() {
        if (cookieButton.exists()) {
            cookieButton.click();
        }
    }
//блок вопросов и ответов
}
