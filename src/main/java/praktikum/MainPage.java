package praktikum;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class MainPage {

    //главная страница
    //локатор кнопки "Закзать" в шапке
    @FindBy(how = How.XPATH, using = "html/body/div/div/div/div/div/button[text() = 'Заказать']")
    private SelenideElement orderButtonTop;
    //локатор кнопки "Закзать" в футере
    @FindBy(how = How.XPATH, using = "html/body/div/div/div/div/div/div/button[text() = 'Заказать']")
    private SelenideElement orderButtonBottom;
    //локатор поля соглашения cookie
    @FindBy(how = How.ID, using = "rcc-confirm-button")
    private SelenideElement cookieButton;
    //локатор изображения самоката
    @FindBy(how = How.ID, using = ".//div[@class = 'Home_Scooter__3YdJy']/img")
    private SelenideElement scooterImg;
    //локатор логотипа яндекс
    @FindBy(how = How.ID, using = "$x(.//img[@alt = 'Yandex'])")
    private SelenideElement yandexLogo;
    //локатор логотипа самоката
    @FindBy(how = How.ID, using = "$x(.//img[@alt = 'Scooter'])")
    private SelenideElement scooterLogo;
    //локатор логотипа яндекс+самокат
    @FindBy(how = How.ID, using = ".//div[@class = 'Header_Logo__23yGT']")
    private SelenideElement yandexSamokatLogo;
    //локатор надписи учебный тренажер
    @FindBy(how = How.ID, using = ".//div[text() = 'Учебный тренажер']")
    private SelenideElement explanationSign;
    //локатор блока соглашения cookie
    @FindBy(how = How.ID, using = ".//div[@class = 'App_CookieConsent__1yUIN']")
    private SelenideElement cookieAppBlock;
    //локатор надписи блока cookie
    @FindBy(how = How.ID, using = ".//div[text() = 'И здесь куки! В общем, мы их используем.']")
    private SelenideElement cookieBlockTitle;
    //локатор текста брифа про сервис
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_Header__iJKdX') and contains(text(),'Самокат')]")
    private SelenideElement briefText;
    //локатор кнопки посмотреть статус заказа в хэдере
    @FindBy(how = How.ID, using = ".//button[@class = 'Header_Link__1TAG7']")
    private SelenideElement trackOrderButton;
    //локатор поля ввода id заказа
    @FindBy(how = How.ID, using = ".//input[@placeholder = 'Введите номер заказа']")
    private SelenideElement trackOrderField;
    //локатор кнопки подтверждения пописка id заказа
    @FindBy(how = How.ID, using = ".//button[text() = 'Go!']")
    private SelenideElement trackOrderButtonNext;
    //локатор первого текста после скорлла
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_SubHeader__zwi_E') and contains(text(),'Привезём его прямо к вашей двери,')]")
    private SelenideElement scrollTextOne;
    //локатор второго текста после скорлла
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_SubHeader__zwi_E') and contains(text(),'Он лёгкий и')]")
    private SelenideElement scrollTextTwo;
    //локатор элемента-блока с параметрами самоката
    @FindBy(how = How.ID, using = ".//div[@class = 'Home_SecondPart__T0Okx']")
    private SelenideElement blockOfParameters;
    //локатор блока с характеристиками самоката
    @FindBy(how = How.ID, using = ".//div[@class = 'Home_Table__2kPxP']")
    private SelenideElement blockOfSpecifications;
    //локатор блока с названием модели
    @FindBy(how = How.ID, using = ".//div[@class = 'Home_Column__xlKDK']")
    private SelenideElement nameOfModel;
    //локатор названия первой характеристики
    @FindBy(how = How.ID, using = ".//div[text() = 'Максимальная скорость']")
    private SelenideElement nameOfSpecificationOne;
    //локатор первой характеристики
    @FindBy(how = How.ID, using = ".//div[text() = '40 км/ч']")
    private SelenideElement specificationOne;
    //локатор названия второй характеристики
    @FindBy(how = How.ID, using = ".//div[text() = 'Проедет без поздарядки']")
    private SelenideElement nameOfSpecificationTwo;
    //локатор второй характеристики
    @FindBy(how = How.ID, using = ".//div[text() = '80 км']")
    private SelenideElement specificationTwo;
    //локатор названия третьей характеристики
    @FindBy(how = How.ID, using = ".//div[text() = 'Выдерживает вес']")
    private SelenideElement nameOfSpecificationThree;
    //локатор третьей характеристики
    @FindBy(how = How.ID, using = ".//div[text() = '120 кг']")
    private SelenideElement specificationThree;
    //локатор подзагаловка
    @FindBy(how = How.ID, using = ".//div[text() = 'Как это работает']")
    private SelenideElement nameOfSubtitle;
    //локатор элемента "круг с цифрой 1 внутри"
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_StatusCircle__3_aTp') and contains(text(),'1')]")
    private SelenideElement graphicalCircleOne;
    //локатор элемента "круг с цифрой 2 внутри"
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_StatusCircle__3_aTp') and contains(text(),'2')]")
    private SelenideElement graphicalCircleTwo;
    //локатор элемента "круг с цифрой 3 внутри"
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_StatusCircle__3_aTp') and contains(text(),'3')]")
    private SelenideElement graphicalCircleThree;
    //локатор элемента "круг с цифрой 4 внутри"
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_StatusCircle__3_aTp') and contains(text(),'4')]")
    private SelenideElement graphicalCircleFour;
    //локатор пункта "шаг 1"
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_Status__YkfmH') and contains(text(),'Заказываете самокат')]")
    private SelenideElement stepOneName;
    //локатор описания пункта "шаг 1"
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_StatusDescription__3WGl5') and contains(text(),'Выбираете, когда')]")
    private SelenideElement stepOneDescription;
    //локатор пункта "шаг 2"
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_Status__YkfmH') and contains(text(),'Курьер привозит самокат')]")
    private SelenideElement stepTwoName;
    //локатор описания пункта "шаг 2"
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_StatusDescription__3WGl5') and contains(text(),'А вы — оплачиваете аренду')]")
    private SelenideElement stepTwoDescription;
    //локатор пункта "шаг 3"
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_Status__YkfmH') and contains(text(),'Катаетесь')]")
    private SelenideElement stepThreeName;
    //локатор описания пункта "шаг 3"
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_StatusDescription__3WGl5') and contains(text(),'Сколько часов аренды осталось — видно на сайте')]")
    private SelenideElement stepThreeDescription;
    //локатор пункта "шаг 4"
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_Status__YkfmH') and contains(text(),'Курьер забирает самокат')]")
    private SelenideElement stepFourName;
    //локатор описания пункта "шаг 4"
    @FindBy(how = How.ID, using = ".//div[contains(@class,'Home_StatusDescription__3WGl5') and contains(text(),'Когда аренда заканчивается')]")
    private SelenideElement stepFourDescription;


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
