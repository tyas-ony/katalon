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

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/div_user-management'))

WebUI.mouseOver(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/div_UserRolePermission'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/a_User'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/a_TAMBAH DATA'))

WebUI.click(findTestObject('User Management/Tambah User/button_SUBMIT'))

WebUI.comment('Menampilkan pesan ketika kolom berlum diisi')

WebUI.verifyElementPresent(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/emprtyfields/p_Masukan Username terlebih dahulu'), 
    0)

WebUI.verifyElementPresent(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/emprtyfields/p_Masukan Nama Lengkap Anda terlebih dahulu'), 
    0)

WebUI.verifyElementPresent(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/emprtyfields/p_Masukan E-mail terlebih dahulu'), 
    0)

WebUI.verifyElementPresent(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/emprtyfields/p_Masukan Jabatan anda terlebih dahulu'), 
    0)

WebUI.verifyElementPresent(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/emprtyfields/p_Silahkan pilih level terlebih dahulu'), 
    0)

WebUI.verifyElementPresent(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/emprtyfields/p_Silahkan pilih Unit terlebih dahulu'), 
    0)

WebUI.verifyElementPresent(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/emprtyfields/p_Masukan Kata Sandi terlebih dahulu'), 
    0)

WebUI.verifyElementPresent(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/emprtyfields/p_Ketikan ulang Kata Sandi terlebih dahulu'), 
    0)

WebUI.delay(0)

WebUI.takeFullPageScreenshot()

WebUI.comment('Memasukkan Data User Baru')

WebUI.refresh()

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/Pilih Role'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/dropdown role dev'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/pilih dropdown role'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/div_Tambah UserUser ManagementUsersTambah U_afbaa4'))

WebUI.setText(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/input_Username_username'), 
    'dev test')

WebUI.setText(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/input_Fullname_full_name'), 
    'dev test')

WebUI.setText(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/input_Email_email'), 
    'tyas+reeng5@oninyon.com')

WebUI.setText(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/input_Level_r13'), '')

WebUI.click(findTestObject('Object Repository/User Management/Page_(VCC) Virtual Command Center by PLN/input_Level_r13'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/li_Induk'))

WebUI.click(findTestObject('Object Repository/User Management/Page_(VCC) Virtual Command Center by PLN/div_Jabatan'))

WebUI.setText(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/input_Jabatan_jabatan'), 
    'dev')

WebUI.click(findTestObject('Object Repository/User Management/Page_(VCC) Virtual Command Center by PLN/input_Unit Name_r16 (1)'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/li_51 - JAWA TIMUR'))

WebUI.setEncryptedText(findTestObject('Object Repository/User Management/Page_(VCC) Virtual Command Center by PLN/input_Password_password_1_2'), 
    '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.setEncryptedText(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/input_Konfirmasi Password_password_confirmation'), 
    '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/input_Status_status'))

WebUI.delay(0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/Sumbit tambah user'))

