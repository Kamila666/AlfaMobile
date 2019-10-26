import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import sun.misc.GC;

import java.util.HashMap;

public class DepositTest extends BeforeAfterTest {

    @Test
    public void deposit() {

        AndroidElement login = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/login", this.DefaultTimeout);
        login.sendKeys("7024183229");
        System.out.println("Вводим номер телефона");

        AndroidElement password = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/password", this.DefaultTimeout);
        password.sendKeys("qwer1234@");
        System.out.println("Вводим пароль");

        AndroidElement signIn = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/login_button", this.DefaultTimeout);
        signIn.click();
        System.out.println("Нажимаем по кнопке войти");

        AndroidElement skip = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/pin_cancelButton", this.DefaultTimeout);
        skip.click();
        System.out.println("Нажимаем по кнопке пропустить");

        AndroidElement alreadyHave = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/btnAlreadyhave", this.DefaultTimeout);
        if(alreadyHave.isDisplayed()) {
            alreadyHave.click();
            System.out.println("Нажимаем пропустить "); }
        else {
        }


        AndroidElement oneClick = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/spotlight_highlighted_view", this.DefaultTimeout);
        if (oneClick.isDisplayed()) {
            oneClick.click();
            System.out.println("пропускаем рекламу");}
        else {

        }

        AndroidElement twoClick = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/spotlight_highlighted_view", this.DefaultTimeout);
        if(twoClick.isDisplayed()){
            twoClick.click();
            System.out.println("пропускаем вторую рекламу");}
        else {

        }

        AndroidElement open = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/others_new_acc", this.DefaultTimeout);
        open.click();
        System.out.println("Нажимаем открыть депозит");

        AndroidElement period = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/fragment_open_deposit_choose_type_period_spinner", this.DefaultTimeout);
        period.click();
        System.out.println("Выбираем срок депозита");



        AndroidElement period2 = newAndroidXpath("android.widget.TextView", "12 месяцев");
        period2.click();
        System.out.println("Выбираем срок 24 месяца");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        js.executeScript("mobile: scroll", scrollObject);


        AndroidElement transfer = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/edit_text_container", this.DefaultTimeout);
        transfer.click();
        transfer.sendKeys("15000");


    }


}
