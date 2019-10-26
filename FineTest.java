import io.appium.java_client.android.AndroidElement;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FineTest extends BeforeAfterTest{

    @Test
    public void fine() {

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
        if(twoClick.isDisplayed()){
            twoClick.click();
            System.out.println("пропускаем вторую рекламу");}
        else {

        }

        AndroidElement threeClick = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/banking_fragment_main_cards_count", this.DefaultTimeout);
        if (threeClick.isDisplayed()) {
            threeClick.click();
            System.out.println("пропускаем рекламу");}
        else {

        }

        AndroidElement allPayments = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/all_payments_widget_payments", this.DefaultTimeout);
        allPayments.click();
        System.out.println("нажимаем на платежи и переводы");

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

        AndroidElement p2p = newAndroidXpath("android.widget.TextView", "Все\n" +
                "платежи");
        p2p.click();
        System.out.println("кликаем по кнопке все платежи");

        AndroidElement fines = newAndroidXpath("android.widget.TextView", "Штрафы ПДД");
        fines.click();



    }
}
