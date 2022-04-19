package com.cnhi.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.auto.framework.base.Assertion;
import com.auto.framework.base.BaseTest;
import com.auto.framework.base.Log;
import com.auto.framework.utils.AppDeviceFactory;
import com.auto.framework.utils.DeviceConfiguration;
import com.cnhi.pageObjects.GenericPage;
import com.cnhi.pageObjects.HomePage;
import com.cnhi.pageObjects.JobCardPage;
import com.cnhi.pageObjects.LoginPage;
import com.cnhi.pageObjects.MileageTachoPage;
import com.cnhi.pageObjects.VehicleDetailPage;

public class AppointmentTest extends BaseTest {
	GenericPage genericPage;
	AppDeviceFactory getDevice;
	DeviceConfiguration deviceConfiguration;
	LoginPage loginPage;
	HomePage homePage;
	JobCardPage jobCardPage;
	MileageTachoPage mileageTachoPage;
	Assertion aMob;
	String device;

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws IOException {
		getDevice = new AppDeviceFactory(driver);
		deviceConfiguration = new DeviceConfiguration();

		System.out.println(deviceConfiguration.getInstance());

		device = deviceConfiguration.getDevicePlatform().toString();

		driver = getDevice.createDriver(deviceConfiguration);
		genericPage = new GenericPage();
		loginPage = new LoginPage(driver, genericPage);
		homePage = new HomePage(driver, genericPage);
		jobCardPage = new JobCardPage(driver, genericPage);
		mileageTachoPage = new MileageTachoPage(driver, genericPage);
		aMob = new Assertion();
		// driver.launchApp();

	}

	public class Demotest extends BaseTest {
		GenericPage genericPage;
		AppDeviceFactory getDevice;
		DeviceConfiguration deviceConfiguration;
		LoginPage loginPage;
		HomePage homePage;
		JobCardPage jobCardPage;
		VehicleDetailPage vehicleDetailPage;
		Assertion aMob;
		String device;

		@BeforeMethod(alwaysRun = true)
		public void beforeMethod() throws IOException {
			getDevice = new AppDeviceFactory(driver);
			deviceConfiguration = new DeviceConfiguration();

			System.out.println(deviceConfiguration.getInstance());

			device = deviceConfiguration.getDevicePlatform().toString();

			driver = getDevice.createDriver(deviceConfiguration);
			genericPage = new GenericPage();
			loginPage = new LoginPage(driver, genericPage);
			homePage = new HomePage(driver, genericPage);
			jobCardPage = new JobCardPage(driver, genericPage);
			vehicleDetailPage = new VehicleDetailPage(driver, genericPage);
			aMob = new Assertion();
			// driver.launchApp();

		}
		
