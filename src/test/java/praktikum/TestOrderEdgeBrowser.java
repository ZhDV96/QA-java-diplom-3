package praktikum;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.codeborne.selenide.Configuration;
import static org.hamcrest.CoreMatchers.containsString;
import org.hamcrest.MatcherAssert;
import ru.yandex.praktikum.OrderPage;

import static com.codeborne.selenide.Selenide.*;

public class TestOrderEdgeBrowser {
    // открывается страница и создаётся экземпляр класса страницы
    OrderPage orderPage = page(OrderPage.class);

    @Before
    public void setBrowser() {
        //открытие главной страницы сервиса в браузере и переход к форме заказа
        Configuration.browser = "edge";
        open("https://stellarburgers.nomoreparties.site/");
    }

    //тест на возможность оформления заказа в сервисе через браузер Chrome с первым набором данных
    @Test
    public void testOrderData1 () {
        //первая часть теста, где проверяется возможность заполнения полей формы заказа
        orderPage.orderButtonBottom("Иван", "Иванов", "ул. Машиностроителей, д.30, стр.1", "+79999999999", "Черкизовская");
        orderPage.orderNext("Предупредите, пожалуйста, за 15 минут до доставки");
        //вторая часть теста, где проверяется наличие id заказа и возможность перехода на страницу трекинга заказа
        ResultOrderPage pageResult = page(ResultOrderPage.class);
        String actualText = pageResult.getTextResultOrder();
        String expectedText = "Заказ оформлен";
        MatcherAssert.assertThat(actualText, containsString(expectedText));
        pageResult.pickStatusNextButton();
    }


    @After
    public void teardown() {
        // Закрыть браузер
        closeWindow();
    }
}
