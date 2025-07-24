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

WebUI.comment('User melakukan edit permission')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/div_user-management'))

WebUI.mouseOver(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/div_UserRolePermission'))

WebUI.click(findTestObject('Object Repository/User Management/Page_(VCC) Virtual Command Center by PLN/a_Permission'))

WebUI.click(findTestObject('User Management/tambah_edit permission/input__r9'))

'Pencarian Permission'
WebUI.setText(findTestObject('User Management/tambah_edit permission/input__r9'), 'User Management')

WebUI.click(findTestObject('User Management/tambah_edit permission/a_UBAH'))

//WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.CONTROL, 'a'))
//WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('User Management/tambah_edit permission/input_Name_name'), ' 1')

//WebUI.setText(findTestObject('null'), '')
//
//WebUI.click(findTestObject('null'))
//
//WebUI.click(findTestObject('User Management/tambah_edit permission/li_User Management'))
WebUI.click(findTestObject('User Management/tambah_edit permission/button_SUBMIT'))

WebUI.click(findTestObject('Object Repository/User Management/tambah_edit permission/button_Ok'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

