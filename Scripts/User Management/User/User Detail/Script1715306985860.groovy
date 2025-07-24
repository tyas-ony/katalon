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

WebUI.comment('done belum report')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/Lihat User/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('Object Repository/User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/Lihat User/div_user-management'))

WebUI.mouseOver(findTestObject('Object Repository/User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/Lihat User/div_UserRolePermission'))

WebUI.click(findTestObject('Object Repository/User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/Lihat User/a_User'))

WebUI.click(findTestObject('User Management/Filter User/Page_(VCC) Virtual Command Center by PLN/Filter Induk'))

WebUI.click(findTestObject('User Management/Filter User/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/li_JAWA TENGAH DAN DIY'))

WebUI.click(findTestObject('User Management/Filter User/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/Filter Area'))

WebUI.click(findTestObject('User Management/Filter User/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/li_YOGYAKARTA'))

//WebUI.click(findTestObject('User Management/Filter User/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/Filter Unit'), 
//    FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('User Management/Filter User/Page_(VCC) Virtual Command Center by PLN/Page_(VCC) Virtual Command Center by PLN/li_SLEMAN'))

WebUI.click(findTestObject('User Management/Filter User/TERAPKAN'))

WebUI.waitForPageLoad(0)

//WebUI.setText(findTestObject('Object Repository/User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/Lihat User/input__rf'), 
//    'test')
WebUI.click(findTestObject('Object Repository/User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/Lihat User/button_LIHAT'))

WebUI.verifyElementPresent(findTestObject('Object Repository/User Management/Page_(VCC) Virtual Command Center by PLN/Tambah User/Lihat User/div_User DetailUsernametest userNama Lengka_20bce0'), 
    0)

