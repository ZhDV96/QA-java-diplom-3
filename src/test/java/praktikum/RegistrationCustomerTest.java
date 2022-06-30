package praktikum;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.codeborne.selenide.Configuration;
import static org.hamcrest.CoreMatchers.containsString;
import org.hamcrest.MatcherAssert;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationCustomerTest {
    // открывается страница и создаётся экземпляр класса страницы
    MainPage mainPage = page(MainPage.class);
    ProfilePage profilePage = page(ProfilePage.class);
    LoginPage loginPage = page(LoginPage.class);
    RegisterPage registerPage = page(RegisterPage.class);
    CustomerDataGenerator customerGenerator = new CustomerDataGenerator();
    Customer firstCustomer = customerGenerator.getRandom();
    Customer secondCustomer = customerGenerator.getRandom();
    String invalidPassword = RandomStringUtils.randomAlphabetic(4);

    @Before
    public void setBrowser() {
        //открытие главной страницы сервиса в браузере и переход к форме заказа
        Configuration.browser = "edge";
        open("https://stellarburgers.nomoreparties.site/");
    }

    //тест на возможность оформления заказа в сервисе через браузер Chrome с первым набором данных
    @DisplayName("Авторизация пользователя с валидными данными")
    @Description("Тест, проверяющий возмжность регистрации пользователя с валидными данными")
    @Test
    public void registerCustomerWithValidData() {
        //теста, проверяющий возможность регистрации
        mainPage.clickAuthorizationTopButton();
        String name = firstCustomer.getName();
        String email =firstCustomer.getEmail();
        String password = firstCustomer.getPassword();
        loginPage.clickSingUpButtonOnLoginPage();
        registerPage.registerAndAuthorization(name, email, password);
        loginPage.signInLoginPage(email, password);
        mainPage.clickAuthorizationTopButton();
        String actualText = profilePage.waitingForDescriptionText();
        String expectedText = "В этом разделе вы можете изменить свои персональные данные";
        String actualName = profilePage.waitingForTextOne();
        String expectedName = firstCustomer.getName();
        MatcherAssert.assertThat(actualText, containsString(expectedText));
        MatcherAssert.assertThat(actualName, containsString(expectedName));
    }

    @DisplayName("Авторизация пользователя с невалидными данными")
    @Description("Тест, проверяющий возмжность авторизации пользователя с невалидными данными - пароль короче 6 символов")
    @Test
    public void registerCustomerWithInvalidData() {
        //теста, проверяющий возможность регистрации
        mainPage.clickAuthorizationTopButton();
        String name = secondCustomer.getName();
        String email =secondCustomer.getEmail();
        String password = invalidPassword;
        loginPage.clickSingUpButtonOnLoginPage();
        registerPage.registerWithIncorrectValue(name, email, password);
        String actualText = registerPage.checkNotificationIncorrectValue();
        String expectedText = "Некорректный пароль";
        MatcherAssert.assertThat(actualText, containsString(expectedText));
    }


    @After
    public void teardown() {
        // Закрыть браузер
        closeWindow();
    }
}
