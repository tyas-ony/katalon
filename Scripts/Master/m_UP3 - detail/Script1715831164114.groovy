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

WebUI.comment('saat search masih error SQL...')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Master/Induk UID/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('Object Repository/Master/Induk UID/div_masterdata'))

WebUI.click(findTestObject('Master/Regional/div_RegionalIndukAreaUnitKontak GM  MUP3'))

WebUI.click(findTestObject('Object Repository/Master/UP3 - Area/a_Area'))

'User melakukan pencarian UP3'
WebUI.setText(findTestObject('Object Repository/Master/UP3 - Area/input__r9'), 'sanggau')

WebUI.comment('masih muncul error sql.... saat search')

WebUI.verifyElementPresent(findTestObject('Object Repository/Master/UP3 - Area/div_ErrorERROR column nama_unit_upi does no_1b8530'), 
    0)

WebUI.click(findTestObject('Object Repository/Master/UP3 - Area/button_Tutup'))

'User melihat informasi detail UP3'
WebUI.click(findTestObject('Object Repository/Master/UP3 - Area/button_DETAIL'))

WebUI.verifyElementPresent(findTestObject('Master/UP3 - Area/div_Informasi AreaID Unit UPI21ID Unit AP21_e3daef'), 0)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

