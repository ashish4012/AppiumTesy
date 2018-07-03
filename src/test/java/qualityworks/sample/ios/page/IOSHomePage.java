package test.java.qualityworks.sample.ios.page;

/**
 * Created by Javon Davis on 7/24/17.
 */

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import test.java.qualityworks.sample.Helpers;

import org.junit.Assert;
import java.util.Objects;

/** Page object for the home page **/
public class IOSHomePage {

    public void clickCounterButton() {
        loaded();
        Helpers.element(MobileBy.AccessibilityId("Show Click Counter")).click();
    }

    public void back() {
        Helpers.back();
    }

    public void clickWorkLocationButton() {
        loaded();
        Helpers.element(MobileBy.AccessibilityId("Show Work Location")).click();
    }


    /** Verify the home page has loaded **/
    public void loaded() {

        MobileElement headingLabel = Helpers.element(MobileBy.AccessibilityId("Quality Works Label"));
        Assert.assertTrue(Objects.equals(headingLabel.getAttribute("value"), "Quality Works Appium iOS Sample"));
    }
}
