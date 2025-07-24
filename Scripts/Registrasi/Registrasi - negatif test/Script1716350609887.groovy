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

WebUI.comment('Cek pesan Empty fields')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://apps02stagingrke2.pln.co.id/')

WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/a_Daftar disini'))

//WebUI.setText(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Email_email'), 'tyas+vcctest@oninyon.com')
//WebUI.setText(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Nama Lengkap_full_name'), 'tester')
'User tidak menginputkan data '
WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/button_register'))

WebUI.verifyElementPresent(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/p_Masukan E-mail terlebih dahulu'), 
    0)

WebUI.verifyElementPresent(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/p_Masukan Nama Lengkap Anda terlebih dahulu'), 
    0)

WebUI.verifyElementPresent(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Kata Sandi_password'), 
    0)

WebUI.verifyElementPresent(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Konfirmasi Kata Sandi_password_confirmation'), 
    0)

WebUI.verifyElementPresent(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/pesan captcha'), 0)

WebUI.verifyElementPresent(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/p_Silahkan pilih level terlebih dahulu'), 
    0)

WebUI.verifyElementPresent(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/pesan pilih unit'), 0)

WebUI.delay(0)

WebUI.takeFullPageScreenshot([])

WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Email_email'))

WebUI.comment('Memasukkan Data Registrasi yang belum sesuai')

'Memasukkan alamat email tidak sesuai'
WebUI.setText(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Email_email'), 'tyas')

WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Nama Lengkap_full_name'))

WebUI.setText(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Nama Lengkap_full_name'), 'Stagging test')

WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Kata Sandi_password'))

WebUI.setEncryptedText(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Kata Sandi_password'), 
    '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Konfirmasi Kata Sandi_password_confirmation'))

'Memasukkan Konfirmasi passord tidak sesuai'
WebUI.setEncryptedText(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/input_Konfirmasi Kata Sandi_password_confirmation'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

'User Pilih Level'
WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/Pilih Level'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/li_Pusat'), FailureHandling.CONTINUE_ON_FAILURE)

'User pilih Unit'
WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/Pilih Nama Unit'))

WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/li_-'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/button_register'))

'Pesan Email tidak valid'
WebUI.verifyElementPresent(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/p_Mohon masukan data E-mail yang valid'), 
    0)

'Pesan Konfirmasi Password tidak sesuai'
WebUI.verifyElementPresent(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/p_Konfirmasi Password tidak sesuai'), 
    0)

'Pesan Captcha '
WebUI.verifyElementPresent(findTestObject('Registrasi/Page_(VCC) Virtual Command Center by PLN/pesan captcha'), 0)

WebUI.delay(0)

WebUI.takeFullPageScreenshot()

