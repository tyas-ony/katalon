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

WebUI.comment('User Approval - Terima')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/User Approval/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('Object Repository/User Approval/div_Approval (1)'))

WebUI.click(findTestObject('Object Repository/User Approval/a_User Approval'))

WebUI.setText(findTestObject('Object Repository/User Approval/input__rb'), 'Jeje')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/User Approval/button_TERIMA'))

WebUI.verifyElementPresent(findTestObject('Object Repository/User Approval/div_Detail UserUsernametest userLevelPusatN_04a02a'), 
    0)

WebUI.takeFullPageScreenshot()

'Pilih Role'
WebUI.click(findTestObject('Object Repository/User Approval/button_Role_MuiButtonBase-root MuiIconButto_07743e'))

WebUI.click(findTestObject('Object Repository/User Approval/li_Petugas Jaga'))

WebUI.takeFullPageScreenshot()

'Klik Terima'
WebUI.click(findTestObject('Object Repository/User Approval/button_Terima (1)'))

'Berhasil Approve'
WebUI.verifyElementPresent(findTestObject('Object Repository/User Approval/div_SuccessUser berhasil di approve Ok'), 0)

WebUI.click(findTestObject('Object Repository/User Approval/button_Ok'))

WebUI.takeFullPageScreenshot()

