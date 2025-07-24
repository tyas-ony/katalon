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

WebUI.comment('Terima Request Change User')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Request Change/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('Object Repository/Request Change/terima/div_Approval'))

'Buka Halaman Request Change'
WebUI.click(findTestObject('Object Repository/Request Change/terima/a_Request Change'))

'Cari User'
WebUI.setText(findTestObject('Object Repository/Request Change/terima/input__r1'), 'hi')

WebUI.takeFullPageScreenshot()

'Klik Terima'
WebUI.click(findTestObject('Object Repository/Request Change/terima/button_TERIMA'))

'Menampilkan pesan "Terima Permintaan Pindah Unit"'
WebUI.verifyElementPresent(findTestObject('Object Repository/Request Change/terima/div_Terima Permintaan Pindah UnitApakah and_dd8dee'), 
    0)

WebUI.takeFullPageScreenshot()

'Klik Tutup, maka akan kembali ke halaman Request Change'
WebUI.click(findTestObject('Object Repository/Request Change/terima/button_Tutup'))

'Klik Terima'
WebUI.click(findTestObject('Object Repository/Request Change/terima/button_TERIMA'))

'Menampilkan pesan "Terima Permintaan Pindah Unit"'
WebUI.verifyElementPresent(findTestObject('Object Repository/Request Change/terima/div_Terima Permintaan Pindah UnitApakah and_dd8dee'), 
    0)

WebUI.click(findTestObject('Object Repository/Request Change/terima/button_Approve'))

WebUI.takeFullPageScreenshot()

'Menampilkan pesan " Success Permintaan Pindah Unit  telah ditambahkan"'
WebUI.verifyElementPresent(findTestObject('Object Repository/Request Change/terima/div_SuccessPermintaan pindah unit telah dit_b8a649'), 
    0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Request Change/terima/button_Ok'))

WebUI.closeBrowser()

