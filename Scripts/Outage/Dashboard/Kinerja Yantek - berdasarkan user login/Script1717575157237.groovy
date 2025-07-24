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

WebUI.comment('Buka Halaman Kinerja Yantek berdasarkan level user login')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

'Klik Outage'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/svg_Outage_injected-svg'))

'Klik Kinerja Yantek'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/a_Kinerja Yantek'))

'Menampilkan halaman Kinerja Yantek'
WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot()

'Klik Manager'
WebUI.click(findTestObject('null'))

'Menampilkan Detail Kontak Manager'
WebUI.verifyElementPresent(findTestObject('null'), 0)

'Klik WA Manager'
WebUI.click(findTestObject('null'))

'Klik GSM Manager'
WebUI.click(findTestObject('null'))

WebUI.waitForPageLoad(2)

WebUI.takeElementScreenshot(findTestObject('null'))

WebUI.switchToWindowTitle('(VCC) Virtual Command Center by PLN')

WebUI.click(findTestObject('null'))

'Klik Angka Total UP3'
WebUI.click(findTestObject('null'))

'Menampilkan detail informasi Total Kinerja Yantek Performance'
WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('null'))

'Klik Angka Under Perform'
WebUI.click(findTestObject('null'))

'Menampilkan detail informasi  Kinerja Yantek - Under Perform'
WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('null'))

'Klik Angka Mid Perform'
WebUI.click(findTestObject('null'))

'Menampilkan detail informasi  Kinerja Yantek - Mid Perform'
WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('null'))

'Klik Angka High Perform'
WebUI.click(findTestObject('null'))

'Menampilkan detail informasi  Kinerja Yantek - High Perform'
WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('null'))

WebUI.closeBrowser()

WebUI.comment('nunggu tanggal sesuai, buat report lagi')

