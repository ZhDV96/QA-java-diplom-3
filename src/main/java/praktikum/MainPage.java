package praktikum;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.time.Duration;
import static com.codeborne.selenide.Condition.attribute;
import io.qameta.allure.Step;

public class MainPage {

    //главная страница
    //локатор кнопки авторизации в хэдере
    @FindBy(how = How.XPATH,using = ".//p[contains(@class,'AppHeader_header__linkText__3q_va ml-2') and contains(text(),'Личный Кабинет')]")
    private SelenideElement orderTopBottom;
    //локатор кнопки авторизации в футере
    @FindBy(how = How.XPATH, using = ".//button[contains(@class,'button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg') and contains(text(),'Войти в аккаунт')]")
    private SelenideElement orderButtonBottom;
    //локатор панели "Булки" выбора ингредиентов раздела "Конструктор"
    @FindBy(how = How.XPATH, using = ".//div/main/section[1]/div[1]/div[1]")
    private SelenideElement constructorTabBuns;
    //локатор панели "Соусы" выбора ингредиентов раздела "Конструктор"
    @FindBy(how = How.XPATH, using = ".//div/main/section[1]/div[1]/div[2]")
    private SelenideElement constructorTabSauces;
    //локатор панели "Начинки" выбора ингредиентов раздела "Конструктор"
    @FindBy(how = How.XPATH, using = ".//div/main/section[1]/div[1]/div[3]")
    private SelenideElement constructorTabFillings;
    //локатор элемента колекции "булки" раздела "Конструктор"
    @FindBy(how = How.XPATH, using = ".//section[1]/div[2]/ul[1]/a/p")
    private ElementsCollection bunsCollection;
    //локатор элемента колекции "соусы" раздела "Конструктор"
    @FindBy(how = How.XPATH, using = ".//section[1]/div[2]/ul[2]/a/p")
    private ElementsCollection sauceCollection;
    //локатор элемента колекции "начинка" раздела "Конструктор"
    @FindBy(how = How.XPATH, using = ".//section[1]/div[2]/ul[3]/a/p")
    private ElementsCollection fillingCollection;
    //локатор кнопки "Сделать заказ"
    @FindBy(how = How.XPATH, using = ".//button[text()='Оформить заказ']")
    private SelenideElement makeAnOrderButton;


    //метод получения коллекции "Булки"
    @Step("Получение коллекции элементов из списка 'Булки'")
    public ElementsCollection getBunsCollection() {
        return bunsCollection;
    }

    //метод получения коллекции "Соусы"
    @Step("Получение коллекции элементов из списка 'Соусы'")
    public ElementsCollection getSauceCollection() {
        return sauceCollection;
    }

    //метод получения коллекции "Начинка"
    @Step("Получение коллекции элементов из списка 'Начинка'")
    public ElementsCollection getFillingCollection() {
        return fillingCollection;
    }

    //метод проверки активации вкладки
    @Step("Метод проверки возможности активации вкладки 'Булки'")
    public void clickConstructorTabBunsAndCheckStatus() {
        constructorTabBuns.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
        constructorTabBuns.shouldHave(attribute("class", "tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect"));
    }

    //метод проверки активации вкладки
    @Step("Метод проверки возможности активации вкладки 'Соусы'")
    public void clickConstructorTabSaucesAndCheckStatus() {
        constructorTabSauces.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
        constructorTabSauces.shouldHave(attribute("class", "tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect"));
    }

    //метод проверки активации вкладки
    @Step("Метод проверки возможности активации вкладки 'Начинка'")
    public void clickConstructorTabFillingsAndCheckStatus() {
        constructorTabFillings.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
        constructorTabFillings.shouldHave(attribute("class", "tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect"));
    }

    //метод клика по кнопке авторизации в шапке сайта
    @Step("Метод клика по кнопке авторизации в шапке сайта")
    public void clickAuthorizationTopButton() {
        orderTopBottom.click();
    }

    //метод клика по кнопке авторизации в шапке сайта
    @Step("Метод клика по кнопке 'Войти'")
    public void clickAuthorizationBottomButton() {
        orderButtonBottom.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    @Step("Проверка наличия кнопки 'Сделать заказ' на главной странице")
    public void checkMakeAnOrderButton() {
        makeAnOrderButton.shouldBe(Condition.appear, Duration.ofSeconds(8000));
    }

}
