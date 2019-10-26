import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;

public class TransferTest extends BeforeAfterTest {
    @Test
    public void transfer() {
//        AlfaCheck check = new AlfaCheck();
//        check.AlfaCheck();

        AndroidElement login2 = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/login", this.DefaultTimeout);
        login2.sendKeys("7772411913");
        System.out.println("Вводим телефон");

        AndroidElement password = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/password", this.DefaultTimeout);
        password.sendKeys("qwer1234@");
        System.out.println("вводим пароль");

        AndroidElement sighIn = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/login_button", this.DefaultTimeout);
        sighIn.click();
        System.out.println("Нажимаем по кнопке войти");

        AndroidElement skip = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/pin_cancelButton", this.DefaultTimeout);
        skip.click();
        System.out.println("Нажимаем по кнопке пропустить");

        AndroidElement alreadyHave = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/btnAlreadyhave", this.DefaultTimeout);
        if(alreadyHave.isDisplayed()) {
            alreadyHave.click();
            System.out.println("text exists "); }
        else {
        }

        AndroidElement oneClick = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/banking_fragment_main_cards_count", this.DefaultTimeout);
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

        AndroidElement transfers = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/all_payments_widget_payments", this.DefaultTimeout);
        transfers.click();
        System.out.println("Платежи и переводы");



        AndroidElement city2 = newAndroidWebEl("android:id/button2", this.DefaultTimeout);
            city2.click();


        AndroidElement transfer = newAndroidXpath("android.widget.TextView",
                "Мобильная");
        transfer.click();
        System.out.println("Нажимаем на мобильный связь");


        AndroidElement mobilePhone = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/phone_picker_number", this.DefaultTimeout);
        mobilePhone.click();
        mobilePhone.sendKeys("7769726968");
        System.out.println("вводим номер телефона");

        AndroidElement amount = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/clAmount", this.DefaultTimeout);
        amount.click();
        amount.sendKeys("300");
        System.out.println("Вводим сумму");

        AndroidElement pay = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/btPay", this.DefaultTimeout);
        pay.click();
        System.out.println("Нажимаем оплатить");

        AndroidElement confirm = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/fragment_payment_confirm_btn", this.DefaultTimeout);
        confirm.click();
        System.out.println("Подтверждаем");

        AndroidElement sms = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/p2p_confirm_sms_et", this.DefaultTimeout);
        sms.click();
        sms.sendKeys("1234");
        System.out.println("Вводим смс");

        AndroidElement close = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/payment_fragment_result_main_btn", this.DefaultTimeout);
        close.click();
        System.out.println("нажимаем вернуться на главную");


    }
}
