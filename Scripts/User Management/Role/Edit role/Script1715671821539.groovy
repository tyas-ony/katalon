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

WebUI.comment('User melakukan Edit Role')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/div_user-management'))

WebUI.mouseOver(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/div_UserRolePermission'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/a_Role'))

WebUI.click(findTestObject('User Management/edit role/div_'))

'Pencarian role'
WebUI.setText(findTestObject('User Management/edit role/input__r9'), 'dev')

'Ubah data role'
WebUI.click(findTestObject('User Management/edit role/a_UBAH'))

//WebUI.clearText(findTestObject('null'))
//WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.CONTROL, 'a'))
//
//WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.BACK_SPACE))
'Memasukkan nama role '
WebUI.setText(findTestObject('User Management/edit role/input_Role Name_name'), ' test 1')

'Status role'
WebUI.click(findTestObject('User Management/tambah role/input_Status_is_enabled'))

//WebUI.sendKeys(findTestObject('User Management/tambah role/textarea_Description_description'), Keys.chord(Keys.CONTROL, 
//        'a'))
//
//WebUI.sendKeys(findTestObject('User Management/tambah role/textarea_Description_description'), Keys.chord(Keys.BACK_SPACE))
//WebUI.clearText(findTestObject('User Management/tambah role/textarea_Description_description'))
'Memasukkan deskripsi'
WebUI.setText(findTestObject('User Management/edit role/textarea_dev'), 'dev 12')

'Centang apabila user ini adalah Command Center'
WebUI.check(findTestObject('User Management/edit role/input__is_command_center'))

'Uncheck centang apabila user ini adalah Command Center'
WebUI.uncheck(findTestObject('User Management/edit role/input__is_command_center'))

WebUI.mouseOver(findTestObject('User Management/edit role/div_ATUR PERMISSIONUser Management User Tambah DataUser Edit DataUserApprovalUser Approval'))

'Pilih Permission'
WebUI.check(findTestObject('User Management/edit role/input_ATUR PERMISSION_e2485d63-5d79-449a-a175-f41e3eb31224'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

'Submit Data'
WebUI.click(findTestObject('User Management/edit role/button_SUBMIT'))

WebUI.click(findTestObject('User Management/edit role/button_Ok'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

