import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.HashMap;

public class P2P extends BeforeAfterTest{

    @Test
    public void P2P() {

        AndroidElement login = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/login", this.DefaultTimeout);
        login.sendKeys("7024016730");
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

        AndroidElement oneClick = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/banking_fragment_main_cards_count", this.DefaultTimeout);
        if (oneClick.isDisplayed()) {
            oneClick.click();
            System.out.println("пропускаем рекламу");}
        else {

        }

        AndroidElement twoClick = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/spotlight_highlighted_view", this.DefaultTimeout);
        if (twoClick.isDisplayed()) {
            twoClick.click();
            System.out.println("Пропускаем AlfaCheck");
        } else {

        }

        AndroidElement threeClick = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/spotlight_highlighted_view", this.DefaultTimeout);
        if (threeClick.isDisplayed()) {
            threeClick.click();
            System.out.println("Пропускаем AlfaCheck");
        } else {

        }

        AndroidElement allPayments = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/all_payments_widget_payments", this.DefaultTimeout);
        allPayments.click();
        System.out.println("Нажимаем на все переводы");

        AndroidElement city = newAndroidWebEl("android:id/button1", this.DefaultTimeout);
        if (city.isDisplayed()) {
            city.click();
            System.out.println("Выбираем город");

            AndroidElement Almaty = newAndroidXpath("android.widget.TextView", "Алматы");
            Almaty.click();
            System.out.println("Выбираем город Алматы");
        }

        else {

        }

        AndroidElement p2p = newAndroidXpath("android.widget.TextView", "С карты\n" +
                "на карту");
        p2p.click();
        System.out.println("кликаем по кнопке с карты на карту");

        AndroidElement newp2p = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/p2p_history_new_transfer_container", this.DefaultTimeout);
        newp2p.click();
        System.out.println("Нажимаем на новый перевод");

        AndroidElement card = newAndroidXpath("android.widget.TextView", "64 796 578,71 ₸");
        card.click();
        System.out.println("Выбираем карту");

       AndroidElement card2 = newAndroidXpath("android.widget.TextView", "409273******9936");
       card2.click();
       System.out.println("Выбираем карту для перевода");

       AndroidElement sum = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/amount", this.DefaultTimeout);
       sum.click();
       sum.sendKeys("1000");
       System.out.println("Вводим сумму");

       AndroidElement action = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/p2p_step3_perform_action", this.DefaultTimeout);
       action.click();
       System.out.println("Подтверждаем");

       AndroidElement action2 = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/p2p_confirm_action_ok", this.DefaultTimeout);
       action2.click();
       System.out.println("Подтверждаем");

       AndroidElement contact = newAndroidWebEl("com.android.packageinstaller:id/permission_allow_button", this.DefaultTimeout);
       if (contact.isDisplayed()) {
           contact.click();
       } else {

       }
       System.out.println("Разрешаем доступ к контактам");

       AndroidElement sms = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/p2p_confirm_sms_et", this.DefaultTimeout);
       sms.click();
       sms.sendKeys("1234");
       System.out.println("водим смс код");

    }

}
