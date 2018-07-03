package test.java.qualityworks.sample.ios.page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import test.java.qualityworks.sample.Helpers;


/**
 * Page Object for the Work Location Page
 * Created by Javon Davis on 7/27/17.
 */
public class IOSWorkLocationPage {

    private String heyThereAccessibilityIdentifier = "Hey There";
    private String questionLabelAccessibilityIdentifier = "Where do you work";
    private String workplaceAccessibilityIdentifier = "Workplace";
    private String submitAccessibilityIdentifier = "Submit";
    private String feedbackAccessibilityIdentifier = "Feedback";

    public void enterWorkLocation(String location) {
        MobileElement workplaceTextField = Helpers.element(MobileBy.AccessibilityId(workplaceAccessibilityIdentifier));
        workplaceTextField.click();
        workplaceTextField.setFileDetector(Helpers.fileDetector()); // Needed to send data to the remote
        workplaceTextField.sendKeys(location);
    }

    public void clickSubmit() {
        MobileElement submitButton = Helpers.element(MobileBy.AccessibilityId(submitAccessibilityIdentifier));
        submitButton.click();
    }


    public void loaded() {
        MobileElement heyThereLabel = Helpers.element(MobileBy.AccessibilityId(heyThereAccessibilityIdentifier));
        MobileElement questionLabel = Helpers.element(MobileBy.AccessibilityId(questionLabelAccessibilityIdentifier));
    }
}
