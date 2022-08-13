import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyPathTest extends BaseTest{
    private final static String BASE_URI = "http://localhost:9999";
    private final static String FULL_NAME = "Иванов Иван";
    private final static String PHONE_NUMBER = "+71234567890";


    @Test
    public void happyPath(){
        ApplicationForADebitCardPage page = new ApplicationForADebitCardPage();
        SuccessPage successPage = new SuccessPage();
        page.openWebsite(BASE_URI);
        page.sendKeysOnString(page.getNameInput(), FULL_NAME);
        page.sendKeysOnString(page.getPhoneInput(),PHONE_NUMBER);
        page.clickToElement(page.getApprovalCheckBox());
        page.clickToElement(page.getSubmitButton());
        successPage.getSuccessMassage();

        boolean expected  = true;
        boolean actual = successPage.existsSuccessMessage();
    }

}
