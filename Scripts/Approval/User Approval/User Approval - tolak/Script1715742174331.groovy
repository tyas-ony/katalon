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

WebUI.comment('User Approval - Tolak')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/User Approval/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('Object Repository/User Approval/div_Approval (1)'))

WebUI.click(findTestObject('Object Repository/User Approval/a_User Approval'))

'Cari User'
WebUI.setText(findTestObject('Object Repository/User Approval/input__rb'), 'Efo')

WebUI.takeFullPageScreenshot()

'Tolak User'
WebUI.click(findTestObject('User Approval/Tolak/button_TOLAK'))

WebUI.verifyElementPresent(findTestObject('User Approval/Tolak/div_WarningTolak user terpilih BatalYa, Lanjutkan'), 0)

WebUI.takeFullPageScreenshot()

'Batalkan, maka akan kembali ke halaman User Approval'
WebUI.click(findTestObject('User Approval/Tolak/button_Batal'))

WebUI.takeFullPageScreenshot()

'Tolak User'
WebUI.click(findTestObject('User Approval/Tolak/button_TOLAK'))

WebUI.verifyElementPresent(findTestObject('User Approval/Tolak/div_WarningTolak user terpilih BatalYa, Lanjutkan'), 0)

WebUI.takeFullPageScreenshot()

'Ya, Lanjutkan'
WebUI.click(findTestObject('User Approval/Tolak/button_Ya, Lanjutkan'))

WebUI.takeFullPageScreenshot()

