package com.cnhi.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.auto.framework.base.Log;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.remote.HideKeyboardStrategy;

public class VehicleDetailPage {

	public AppiumDriver<?> driver;
	GenericPage gMob;

	public VehicleDetailPage(AppiumDriver<?> driver, GenericPage ttMob) {
		this.driver = driver;
		this.gMob = ttMob;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

//---------------------- Vehicle Detail Tab Screens Elements-----------------------------

	// Vehicle Detail Screen Elements

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Vehicle details']")
	private MobileElement vehicleDetailTab;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Vehicle details']")
	private MobileElement vehicleDetailLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='FDP Description in dealer language']/following-sibling:: XCUIElementTypeStaticText)[last()]")
	private MobileElement fDPDescriptionInDealerLanguageValue;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Model description']/following-sibling:: XCUIElementTypeStaticText)[last()]")
	private MobileElement modelDescriptionValue;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='BM']/following-sibling:: XCUIElementTypeStaticText)[last()]")
	private MobileElement bMValue;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='FDP English description']/following-sibling:: XCUIElementTypeStaticText)[last()]")
	private MobileElement fDPEnglishDescriptionValue;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='FDP code']/following-sibling:: XCUIElementTypeStaticText)[last()]")
	private MobileElement fDPCodeValue;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Sold-To Dealer Market']/following-sibling:: XCUIElementTypeStaticText)[last()]")
	private MobileElement soldToDealerMarketValue;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Build date']/following-sibling:: XCUIElementTypeStaticText)[last()]")
	private MobileElement buildDateValue;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Model Group']/following-sibling:: XCUIElementTypeStaticText)[last()]")
	private MobileElement modelGroupValue;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Model Group']/following-sibling:: XCUIElementTypeStaticText)[last()]")
	private MobileElement productionPlantDescriptionValue;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='menu']/following-sibling::XCUIElementTypeButton")
	private List<MobileElement> vehicleMenuTabLists;

	// SAP end Customer Screen Elements

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SAP end customer']")
	private MobileElement sAPEndCustomerTab;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='SAP end customer']")
	private MobileElement sAPEndCustomerLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='End customer Country']/following-sibling:: XCUIElementTypeStaticText)[last()]")
	private MobileElement endCustomerCountryText;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='End customer Name']/following-sibling:: XCUIElementTypeStaticText)[last()]")
	private MobileElement endCustomerNameText;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='End customer City']/following-sibling:: XCUIElementTypeStaticText)[last()]")
	private MobileElement endCustomerCityText;

	// Group Serial Number Screen Elements

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Group serial number']")
	private MobileElement groupSerialNumberTab;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Group serial number']")
	private MobileElement groupSerialNumberLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Description']")
	private MobileElement descriptionLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Serial']")
	private MobileElement serialLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Chassis']")
	private MobileElement chassisLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Engine']")
	private MobileElement engineLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Gearbox']")
	private MobileElement gearboxLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='First axle']")
	private MobileElement firstAxleLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='1-Rear axle']")
	private MobileElement RearAxleLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='CABINA VERNICIATA']")
	private MobileElement cabinaVerniciataLabel;

	// SAP Option Detail Screen Elements

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SAP option details']")
	private MobileElement sAPOptionDetailsTab;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='SAP option details']")
	private MobileElement sAPOptionDetailsLabel;

	// SAP Repair History Screen Elements

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SAP repair history']")
	private MobileElement sAPRepairHistoryTab;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='SAP repair history']")
	private MobileElement sAPRepairHistoryLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name='search text']")
	private MobileElement sAPRepairHistorySearchTextBox;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Defect Description']")
	private MobileElement defectDescriptionLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'BLOCKAGE')]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText[@name='Show details']")
	private List<MobileElement> defectDescriptionBlockageWithShowDetailsLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Claim Repair End Date']/following-sibling::XCUIElementTypeStaticText)[last()]")
	private MobileElement claimRepairEndDateText;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Defect Code']/following-sibling::XCUIElementTypeStaticText)[last()]")
	private MobileElement defectCodeText;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Mileage/KM']/following-sibling::XCUIElementTypeStaticText)[last()]")
	private MobileElement MileageKMText;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Warranty Type']/following-sibling::XCUIElementTypeStaticText)[last()]")
	private MobileElement warrantyTypeText;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Workshop Description']/following-sibling::XCUIElementTypeStaticText)[last()]")
	private MobileElement workshopDescriptionText;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Workshop Description']/following-sibling::XCUIElementTypeStaticText)[last()]")
	private MobileElement statusText;

	// Warranty Services Screen

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Warranty services']")
	private MobileElement warrantyServicesTab;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Active Warranty Services']")
	private MobileElement activeWarrantyServicesLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Planned Warranty Services']")
	private MobileElement plannedWarrantyServicesLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Expired Warranty Services']")
	private MobileElement expiredWarrantyServicesLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='No Data for this vehicle in this language']")
	private MobileElement noDataLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='EXTRA PDI']/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText[@name='Show details']")
	private MobileElement extraPDIShowDetails;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Service Number']/following-sibling::XCUIElementTypeStaticText)[last()]")
	private MobileElement serviceNumberDetails;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Warranty Type']/following-sibling::XCUIElementTypeStaticText)[last()]")
	private MobileElement warrantyTypeDetails;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Duration']/following-sibling::XCUIElementTypeStaticText)[last()]")
	private MobileElement durationDetails;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Start']/following-sibling::XCUIElementTypeStaticText)[last()]")
	private MobileElement startDetails;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='End']/following-sibling::XCUIElementTypeStaticText)[last()]")
	private MobileElement endDetails;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Mileage']/following-sibling::XCUIElementTypeStaticText)[last()]")
	private MobileElement mileageDetails;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Contract']/following-sibling::XCUIElementTypeStaticText)[last()]")
	private MobileElement contractDetails;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='PDI PRE DELIVERY INSPECTION']")
	private MobileElement pdiPreDeliveryInspectionLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='EXTRA DL - 2° Year']")
	private MobileElement extraDlLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Technical Warranty 1st Year']")
	private MobileElement TechnicalWarrantyLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='DRIVE LINE 2° YEAR']")
	private MobileElement driveLineLabel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='ANS 24H ASSISTANCE NO STOP']")
	private MobileElement ans24HLabel;

	// Job History Screen
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Jobcard History']")
	private MobileElement jobCardHistoryTab;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Summary']")
	private MobileElement summaryScreenTab;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Details']")
	private MobileElement detailsScreenTab;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Delivery Date']")
	private MobileElement deliveryDateLabel;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next step']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Booking ID']")
	private MobileElement bookingIdLabel;

	// Below Are The Methods Related To Vehicle Detail Screens
