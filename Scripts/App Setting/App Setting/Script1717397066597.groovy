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

WebUI.click(findTestObject('App Setting/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('Object Repository/App Setting/div_App Settings'))

WebUI.click(findTestObject('Object Repository/App Setting/a_Homescreen Message'))

WebUI.comment('Mengkosongkan Kolom Value')

WebUI.sendKeys(findTestObject('App Setting/Value Force-update'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('App Setting/Value Force-update'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('App Setting/Value Homescreen-message'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('App Setting/Value Homescreen-message'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('App Setting/Value Maintenance-Mode'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('App Setting/Value Maintenance-Mode'), Keys.chord(Keys.BACK_SPACE))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/App Setting/button_SUBMIT'))

'Menampilkan pesan " Mohon Periksa Kembali Kolom yang anda isi'
WebUI.verifyElementPresent(findTestObject('App Setting/Error Mohon periksa kembali kolom yang anda isi'), 0)

WebUI.takeElementScreenshot(findTestObject('App Setting/Error Mohon periksa kembali kolom yang anda isi'))

WebUI.click(findTestObject('Object Repository/App Setting/button_Tutup'))

WebUI.comment('Home-Message')

'Status Active/Inactive'
WebUI.click(findTestObject('App Setting/Status Homescreen-message'))

WebUI.setText(findTestObject('App Setting/Value Homescreen-message'), 'Selamat Datang !')

WebUI.comment('Force-Update')

'Status Active/Inactive'
WebUI.click(findTestObject('App Setting/Status Force-update'))

WebUI.setText(findTestObject('App Setting/Value Force-update'), 'Sedang di update!')

WebUI.comment('Maintenance-Mode')

'Status Active/Inactive'
WebUI.click(findTestObject('App Setting/Status Maintenance-Mode'))

WebUI.setText(findTestObject('App Setting/Value Maintenance-Mode'), 'Sedang Maintenance !')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/App Setting/button_SUBMIT'))

WebUI.verifyElementPresent(findTestObject('App Setting/SuccessData berhasil diubah'), 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('App Setting/button_Ok'))

WebUI.closeBrowser()

