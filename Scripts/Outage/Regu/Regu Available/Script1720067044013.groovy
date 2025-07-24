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

WebUI.comment('Buka Halaman Regu Available')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/Outage/Regu/Regu Available/div_OutageOutage ManagementDashboardTindak _97fe5d'))

'Buka halaman Regu Available'
WebUI.click(findTestObject('Outage/Regu/a_Regu Available'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

'Cari Data'
WebUI.setText(findTestObject('Outage/Regu/Regu Available/Cari Regu Available'), 'Untung')

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

'Klik WA Petugas'
WebUI.click(findTestObject('Object Repository/Outage/Regu/Regu Available/a_PETUGAS'))

'Klik Maps'
WebUI.click(findTestObject('Object Repository/Outage/Regu/Regu Available/a_MAPS'))

WebUI.switchToWindowTitle('(VCC) Virtual Command Center by PLN')

'Klik Nama Regu'
WebUI.click(findTestObject('Object Repository/Outage/Regu/Regu Available/button_UNTUNG JAWA'))

'Menampilkan detail Regu'
WebUI.verifyElementPresent(findTestObject('Object Repository/Outage/Regu/Regu Available/div_Detail Regu'), 0)

WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

