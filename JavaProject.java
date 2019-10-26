import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;


public class JavaProject extends BeforeAfterTest {
    @Test
    public void testSearchAppium() {
        AndroidElement login = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/login", this.DefaultTimeout);
        login.sendKeys("7772411913");
        System.out.println("Вводим телефон");

//        waitToAppear
//                waitToAppearEnabled
//                CheckExistElement
        AndroidElement password = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/password", this.DefaultTimeout);
        password.sendKeys("qwer1234@");
        System.out.println("Вводим пароль");

        AndroidElement signIn = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/login_button", this.DefaultTimeout);
        signIn.click();
        System.out.println("Нажимаем по кнопке Войти");

        AndroidElement Skip = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/pin_cancelButton", this.DefaultTimeout);
        Skip.click();
        System.out.println("Нажимаем пропустить");


        AndroidElement clickCard = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/linking_card_view_1", this.DefaultTimeout);
        clickCard.click();
        System.out.println("Выбираем счет");

        AndroidElement click = newAndroidXpath("//android.widget.TextView","ИНФОРМАЦИЯ");
        click.click();
        System.out.println("кликаем по кнопке 'Информация'");

        AndroidElement expand = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/expand", this.DefaultTimeout);
        expand.click();
        System.out.println("кликаем по кнопке 'названия продукта'");

        AndroidElement rename = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/rename_input_text", this.DefaultTimeout);
        rename.click();
        rename.clear();
        rename.sendKeys("Test");
        System.out.println("меняем название счета");

        AndroidElement save = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/payment_credit_action", this.DefaultTimeout);
        save.click();
        System.out.println("сохраняем изменение");

    }





}