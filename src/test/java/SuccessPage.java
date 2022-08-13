import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SuccessPage {
    public SelenideElement getSuccessMassage() {
        return successMassage;
    }

    private final SelenideElement successMassage = $x("//*[@data-test-id = \"order-success\"]");

    public boolean existsSuccessMessage(){
        return successMassage.exists();


    }
}
