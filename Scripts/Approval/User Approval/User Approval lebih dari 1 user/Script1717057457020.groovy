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

WebUI.click(findTestObject('User Approval/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('Object Repository/User Approval/Lebih dari 1 user/div_Approval'))

WebUI.click(findTestObject('Object Repository/User Approval/Lebih dari 1 user/a_User Approval'))

WebUI.comment('Approve User lebih dari 1 user')

'Checklist User yang akan di approve'
WebUI.click(findTestObject('User Approval/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/input_Aksi_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.click(findTestObject('User Approval/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/checklist kedua'))

WebUI.click(findTestObject('User Approval/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/input_Aksi_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.click(findTestObject('User Approval/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/input_Aksi_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.takeFullPageScreenshot()

WebUI.mouseOver(findTestObject('User Approval/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/data terpilih'))

'Terima Pengajuan User '
WebUI.click(findTestObject('Object Repository/User Approval/Lebih dari 1 user/button_TERIMA'))

WebUI.verifyElementPresent(findTestObject('User Approval/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/Terima 2 Data User'), 
    0)

WebUI.click(findTestObject('Object Repository/User Approval/Lebih dari 1 user/button_Role_MuiButtonBase-root MuiIconButto_07743e'))

'Pilih Role'
WebUI.click(findTestObject('Object Repository/User Approval/Lebih dari 1 user/li_Petugas Jaga'))

WebUI.click(findTestObject('Object Repository/User Approval/Lebih dari 1 user/button_Approve'))

'Menampilkan pesan "Success User berhasil diterima"'
WebUI.verifyElementPresent(findTestObject('Object Repository/User Approval/Lebih dari 1 user/div_SuccessUser berhasil di terima Ok'), 
    0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/User Approval/Lebih dari 1 user/button_Ok'))

WebUI.comment('Tolak User lebih dari 1 user')

'Checklist User yang akan di tolak'
WebUI.click(findTestObject('User Approval/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/input_Aksi_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.click(findTestObject('User Approval/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/checklist kedua'))

WebUI.click(findTestObject('User Approval/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/input_Aksi_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.click(findTestObject('User Approval/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/input_Aksi_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.takeFullPageScreenshot()

WebUI.mouseOver(findTestObject('User Approval/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/data terpilih'))

'Tolak Pengajuan User'
WebUI.click(findTestObject('User Approval/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/button_TOLAK'))

'Menampilkan pesan " Tolak 2 user terpilih"'
WebUI.verifyElementPresent(findTestObject('User Approval/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/WarningTolak 2 user terpilih BatalYa, Lanjutkan'), 
    0)

WebUI.takeFullPageScreenshot()

'Klik Ya, Lanjutkan'
WebUI.click(findTestObject('User Approval/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/button_Ya, Lanjutkan'))

