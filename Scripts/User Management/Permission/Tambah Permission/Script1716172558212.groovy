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

WebUI.comment('User Tambah Permission Baru')

WebUI.comment('button ok masih miss')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/div_user-management'))

WebUI.mouseOver(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/div_UserRolePermission'))

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/a_Permission'))

'User Tambah Permission Baru'
WebUI.click(findTestObject('User Management/tambah_edit permission/a_TAMBAH DATA'))

WebUI.click(findTestObject('User Management/tambah_edit permission/Page_(VCC) Virtual Command Center by PLN/tombol_SUBMIT'))

'Menampilkan pesan Masukkan Nama Permission terlebih dahulu'
WebUI.verifyElementPresent(findTestObject('User Management/tambah_edit permission/Page_(VCC) Virtual Command Center by PLN/pesan Masukan Nama Permission terebih dahulu'), 
    0)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/User Management/tambah_edit permission/Page_(VCC) Virtual Command Center by PLN/input_Name_name'), 
    'Tambah Permission')

WebUI.setText(findTestObject('Object Repository/User Management/tambah_edit permission/Page_(VCC) Virtual Command Center by PLN/Masukkan Parent'), 
    'Permission')

WebUI.click(findTestObject('Object Repository/User Management/tambah_edit permission/Page_(VCC) Virtual Command Center by PLN/Masukkan Parent'))

WebUI.click(findTestObject('User Management/tambah_edit permission/li_Permission'))

//WebUI.click(findTestObject('Object Repository/User Management/tambah_edit permission/Page_(VCC) Virtual Command Center by PLN/div_Tambah PermissionUser ManagementPermiss_e24049'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('User Management/tambah_edit permission/Page_(VCC) Virtual Command Center by PLN/tombol_SUBMIT'))

'Pesan Permission Berhasil ditambahkan'
WebUI.verifyElementPresent(findTestObject('Object Repository/User Management/tambah_edit permission/Page_(VCC) Virtual Command Center by PLN/Pesan SuccessData berhasil ditambah Ok'), 
    0)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('User Management/tambah_edit permission/Page_(VCC) Virtual Command Center by PLN/tombol_Ok'))

