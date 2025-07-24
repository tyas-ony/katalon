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

WebUI.comment('Buka Halaman Anomali WO')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Analisis Kinerja Yantek/div_OutageOutage ManagementDashboardTindak _2f48d9'))

'Anomali WO'
WebUI.click(findTestObject('Outage/Dashboard/Anomali WO/a_Anomali WO'))

WebUI.waitForPageLoad(3)

WebUI.takeFullPageScreenshot()

'Klik Div. Jamali'
WebUI.click(findTestObject('Outage/Dashboard/Anomali WO/a_DIV. OPDIS JAMALI'))

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

'Klik Laporan Berulang'
WebUI.click(findTestObject('Outage/Dashboard/Anomali WO/Klik Kotak Laporan Berulang'))

'Menampilkan detail Laporan Berulang'
WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Anomali WO/Detail laporan Berulang'), 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Outage/Dashboard/Anomali WO/kembali'))

'Klik Laporan Skip Step'
WebUI.click(findTestObject('Outage/Dashboard/Anomali WO/Klik kotak Skip Step'))

'Menampilkan Detail Skip Step'
WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Anomali WO/Detail Skip Step'), 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Outage/Dashboard/Anomali WO/kembali'))

'Klik Rating Negatif'
WebUI.click(findTestObject('Outage/Dashboard/Anomali WO/Klik kotak Rating Negatif'))

'Menampilkan Detail Rating Negatif'
WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Anomali WO/Detail Rating Negatif'), 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Outage/Dashboard/Anomali WO/kembali'))

'Klik Total Anomali'
WebUI.click(findTestObject('Outage/Dashboard/Anomali WO/Page_(VCC) Virtual Command Center by PLN/Klik Total Anomali'))

'Menampilkan Detail Rating Negatif'
WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Anomali WO/Page_(VCC) Virtual Command Center by PLN/Detail Total Anomali'), 
    0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Outage/Dashboard/Anomali WO/kembali'))

'Klik button Manager'
WebUI.click(findTestObject('Outage/Dashboard/Anomali WO/button_MANAGER'))

WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Anomali WO/Detail GM'), 0)

WebUI.takeElementScreenshot(findTestObject('Outage/Dashboard/Anomali WO/Detail GM'))

WebUI.click(findTestObject('Outage/Dashboard/Anomali WO/a_HUBUNGI MANAGER UNIT'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Outage/Dashboard/Anomali WO/a_HUBUNGI WA MANAGER UNIT'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Outage/Dashboard/Anomali WO/x_Detail GM'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

WebUI.comment('nunggu data untuk validasi WO')

