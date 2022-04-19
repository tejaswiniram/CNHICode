//package com.cnhi.tests;
//
//import static org.testng.Assert.assertTrue;
//
//import java.io.IOException;
//
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.auto.framework.base.BaseTest;
//import com.auto.framework.utils.AppDeviceFactory;
//import com.auto.framework.utils.DeviceConfiguration;
//import com.cnhi.pageObjects.GenericPage;
//import com.cnhi.pageObjects.HomePage;
//import com.cnhi.pageObjects.JobCardPage;
//import com.cnhi.pageObjects.LoginPage;
//
//public class Demotest2 extends BaseTest {
//	GenericPage genericPage;
//	AppDeviceFactory getDevice;
//	DeviceConfiguration deviceConfiguration;
//	LoginPage loginPage;
//	HomePage homePage;
//	JobCardPage jobCardPage;
//
//	@BeforeMethod(alwaysRun = true)
//	public void beforeMethod() throws IOException {
//		getDevice = new AppDeviceFactory(driver);
//		deviceConfiguration = new DeviceConfiguration();
//		System.out.println(deviceConfiguration.getInstance());
//
//		driver = getDevice.createDriver(deviceConfiguration);
//		genericPage = new GenericPage();
//		loginPage = new LoginPage(driver, genericPage);
//		homePage = new HomePage(driver, genericPage);
//		jobCardPage = new JobCardPage(driver, genericPage);
//		// driver.launchApp();
//
//	}
//
//	@Test(description = "T90-02-04-08-02 CV - Breakdown - Creation - Vehicle details")
//	public void loginTest() throws Exception {
//		Thread.sleep(10000);
//		loginPage.tapOnLoginScreen();
//		loginPage.enterUsername();
//		loginPage.enterPassword();
//		loginPage.clickOnSignInBtn();
//		homePage.clickOnJobCardOption();
//		jobCardPage.clickOnCreateButton();
//		jobCardPage.clickOnBreakdownOrRemoteAppointmentCheckBox();
//		jobCardPage.enterCustomerNameOnCustomerNameTextBox();
//		jobCardPage.enterEmailOnCustomerEmailTextBox();
//		jobCardPage.enterPhoneNoOnCustomerPhoneTextBox();
//		jobCardPage.enterContactNoOnContactPhoneTextBox();
//		// jobCardPage.enterFiscalOnFiscalInformationTextBox();
//		jobCardPage.enterBrandOnBrandTextBox();
//		jobCardPage.enterModelOnModelNameTextBox();
//		jobCardPage.enterNumberOnPlateNumberTextBox();
//		jobCardPage.enterMileageOnMileageTextBox();
//		jobCardPage.enterSerialNumberOnSerialNumberTextBox();
//		jobCardPage.enterComplainsOnCustomerComplainsTextBox();
//		jobCardPage.enterAddressOnRepairAddressTextBox();
//		jobCardPage.clickOnNextStepButton();
//		jobCardPage.enterActivityOnActivityTextBox();
//		jobCardPage.clickOnAddButton();
//		jobCardPage.clickOnArrowButton();
//		jobCardPage.enterDefectCodeOnActivityTextBox();
//		jobCardPage.selectFailureOptionFromFailureDropDown("001 - DEFECT");
//		jobCardPage.selectFailureSeverityRateFromFailureSeverityRateDropDown("2 - Severe");
//		jobCardPage.selectPaymentTypeFromPaymentTypeDropDown("TEST Payment Type");
//		jobCardPage.clickOnAddNewOperationBtn();
//		jobCardPage.enterOperationNameTextBox();
//		//jobCardPage.clickOnPartsPlusIcon();
//		//jobCardPage.enterPartCodeOnPartCodeTextBox();
//		jobCardPage.clickOnSaveButton();
//		//Assert.assertTrue(jobCardPage.isNewOperationCreated());
//		jobCardPage.clickOnAddAnotherItemBtn();
//		jobCardPage.selectTypeFromTypeDropDown("Freight");
//		jobCardPage.selectCodeFromCodeDropDown("C010M - MATERIAL PROGRAM");
//		jobCardPage.enterDescriptionOnDescriptionTextBox();
//		jobCardPage.enterPriceOnPriceTextBox();
//		jobCardPage.clickOnAddItemSaveBtn();
//		//Assert.assertTrue(jobCardPage.isNewTypeCreated());
//		jobCardPage.clickOnSaveButton();
////		jobCardPage.SelectCreatedAppointment();
////		Assert.assertTrue(jobCardPage.isUnassignedActivitiesPopupVisible());
////		jobCardPage.clickOnYesButton();
////		jobCardPage.clickOnMenuButton();
////		jobCardPage.clickOnJobDetailMenuOption();
////		Assert.assertEquals(jobCardPage.getCustomerName(), "106267 - FELBERMAYR TRANSPORT- UND");
////		Assert.assertEquals(jobCardPage.getModelName(), "35S16V");
////		Assert.assertEquals(jobCardPage.getReceptionDate(), "Feb 23, 2022");
////		Assert.assertEquals(jobCardPage.getDeliveryDate(), "Feb 23, 2022");
//							
//	}
//	
//	
//
//	@Test(description = "Login to application Trying to fail this scenario for reprting purpose ")
//	public void loginTest2() throws IOException {
////		boolean b=loginPage.isSignInBtnVisible();
////		System.out.println(b);
////		Assert.assertFalse(loginPage.isSignInBtnVisible());
//		loginPage.enterUsername();
//		loginPage.enterPassword();
//		loginPage.clickOnSignInBtn();
//		//Adding wrong assert to show how it is visible on report
//		Assert.assertTrue(jobCardPage.isNewTypeCreated());
//	}
//
//	@AfterMethod(alwaysRun = true)
//	public void afterMethod() {
//		 driver.quit();
//	}
//
//}
