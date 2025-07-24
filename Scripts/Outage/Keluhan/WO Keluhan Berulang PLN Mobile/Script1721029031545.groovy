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

WebUI.comment('Buka halaman Outage Keluhan Berulang PLN Mobile')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Outage/Keluhan/WO Keluhan Berulang PLN Mobile/div_OutageOutage ManagementDashboardTindak _97fe5d'))

'Klik halaman WO Keluhan Berulang PLN Mobile'
WebUI.click(findTestObject('Outage/Keluhan/a_WO Keluhan Berulang PLN Mobile'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

//'Cari data WO Keluhan Berulang'
//WebUI.setText(findTestObject('Object Repository/Outage/Keluhan/WO Keluhan Berulang PLN Mobile/Cari Wo Keluhan Berulang'), 'ULP RAMBI')
//
//WebUI.waitForPageLoad(2)
//
//WebUI.takeFullPageScreenshot()
WebUI.click(findTestObject('Object Repository/Outage/Keluhan/WO Keluhan Berulang PLN Mobile/td_WA PelangganWA Petugas'))

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

'Klik WA Pelanggan'
WebUI.click(findTestObject('Object Repository/Outage/Keluhan/WO Keluhan Berulang PLN Mobile/a_WA Pelanggan'))

WebUI.switchToWindowTitle('(VCC) Virtual Command Center by PLN')

'Klik Wa Petugas'
WebUI.click(findTestObject('Object Repository/Outage/Keluhan/WO Keluhan Berulang PLN Mobile/a_WA Petugas'))

WebUI.closeBrowser()

WebUI.comment('nunggu api data bener')

