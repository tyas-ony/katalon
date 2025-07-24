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

WebUI.click(findTestObject('Request Change/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('Object Repository/Request Change/Lebih dari 1 user/div_Approval'))

WebUI.click(findTestObject('Object Repository/Request Change/Lebih dari 1 user/a_Request Change'))

WebUI.comment('Approve User lebih dari 1')

'Checklist User yang akan di approve'
WebUI.click(findTestObject('Object Repository/Request Change/Lebih dari 1 user/input_Aksi_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.click(findTestObject('Request Change/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/checklist kedua'))

WebUI.click(findTestObject('Object Repository/Request Change/Lebih dari 1 user/input_Aksi_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.click(findTestObject('Object Repository/Request Change/Lebih dari 1 user/input_Aksi_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.takeFullPageScreenshot()

'Terima atau Approve Pindah Unit User '
WebUI.mouseOver(findTestObject('Request Change/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/data terpilih'))

WebUI.click(findTestObject('Request Change/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/button_TERIMA'))

'Menampilkan pesan Terima Request Pindah Unit'
WebUI.verifyElementPresent(findTestObject('Object Repository/Request Change/Lebih dari 1 user/div_Terima Request Pindah UnitApakah anda y_650b5f'), 
    5)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Request Change/Lebih dari 1 user/button_Approve'))

'Menampilkan pesan "Success Permintaan Pindah Unit telah diterima !"'
WebUI.verifyElementPresent(findTestObject('Object Repository/Request Change/Lebih dari 1 user/div_SuccessPermintaan pindah unit telah dit_b8a649'), 
    5)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Request Change/Lebih dari 1 user/button_Ok'))

WebUI.comment('Tolak User lebih dari 1')

'Checklist User yang akan di ditolak'
WebUI.click(findTestObject('Object Repository/Request Change/Lebih dari 1 user/input_Aksi_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.click(findTestObject('Request Change/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/checklist kedua'))

'Checklist User yang akan di ditolak'
WebUI.click(findTestObject('Object Repository/Request Change/Lebih dari 1 user/input_Aksi_PrivateSwitchBase-input css-1m9pwf3'))

'Checklist User yang akan di ditolak'
WebUI.click(findTestObject('Object Repository/Request Change/Lebih dari 1 user/input_Aksi_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.mouseOver(findTestObject('Request Change/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/data terpilih'))

'Tolak User'
WebUI.click(findTestObject('Request Change/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/button_TOLAK'))

'Menampilkan pesan "Tolak permintaan pindah unit "2 user" terpilih ?"'
WebUI.verifyElementPresent(findTestObject('Request Change/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/div_WarningTolak permintaan pindah unit 2 user terpilih BatalYa, Lanjutkan'), 
    0)

WebUI.click(findTestObject('Request Change/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/button_Ya, Lanjutkan'))

WebUI.takeFullPageScreenshot()

'Menampilkan pesan "Success Permintaan Pindah Unit Ditolak!"'
WebUI.verifyElementPresent(findTestObject('Request Change/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/div_SuccessPermintaan pindah unit ditolak Ok'), 
    0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Request Change/Lebih dari 1 user/Page_(VCC) Virtual Command Center by PLN/button_Ok'))

WebUI.closeBrowser()

