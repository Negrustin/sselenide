import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$;

/**
 * Страница регистрации дебетовой карты.
 */

public class ApplicationForADebitCardPage {
    private final SelenideElement nameInput = $x("//input[@name = \"name\"]");
    private final SelenideElement phoneInput =$x("//input[@name = \"phone\"]");
    private final SelenideElement approvalCheckBox =$(".checkbox");
    private final SelenideElement submitButton = $(".button__text");

    public SelenideElement getNameInput() {

        return nameInput;
    }

    public SelenideElement getPhoneInput() {

        return phoneInput;
    }

    public SelenideElement getApprovalCheckBox() {
        return approvalCheckBox;
    }

    public void sendKeysOnString(SelenideElement element, String str){

        element.sendKeys(str);
    }

    public void openWebsite(String url){

        Selenide.open(url);
    }

    public SelenideElement getSubmitButton() {
        return submitButton;
    }

    public void clickToElement(SelenideElement element){
        element.click();
    }

}
