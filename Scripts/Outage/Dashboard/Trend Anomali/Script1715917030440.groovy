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

WebUI.comment('Buka Halaman Trend Anomali')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Analisis Kinerja Yantek/div_OutageOutage ManagementDashboardTindak _2f48d9'))

'Buka halaman Trend Anomali\r\n'
WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/a_Trend Anomali'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.comment('Menerapkan Filter')

WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/Filter Regional'))

WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/Page_(VCC) Virtual Command Center by PLN/li_DIV. OPDIS JAMALI'))

WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/Filter Induk'))

WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/Page_(VCC) Virtual Command Center by PLN/li_BANTEN'))

//
//WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/Filter Periode'))
//
//WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/li_June 2024'))
WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/button_TERAPKAN'))

WebUI.waitForPageLoad(5)

'Menampilkan data sesuai dengan filter'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/button_GM'))

'Menampilkan informasi kontak GM'
WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Trend Anomali/Detail GM'), 2)

WebUI.waitForPageLoad(0)

WebUI.takeElementScreenshot(findTestObject('Outage/Dashboard/Trend Anomali/Detail GM'))

WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/a_HUBUNGI GSM General Manager UNIT'))

WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/a_HUBUNGI WA General Manager UNIT'))

WebUI.switchToWindowTitle('(VCC) Virtual Command Center by PLN')

WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/x_GM'))

'Klik Data WO Over SLA'
WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/WO Over SLA'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

'Klik Data Laporan Berulang'
WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/Laporan Berulang'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

'Klik Data Skip Step'
WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/Skip Step'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

'Klik Data Rating Negatif'
WebUI.click(findTestObject('Outage/Dashboard/Trend Anomali/Rating Negatif'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

