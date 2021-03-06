package test.java.qualityworks.sample.ios.page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import test.java.qualityworks.sample.Helpers;

/**
 * Created by Javon Davis on 7/28/17.
 */
public class IOSClickCounterPage {

    private String decreaseAccessibilityIdentifier = "Decrease Button";
    private String increaseAccessibilityIdentifier = "Increase Button";
    private String countAccissibilityIdentifier = "Count";


    public void clickIncreaseButton() {
        MobileElement increaseButton = Helpers.element(MobileBy.AccessibilityId(increaseAccessibilityIdentifier));
        increaseButton.click();

    }

    public void clickDecreaseButton() {
        MobileElement decreaseButton = Helpers.element(MobileBy.AccessibilityId(increaseAccessibilityIdentifier));
        decreaseButton.click();
    }

    public void loaded() {
        MobileElement countLabel = Helpers.element(MobileBy.AccessibilityId(countAccissibilityIdentifier));
    }
}
