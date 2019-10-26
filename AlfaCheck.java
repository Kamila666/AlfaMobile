import com.sun.xml.internal.ws.api.model.CheckedException;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;

public class AlfaCheck extends BeforeAfterTest {

    public void AlfaCheck() {
        AndroidElement alreadyHave = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/btnAlreadyhave", this.DefaultTimeout);
        if(alreadyHave.isDisplayed()) {
            alreadyHave.click();
            System.out.println("text exists "); }
        else {
        }

        AndroidElement skipIt = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/tvSkipp", this.DefaultTimeout);
        if (skipIt.isDisplayed()) {
            skipIt.click();
            System.out.println("Нажимаем пропустить");}
        else{

        }

        AndroidElement city = newAndroidXpath("android.widget.Button", "ВЫБРАТЬ");
        if (city.isDisplayed()) {
            city.click();
            System.out.println("Выбираем город");

        AndroidElement cityClick = newAndroidXpath("android.widget.TextView", "Алматы");
        cityClick.click();
        System.out.println("Выбираем город Алматы");}
        else {

        }

        AndroidElement skip = newAndroidWebEl("kz.alfabank.mobile.android.debug:id/fragment_boarding_cancel_btn", this.DefaultTimeout);
        if (skip.isDisplayed()) {
            skip.click();
            System.out.println("Нажимаем пропустить");}
        else {

        }



    }

}


//