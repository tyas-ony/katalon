import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.comment('Buka Halaman Dashboard Rating Negatif')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

'Buka Menu Outage'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Rating Negatif Internal/div_OutageOutage ManagementDashboardTindak _a56380'))

'Buka Menu Dashboard Rating Negatif'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Rating Negatif Internal/a_Dashboard Negative Rating'))

'Pilih Tanggal Awal'
WebUI.click(findTestObject('Outage/Dashboard/Rating Negatif Internal/Date Picker/Tanggal Awal'))

'Pilih Tahun'
WebUI.click(findTestObject('Outage/Dashboard/Rating Negatif Internal/Date Picker/Picker Bulan Tahun'))

WebUI.click(findTestObject('Outage/Dashboard/Rating Negatif Internal/Date Picker/Tahun 2021'))

'Pilih Bulan'
WebUI.click(findTestObject('Outage/Dashboard/Rating Negatif Internal/Date Picker/Previous Month'))

WebUI.click(findTestObject('Outage/Dashboard/Rating Negatif Internal/Date Picker/Previous Month'))

'Pilih Tanggal'
WebUI.click(findTestObject('Outage/Dashboard/Rating Negatif Internal/Date Picker/Tanggal 1'))

'Menerapkan Filter'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Rating Negatif Internal/button_TERAPKAN'))

WebUI.takeFullPageScreenshot()

'Klik Div Opdis Sulmapana'
WebUI.click(findTestObject('Outage/Dashboard/Rating Negatif Internal/1a_DIV. OPDIS SULMAPANA'))

WebUI.waitForPageLoad(3)

WebUI.takeFullPageScreenshot()

'Scroll down'
WebUI.scrollToElement(findTestObject('Outage/Dashboard/Rating Negatif Internal/2a_UIW SULUTTENGGO'), 1)

'Klik Kontak General Manager'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Rating Negatif Internal/button_GM'))

WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Rating Negatif Internal/Kontak General Manager'), 
    0)

WebUI.waitForPageLoad(1)

WebUI.takeElementScreenshot(findTestObject('Outage/Dashboard/Rating Negatif Internal/Kontak General Manager'))

'Klik WA General Manager'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Rating Negatif Internal/a_HUBUNGI WA General Manager UNIT'))

'Klik GSM General Manager'
WebUI.click(findTestObject('Outage/Dashboard/Rating Negatif Internal/a_HUBUNGI GSM General Manager UNIT'))

WebUI.switchToWindowTitle('(VCC) Virtual Command Center by PLN')

WebUI.click(findTestObject('Outage/Dashboard/Rating Negatif Internal/x_Kontak GM'))

'Klik UIW Suluttenggo'
WebUI.click(findTestObject('Outage/Dashboard/Rating Negatif Internal/2a_UIW SULUTTENGGO'))

WebUI.waitForPageLoad(3)

WebUI.scrollToElement(findTestObject('Outage/Dashboard/Rating Negatif Internal/3a_UP3 MANADO'), 1)

WebUI.takeFullPageScreenshot()

'Klik Kontak Manager'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Rating Negatif Internal/button_MANAGER'))

WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Rating Negatif Internal/Kontak Manager'), 0)

WebUI.waitForPageLoad(1)

WebUI.takeElementScreenshot(findTestObject('Outage/Dashboard/Rating Negatif Internal/Kontak Manager'))

'Klik WA Manager'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Rating Negatif Internal/a_HUBUNGI WA Manager UNIT'))

'Klik GSM Manager'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Rating Negatif Internal/a_HUBUNGI GSM Manager UNIT'))

WebUI.switchToWindowTitle('(VCC) Virtual Command Center by PLN')

WebUI.click(findTestObject('Outage/Dashboard/Rating Negatif Internal/x_Kontak Manager'))

'Klik UP3 Manado'
WebUI.click(findTestObject('Outage/Dashboard/Rating Negatif Internal/3a_UP3 MANADO'))

WebUI.waitForPageLoad(3)

WebUI.scrollToElement(findTestObject('Outage/Dashboard/Rating Negatif Internal/4a_ULP MANADO SELATAN'), 1)

WebUI.takeFullPageScreenshot()

'Klik ULP Manado Selatan'
WebUI.click(findTestObject('Outage/Dashboard/Rating Negatif Internal/4a_ULP MANADO SELATAN'))

WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

