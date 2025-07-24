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

WebUI.comment('Buka Halaman Kinerja Yantek')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

'Klik Outage'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/svg_Outage_injected-svg'))

'Klik Kinerja Yantek'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/a_Kinerja Yantek'))

'Menampilkan halaman Kinerja Yantek'
WebUI.waitForPageLoad(30)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/a_JAMALI'))

'Menampilkan halaman Kinerja Yantek'
WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot()

'Klik General Manager'
WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/button_GM'))

'Menampilkan Detail Kontak GM'
WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/Detail GM'), 
    0)

'Klik WA GM'
WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/a_HUBUNGI WA General Manager UID JATIM'))

'Klik GSM GM'
WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/a_HUBUNGI GSM General Manager UID JATIM'))

WebUI.waitForPageLoad(2)

WebUI.takeElementScreenshot(findTestObject('Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/Detail GM'))

WebUI.switchToWindowTitle('(VCC) Virtual Command Center by PLN')

WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/x_GM'))

'Klik Nama Area'
WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/a_UID JATIM'))

'Menampilkan halaman Kinerja Yantek'
WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot()

'Klik Manager'
WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/button_MANAGER'))

'Menampilkan Detail Kontak Manager'
WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/button_MANAGER'), 
    0)

'Klik WA Manager'
WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/a_HUBUNGI WA Manager UP3'))

'Klik GSM Manager'
WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/a_HUBUNGI GSM Manager UP3'))

WebUI.waitForPageLoad(2)

WebUI.takeElementScreenshot(findTestObject('Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/Detail Manager'))

WebUI.switchToWindowTitle('(VCC) Virtual Command Center by PLN')

WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/x_Manager'))

'Klik Angka Total UP3'
WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Data/Klik Total'))

'Menampilkan detail informasi Total Kinerja Yantek Performance'
WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Kinerja Yantek/Data/Detail Total'), 0)

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Data/x_total'))

'Klik Angka Under Perform'
WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Data/Klik Under Perform'))

'Menampilkan detail informasi  Kinerja Yantek - Under Perform'
WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Kinerja Yantek/Data/Detail Under Perform'), 0)

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Data/x_Under Performance'))

'Klik Angka Mid Perform'
WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Data/Klik Mide Perform'))

'Menampilkan detail informasi  Kinerja Yantek - Mid Perform'
WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Kinerja Yantek/Data/Detail Mid Perform'), 0)

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Data/x_Mid Perfromance'))

'Klik Angka High Perform'
WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Data/Klik High Perform'))

'Menampilkan detail informasi  Kinerja Yantek - High Perform'
WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Kinerja Yantek/Data/Detail High Performance'), 0)

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Outage/Dashboard/Kinerja Yantek/Data/x_High Perform'))

WebUI.closeBrowser()