		@Test(description = "1	T90-02-04-08-02 CV - Breakdown - Creation - Vehicle details")
		public void BreakdownCreationVehicleDetailsTest() throws Exception {
			Thread.sleep(10000);
			loginPage.loginToApplication("W90041D", "Saize9045");
			homePage.clickOnJobCardOption();
			jobCardPage.clickOnCreateButton();
			jobCardPage.clickOnBreakdownOrRemoteAppointmentCheckBox();
			//Making Random Customer Name
			String CustomerName="12 - VALID Customer (64100)"+genericPage.getCurrentDate("yyyy/MM/dd HH:mm:ss");
			jobCardPage.enterCustomerNameOnCustomerNameTextBox("12 - VALID Customer (64100)", device);
			jobCardPage.enterEmailOnCustomerEmailTextBox("valid@jobcard.com");
			jobCardPage.enterPhoneNoOnCustomerPhoneTextBox("123456789");
			jobCardPage.enterContactNoOnContactPhoneTextBox("123456789");

			jobCardPage.enterBrandOnBrandTextBox("IVECO");
			jobCardPage.enterModelOnModelNameTextBox("35S16V");
			jobCardPage.enterNumberOnPlateNumberTextBox("HA 100FZ");
			jobCardPage.enterMileageOnMileageTextBox("5000",device);
			jobCardPage.enterSerialNumberOnSerialNumberTextBox("ZCFC135B205304268");
			jobCardPage.enterComplainsOnCustomerComplainsTextBox("no longer starts");
			jobCardPage.enterAddressOnRepairAddressTextBox("Rue des Arènes 64100 BAYONNE");
			jobCardPage.clickOnNextStepButton();

			jobCardPage.enterActivityOnActivityTextBox("Repair");
			jobCardPage.clickOnAddButton();
			aMob.AssertTrue(jobCardPage.isToExecuteStatusVisible(), "To Execute Ststus is Visible");
			jobCardPage.clickOnArrowButton();
			jobCardPage.enterDefectCodeOnActivityTextBox("542486 COMPRESSOR DRIVE BELT");
			jobCardPage.selectFailureOptionFromFailureDropDown("007 - BLOCKAGE", device);
			jobCardPage.selectFailureSeverityRateFromFailureSeverityRateDropDown("2 - Severe", device);
			jobCardPage.selectPaymentTypeFromPaymentTypeDropDown("TEST Payment Type", device);
			jobCardPage.clickOnAddNewOperationBtn();
			jobCardPage.enterOperationNameTextBox("76 91 30 100 - RENEW STARTER CABLE CONNECTI ON", device);
			jobCardPage.clickOnSaveButton();
			aMob.AssertTrue(jobCardPage.isNewOperationCreated("RENEW STARTER CABLE CONNECTI ON"),
					"New Operation Added Successfully");
			jobCardPage.clickOnSaveButton();
			jobCardPage.SelectCreatedAppointment(CustomerName,device);
			aMob.AssertTrue(jobCardPage.isUnassignedActivitiesPopupVisible(),
					"Message Unassigned Activities For Breakdown is Visible");
			jobCardPage.clickOnYesButton();
			aMob.AssertTrue(jobCardPage.isAppointmentInfoLabelVisible(), "Appointment Info Label is Visible");
			aMob.AssertEquals(jobCardPage.getCustomerInfoFromAppointmentInfo(device), "12 - VALID Customer (64100)",
					"Customer Name from Appointment Screen i.e. " + jobCardPage.getCustomerInfoFromAppointmentInfo(device)
							+ " is same as Expected");
			aMob.AssertEquals(jobCardPage.getModelInfoFromAppointmentInfo(device), "35S16V",
					"Model Name from Appointment Screen i.e. " + jobCardPage.getModelInfoFromAppointmentInfo(device)
							+ " is same as Expected");
			aMob.AssertEquals(jobCardPage.getReceptionDateFromAppointmentInfo(device),
					genericPage.getCurrentDate("MMM dd, yyyy"),
					"Reception Date From Appointment Screen i.e. " + jobCardPage.getReceptionDateFromAppointmentInfo(device)
							+ " is same as Expected i.e. " + genericPage.getCurrentDate("MMM dd, yyyy"));
			aMob.AssertEquals(jobCardPage.getDeliveryDateFromAppointmentInfo(device),
					genericPage.getCurrentDate("MMM dd, yyyy"),
					"Delivery Date From Appointment Screen i.e. " + jobCardPage.getDeliveryDateFromAppointmentInfo(device)
							+ " is same as Expected i.e. " + genericPage.getCurrentDate("MMM dd, yyyy"));

			jobCardPage.clickOnMenuButton();
			jobCardPage.clickOnVehicleDetailMenuOption();
			vehicleDetailPage.clickVehicleDetailTab();
			aMob.AssertTrue(vehicleDetailPage.isVehicleDetailLabelVisible(), "Vehicle Detail Label is Visible");
			aMob.AssertTrue(!vehicleDetailPage.getFDPDescriptionInDealerLanguageValueFromJobDetail().equals(":"),
					"FDP Description In Dealer Language From Vehicle Detail Screen is not empty i.e. "
							+ vehicleDetailPage.getFDPDescriptionInDealerLanguageValueFromJobDetail());
			aMob.AssertTrue(!vehicleDetailPage.getModelDescriptionValueFromJobDetail().equals(":"),
					"ModelDescription From Vehicle Detail Screen is not empty i.e. "
							+ vehicleDetailPage.getModelDescriptionValueFromJobDetail());
			aMob.AssertTrue(!vehicleDetailPage.getBMValueFromJobDetail().equals(":"),
					"BM Value from Vehicle Detail Screen is not empty i.e. " + vehicleDetailPage.getBMValueFromJobDetail());
			aMob.AssertTrue(!vehicleDetailPage.getBMValueFromJobDetail().equals(":"),
					"FDP English Description From Vehicle Detail Screen is not empty i.e. "
							+ vehicleDetailPage.getfDPEnglishDescriptionValueFromJobDetail());
			aMob.AssertTrue(!vehicleDetailPage.getBMValueFromJobDetail().equals(":"),
					"FDP Code From Vehicle Detail Screen is not empty i.e. " + vehicleDetailPage.getBMValueFromJobDetail());
			aMob.AssertTrue(!vehicleDetailPage.getBMValueFromJobDetail().equals(":"),
					"Sold To Dealer Market From Vehicle Detail Screen is not empty i.e. "
							+ vehicleDetailPage.getBMValueFromJobDetail());
			aMob.AssertTrue(!vehicleDetailPage.getBMValueFromJobDetail().equals(":"),
					"Build Date From Vehicle Detail Screen is not empty i.e. "
							+ vehicleDetailPage.getBMValueFromJobDetail());
			aMob.AssertTrue(!vehicleDetailPage.getBMValueFromJobDetail().equals(":"),
					"Model Group Value From Vehicle Detail Screen is not empty i.e.  "
							+ vehicleDetailPage.getBMValueFromJobDetail());
			aMob.AssertTrue(!vehicleDetailPage.getBMValueFromJobDetail().equals(":"),
					"Production Plant Description From Vehicle Detail Screen is not empty i.e. "
							+ vehicleDetailPage.getBMValueFromJobDetail());

			vehicleDetailPage.clickSapEndCustomerTab();
			aMob.AssertTrue(vehicleDetailPage.isSAPEndCustomerLabelVisible(), "SAP End Customer Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isEndCustomerCountryTextVisibleEmpty(),
					"End Customer Country Value From SAP End Customer Screen is Empty");
			aMob.AssertTrue(vehicleDetailPage.isEndCustomerNameTextVisibleEmpty(),
					"End Customer Name Value From SAP End Customer Screen is Empty");
			aMob.AssertTrue(vehicleDetailPage.isEndCustomerCityTextVisibleEmpty(),
					"End Customer City Value From SAP End Customer Screen is Empty");

			vehicleDetailPage.clickGroupSerialNumberTab();
			aMob.AssertTrue(vehicleDetailPage.isGroupSerialNumberLabelVisible(), "Group Serial Number Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isDescriptionLabelVisible(), "Description Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isSerialLabelVisible(), "Serial Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isChassisLabelVisible(), "Chassis Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isEngineLabelVisible(), "Engine Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isGearLabelVisible(), "Gear Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isFirstAxleLabelVisible(), "First Axle Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isRearAxleLabelVisible(), "Rear Axle Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isCabinaVerniciataLabelVisible(), "Cabina Verniciata Label Visible");

			vehicleDetailPage.clickSapRepairHistoryTab();
			aMob.AssertTrue(vehicleDetailPage.isSapRepairHistoryLabelVisible(), "Repair History Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isSapRepairHistorySearchTextBoxVisible(), "Repair History Text Box Visible");
			aMob.AssertTrue(vehicleDetailPage.isDefectDescriptionLabelVisible(), "Defect Description Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isDefectDescriptionBlockageWithShowDetailsLabelVisible(),
					"Defect Description Blockage With Show Detail Label Visible");

			vehicleDetailPage.clickDefectDescriptionBlockageWithShowDetail();
			Log.info("123456");
			Log.info(vehicleDetailPage.getClaimRepairEndDateData());
			aMob.AssertTrue(!vehicleDetailPage.getClaimRepairEndDateData().equals(":"),
					"Claim Date Repair End Date Value From Vehicle Detail Screen is not empty i.e. "
							+ vehicleDetailPage.getClaimRepairEndDateData());
			aMob.AssertTrue(!vehicleDetailPage.getClaimRepairEndDateData().equals(":"),
					"Claim Date Repair End Date Value From Vehicle Detail Screen is not empty i.e. "
							+ vehicleDetailPage.getClaimRepairEndDateData());
			aMob.AssertTrue(!vehicleDetailPage.getadefectCodeData().equals(":"),
					"Defect Code Value From Vehicle Detail Screen is not empty i.e. "
							+ vehicleDetailPage.getadefectCodeData());
			aMob.AssertTrue(!vehicleDetailPage.getMileageKMtData().equals(":"),
					"Mileage Value From Vehicle Detail Screen is not empty i.e. " + vehicleDetailPage.getMileageKMtData());
			aMob.AssertTrue(!vehicleDetailPage.getWarrantyTypeData().equals(":"),
					"Warranty Type From Vehicle Detail Screen is not empty i.e. "
							+ vehicleDetailPage.getWarrantyTypeData());
			aMob.AssertTrue(!vehicleDetailPage.getWorkshopDescriptionData().equals(":"),
					"Work Shop Description From Vehicle Detail Screen is not empty  i.e. "
							+ vehicleDetailPage.getWorkshopDescriptionData());
			aMob.AssertTrue(!vehicleDetailPage.getStatusData().equals(":"),
					"Status From Vehicle Detail Screen is not empty i.e. " + vehicleDetailPage.getStatusData());

			vehicleDetailPage.clickWarrantyServicesTab();
			aMob.AssertTrue(vehicleDetailPage.isActiveWarrantyServicesLabelVisible(), "Warranty Services Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isPlannedWarrantyServicesLabelVisible(),
					"Planned Warranty Services Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isExpiredWarrantyServicesLabelVisible(),
					"Expired Warranty Services Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isNoDataLabelVisible(), "No Data Label Visible");
			aMob.AssertTrue(vehicleDetailPage.isExtraPDIShowVisible(), "Extra PDI Visible");
			vehicleDetailPage.clickExtraPDIShowDetail();
			aMob.AssertTrue(!vehicleDetailPage.getServiceNumberDetail().equals(":"),
					"Service Number Detail From Warranty Services Screen is not empty i.e. "
							+ vehicleDetailPage.getServiceNumberDetail());
			aMob.AssertTrue(!vehicleDetailPage.getwarrantyTypeDetail().equals(":"),
					"Warranty Type From Warranty Services Screen is not empty i.e. "
							+ vehicleDetailPage.getwarrantyTypeDetail());
			aMob.AssertTrue(!vehicleDetailPage.getDurationDetail().equals(":"),
					"Duration From Warranty Services Screen is not empty i.e. " + vehicleDetailPage.getDurationDetail());
			aMob.AssertTrue(!vehicleDetailPage.getStartDetail().equals(":"),
					"Start Detail From Warranty Services Screen is not empty i.e. " + vehicleDetailPage.getStartDetail());
			aMob.AssertTrue(!vehicleDetailPage.getEndDetail().equals(":"),
					"End Detail From Warranty Services Screen is not empty i.e. " + vehicleDetailPage.getEndDetail());
			aMob.AssertTrue(!vehicleDetailPage.getMileageDetail().equals(":"),
					"Mileage From Warranty Services Screen is not empty i.e. " + vehicleDetailPage.getMileageDetail());
			aMob.AssertTrue(vehicleDetailPage.getContractDetail().equals(":"),
					"Contract From Warranty Services Screen is not empty i.e. " + vehicleDetailPage.getContractDetail());
			aMob.AssertTrue(vehicleDetailPage.isPdiPreDeliveryInspectionLabelVisible(),
					"PDI Pre Delivery Inspection Visible");
			aMob.AssertTrue(vehicleDetailPage.isExtraDlLabelVisible(), "Extra DL Visible");
			aMob.AssertTrue(vehicleDetailPage.isTechnicalWarrantyLabelVisible(), "Technical Warranty Visible");
			aMob.AssertTrue(vehicleDetailPage.isDriveLineLabelVisible(), "Drive Line Visible");
			aMob.AssertTrue(vehicleDetailPage.isAns24HLabelVisible(), "Ans 24 H Visible");

			vehicleDetailPage.clickJobCardHistoryTab();
			aMob.AssertTrue(vehicleDetailPage.isSummaryScreenTabVisible(), "Summary Screen Visible");
			aMob.AssertTrue(vehicleDetailPage.isDetailsScreenTabVisible(), "Detail Screen Visible");
			aMob.AssertTrue(vehicleDetailPage.isDeliveryDateLabelVisible(), "Delivery Date Visible");
			aMob.AssertTrue(vehicleDetailPage.isbookingIdLabelVisible(), "Booking ID Visible");
		
		}

		@Test(description = "T90-02-04-08-01 CV - Breakdown - Creation - Jobcard details")
		public void BreakdownCreationJobcardDetailsTest() throws Exception {
			loginPage.loginToApplication("W90041D", "Saize9045");
			homePage.clickOnJobCardOption();
			jobCardPage.clickOnCreateButton();
			jobCardPage.clickOnBreakdownOrRemoteAppointmentCheckBox();
			//Making Random Customer Name
			String CustomerName="FELBERMATR TRANSPORT- UND"+genericPage.getCurrentDate("yyyy/MM/dd HH:mm:ss");
			jobCardPage.enterCustomerNameOnCustomerNameTextBox(CustomerName, device);
			jobCardPage.enterEmailOnCustomerEmailTextBox("valid@jobcard.com");
			jobCardPage.enterPhoneNoOnCustomerPhoneTextBox("123456789");
			jobCardPage.enterContactNoOnContactPhoneTextBox("123456789");
			jobCardPage.enterBrandOnBrandTextBox("IVECO");
			jobCardPage.enterModelOnModelNameTextBox("35S16V");
			jobCardPage.enterNumberOnPlateNumberTextBox("BL688CV");
			// Thread.sleep(20000);
			jobCardPage.enterMileageOnMileageTextBox("5000",device);
			jobCardPage.enterSerialNumberOnSerialNumberTextBox("ZCFC135B205130749");
			Thread.sleep(4000);
			jobCardPage.enterComplainsOnCustomerComplainsTextBox("Issue on");
			Thread.sleep(2000);
			jobCardPage.enterAddressOnRepairAddressTextBox("HEBETECHNIK GMBH & CO KG AUPOINT 45101 BERGHEIM");
			jobCardPage.navigatingToCustomerNameTextBox();
//			jobCardPage.enterCustomerNameOnCustomerNameTextBox(CustomerName, device);
//			jobCardPage.enterEmailOnCustomerEmailTextBox("valid@jobcard.com");
//			jobCardPage.enterPhoneNoOnCustomerPhoneTextBox("123456789");
//			jobCardPage.enterContactNoOnContactPhoneTextBox("123456789");
			jobCardPage.clickOnNextStepButton();
			jobCardPage.enterActivityOnActivityTextBox("Repair");
			jobCardPage.clickOnAddButton();
			aMob.AssertTrue(jobCardPage.isToExecuteStatusVisible(), "To Execute Ststus is Visible");
			jobCardPage.clickOnArrowButton();
			jobCardPage.enterDefectCodeOnActivityTextBox("542486 COMPRESSOR DRIVE BELT");
			jobCardPage.selectFailureOptionFromFailureDropDown("001 - DEFECT", device);
			jobCardPage.selectFailureSeverityRateFromFailureSeverityRateDropDown("2 - Severe", device);
			jobCardPage.selectPaymentTypeFromPaymentTypeDropDown("TEST Payment Type", device);
			jobCardPage.clickOnAddNewOperationBtn();
			jobCardPage.enterOperationNameTextBox("55 59 10 100 - R-I SAFETY BELTS DRIVER SEAT", device);
			jobCardPage.clickOnPartsPlusIcon();
			jobCardPage.enterPartCodeOnPartCodeTextBox("54210956", device);
			jobCardPage.clickOnSaveButton();
			aMob.AssertTrue(jobCardPage.isNewOperationCreated("R-I SAFETY BELTS DRIVER SEAT"),
					"New Operation Added Successfully");
			jobCardPage.clickOnAddAnotherItemBtn();
			jobCardPage.selectTypeFromTypeDropDown("Freight", device);
			jobCardPage.selectCodeFromCodeDropDown("C010 - SERVICE PROGRAM", device);
			jobCardPage.enterDescriptionOnDescriptionTextBox("SERVICE PROGRAM",device);
			jobCardPage.enterPriceOnPriceTextBox("135",device);
			jobCardPage.clickOnAddItemSaveBtn();
			aMob.AssertTrue(jobCardPage.isNewTypeCreated("Freight"), "New Type Added Successfully");
			jobCardPage.clickOnSaveButton();
			jobCardPage.SelectCreatedAppointment(CustomerName,device);
			aMob.AssertTrue(jobCardPage.isUnassignedActivitiesPopupVisible(),
					"Message Unassigned Activities For Breakdown is Visible");
			jobCardPage.clickOnYesButton();
			aMob.AssertTrue(jobCardPage.isAppointmentInfoLabelVisible(), "Appointment Info Label is Visible");
			aMob.AssertTrue(CustomerName.contains(jobCardPage.getCustomerInfoFromAppointmentInfo(device)),
					"Customer Name from Appointment Screen i.e. " + jobCardPage.getCustomerInfoFromAppointmentInfo(device)
							+ " is same as Expected");

			aMob.AssertEquals(jobCardPage.getModelInfoFromAppointmentInfo(device), "35S16V",
					"Model Name from Appointment Screen i.e. " + jobCardPage.getModelInfoFromAppointmentInfo(device)
							+ " is same as Expected");

			aMob.AssertEquals(jobCardPage.getReceptionDateFromAppointmentInfo(device),
					genericPage.getCurrentDate("MMM dd, yyyy"),
					"Reception Date From Appointment Screen i.e. " + jobCardPage.getReceptionDateFromAppointmentInfo(device)
							+ " is same as Expected i.e. " + genericPage.getCurrentDate("MMM dd, yyyy"));

			aMob.AssertEquals(jobCardPage.getDeliveryDateFromAppointmentInfo(device),
					genericPage.getCurrentDate("MMM dd, yyyy"),
					"Delivery Date From Appointment Screen i.e. " + jobCardPage.getDeliveryDateFromAppointmentInfo(device)
							+ " is same as Expected i.e. " + genericPage.getCurrentDate("MMM dd, yyyy"));

			jobCardPage.clickOnMenuButton();
			jobCardPage.clickOnJobDetailMenuOption();

			aMob.AssertTrue(jobCardPage.isAppointmentInfoLabelVisible(), "Appointment Info Label is Visible");
			aMob.AssertTrue(CustomerName.contains(jobCardPage.getCustomerInfoFromAppointmentInfo(device)),
					"Customer Name from Appointment Screen i.e. " + jobCardPage.getCustomerInfoFromAppointmentInfo(device)
							+ " is same as Expected");

			aMob.AssertEquals(jobCardPage.getModelInfoFromAppointmentInfo(device), "35S16V",
					"Model Name From Appointment Screen i.e. " + jobCardPage.getModelInfoFromAppointmentInfo(device)
							+ " is same as Expected");

			aMob.AssertEquals(jobCardPage.getReceptionDateFromAppointmentInfo(device),
					genericPage.getCurrentDate("MMM dd, yyyy"),
					"Reception Date from Appointment Screen i.e. " + jobCardPage.getReceptionDateFromAppointmentInfo(device)
							+ " is same as Expected i.e. " + genericPage.getCurrentDate("MMM dd, yyyy"));

			aMob.AssertEquals(jobCardPage.getDeliveryDateFromAppointmentInfo(device),
					genericPage.getCurrentDate("MMM dd, yyyy"),
					"Delivery Date From Appointment Screen i.e. " + jobCardPage.getDeliveryDateFromAppointmentInfo(device)
							+ " is same as Expected i.e. " + genericPage.getCurrentDate("MMM dd, yyyy"));

			aMob.AssertTrue(jobCardPage.isContactDetailLabelVisible(), "Contact Detail Label is Visible");

			aMob.AssertEquals(jobCardPage.getCustomerEmailValueFromJobDetail(device), "valid@jobcard.com",
					"Customer Email From Job Detail Screen i.e. " + jobCardPage.getCustomerEmailValueFromJobDetail(device)
							+ " is same as Expected");

			aMob.AssertEquals(jobCardPage.getCustomerPhoneNoValueFromJobDetail(device), "123456789",
					"Customer Phone No From Job Detail Screen i.e. " + jobCardPage.getCustomerPhoneNoValueFromJobDetail(device)
							+ " is same as Expected");

			aMob.AssertEquals(jobCardPage.getContactPhoneNumberNoFromJobDetail(device), "123456789",
					"Contact Phone No From Job Detail Screen i.e. " + jobCardPage.getContactPhoneNumberNoFromJobDetail(device)
							+ " is same as Expected");

			aMob.AssertTrue(jobCardPage.isRepairAddressLabelVisible(), "Repair Address Label is Visible");

			aMob.AssertEquals(jobCardPage.getRepairAddressFromJobDetail(device),
					"HEBETECHNIK GMBH & CO KG AUPOINT 45101 BERGHEIM", "Repair Address From Job Detail Screen i.e. "
							+ jobCardPage.getRepairAddressFromJobDetail(device) + " is same as Expected");

			aMob.AssertTrue(jobCardPage.isCustomerComplainsLabelVisible(), "Customer Complain Label is Visible");

			aMob.AssertEquals(jobCardPage.getCustomerComplainEmailFromJobDetail(device), "Issue on",
					"Customer Complain From Job Detail Screen i.e. " + jobCardPage.getCustomerComplainEmailFromJobDetail(device)
							+ " is same as Expected");

		}
		
		@Test(description = "T90-02-04-08-03 CV - Breakdown - Vehicle reception - Reception checklist")
		public void BreakdownVehicleReceptionChecklistTest() throws Exception {
			loginPage.loginToApplication("W90041D", "Saize9045");
			System.out.println(driver.getContextHandles());
			homePage.clickOnJobCardOption();
			Thread.sleep(3000);
			jobCardPage.clickOnCreateButton();
			jobCardPage.clickOnBreakdownOrRemoteAppointmentCheckBox();
			String CustomerName = "03 - Customer VALID" + genericPage.getCurrentDate("yyyy/MM/dd HH:mm:ss");
			jobCardPage.enterCustomerNameOnCustomerNameTextBox(CustomerName, device);
			jobCardPage.enterEmailOnCustomerEmailTextBox("customer.valid@cnhi.com");
			jobCardPage.enterPhoneNoOnCustomerPhoneTextBox("0634353637");
			jobCardPage.enterContactNoOnContactPhoneTextBox("0745464748");
			jobCardPage.enterBrandOnBrandTextBox("IVECO");
			jobCardPage.enterModelOnModelNameTextBox("50C15V");
			jobCardPage.enterNumberOnPlateNumberTextBox("ZE-983IW");
			jobCardPage.enterMileageOnMileageTextBox("40000", device);
			jobCardPage.enterSerialNumberOnSerialNumberTextBox("ZCFC150A705105307");
			Thread.sleep(3000);
			jobCardPage.enterComplainsOnCustomerComplainsTextBox("Alarm on");
			jobCardPage.enterAddressOnRepairAddressTextBox("Valid Office India");
			jobCardPage.selectCheckListOption("Test Reception Checklist");
//			jobCardPage.navigatingToCustomerNameTextBox();
//			jobCardPage.enterCustomerNameOnCustomerNameTextBox(CustomerName, device);
//			jobCardPage.enterEmailOnCustomerEmailTextBox("customer.valid@cnhi.com");
//			jobCardPage.enterPhoneNoOnCustomerPhoneTextBox("0634353637");
//			jobCardPage.enterContactNoOnContactPhoneTextBox("0745464748");
				jobCardPage.clickOnNextStepButton();
			jobCardPage.enterActivityOnActivityTextBox("Remote Activity");
			jobCardPage.clickOnAddButton();
			aMob.AssertTrue(jobCardPage.isToExecuteStatusVisible(), "To Execute Ststus is Visible");
			jobCardPage.clickOnSaveButton();
			String appointmentData = jobCardPage.getCreatedAppointmentData(CustomerName, device);

			aMob.AssertTrue(appointmentData.contains(CustomerName),
					"Customer Name Visible In the Kist Of New Created Appointment");
			aMob.AssertTrue(appointmentData.contains("50C15V"),
					"Model Name Visible In the First Of New Created Appointment");
			aMob.AssertTrue(appointmentData.contains("50C15V"),
					"Model Name Visible In the First Of New Created Appointment");
			aMob.AssertTrue(appointmentData.contains("ZE-983IW"),
					"Plate Number Visible In the First Of New Created Appointment");
			jobCardPage.SelectCreatedAppointment(CustomerName, device);

			aMob.AssertTrue(jobCardPage.isUnassignedActivitiesPopupVisible(),
					"Message Unassigned Activities For Breakdown is Visible");
			jobCardPage.clickOnYesButton();
			aMob.AssertTrue(jobCardPage.isAppointmentInfoLabelVisible(), "Appointment Info Label is Visible");
			aMob.AssertTrue(CustomerName.contains(jobCardPage.getCustomerInfoFromAppointmentInfo(device)),
					"Customer Name from Appointment Screen i.e. " + jobCardPage.getCustomerInfoFromAppointmentInfo(device)
							+ " is same as Expected");

			aMob.AssertEquals(jobCardPage.getModelInfoFromAppointmentInfo(device), "50C15V",
					"Model Name from Appointment Screen i.e. " + jobCardPage.getModelInfoFromAppointmentInfo(device)
							+ " is same as Expected");

			aMob.AssertEquals(jobCardPage.getReceptionDateFromAppointmentInfo(device),
					genericPage.getCurrentDate("MMM dd, yyyy"),
					"Reception Date From Appointment Screen i.e. " + jobCardPage.getReceptionDateFromAppointmentInfo(device)
							+ " is same as Expected i.e. " + genericPage.getCurrentDate("MMM dd, yyyy"));

			aMob.AssertEquals(jobCardPage.getDeliveryDateFromAppointmentInfo(device),
					genericPage.getCurrentDate("MMM dd, yyyy"),
					"Delivery Date From Appointment Screen i.e. " + jobCardPage.getDeliveryDateFromAppointmentInfo(device)
							+ " is same as Expected i.e. " + genericPage.getCurrentDate("MMM dd, yyyy"));

			mileageTachoPage.clickOnMileageTachoTab();
			Log.info("gjhgjh" + mileageTachoPage.isMileageTachoCameraStarIconVisible());
			aMob.AssertTrue(mileageTachoPage.isMileageTachoCameraStarIconVisible() == 2,
					"Camera Mandatory Star Icon Is Visible");
			mileageTachoPage.clickOnMileageTachoCameraIcon();
			mileageTachoPage.clickOnAddImageIcon();
			mileageTachoPage.clickOnImage();
			Log.info("gjhgjh" + mileageTachoPage.isMileageTachoCameraStarIconVisible());

			Thread.sleep(8000);
			// driver.context(Geeks[1]);
			System.out.println(driver.getContext());

//			System.out.println(driver.findElement(By.xpath("(//ion-button[@id='jobcard-mandatoryfield-mileage-photo-phone'])[1]")).getCssValue("color"));
//			System.out.println(driver.findElement(By.xpath("(//ion-button[@id='jobcard-mandatoryfield-mileage-photo-phone'])[1]")).getCssValue("--ion-color-primary-rgb"));

			// driver.context(Geeks[0]);
			System.out.println(driver.getContext());
			Thread.sleep(5000);
			aMob.AssertTrue(mileageTachoPage.isMileageTachoCameraStarIconVisible() == 1,
					"Camera Mandatory Star Icon Not Visible-- Green Dot Is Visible");

			jobCardPage.selectCheckListOption("Test Reception Checklist");

			mileageTachoPage.clickOnQuestion13DotsBtn();
			mileageTachoPage.clickOnCommentIcon();
			mileageTachoPage.enterCommentTextBox("Technician Comment on Inspection checklist");
			mileageTachoPage.clickOnSubmitBtn();
			String yesChkBeforeStatus = mileageTachoPage.getYesRadioButtonCheckStatus();
			mileageTachoPage.clickOnYesRadioBtnFromQuestion1();

			mileageTachoPage.clickOnQuestion23DotsBtn();
			int beforeCount = mileageTachoPage.getTotalCameraIconCount();
			Log.info("jgjh" + beforeCount);
			mileageTachoPage.clickOnAddImageIconFromQuestions();
			mileageTachoPage.clickOnImage();
			mileageTachoPage.clickOnQuestion23DotsBtn();
			int afterCount = mileageTachoPage.getTotalCameraIconCount();
			Log.info("jgjh" + afterCount);
			aMob.AssertTrue(beforeCount < afterCount, "Image Added Successfully");
			mileageTachoPage.tapOnScreen();
			String greenChkBeforeStatus = mileageTachoPage.getGreenRadioButtonCheckStatus();
			mileageTachoPage.clickOnGreenRadioBtnFromQuestion2();

			mileageTachoPage.clickOnQuestion33DotsBtn();
			mileageTachoPage.clickOnRecorderIcon();
			mileageTachoPage.clickOnRecordedBtnIcon();
			mileageTachoPage.clickOnOkButton();
			mileageTachoPage.clickOnRecorderStopBtnIcon();
			aMob.AssertTrue(mileageTachoPage.isRecordedVoiceVisible(), "Recorded Voice Visible Successfully");
			mileageTachoPage.clickOnRecordeCloseBtnIcon();
			String sliderBeforeValue = mileageTachoPage.getSliderValue();
			mileageTachoPage.slideQuestion3Slider();
			String sliderAfterValue = mileageTachoPage.getSliderValue();
			aMob.AssertTrue(!sliderBeforeValue.equalsIgnoreCase(sliderAfterValue),
					"Slider Value Before Click On Slider i.e. " + sliderBeforeValue
							+ " Changed After Clicking On Slider i.e. " + sliderAfterValue);

			mileageTachoPage.clickOnQuestion43DotsBtn();
			mileageTachoPage.clickOnCommentIcon();
			mileageTachoPage.enterCommentTextBox("Technician Comment on Inspection checklist");
			mileageTachoPage.clickOnSubmitBtn();
			String OnOffChkBeforeStatus = mileageTachoPage.getonOffSwitchButtonCheckStatus();
			mileageTachoPage.clickOnSwitcherFromQuestion4FromQuestion4();

			mileageTachoPage.clickOnCheckinIcon();
			mileageTachoPage.enterCustomerNameTextBox("Customer VALID");
			mileageTachoPage.enterSignatureTextBox();
			mileageTachoPage.turnOnTermConditionRadioButton();
			mileageTachoPage.clickOnSubmitBtn();
			mileageTachoPage.clickOnCloseReceptionButton();

			jobCardPage.SelectReceivedAppointment(device);
			jobCardPage.clickOnMenuButton();
			jobCardPage.clickOnchecklistMenuOption();

			mileageTachoPage.clickOnCheckinIcon();

			String yesChkFinalStatus = mileageTachoPage.getYesRadioButtonCheckStatus();
			aMob.AssertTrue(!yesChkFinalStatus.equalsIgnoreCase(yesChkBeforeStatus),
					"Yes Radio Chk Value Before Click i.e. " + yesChkBeforeStatus + " Changed After Clicking i.e. "
							+ yesChkFinalStatus);
			mileageTachoPage.clickOnQuestion13DotsBtn();
			mileageTachoPage.clickOnCommentIcon();
			aMob.AssertEquals(mileageTachoPage.getCommentBoxText(), "Technician Comment on Inspection checklist",
					"Comment Value i.e. " + mileageTachoPage.getCommentBoxText() + "Is Matched With The Expected");
			mileageTachoPage.clickOnSubmitBtn();

			String greenChkFinalStatus = mileageTachoPage.getGreenRadioButtonCheckStatus();
			aMob.AssertTrue(!greenChkFinalStatus.equalsIgnoreCase(greenChkBeforeStatus),
					"Green Radio Chk Value Before Click i.e. " + greenChkBeforeStatus + " Changed After Clicking i.e. "
							+ greenChkFinalStatus);
			mileageTachoPage.clickOnQuestion23DotsBtn();
			mileageTachoPage.clickOnImageAddedEyeIcon();
			aMob.AssertTrue(mileageTachoPage.isAddedImageVisible(), "Image Added Successfully");
			mileageTachoPage.clickOnCloseBtnFromAddedImageScreen();

			String sliderFinalValue = mileageTachoPage.getSliderValue();
			aMob.AssertTrue(!sliderBeforeValue.equalsIgnoreCase(sliderFinalValue),
					"Slider Value Before Click On Slider i.e. " + sliderBeforeValue
							+ " Changed After Clicking On Slider i.e. " + sliderFinalValue);
			mileageTachoPage.clickOnQuestion33DotsBtn();
			mileageTachoPage.clickOnRecorderIcon();
			aMob.AssertTrue(mileageTachoPage.isRecordedVoiceVisible(), "Recorded Voice Visible Successfully");
			mileageTachoPage.clickOnRecordeCloseBtnIcon();

			String OnOffChkFinalStatus = mileageTachoPage.getonOffSwitchButtonCheckStatus();
			aMob.AssertTrue(!OnOffChkFinalStatus.equalsIgnoreCase(OnOffChkBeforeStatus),
					"Green Radio Chk Value Before Click i.e. " + OnOffChkBeforeStatus + " Changed After Clicking i.e. "
							+ OnOffChkFinalStatus);

		}
		
//		@Test(description = "T90-02-04-08-03 CV - Breakdown - Vehicle reception - Mileage + Tacho and Engine hours")
//		public void BreakdownVehicleReceptionMileageTachoAndEngineHoursTest() throws Exception {
//			loginPage.loginToApplication("W90041D", "Saize9045");
//			homePage.clickOnJobCardOption();
//			jobCardPage.clickOnCreateButton();
//			jobCardPage.clickOnBreakdownOrRemoteAppointmentCheckBox();
//			jobCardPage.enterCustomerNameOnCustomerNameTextBox("FELBERMATR TRANSPORT- UND", device);
//			jobCardPage.enterEmailOnCustomerEmailTextBox("valid@jobcard.com");
//			jobCardPage.enterPhoneNoOnCustomerPhoneTextBox("123456789");
//			jobCardPage.enterContactNoOnContactPhoneTextBox("123456789");
//			//jobCardPage.enterFiscalOnFiscalInformationTextBox("987654321");
//			jobCardPage.enterBrandOnBrandTextBox("IVECO");
//			jobCardPage.enterModelOnModelNameTextBox("35S16V");
//			jobCardPage.enterNumberOnPlateNumberTextBox("BL688CV");
//			// Thread.sleep(20000);
//			jobCardPage.enterMileageOnMileageTextBox("5000",device);
//			jobCardPage.enterSerialNumberOnSerialNumberTextBox("ZCFC135B205130749");
//			Thread.sleep(3000);
//			jobCardPage.enterComplainsOnCustomerComplainsTextBox("Issue on");
//			jobCardPage.enterAddressOnRepairAddressTextBox("HEBETECHNIK GMBH & CO KG AUPOINT 45101 BERGHEIM");
//
//			jobCardPage.clickOnNextStepButton();
//			jobCardPage.enterActivityOnActivityTextBox("Repair");
//			jobCardPage.clickOnAddButton();
//			aMob.AssertTrue(jobCardPage.isToExecuteStatusVisible(), "To Execute Ststus is Visible");
//			jobCardPage.clickOnArrowButton();
//			jobCardPage.enterDefectCodeOnActivityTextBox("542486 COMPRESSOR DRIVE BELT");
//			jobCardPage.selectFailureOptionFromFailureDropDown("001 - DEFECT", device);
//			jobCardPage.selectFailureSeverityRateFromFailureSeverityRateDropDown("2 - Severe", device);
//			jobCardPage.selectPaymentTypeFromPaymentTypeDropDown("TEST Payment Type", device);
//			jobCardPage.clickOnAddNewOperationBtn();
//			jobCardPage.enterOperationNameTextBox("55 59 10 100 - R-I SAFETY BELTS DRIVER SEAT", device);
//			jobCardPage.clickOnPartsPlusIcon();
//			jobCardPage.enterPartCodeOnPartCodeTextBox("54210956", device);
//			jobCardPage.clickOnSaveButton();
//			aMob.AssertTrue(jobCardPage.isNewOperationCreated("R-I SAFETY BELTS DRIVER SEAT"),
//					"New Operation Added Successfully");
//			jobCardPage.clickOnAddAnotherItemBtn();
//			jobCardPage.selectTypeFromTypeDropDown("Freight", device);
//			jobCardPage.selectCodeFromCodeDropDown("C010 - SERVICE PROGRAM", device);
//			jobCardPage.enterDescriptionOnDescriptionTextBox("SERVICE PROGRAM");
//			jobCardPage.enterPriceOnPriceTextBox("135");
//			jobCardPage.clickOnAddItemSaveBtn();
//			aMob.AssertTrue(jobCardPage.isNewTypeCreated("Freight"), "New Type Added Successfully");
//			jobCardPage.clickOnSaveButton();
//			jobCardPage.SelectCreatedAppointment(device);
//			aMob.AssertTrue(jobCardPage.isUnassignedActivitiesPopupVisible(),
//					"Message Unassigned Activities For Breakdown is Visible");
//			jobCardPage.clickOnYesButton();
//			aMob.AssertTrue(jobCardPage.isAppointmentInfoLabelVisible(), "Appointment Info Label is Visible");
//			aMob.AssertEquals(jobCardPage.getCustomerInfoFromAppointmentInfo(device), "FELBERMATR TRANSPORT- UND",
//					"Customer Name from Appointment Screen i.e. " + jobCardPage.getCustomerInfoFromAppointmentInfo(device)
//							+ " is same as Expected");
//
//			aMob.AssertEquals(jobCardPage.getModelInfoFromAppointmentInfo(device), "35S16V",
//					"Model Name from Appointment Screen i.e. " + jobCardPage.getModelInfoFromAppointmentInfo(device)
//							+ " is same as Expected");
//
//			aMob.AssertEquals(jobCardPage.getReceptionDateFromAppointmentInfo(device),
//					genericPage.getCurrentDate("MMM dd, yyyy"),
//					"Reception Date From Appointment Screen i.e. " + jobCardPage.getReceptionDateFromAppointmentInfo(device)
//							+ " is same as Expected i.e. " + genericPage.getCurrentDate("MMM dd, yyyy"));
//
//			aMob.AssertEquals(jobCardPage.getDeliveryDateFromAppointmentInfo(device),
//					genericPage.getCurrentDate("MMM dd, yyyy"),
//					"Delivery Date From Appointment Screen i.e. " + jobCardPage.getDeliveryDateFromAppointmentInfo(device)
//							+ " is same as Expected i.e. " + genericPage.getCurrentDate("MMM dd, yyyy"));
//
//			jobCardPage.clickOnMenuButton();
//			jobCardPage.clickOnJobDetailMenuOption();
//
//			aMob.AssertTrue(jobCardPage.isAppointmentInfoLabelVisible(), "Appointment Info Label is Visible");
//			aMob.AssertEquals(jobCardPage.getCustomerInfoFromAppointmentInfo(device), "FELBERMATR TRANSPORT- UND",
//					"Customer Name From Appointment Screen i.e. " + jobCardPage.getCustomerInfoFromAppointmentInfo(device)
//							+ " is same as Expected");
//
//			aMob.AssertEquals(jobCardPage.getModelInfoFromAppointmentInfo(device), "35S16V",
//					"Model Name From Appointment Screen i.e. " + jobCardPage.getModelInfoFromAppointmentInfo(device)
//							+ " is same as Expected");
//
//			aMob.AssertEquals(jobCardPage.getReceptionDateFromAppointmentInfo(device),
//					genericPage.getCurrentDate("MMM dd, yyyy"),
//					"Reception Date from Appointment Screen i.e. " + jobCardPage.getReceptionDateFromAppointmentInfo(device)
//							+ " is same as Expected i.e. " + genericPage.getCurrentDate("MMM dd, yyyy"));
//
//			aMob.AssertEquals(jobCardPage.getDeliveryDateFromAppointmentInfo(device),
//					genericPage.getCurrentDate("MMM dd, yyyy"),
//					"Delivery Date From Appointment Screen i.e. " + jobCardPage.getDeliveryDateFromAppointmentInfo(device)
//							+ " is same as Expected i.e. " + genericPage.getCurrentDate("MMM dd, yyyy"));
//
//			aMob.AssertTrue(jobCardPage.isContactDetailLabelVisible(), "Contact Detail Label is Visible");
//
//			aMob.AssertEquals(jobCardPage.getCustomerEmailValueFromJobDetail(), "valid@jobcard.com",
//					"Customer Email From Job Detail Screen i.e. " + jobCardPage.getCustomerEmailValueFromJobDetail()
//							+ " is same as Expected");
//
//			aMob.AssertEquals(jobCardPage.getCustomerPhoneNoValueFromJobDetail(), "123456789",
//					"Customer Phone No From Job Detail Screen i.e. " + jobCardPage.getCustomerPhoneNoValueFromJobDetail()
//							+ " is same as Expected");
//
//			aMob.AssertEquals(jobCardPage.getContactPhoneNumberNoFromJobDetail(), "123456789",
//					"Contact Phone No From Job Detail Screen i.e. " + jobCardPage.getContactPhoneNumberNoFromJobDetail()
//							+ " is same as Expected");
//
//			aMob.AssertTrue(jobCardPage.isRepairAddressLabelVisible(), "Repair Address Label is Visible");
//
//			aMob.AssertEquals(jobCardPage.getRepairAddressFromJobDetail(),
//					"HEBETECHNIK GMBH & CO KG AUPOINT 45101 BERGHEIM", "Repair Address From Job Detail Screen i.e. "
//							+ jobCardPage.getRepairAddressFromJobDetail() + " is same as Expected");
//
//			aMob.AssertTrue(jobCardPage.isCustomerComplainsLabelVisible(), "Customer Complain Label is Visible");
//
//			aMob.AssertEquals(jobCardPage.getCustomerComplainEmailFromJobDetail(), "Issue on",
//					"Customer Complain From Job Detail Screen i.e. " + jobCardPage.getCustomerComplainEmailFromJobDetail()
//							+ " is same as Expected");
//
//		}


		@AfterMethod(alwaysRun = true)
		public void afterMethod() {
			System.out.println("Test");
			// driver.quit();
		}
	}

}
