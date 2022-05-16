package praktikum;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.time.Duration;
import io.qameta.allure.Step;

public class ProfilePage {

    //локатор кнопки перехода в конструктор через лого со страницы профиля
    @FindBy(how = How.XPATH,using = ".//header/nav/div/a")
    private SelenideElement profileConstructorLogoLink;
    //локатор кнопки перехода в конструктор со страницы профиля
    @FindBy(how = How.XPATH,using = ".//div/header/nav/ul/li[1]/a")
    private SelenideElement profileConstructorLink;
    //локатор 1 пункта списка ссылок меню профиля
    @FindBy(how = How.XPATH,using = ".//a[text()='Профиль']")
    private SelenideElement profileEditingLink;
    //локатор панели с описанием раздела редактирования профиля
    @FindBy(how = How.XPATH,using = ".//p[@class = 'Account_text__fZAIn text text_type_main-default']")
    private SelenideElement profileDescriptionPanel;
    //лоактор поля ввода и реадктирования имени пользователя
    @FindBy(how = How.XPATH,using = ".//li[1]//input")
    private SelenideElement profileNameEditingField;
    //лоактор поля ввода и реадктирования имени пользователя
    @FindBy(how = How.XPATH,using = ".//li[2]//input")
    private SelenideElement profileEmailEditingField;
    //лоактор поля ввода и реадктирования имени пользователя
    @FindBy(how = How.XPATH,using = ".//li[3]//input")
    private SelenideElement profilePasswordEditingField;
    //лоактор поля ввода и реадктирования имени пользователя
    @FindBy(how = How.XPATH,using = ".//button[text() = 'Выход']")
    private SelenideElement profileSignOutLink;

    @Step("Клик по лого сайта в хэдере на странице аккаунта")
    public void clickProfileConstructorLogoLink() {
        profileConstructorLogoLink.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    @Step("Клик по ссылке 'Конструктор' в хэдере на странице аккаунта")
    public void clickProfileConstructorLink() {
        profileConstructorLink.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    @Step("Метод выхода их аккаунта")
    public void signingOutFromAccount() {
        profileSignOutLink.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    @Step("Проверка наличия текста описания на странице профиля")
    public String waitingForDescriptionText() {
        profileDescriptionPanel.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
        return profileDescriptionPanel.getText();
    }

    @Step("Проверка наличия текста имени пользователя на странице профиля")
    public String waitingForTextOne() {
        profileNameEditingField.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
        return profileNameEditingField.getValue().toString();
    }


}
