package praktikum;
import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Description;

public class ConstructorSwitcherTest {

    String[] answersBuns = {
            "Флюоресцентная булка R2-D3",
            "Краторная булка N-200i"
    };

    String[] answersSauces = {
            "Соус Spicy-X",
            "Соус фирменный Space Sauce",
            "Соус традиционный галактический",
            "Соус с шипами Антарианского плоскоходца"
    };

    String[] answersFillings = {
            "Мясо бессмертных моллюсков Protostomia",
            "Говяжий метеорит (отбивная)",
            "Биокотлета из марсианской Магнолии",
            "Филе Люминесцентного тетраодонтимформа",
    };

    @Before
    public void setBrowser() {
        //открытие главной страницы
        Configuration.browser = "edge";
        open("https://stellarburgers.nomoreparties.site/");
    }

    @DisplayName("Проверка возможности переключения вкладок конструктора ингредиентов заказа")
    @Description("Тест, проверяющий возмжность возможность переключения вкладок конструктора и корректности названий ингредиентов")
    @Test
    public void comparingIngredientsListNamesTest () {

        //тесты, проверяющие возможность переключения вкладок и корректность названий ингредиентов
        MainPage mainPage = page(MainPage.class);

        mainPage.clickConstructorTabFillingsAndCheckStatus();
        ElementsCollection fillingCollection = mainPage.getFillingCollection();
        System.out.println(fillingCollection);
        for (int i = 0; i < answersFillings.length; i++) {
            fillingCollection.get(i).shouldBe(visible).shouldHave(exactText(answersFillings[i]));
        }

        mainPage.clickConstructorTabSaucesAndCheckStatus();
        ElementsCollection saucesCollection = mainPage.getSauceCollection();
        System.out.println(saucesCollection);
        for (int i = 0; i < answersSauces.length; i++) {
            saucesCollection.get(i).shouldBe(visible).shouldHave(exactText(answersSauces[i]));
        }

        mainPage.clickConstructorTabBunsAndCheckStatus();
        ElementsCollection bunsCollection = mainPage.getBunsCollection();
        System.out.println(bunsCollection);
        for (int i = 0; i < answersBuns.length; i++) {
            bunsCollection.get(i).shouldBe(visible).shouldHave(exactText(answersBuns[i]));
        }

    }

    @After
    public void teardown() {
        // Закрыть браузер
        closeWindow();
    }
}
