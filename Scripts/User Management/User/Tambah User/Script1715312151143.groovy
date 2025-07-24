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

WebUI.comment('Melakukan Tambah User Baru error')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/div_user-management'))

WebUI.mouseOver(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/div_UserRolePermission'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/a_User'))

'Klik Tambah Data'
WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/a_TAMBAH DATA'))

WebUI.click(findTestObject('User Management/Tambah User/Pilih Role'))

WebUI.click(findTestObject('User Management/Tambah User/li_Petugas Jaga'))

WebUI.setText(findTestObject('User Management/Tambah User/input Username'), 'Yas')

WebUI.setText(findTestObject('User Management/Tambah User/input Fullname'), 'Yas test')

WebUI.setText(findTestObject('User Management/Tambah User/input Email'), 'tyas+reeng5@oninyon.com')

WebUI.click(findTestObject('User Management/Tambah User/input Level'))

WebUI.click(findTestObject('User Management/Tambah User/Pilih Level'))

'masih error disini karena malah ke role'
WebUI.click(findTestObject('User Management/Tambah User/Page_1716866711356/li_Pusat'))

WebUI.click(findTestObject('User Management/Tambah User/input Unit Name'))

WebUI.setText(findTestObject('User Management/Tambah User/input Jabatan'), 'dev')

WebUI.click(findTestObject('User Management/Tambah User/Pilih Unit'))

WebUI.click(findTestObject('User Management/Tambah User/li_-'))

WebUI.setEncryptedText(findTestObject('User Management/Tambah User/input Password'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.setEncryptedText(findTestObject('User Management/Tambah User/input Konfirmasi Password'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('User Management/Tambah User/input_Status_status'))

WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('User Management/Tambah User/button_SUBMIT'))