//**************************************************************************************************************************************

	// Vehicle Detail Screen

	public void clickVehicleDetailTab() {
		gMob.waitForVisibility(vehicleDetailTab, driver);
		gMob.clickElement(vehicleDetailTab, "Click On Vehicle Tab");
	}

	public boolean isVehicleDetailLabelVisible() throws Exception {
		gMob.waitForVisibility(vehicleDetailLabel, driver);
		return gMob.isElementVisibleWithinGivenTime(vehicleDetailLabel, 100, driver);
	}

	public String getFDPDescriptionInDealerLanguageValueFromJobDetail() throws Exception {
		gMob.waitForVisibility(fDPDescriptionInDealerLanguageValue, driver);
		String value = gMob.getElementText(fDPDescriptionInDealerLanguageValue, "name",
				"Getting FDP Description In Dealer Language Value");
		Log.info(value);
		return value;
	}

	public String getModelDescriptionValueFromJobDetail() throws Exception {
		gMob.waitForVisibility(modelDescriptionValue, driver);
		String value = gMob.getElementText(modelDescriptionValue, "name", "Getting Model Description Value");
		Log.info(value);
		return value;
	}

	public String getBMValueFromJobDetail() throws Exception {
		gMob.waitForVisibility(bMValue, driver);
		String value = gMob.getElementText(bMValue, "name", "Getting BM Value");
		Log.info(value);
		return value;
	}

	public String getfDPEnglishDescriptionValueFromJobDetail() throws Exception {
		gMob.waitForVisibility(fDPEnglishDescriptionValue, driver);
		String value = gMob.getElementText(fDPEnglishDescriptionValue, "name", "Getting FDP English Description Value");
		Log.info(value);
		return value;
	}

	public String getfDPCodeValueFromJobDetail() throws Exception {
		gMob.waitForVisibility(fDPCodeValue, driver);
		String value = gMob.getElementText(fDPCodeValue, "name", "Getting FDP Code Value");
		Log.info(value);
		return value;
	}

	public String getSoldToDealerMarketValueFromJobDetail() throws Exception {
		gMob.waitForVisibility(soldToDealerMarketValue, driver);
		String value = gMob.getElementText(soldToDealerMarketValue, "name", "Getting Sold To Dealer Market Value");
		Log.info(value);
		return value;
	}

	public String getbuildDateValuetFromJobDetail() throws Exception {
		gMob.waitForVisibility(buildDateValue, driver);
		String value = gMob.getElementText(buildDateValue, "name", "Getting Build Date Value");
		Log.info(value);
		return value;
	}

	public String getmodelGroupValueFromJobDetail() throws Exception {
		gMob.waitForVisibility(modelGroupValue, driver);
		String value = gMob.getElementText(modelGroupValue, "name", "Getting Model Group Value");
		Log.info(value);
		return value;
	}

	public String getProductionPlantDescriptionValueFromJobDetail() throws Exception {
		gMob.waitForVisibility(productionPlantDescriptionValue, driver);
		String value = gMob.getElementText(productionPlantDescriptionValue, "name",
				"Getting Production Plant Description Value");
		Log.info(value);
		return value;
	}

	// SAP end Customer Screen

	public void clickSapEndCustomerTab() {
		gMob.waitForVisibility(sAPEndCustomerTab, driver);
		gMob.clickElement(sAPEndCustomerTab, "Click On SAP End Customer Tab");
	}

	public boolean isSAPEndCustomerLabelVisible() throws Exception {
		gMob.waitForVisibility(sAPEndCustomerLabel, driver);
		return gMob.isElementVisibleWithinGivenTime(sAPEndCustomerLabel, 100, driver);
	}

	public boolean isEndCustomerCountryTextVisibleEmpty() throws Exception {
		gMob.waitForVisibility(endCustomerCountryText, driver);
		return gMob.getElementText(endCustomerCountryText, "value", "Getting Last Value Of End Customer Country")
				.equals(":");
	}

	public boolean isEndCustomerNameTextVisibleEmpty() throws Exception {
		gMob.waitForVisibility(endCustomerNameText, driver);
		return gMob.getElementText(endCustomerNameText, "value", "Getting Last Value Of End Customer Name").equals(":");
	}

	public boolean isEndCustomerCityTextVisibleEmpty() throws Exception {
		gMob.waitForVisibility(endCustomerCityText, driver);
		return gMob.getElementText(endCustomerCityText, "value", "Getting Last Value Of End Customer City").equals(":");
	}

	// Group Serial Number Screen

	public void clickGroupSerialNumberTab() throws InterruptedException {
		int startX = 290;
		int startY = 98;
		int endX = 42;
		int endY = 98;
		for (int i = 0; i <= 10; i++) {
			Log.info("Waiting For Element " + i);
			try {
				if (gMob.getElementText(groupSerialNumberTab, "visible", "").equals("true")) {
					Log.info("Repair History Tab Screen Is Visible");
					gMob.clickElement(groupSerialNumberTab, "Click On Group Serial No Tab");
					break;
				} else {
					gMob.swipe(startX, startY, endX, endY, 1000, driver);
				}
			} catch (Exception e) {
				gMob.swipe(startX, startY, endX, endY, 1000, driver);
				if (i > 10) {
					Log.info(e.getMessage());
					e.printStackTrace();
				}

			}
		}
	}

	public boolean isGroupSerialNumberLabelVisible() throws Exception {
		gMob.waitForVisibility(groupSerialNumberLabel, driver);
		return gMob.isElementVisibleWithinGivenTime(groupSerialNumberLabel, 100, driver);
	}

	public boolean isDescriptionLabelVisible() throws Exception {
		gMob.waitForVisibility(descriptionLabel, driver);
		return gMob.isElementVisibleWithinGivenTime(descriptionLabel, 100, driver);
	}

	public boolean isSerialLabelVisible() throws Exception {
		gMob.waitForVisibility(serialLabel, driver);
		return gMob.isElementVisibleWithinGivenTime(serialLabel, 100, driver);
	}

	public boolean isChassisLabelVisible() throws Exception {
		gMob.waitForVisibility(chassisLabel, driver);
		return gMob.isElementVisibleWithinGivenTime(chassisLabel, 100, driver);
	}

	public boolean isEngineLabelVisible() throws Exception {
		gMob.waitForVisibility(engineLabel, driver);
		return gMob.isElementVisibleWithinGivenTime(engineLabel, 100, driver);
	}

	public boolean isGearLabelVisible() throws Exception {
		gMob.waitForVisibility(gearboxLabel, driver);
		return gMob.isElementVisibleWithinGivenTime(gearboxLabel, 100, driver);
	}

	public boolean isFirstAxleLabelVisible() throws Exception {
		gMob.waitForVisibility(firstAxleLabel, driver);
		return gMob.isElementVisibleWithinGivenTime(firstAxleLabel, 100, driver);
	}

	public boolean isRearAxleLabelVisible() throws Exception {
		gMob.waitForVisibility(RearAxleLabel, driver);
		return gMob.isElementVisibleWithinGivenTime(RearAxleLabel, 100, driver);
	}

	public boolean isCabinaVerniciataLabelVisible() throws Exception {
		gMob.waitForVisibility(cabinaVerniciataLabel, driver);
		return gMob.isElementVisibleWithinGivenTime(cabinaVerniciataLabel, 100, driver);
	}

	// SAP Option Detail Screen

	public void clickSapOptionDetailTab() throws InterruptedException {
		int startX = 290;
		int startY = 98;
		int endX = 42;
		int endY = 98;
		for (int i = 0; i <= 10; i++) {
			Log.info("Waiting For Element " + i);
			try {
				if (gMob.getElementText(sAPOptionDetailsTab, "visible", "").equals("true")) {
					Log.info("Repair History Tab Screen Is Visible");
					gMob.clickElement(sAPOptionDetailsTab, "Click On SAP option detail Tab");
					break;
				} else {
					gMob.swipe(startX, startY, endX, endY, 1000, driver);
				}
			} catch (Exception e) {
				gMob.swipe(startX, startY, endX, endY, 1000, driver);
				if (i > 10) {
					Log.info(e.getMessage());
					e.printStackTrace();
				}

			}
		}
	}

	// SAP Repair History Screen

	public void clickSapRepairHistoryTab() throws InterruptedException {
		int startX = 290;
		int startY = 98;
		int endX = 42;
		int endY = 98;
		for (int i = 0; i <= 10; i++) {
			Log.info("Waiting For Element " + i);
			try {
				if (gMob.getElementText(sAPRepairHistoryTab, "visible", "").equals("true")) {
					Log.info("Repair History Tab Screen Is Visible");
					gMob.clickElement(sAPRepairHistoryTab, "Click On Vehicle Tab");
					break;
				} else {
					gMob.swipe(startX, startY, endX, endY, 1000, driver);
				}
			} catch (Exception e) {
				gMob.swipe(startX, startY, endX, endY, 1000, driver);
				if (i > 10) {
					Log.info(e.getMessage());
					e.printStackTrace();
				}
			}
		}
	}

	public boolean isSapRepairHistoryLabelVisible() throws Exception {
		gMob.waitForVisibility(sAPRepairHistoryLabel, driver);
		return gMob.isElementVisibleWithinGivenTime(sAPRepairHistoryLabel, 100, driver);
	}

	public boolean isSapRepairHistorySearchTextBoxVisible() throws Exception {
		gMob.waitForVisibility(sAPRepairHistorySearchTextBox, driver);
		return gMob.isElementVisibleWithinGivenTime(sAPRepairHistorySearchTextBox, 100, driver);
	}

	public boolean isDefectDescriptionLabelVisible() throws Exception {
		gMob.waitForVisibility(defectDescriptionLabel, driver);
		return gMob.isElementVisibleWithinGivenTime(defectDescriptionLabel, 100, driver);
	}

	public boolean isDefectDescriptionBlockageWithShowDetailsLabelVisible() {
		return defectDescriptionBlockageWithShowDetailsLabel.size() == 1;
	}

	public void clickDefectDescriptionBlockageWithShowDetail() {
		gMob.waitForVisibility(defectDescriptionBlockageWithShowDetailsLabel.get(0), driver);
		gMob.clickElement(defectDescriptionBlockageWithShowDetailsLabel.get(0), "Click On SAP End Customer Tab");
	}

	public String getClaimRepairEndDateData() throws Exception {
		gMob.waitForVisibility(claimRepairEndDateText, driver);
		String value = gMob.getElementText(claimRepairEndDateText, "name", "Getting claim Repair End date Value");
		Log.info(value);
		return value;
	}

	public String getadefectCodeData() throws Exception {
		gMob.waitForVisibility(defectCodeText, driver);
		String value = gMob.getElementText(defectCodeText, "name", "Getting defect code Value");
		Log.info(value);
		return value;
	}

	public String getMileageKMtData() throws Exception {
		gMob.waitForVisibility(MileageKMText, driver);
		String value = gMob.getElementText(MileageKMText, "name", "Getting Mileage KM Value");
		Log.info(value);
		return value;
	}

	public String getWarrantyTypeData() throws Exception {
		gMob.waitForVisibility(warrantyTypeText, driver);
		String value = gMob.getElementText(warrantyTypeText, "name", "Getting Warranty Type Value");
		Log.info(value);
		return value;
	}

	public String getWorkshopDescriptionData() throws Exception {
		gMob.waitForVisibility(workshopDescriptionText, driver);
		String value = gMob.getElementText(workshopDescriptionText, "name", "Getting Workshop Description Value");
		Log.info(value);
		return value;
	}

	public String getStatusData() throws Exception {
		gMob.waitForVisibility(statusText, driver);
		String value = gMob.getElementText(statusText, "name", "Getting Status Value");
		Log.info(value);
		return value;
	}

	// Warranty Services Screen

	public void clickWarrantyServicesTab() throws InterruptedException {
		int startX = 290;
		int startY = 98;
		int endX = 42;
		int endY = 98;
		for (int i = 0; i <= 10; i++) {
			Log.info("Waiting For Element " + i);
			try {
				if (gMob.getElementText(warrantyServicesTab, "visible", "").equals("true")) {
					Log.info("Repair History Tab Screen Is Visible");
					gMob.clickElement(warrantyServicesTab, "Click On Vehicle Tab");
					break;
				} else {
					gMob.swipe(startX, startY, endX, endY, 1000, driver);
				}
			} catch (Exception e) {
				gMob.swipe(startX, startY, endX, endY, 1000, driver);
				if (i > 10) {
					Log.info(e.getMessage());
					e.printStackTrace();
				}
			}
		}
	}

	public boolean isActiveWarrantyServicesLabelVisible() {
		return gMob.isElementVisibleWithinGivenTime(plannedWarrantyServicesLabel, 100, driver);
	}
	
	public boolean isPlannedWarrantyServicesLabelVisible() throws Exception {
		return gMob.isElementVisibleWithinGivenTime(plannedWarrantyServicesLabel, 100, driver);
	}
	
	public boolean isExpiredWarrantyServicesLabelVisible() throws Exception {
		return gMob.isElementVisibleWithinGivenTime(expiredWarrantyServicesLabel, 100, driver);
	}
	
	public boolean isNoDataLabelVisible() throws Exception {
		return gMob.isElementVisibleWithinGivenTime(noDataLabel, 100, driver);
	}
	
	public boolean isExtraPDIShowVisible() throws Exception {
		return gMob.isElementVisibleWithinGivenTime(extraPDIShowDetails, 100, driver);
	}
	
	public void clickExtraPDIShowDetail() throws Exception {
		gMob.swipeToElement(extraPDIShowDetails, "up", driver);
		gMob.clickElement(extraPDIShowDetails, "Click On Extra PDI Show Detail");
	}
	
	public String getServiceNumberDetail() throws Exception {
		gMob.swipeToElement(serviceNumberDetails, "up", driver);
		gMob.waitForVisibility(serviceNumberDetails, driver);
		String value = gMob.getElementText(serviceNumberDetails, "name", "Getting Service Detail Value");
		Log.info(value);
		return value;
	}
	
	public String getwarrantyTypeDetail() throws Exception {
		gMob.swipeToElement(warrantyTypeDetails, "up", driver);
		gMob.waitForVisibility(warrantyTypeDetails, driver);
		String value = gMob.getElementText(warrantyTypeDetails, "name", "Getting Service Detail Value");
		Log.info(value);
		return value;
	}
	
	public String getDurationDetail() throws Exception {
		gMob.swipeToElement(durationDetails, "up", driver);
		gMob.waitForVisibility(durationDetails, driver);
		String value = gMob.getElementText(durationDetails, "name", "Getting Service Detail Value");
		Log.info(value);
		return value;
	}
	
	public String getStartDetail() throws Exception {
		gMob.swipeToElement(startDetails, "up", driver);
		gMob.waitForVisibility(startDetails, driver);
		String value = gMob.getElementText(startDetails, "name", "Getting Service Detail Value");
		Log.info(value);
		return value;
	}
	
	public String getEndDetail() throws Exception {
		gMob.swipeToElement(endDetails, "up", driver);
		gMob.waitForVisibility(endDetails, driver);
		String value = gMob.getElementText(endDetails, "name", "Getting Service Detail Value");
		Log.info(value);
		return value;
	}
	
	public String getMileageDetail() throws Exception {
		gMob.swipeToElement(mileageDetails, "up", driver);
		gMob.waitForVisibility(mileageDetails, driver);
		String value = gMob.getElementText(mileageDetails, "name", "Getting Service Detail Value");
		Log.info(value);
		return value;
	}
	
	public String getContractDetail() throws Exception {
		gMob.swipeToElement(contractDetails, "up", driver);
		gMob.waitForVisibility(contractDetails, driver);
		String value = gMob.getElementText(contractDetails, "name", "Getting Service Detail Value");
		Log.info(value);
		return value;
	}
	
	public boolean isPdiPreDeliveryInspectionLabelVisible() throws Exception {
		gMob.swipeToElement(pdiPreDeliveryInspectionLabel, "up", driver);
		return gMob.isElementVisibleWithinGivenTime(pdiPreDeliveryInspectionLabel, 100, driver);
	}
	
	public boolean isExtraDlLabelVisible() throws Exception {
		gMob.swipeToElement(extraDlLabel, "up", driver);
		return gMob.isElementVisibleWithinGivenTime(extraDlLabel, 100, driver);
	}
	
	public boolean isTechnicalWarrantyLabelVisible() throws Exception {
		gMob.swipeToElement(TechnicalWarrantyLabel, "up", driver);
		return gMob.isElementVisibleWithinGivenTime(TechnicalWarrantyLabel, 100, driver);
	}
	
	public boolean isDriveLineLabelVisible() throws Exception {
		gMob.swipeToElement(driveLineLabel, "up", driver);
		return gMob.isElementVisibleWithinGivenTime(driveLineLabel, 100, driver);
	}
	
	public boolean isAns24HLabelVisible() throws Exception {
		gMob.swipeToElement(ans24HLabel, "up", driver);
		return gMob.isElementVisibleWithinGivenTime(ans24HLabel, 100, driver);
	}
	
	// Warranty Services Screen

	public void clickJobCardHistoryTab() throws InterruptedException {
		int startX = 290;
		int startY = 98;
		int endX = 42;
		int endY = 98;
		for (int i = 0; i <= 10; i++) {
			Log.info("Waiting For Element " + i);
			try {
				if (gMob.getElementText(jobCardHistoryTab, "visible", "").equals("true")) {
					Log.info("Repair History Tab Screen Is Visible");
					gMob.clickElement(jobCardHistoryTab, "Click On Vehicle Tab");
					break;
				} else {
					gMob.swipe(startX, startY, endX, endY, 1000, driver);
				}
			} catch (Exception e) {
				gMob.swipe(startX, startY, endX, endY, 1000, driver);
				if (i > 10) {
					Log.info(e.getMessage());
					e.printStackTrace();
				}
			}
		}
	}
	
	public boolean isSummaryScreenTabVisible() throws Exception {
		gMob.swipeToElement(summaryScreenTab, "up", driver);
		return gMob.isElementVisibleWithinGivenTime(summaryScreenTab, 100, driver);
	}
	
	public boolean isDetailsScreenTabVisible() throws Exception {
		gMob.swipeToElement(detailsScreenTab, "up", driver);
		return gMob.isElementVisibleWithinGivenTime(detailsScreenTab, 100, driver);
	}
	
	public boolean isDeliveryDateLabelVisible() throws Exception {
		gMob.swipeToElement(deliveryDateLabel, "up", driver);
		return gMob.isElementVisibleWithinGivenTime(deliveryDateLabel, 100, driver);
	}
	
	public boolean isbookingIdLabelVisible() throws Exception {
		gMob.swipeToElement(bookingIdLabel, "up", driver);
		return gMob.isElementVisibleWithinGivenTime(bookingIdLabel, 100, driver);
	}

}
