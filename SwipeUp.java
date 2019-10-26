import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

protected void doSwipe(int startx, int starty, int endx, int endy, int duration) {
        TouchAction touchAction = new TouchAction(this);
        touchAction.press(startx, starty).waitAction(duration).moveTo(endx, endy).release();
        touchAction.perform();
        }

public abstract void swipe(int var1, int var2, int var3, int var4, int var5);

    public void pinch(WebElement el) {
        MultiTouchAction multiTouch = new MultiTouchAction(this);
        Dimension dimensions = el.getSize();
        Point upperLeft = el.getLocation();
        Point center = new Point(upperLeft.getX() + dimensions.getWidth() / 2, upperLeft.getY() + dimensions.getHeight() / 2);
        int yOffset = center.getY() - upperLeft.getY();
        TouchAction action0 = (new TouchAction(this)).press(el, center.getX(), center.getY() - yOffset).moveTo(el).release();
        TouchAction action1 = (new TouchAction(this)).press(el, center.getX(), center.getY() + yOffset).moveTo(el).release();
        multiTouch.add(action0).add(action1);
        multiTouch.perform();
    }

