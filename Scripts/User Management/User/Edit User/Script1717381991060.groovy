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

WebUI.click(findTestObject('User Management/Edit User 2/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('Object Repository/User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/div_User Management'))

WebUI.click(findTestObject('Object Repository/User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/a_User'))

'Cari User'
WebUI.setText(findTestObject('Object Repository/User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/input__r7'), 
    'reeng6')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/a_UBAH'))

WebUI.takeFullPageScreenshot()

'Edit Username'
WebUI.setText(findTestObject('Object Repository/User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/input_Username_username'), 
    '.com')

'Edit Fullname'
WebUI.setText(findTestObject('Object Repository/User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/input_Fullname_full_name'), 
    'aa')

'Edit email'
WebUI.setText(findTestObject('Object Repository/User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/input_Email_email'), 
    'm')

'Edit jabatan'
WebUI.setText(findTestObject('Object Repository/User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/input_Jabatan_jabatan'), 
    'eloper')

'Edit Level'
WebUI.click(findTestObject('User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/Pilih Role'))

WebUI.click(findTestObject('User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/li_Petugas Jaga'))

//WebUI.click(findTestObject('Object Repository/User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/div_Ubah UserUser ManagementUsersUbah UserR_25aea4'))
WebUI.click(findTestObject('User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/Pilih Role User'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Pilih Level'
WebUI.click(findTestObject('User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/Pilih Level'))

WebUI.click(findTestObject('User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/li_Induk'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/Pilih Unit Name'))

//WebUI.setText(findTestObject('User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/Masukkan Unit Name'), 
//    'Jawa Tengah')

WebUI.click(findTestObject('User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/li_52 - JAWA TENGAH DAN DIY'))

WebUI.click(findTestObject('Object Repository/User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/input_Status_status'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/button_SUBMIT'))

WebUI.verifyElementPresent(findTestObject('Object Repository/User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/div_SuccessData berhasil diubah Ok'), 
    0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/User Management/Edit User 2/Page_(VCC) Virtual Command Center by PLN/button_Ok'))

