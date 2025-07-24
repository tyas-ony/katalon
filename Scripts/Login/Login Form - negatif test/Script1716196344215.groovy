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

WebUI.click(findTestObject('Object Repository/Page_(VCC) Virtual Command Center by PLN/button_Login'))

WebUI.click(findTestObject('Page_Login Form/button_login'))

WebUI.comment('Menampilkan pesan ketika pengguna belum menginputkan data')

'tidak menginputkan username'
WebUI.verifyElementPresent(findTestObject('Page_Login Form/p_Masukkan username anda'), 0)

'tidak menginputkan password'
WebUI.verifyElementPresent(findTestObject('Page_Login Form/p_Masukkan password anda'), 0)

'tidak menginputkan captcha'
WebUI.verifyElementPresent(findTestObject('Page_Login Form/p_Masukkan angka  huruf yang ada pada recaptcha'), 0)

WebUI.click(findTestObject('Page_Login Form/button_login'))

WebUI.delay(0)

WebUI.takeFullPageScreenshot()

//WebUI.sendKeys(findTestObject('Object Repository/Page_Login Form/input_Username_email'), Keys.chord(Keys.CONTROL, 'a'))
//
//WebUI.sendKeys(findTestObject('Object Repository/Page_Login Form/input_Username_email'), Keys.chord(Keys.BACK_SPACE))

'Memasukkan valid username'
WebUI.setText(findTestObject('Object Repository/Page_Login Form/input_Username_email'), 'tyas+reeng4@oninyon.com')

'Memasukkan valid password'
WebUI.setText(findTestObject('Page_Login Form/Page_(VCC) Virtual Command Center by PLN/input_Password_password'), 'password123')

'Menginputkan invalid captcha'
WebUI.setText(findTestObject('Page_Login Form/Page_(VCC) Virtual Command Center by PLN/input_Captcha_captcha'), '11111')

WebUI.click(findTestObject('Page_Login Form/button_login'))

'Menampilkan pesan error "Mohon periksa kembali kode Captcha yang anda masukan'
WebUI.verifyElementPresent(findTestObject('Page_Login Form/div_Mohon periksa kembali kode Captcha yang anda masukan'), 0)

//'Menampilkan pesan error "Mohon periksa kembali username password anda'
//WebUI.comment('Menampilkan pesan ketika pengguna memasukkan invalid data')
//WebUI.verifyElementPresent(findTestObject('Page_Login Form/div_ErrorMohon periksa kembali username  password anda.Ok'),
//    0)
WebUI.delay(0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_Login Form/button_Ok'))

'Menginputkan invalid username '
WebUI.setText(findTestObject('Page_Login Form/input_Username_email'), 'tyas')

'Menginputkan invalid passsword '
WebUI.setEncryptedText(findTestObject('Page_Login Form/Page_(VCC) Virtual Command Center by PLN/input_Password_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

'Menginputkan invalid captcha'
WebUI.setText(findTestObject('Page_Login Form/Page_(VCC) Virtual Command Center by PLN/input_Captcha_captcha'), '12345')

WebUI.click(findTestObject('Object Repository/Page_(VCC) Virtual Command Center by PLN/button_Login'))

'Menampilkan pesan error "Mohon periksa kembali username password anda'
WebUI.verifyElementPresent(findTestObject('Page_Login Form/div_ErrorMohon periksa kembali username  password anda.Ok'), 
    0)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Login Form/button_Ok'))

