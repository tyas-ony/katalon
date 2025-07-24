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

WebUI.navigateToUrl('https://apps02stagingrke2.pln.co.id/')

'User melakukan pendaftaran / registrasi '
WebUI.click(findTestObject('Object Repository/Registrasi/Page_(VCC) Virtual Command Center by PLN/a_Daftar disini'))

'User memasukkan Email'
WebUI.setText(findTestObject('Object Repository/Registrasi/Page_(VCC) Virtual Command Center by PLN//input_Email_email'), 
    'tyas+reeng3@oninyon.com')

'User memasukkan Nama Lengkap'
WebUI.setText(findTestObject('Object Repository/Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Nama Lengkap_full_name'), 
    'Staging Test')

'User memasukkan kata sandi'
WebUI.setEncryptedText(findTestObject('Object Repository/Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Kata Sandi_password'), 
    '8SQVv/p9jVTHLrggi8kCzw==')

'User memasukkan konfirmasi kata sandi'
WebUI.setEncryptedText(findTestObject('Object Repository/Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Konfirmasi Kata Sandi_password_confirmation'), 
    '8SQVv/p9jVTHLrggi8kCzw==')

'User memasukkan Captcha'
WebUI.setText(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/Masukkan Captcha'), '0000', FailureHandling.CONTINUE_ON_FAILURE)

'User Pilih Level'
WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/Pilih Level'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/li_Pusat'), FailureHandling.CONTINUE_ON_FAILURE)

'User pilih Unit'
WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/Pilih Nama Unit'))

WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/li_-'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(0, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot([], null)

//WebUI.click(findTestObject('Object Repository/Registrasi/Page_(VCC) Virtual Command Center by PLN/button_register'))
WebUI.comment('automate sengaja tidak klik register karena captcha tidak bisa di bypass ')

