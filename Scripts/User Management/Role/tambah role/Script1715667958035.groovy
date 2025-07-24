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

WebUI.comment('done sudah buat report')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/div_user-management'))

WebUI.mouseOver(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/div_UserRolePermission'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/a_Role'))

'Tambah Role Baru'
WebUI.click(findTestObject('User Management/tambah role/a_TAMBAH DATA'))

'Memasukkan Nama Role'
WebUI.setText(findTestObject('User Management/tambah role/input_Role Name_name'), 'dev test 2')

'Status Role'
WebUI.click(findTestObject('User Management/tambah role/input_Status_is_enabled'))

'Memasukkan Description'
WebUI.setText(findTestObject('User Management/tambah role/textarea_Description_description (1)'), 'developer test')

'Centang apabila user ini adalah Command Center'
WebUI.click(findTestObject('User Management/tambah role/input__is_command_center'))

'Pilih Permission'
WebUI.click(findTestObject('User Management/tambah role/input_ATUR PERMISSION_e2485d63-5d79-449a-a175-f41e3eb31224'))

WebUI.mouseOver(findTestObject('User Management/tambah role/div_ATUR PERMISSIONUser ManagementUserApprovalUser Approval'))

WebUI.click(findTestObject('User Management/tambah role/input_ATUR PERMISSION_e2485d63-5d79-449a-a175-f41e3eb31224'))

WebUI.click(findTestObject('User Management/tambah role/button_SUBMIT'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

