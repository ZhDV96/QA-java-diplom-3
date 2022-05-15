package praktikum;
import com.codeborne.selenide.Configuration;
import org.apache.commons.lang3.RandomStringUtils;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.containsString;

public class AuthorizationCustomerTest {

    // открывается страница и создаётся экземпляр класса страницы
    MainPage mainPage = page(MainPage.class);
    ProfilePage profilePage = page(ProfilePage.class);
    LoginPage loginPage = page(LoginPage.class);
    RegisterPage registerPage = page(RegisterPage.class);
    ForgotPasswordPage forgotPasswordPage = page(ForgotPasswordPage.class);
    String email = "alabai@yandex.ru";
    String password = "woofwoof";

    @Before
    public void setBrowser() {
        //открытие главной страницы сервиса в браузере и переход к форме заказа
        Configuration.browser = "edge";
        open("https://stellarburgers.nomoreparties.site/");
    }

    //тест на возможность оформления заказа в сервисе через браузер Chrome с первым набором данных
    @Test
    public void authorizationOnLoginPage() {
        //теста, проверяющий возможность регистрации
        mainPage.clickAuthorizationBottomButton();
        loginPage.signInLoginPage(email, password);
        mainPage.clickAuthorizationTopButton();
        String actualText = profilePage.waitingForDescriptionText();
        String expectedText = "В этом разделе вы можете изменить свои персональные данные";
        String actualName = profilePage.waitingForTextOne();
        String expectedName = "Алабай";
        MatcherAssert.assertThat(actualText, containsString(expectedText));
        MatcherAssert.assertThat(actualName, containsString(expectedName));
    }

    //тест на возможность оформления заказа в сервисе через браузер Chrome с первым набором данных
    @Test
    public void authorizationThroughAuthorizationButton() {
        //теста, проверяющий возможность регистрации
        mainPage.clickAuthorizationTopButton();
        loginPage.signInLoginPage(email, password);
        mainPage.clickAuthorizationTopButton();
        String actualText = profilePage.waitingForDescriptionText();
        String expectedText = "В этом разделе вы можете изменить свои персональные данные";
        String actualName = profilePage.waitingForTextOne();
        String expectedName = "Алабай";
        MatcherAssert.assertThat(actualText, containsString(expectedText));
        MatcherAssert.assertThat(actualName, containsString(expectedName));
    }
    @Test
    public void authorizationThroughRegistrationPage() {
        //теста, проверяющий возможность регистрации
        mainPage.clickAuthorizationTopButton();
        loginPage.clickSingUpButtonOnLoginPage();
        registerPage.clickSignUpRegisterPage();
        loginPage.signInLoginPage(email, password);
        mainPage.clickAuthorizationTopButton();
        String actualText = profilePage.waitingForDescriptionText();
        String expectedText = "В этом разделе вы можете изменить свои персональные данные";
        String actualName = profilePage.waitingForTextOne();
        String expectedName = "Алабай";
        MatcherAssert.assertThat(actualText, containsString(expectedText));
        MatcherAssert.assertThat(actualName, containsString(expectedName));
    }
    @Test
    public void authorizationThroughForgotPasswordPage() {
        //теста, проверяющий возможность регистрации
        mainPage.clickAuthorizationTopButton();
        loginPage.clickRecoverPasswordLink();
        forgotPasswordPage.clickSignInForgotPasswordPage();
        loginPage.signInLoginPage(email, password);
        mainPage.clickAuthorizationTopButton();
        String actualText = profilePage.waitingForDescriptionText();
        String expectedText = "В этом разделе вы можете изменить свои персональные данные";
        String actualName = profilePage.waitingForTextOne();
        String expectedName = "Алабай";
        MatcherAssert.assertThat(actualText, containsString(expectedText));
        MatcherAssert.assertThat(actualName, containsString(expectedName));
    }


    @After
    public void teardown() {
        // Выход из аккаунта и закрытие браузера
        profilePage.signingOutFromAccount();
        closeWindow();
    }

}
