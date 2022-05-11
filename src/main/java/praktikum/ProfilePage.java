package praktikum;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class ProfilePage {

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

    public String waitingForDescriptionText() {
        profileDescriptionPanel.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
        return profileDescriptionPanel.getText();
    }

    public String waitingForTextOne() {
        profileNameEditingField.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
        return profileNameEditingField.getValue().toString();
    }


}
