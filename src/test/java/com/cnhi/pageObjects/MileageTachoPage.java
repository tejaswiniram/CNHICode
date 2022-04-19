package com.cnhi.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.auto.framework.base.Log;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MileageTachoPage {

	public AppiumDriver<?> driver;
	GenericPage gMob;

	public MileageTachoPage(AppiumDriver<?> driver, GenericPage ttMob) {
		this.driver = driver;
		this.gMob = ttMob;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Mileage + Tacho']")
	private MobileElement mileageTachoTab;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Engine hours']")
	private MobileElement engineHoursTab;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Group Test Reception Checklist']")
	private MobileElement groupTestReceptionTab;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Mileage + Tacho']/parent:: XCUIElementTypeOther/following-sibling:: XCUIElementTypeButton)[1]")
	private MobileElement mileageTachoCameraIcon;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Engine hours']/parent:: XCUIElementTypeOther/following-sibling:: XCUIElementTypeButton)[1]")
	private MobileElement engineHoursCameraIcon;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='General Attachments']/parent:: XCUIElementTypeOther/following-sibling:: XCUIElementTypeButton)[1]")
	private MobileElement generalAttachmentsCameraIcon;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='General Attachments']/parent:: XCUIElementTypeOther/following-sibling:: XCUIElementTypeButton)[2]")
	private MobileElement generalAttachmentsMicroIcon;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Engine hours']/parent:: XCUIElementTypeOther/following-sibling:: XCUIElementTypeTextField)[1]")
	private MobileElement engineHoursTextField;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='*']")
	private List<MobileElement> mileageTachoCameraStarIcon;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private MobileElement okButtonFromPopup;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Service App']//XCUIElementTypeButton)[last()]")
	private MobileElement addImageIcon;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[contains(@name,'Photo')])[1]")
	private MobileElement photoImage;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Service App']//XCUIElementTypeButton)[1]")
	private MobileElement imageAddedEyeIcon;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Service App']//XCUIElementTypeButton")
	private List<MobileElement> cameraAllIcons;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='#'])[1]")
	private MobileElement photoAddedImage;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Delete']")
	private MobileElement deleteImageBtn;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='#']")
	private List<MobileElement> totalPhotoAddedImage;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Delete']")
	private MobileElement imageDeleteBtn;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='web dialog']//XCUIElementTypeButton")
	private MobileElement closeAddImageScreenIcon;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Qiestion 01']/parent:: XCUIElementTypeOther/following-sibling:: XCUIElementTypeButton)[1]")
	private MobileElement question13DotsBtn;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Service App']//XCUIElementTypeButton)[last()-1]")
	private MobileElement commentIcon;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Service App']//XCUIElementTypeButton)[last()-3]")
	private MobileElement addImageFromQuesionsIcon;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Service App']//XCUIElementTypeButton)[last()-2]")
	private MobileElement recorderIcon;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Voice Note']/parent:: XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeButton")
	private MobileElement recordedBtn;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Voice Note']/parent:: XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeButton)[2]")
	private MobileElement recordedStopeBtn;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'audio')]")
	private MobileElement recordedVoice;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Voice Note']/parent:: XCUIElementTypeOther/following-sibling:: XCUIElementTypeButton)[1]")
	private MobileElement closeRecordedScreenIcon;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Comment']/parent:: XCUIElementTypeOther/following-sibling:: XCUIElementTypeTextView")
	private MobileElement commentTextbox;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Submit']")
	private MobileElement submitBtn;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
	private MobileElement cancelBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Question 02']/parent:: XCUIElementTypeOther/following-sibling:: XCUIElementTypeButton)[1]")
	private MobileElement question23DotsBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Question 03']/parent:: XCUIElementTypeOther/following-sibling:: XCUIElementTypeButton)[1]")
	private MobileElement question33DotsBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Question 04']/parent:: XCUIElementTypeOther/following-sibling:: XCUIElementTypeButton)[1]")
	private MobileElement question43DotsBtn;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSlider")
	private MobileElement sliderQuestion3;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'/ 10')]")
	private MobileElement sliderValueQuestion3;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Question 02']/parent:: XCUIElementTypeOther/following-sibling:: XCUIElementTypeOther/XCUIElementTypeOther)[1]")
	private MobileElement greenRadioBtnFromQuestion2;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Yes']")
	private MobileElement yesRadioBtn;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch")
	private MobileElement switcherFromQuestion4;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton)[4]")
	private MobileElement checkinIcon;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Customer name']/parent:: XCUIElementTypeOther/following-sibling:: XCUIElementTypeTextField)[1]")
	private MobileElement customerNameTextBox;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Signature']/parent:: XCUIElementTypeOther/following-sibling:: XCUIElementTypeOther)[1]")
	private MobileElement signatureTextBox;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Terms and Conditions']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeSwitch)[1]")
	private MobileElement termConditionRadioButton;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='By selecting this check box you give consent for marketing activities as described in the Privacy Notice - MARKETING THIRD PARTIES']/parent::XCUIElementTypeOther/following:: XCUIElementTypeSwitch)[1]")
	private MobileElement privacyNoticeRadioButton;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[@name='Customer not present']")
	private MobileElement customerNotPresentRadioButton;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Close reception']")
	private MobileElement closeReceptionButton;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Mileage text has not been filled in. Mileage photo has not been filled in']")
	private MobileElement mileageTextHasNotBeenFilledText;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Mileage photo has not been filled in.']")
	private MobileElement mileagePhotoHasNotBeenFilledText;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='jobcard']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='You confirm that you had read and accepted the Terms and Conditions']")
	private MobileElement readTermConditionText;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private MobileElement OkBtn;

	public void clickOnMileageTachoTab() {
		gMob.waitForVisibility(mileageTachoTab, driver);
		gMob.clickElement(mileageTachoTab, "Click On Mileage Tacho Tab Option");
	}

	public void clickOnEngineHoursTab() {
		gMob.waitForVisibility(engineHoursTab, driver);
		gMob.clickElement(engineHoursTab, "Click On Mileage Tacho Tab Option");
	}

	public void clickOnMileageTachoCameraIcon() {
		gMob.waitForVisibility(mileageTachoCameraIcon, driver);
		gMob.clickElement(mileageTachoCameraIcon, "Click On Engine Hours Camera Icon Option");
	}

	public void clickOnEngineHoursCameraIcon() {
		gMob.waitForVisibility(engineHoursCameraIcon, driver);
		gMob.clickElement(engineHoursCameraIcon, "Click On Engine Hour Camera Icon Option");
	}

	public void clickOnGeneralAttachmentsCameraIcon() {
		gMob.waitForVisibility(generalAttachmentsCameraIcon, driver);
		gMob.clickElement(generalAttachmentsCameraIcon, "Click On General Attachments Camera Icon Option");
	}

	public void clickOnGeneralAttachmentsMicroPhoneIcon() {
		gMob.waitForVisibility(generalAttachmentsMicroIcon, driver);
		gMob.clickElement(generalAttachmentsMicroIcon, "Click On General Attachments MicroPhone Icon Option");
	}

	public void enterEngineHoursOnTextBox(String EngineHours) {
		gMob.waitForVisibility(engineHoursTextField, driver);
		gMob.clickElement(engineHoursTextField, "Click On Engine Hours Text Box");
		gMob.clearTextBox(engineHoursTextField, "Clear Engine Hours Text Box");
		gMob.sendKeysOnTextBox(engineHoursTextField, EngineHours, "Entering Engine Hours On Engine Hours Text Box");
	}

	public int isMileageTachoCameraStarIconVisible() {
		// gMob.waitForVisibility(mileageTachoCameraStarIcon.get(0), driver);
		return mileageTachoCameraStarIcon.size();
	}

	public void clickOnAddImageIcon() {
		gMob.waitForVisibility(addImageIcon, driver);
		gMob.clickElement(addImageIcon, "Click On Mileage Tacho Camera Icon Option");
	}

	public void clickOnImage() {
		gMob.waitForVisibility(photoImage, driver);
		gMob.clickElement(photoImage, "Select Photo Image ");
	}

	public void clickOnDeleteImageBtn() {
		gMob.waitForVisibility(deleteImageBtn, driver);
		gMob.clickElement(deleteImageBtn, "Select Photo Image ");
	}

	public int getTotalCameraIconCount() {
		gMob.waitForVisibility(addImageIcon, driver);
		return cameraAllIcons.size();
	}

	public boolean isAddedImageVisible() {
		gMob.waitForVisibility(photoAddedImage, driver);
		return gMob.isElementDisplay(photoAddedImage, "Image Visible Successfully");

	}

	public void clickOnAddedImage() {
		gMob.waitForVisibility(photoAddedImage, driver);
		gMob.clickElement(photoAddedImage, "Clcik On Image Added");
	}

	public int getTotalImageCount() {
		gMob.waitForVisibility(photoAddedImage, driver);
		return totalPhotoAddedImage.size();
	}

	public boolean isMentionedDeleteAttachmentReasonVisible(String option, String device) throws Exception {
		Thread.sleep(3000);
		String xPath = null;
		if (device.equalsIgnoreCase("Android")) {
			xPath = "//android.widget.RadioButton[@text='" + option + "']";
		} else {
			xPath = "(//XCUIElementTypeOther[@name='" + option + "'])[1]";
		}
		Thread.sleep(3000);
		return gMob.WaitingAndReturningElementVisibilityUsingXpath(xPath, driver);
	}

	public void clickOnDeleteAttachmentReason(String option, String device) throws Exception {
		Thread.sleep(3000);
		String xPath = null;
		if (device.equalsIgnoreCase("Android")) {
			xPath = "//android.widget.RadioButton[@text='" + option + "']";
		} else {
			xPath = "(//XCUIElementTypeOther[@name='" + option + "'])[1]";
		}
		Thread.sleep(3000);
		gMob.WaitingAndReturningElementVisibilityUsingXpath(xPath, driver);
		driver.findElement(By.xpath(xPath)).click();
	}

	public void clickOnCloseBtnFromAddedImageScreen() {
		gMob.waitForVisibility(closeAddImageScreenIcon, driver);
		gMob.clickElement(closeAddImageScreenIcon, "Closes Added Image Icon");
	}

	public void clickOnImageAddedEyeIcon() {
		if (getTotalCameraIconCount() > 3) {
			gMob.clickElement(cameraAllIcons.get(0), "Click On Image Added Eye Icon");
		} else {
			Log.info("Image Added Eye Icon Not Visible");
		}
	}

	public void clickOnQuestion13DotsBtn() throws Exception {
		gMob.swipeToElement(question13DotsBtn, "up", driver);
		gMob.waitForVisibility(question13DotsBtn, driver);
		gMob.clickElement(question13DotsBtn, "Click On Quesion 1 three dot Button");
	}

	public void clickOnQuestion23DotsBtn() throws Exception {
		gMob.swipeToElement(question23DotsBtn, "up", driver);
		gMob.waitForVisibility(question23DotsBtn, driver);
		gMob.clickElement(question23DotsBtn, "Click On Quesion 2 three dot Button");
	}

	public void clickOnQuestion33DotsBtn() throws Exception {
		gMob.swipeToElement(question33DotsBtn, "up", driver);
		gMob.waitForVisibility(question33DotsBtn, driver);
		gMob.clickElement(question33DotsBtn, "Click On Quesion 3 three dot Button");
	}

	public void clickOnQuestion43DotsBtn() throws Exception {
		gMob.swipeToElement(question43DotsBtn, "up", driver);
		gMob.waitForVisibility(question43DotsBtn, driver);
		gMob.clickElement(question43DotsBtn, "Click On Quesion 4 three dot Button");
	}

	public String getGreenRadioButtonCheckStatus() throws Exception {
		gMob.swipeToElement(greenRadioBtnFromQuestion2, "up", driver);
		gMob.waitForVisibility(greenRadioBtnFromQuestion2, driver);
		return gMob.getElementText(greenRadioBtnFromQuestion2, "value",
				"Getting Green Radio Button Check Status From Question 2");
	}

	public void clickOnGreenRadioBtnFromQuestion2() throws Exception {
		gMob.swipeToElement(greenRadioBtnFromQuestion2, "up", driver);
		gMob.waitForVisibility(greenRadioBtnFromQuestion2, driver);
		gMob.clickElement(greenRadioBtnFromQuestion2, "Click On Green Radio Button From Question 2");
	}

	public void clickOnCommentIcon() throws Exception {
		gMob.waitForVisibility(commentIcon, driver);
		gMob.clickElement(commentIcon, "Click Comment Icon");
	}

	public void clickOnAddImageIconFromQuestions() throws Exception {
		gMob.waitForVisibility(addImageFromQuesionsIcon, driver);
		gMob.clickElement(addImageFromQuesionsIcon, "Click On Add Image Icon from Questions");
	}

	public void clickOnRecorderIcon() throws Exception {
		gMob.waitForVisibility(recorderIcon, driver);
		gMob.clickElement(recorderIcon, "Click Recorder Icon");
	}

	public void clickOnRecordedBtnIcon() throws Exception {
		gMob.waitForVisibility(recordedBtn, driver);
		gMob.clickElement(recordedBtn, "Click Recorded Btn Icon");
	}

	public void clickOnRecorderStopBtnIcon() throws Exception {
		gMob.waitForVisibility(recordedStopeBtn, driver);
		gMob.clickElement(recordedStopeBtn, "Click Recorder Pause Button Icon");
	}

	public boolean isRecordedVoiceVisible() {
		gMob.waitForVisibility(recordedVoice, driver);
		return gMob.isElementDisplay(recordedVoice, "Recorded Voice Visible");
	}

	public void clickOnRecordeCloseBtnIcon() throws Exception {
		gMob.waitForVisibility(closeRecordedScreenIcon, driver);
		gMob.clickElement(closeRecordedScreenIcon, "Click On close Button From recorded Screen");
	}

	public void enterCommentTextBox(String Comments) {
		gMob.waitForVisibility(commentTextbox, driver);
		gMob.clickElement(commentTextbox, "Click On Comments Text Box");
		gMob.clearTextBox(commentTextbox, "Clear Comments Text Box");
		gMob.sendKeysOnTextBox(commentTextbox, Comments, "Entering Comments On Comment Text Box");
	}

	public String getCommentBoxText() {
		gMob.waitForVisibility(commentTextbox, driver);
		return gMob.getElementText(commentTextbox, "value", "Getting Comments Value");
	}

	public void clickOnSubmitBtn() {
		gMob.waitForVisibility(submitBtn, driver);
		gMob.clickElement(submitBtn, "Click On Submit Button On Commet Box Screen");
	}

	public void clickOnCancelBtn() {
		gMob.waitForVisibility(cancelBtn, driver);
		gMob.clickElement(cancelBtn, "Click On Cancel Button");
	}

	public boolean isCancelBtnVisible() {
		gMob.waitForVisibility(cancelBtn, driver);
		return gMob.isElementDisplay(cancelBtn, "Cancel Button Is Visible");
	}

	public boolean isSubmitBtnVisible() {
		gMob.waitForVisibility(submitBtn, driver);
		return gMob.isElementDisplay(submitBtn, "Cancel Button Is Visible");
	}

	public String getSubmitBtnEnableStatus() {
		gMob.waitForVisibility(submitBtn, driver);
		return gMob.getElementText(submitBtn, "enabled", "Getting Submit Btn Enabled Status");
	}

	public String getYesRadioButtonCheckStatus() throws Exception {
		gMob.swipeToElement(yesRadioBtn, "up", driver);
		gMob.waitForVisibility(yesRadioBtn, driver);
		return gMob.getElementText(yesRadioBtn, "value", "Getting Yes Radio Button Check Status From Question 1");
	}

	public void clickOnYesRadioBtnFromQuestion1() throws Exception {
		gMob.swipeToElement(yesRadioBtn, "up", driver);
		gMob.waitForVisibility(yesRadioBtn, driver);
		gMob.clickElement(yesRadioBtn, "Click On Yes Radio Button");
	}

	public String getonOffSwitchButtonCheckStatus() throws Exception {
		gMob.swipeToElement(switcherFromQuestion4, "up", driver);
		gMob.waitForVisibility(switcherFromQuestion4, driver);
		return gMob.getElementText(switcherFromQuestion4, "value",
				"Getting On/Off Radio Button Check Status From Question 4");
	}

	public void clickOnSwitcherFromQuestion4FromQuestion4() throws Exception {
		gMob.swipeToElement(switcherFromQuestion4, "up", driver);
		gMob.waitForVisibility(switcherFromQuestion4, driver);
		gMob.clickElement(switcherFromQuestion4, "Click On Switcher Icon From Question 4");
	}

	public void clickOnCheckinIcon() throws Exception {
		gMob.swipeToElement(checkinIcon, "up", driver);
		gMob.waitForVisibility(checkinIcon, driver);
		gMob.clickElement(checkinIcon, "Click On Check In Icon");
	}

	public void enterCustomerNameTextBox(String CustomerName) throws InterruptedException {
		Thread.sleep(5000);
		gMob.waitForVisibility(customerNameTextBox, driver);
		gMob.clickElement(customerNameTextBox, "Click On Customer Name Text Box");
		gMob.clearTextBox(customerNameTextBox, "Clear Customer Name Text Box");
		gMob.sendKeysOnTextBox(customerNameTextBox, CustomerName, "Entering Customer Name On Customer Name Text Box");
		gMob.tapByCoordinates(193, 51, driver);
	}

	public void enterSignatureTextBox() {
		int xAxis = signatureTextBox.getLocation().getX()+30;
		int yAxis = signatureTextBox.getLocation().getY()+30;
		gMob.tapByCoordinates(xAxis, yAxis, driver);
	}

	public void turnOnCustomerNotPresentRadioButton() throws Exception {
		gMob.swipeToElement(customerNotPresentRadioButton, "up", driver);
		gMob.waitForVisibility(customerNotPresentRadioButton, driver);
		String status = gMob.getElementText(customerNotPresentRadioButton, "value",
				"Getting Customer Not Present Selected Status");
		if (status.equalsIgnoreCase("0")) {
			gMob.clickElement(customerNotPresentRadioButton, "Click On Customer Not Present Radio Button");
		}
	}

	public void turnOnTermConditionRadioButton() throws Exception {
		gMob.swipeToElement(termConditionRadioButton, "up", driver);
		gMob.waitForVisibility(termConditionRadioButton, driver);
		String status = gMob.getElementText(termConditionRadioButton, "value",
				"Getting Terms and Condition Selected Status");
		if (status.equalsIgnoreCase("0")) {
			gMob.clickElement(termConditionRadioButton, "Turn On Term Condition Radio Button");
		}
	}

	public void turnOffTermConditionRadioButton() throws Exception {
		gMob.swipeToElement(termConditionRadioButton, "up", driver);
		gMob.waitForVisibility(termConditionRadioButton, driver);
		String status = gMob.getElementText(termConditionRadioButton, "value",
				"Getting Terms and Condition Selected Status");
		if (status.equalsIgnoreCase("1")) {
			gMob.clickElement(termConditionRadioButton, "Turn Off Term Condition Radio Button");
		}
	}

	public void turnOnPrivacyNoticeRadioButton() throws Exception {
		gMob.swipeToElement(privacyNoticeRadioButton, "up", driver);
		gMob.waitForVisibility(privacyNoticeRadioButton, driver);
		String status = gMob.getElementText(privacyNoticeRadioButton, "value",
				"Getting Privacy Policy Selected Status");
		if (status.equalsIgnoreCase("0")) {
			gMob.clickElement(privacyNoticeRadioButton, "Turn On Privacy Policy Radio Button");
		}
	}

	public boolean isCustomerNameTextBoxVisible() throws Exception {
		gMob.swipeToElement(customerNameTextBox, "up", driver);
		gMob.waitForVisibility(customerNameTextBox, driver);
		return gMob.isElementDisplay(customerNameTextBox, "Customer Name Text Box Is Visible");
	}

	public boolean isSignatureTextBoxVisible() throws Exception {
		gMob.swipeToElement(signatureTextBox, "up", driver);
		gMob.waitForVisibility(signatureTextBox, driver);
		return gMob.isElementDisplay(signatureTextBox, "Signature Text Box Is Visible");
	}

	public boolean isTermConditionRadioButtonVisible() throws Exception {
		gMob.swipeToElement(termConditionRadioButton, "up", driver);
		gMob.waitForVisibility(termConditionRadioButton, driver);
		return gMob.isElementDisplay(termConditionRadioButton, "Term Condition Is Visible");
	}

	public boolean isPrivacyNoticeRadioButtonVisible() throws Exception {
		gMob.swipeToElement(privacyNoticeRadioButton, "up", driver);
		gMob.waitForVisibility(privacyNoticeRadioButton, driver);
		return gMob.isElementDisplay(privacyNoticeRadioButton, "By Selecting The Radio Button Is Visible");
	}

	public boolean isCustomerNotPresentRadioButtonVisible() throws Exception {
		gMob.swipeToElement(customerNotPresentRadioButton, "up", driver);
		gMob.waitForVisibility(customerNotPresentRadioButton, driver);
		return gMob.isElementDisplay(customerNotPresentRadioButton, "Customer Not Present Radio Button Is Visible");
	}

	public String getTermConditionRadioButtonStatus() throws Exception {
		gMob.swipeToElement(termConditionRadioButton, "up", driver);
		gMob.waitForVisibility(termConditionRadioButton, driver);
		String status = gMob.getElementText(termConditionRadioButton, "value",
				"Getting Terms and Condition Selected Status");
		return status;
	}

	public String getPrivacyNoticeRadioButtonStatus() throws Exception {
		gMob.swipeToElement(privacyNoticeRadioButton, "up", driver);
		gMob.waitForVisibility(privacyNoticeRadioButton, driver);
		String status = gMob.getElementText(privacyNoticeRadioButton, "value",
				"Getting Privacy Notice Selected Status");
		return status;
	}

	public void clickOnCloseReceptionButton() throws Exception {
		gMob.swipeToElement(closeReceptionButton, "up", driver);
		gMob.waitForVisibility(closeReceptionButton, driver);
		gMob.clickElement(closeReceptionButton, "Click On Close reception Button");
	}

	public void slideQuestion3Slider() {
		int xAxis = sliderQuestion3.getLocation().x + 127;
		int yAxis = sliderQuestion3.getLocation().y;
		gMob.tapByCoordinates(xAxis, yAxis, driver);
	}

	public String getSliderValue() throws Exception {
		gMob.swipeToElement(sliderValueQuestion3, "up", driver);
		gMob.waitForVisibility(sliderValueQuestion3, driver);
		return gMob.getElementText(sliderValueQuestion3, "name", "Getting Slider Value");
	}

	public boolean isMileageTextHasNotBeenFilledTextVisible() throws Exception {
		gMob.swipeToElement(mileageTextHasNotBeenFilledText, "up", driver);
		return gMob.isElementDisplay(mileageTextHasNotBeenFilledText, "Mileage Text Has Not Been Filled Text Visible");
	}

	public boolean isMileagePhotoHasNotBeenFilledTextVisible() throws Exception {
		gMob.swipeToElement(mileagePhotoHasNotBeenFilledText, "up", driver);
		return gMob.isElementDisplay(mileagePhotoHasNotBeenFilledText,
				"Mileage Photo Has Not Been Filled Text Visible");
	}

	public boolean isReadTermConditionTextTextVisible() throws Exception {
		gMob.swipeToElement(readTermConditionText, "up", driver);
		return gMob.isElementDisplay(readTermConditionText, "Read Term Condition Text Visible");
	}

	public void tapOnScreen() {
		gMob.tapByCoordinates(192, 166, driver);
	}

	public void clickOnOkButton() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println(gMob.WaitingAndReturningElementVisibility(OkBtn));
		if (gMob.WaitingAndReturningElementVisibility(OkBtn)) {
			int xAxis = OkBtn.getLocation().getX();
			int yAxis = OkBtn.getLocation().getY();
			gMob.tapByCoordinates(xAxis, yAxis, driver);
			// gMob.clickElement(checkListOkBtn, "Click On OK Button");
		}
	}

}
