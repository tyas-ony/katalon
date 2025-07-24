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

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

'Welcome,'
WebUI.getText(findTestObject('Object Repository/Rekap/Rekap Swacam/div_Menu 1AbsensiUser ManagementUserRolePer_5a3866'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Swacam/div_Menu 1AbsensiUser ManagementUserRolePer_5a3866'))

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Swacam/div_PLN MobilePLN Mobile ManagementRekapRek_eef85c'))

WebUI.comment('Login Level Induk Jawa Tengah dan DIY')

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Swacam/a_Rekap Swacam'))

WebUI.waitForPageLoad(3)

WebUI.takeFullPageScreenshot()

//'Pilih Induk jawa Tengah dan DIY'
//WebUI.click(findTestObject('Rekap/Rekap Swacam/Pilih Induk Jawa Tengah dan DIY'))
//
//WebUI.takeFullPageScreenshot()
'Pilih Area Yogyakarta'
WebUI.click(findTestObject('Rekap/Rekap Swacam/Pilih Area Yogyakarta'))

WebUI.takeFullPageScreenshot()

'Pilih Unit Wates'
WebUI.click(findTestObject('Rekap/Rekap Swacam/Pilih Unit Wates'))

WebUI.waitForPageLoad(1)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Swacam/button_DETAIL'))

'Menampilkan Detail'
WebUI.click(findTestObject('Object Repository/Rekap/Rekap Swacam/div_Detail SwacamMeter ID521020036636Userna_0007de'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Swacam/svg_Detail Swacam_injected-svg icons-sm (1)'))

'Export Rekap Swacam'
WebUI.click(findTestObject('Object Repository/Rekap/Rekap Swacam/button_EXPORT'))

WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

