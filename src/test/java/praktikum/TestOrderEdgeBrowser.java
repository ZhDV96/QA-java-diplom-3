package praktikum;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.codeborne.selenide.Configuration;
import static org.hamcrest.CoreMatchers.containsString;
import org.hamcrest.MatcherAssert;
import praktikum.LoginPage;
import praktikum.ProfilePage;
import praktikum.MainPage;

import static com.codeborne.selenide.Selenide.*;

public class TestOrderEdgeBrowser {
    // открывается страница и создаётся экземпляр класса страницы
    RegisterPage registerPage = page(RegisterPage.class);

    @Before
    public void setBrowser() {
        //открытие главной страницы сервиса в браузере и переход к форме заказа
        Configuration.browser = "edge";
        open("https://stellarburgers.nomoreparties.site/");
    }

    //тест на возможность оформления заказа в сервисе через браузер Chrome с первым набором данных
    @Test
    public void testOrderData1 () {
        //теста, проверяющий возможность регистрации
        MainPage mainPage = page(MainPage.class);
        ProfilePage profilePage = page(ProfilePage.class);
        mainPage.clickAuthorizationTopButton();
        registerPage.registerAndAuthorization("ZhD60191", "m2ilerlx29@gmail.com", "Adulil6336");
        mainPage.clickAuthorizationTopButton();
        String actualText = profilePage.waitingForDescriptionText();
        String expectedText = "В этом разделе вы можете изменить свои персональные данные";
        MatcherAssert.assertThat(actualText, containsString(expectedText));
    }


    @After
    public void teardown() {
        // Закрыть браузер
        closeWindow();
    }
}
