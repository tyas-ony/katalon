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

WebUI.click(findTestObject('Object Repository/Master/kontak gm/button_kirim_bg-transparent --toggle-btn p-_fab310'))

WebUI.click(findTestObject('Object Repository/Master/kontak gm/UID/div_Master Data'))

'Buka halaman Kontak GM & MUP3'
WebUI.click(findTestObject('Object Repository/Master/kontak gm/UID/a_Kontak GM  MUP3'))

WebUI.waitForPageLoad(1)

WebUI.takeFullPageScreenshot()

'Cari Kontak UID'
WebUI.setText(findTestObject('Object Repository/Master/kontak gm/UID/input__r1'), 'jakarta raya')

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.comment('Ubah data UID')

WebUI.click(findTestObject('Object Repository/Master/kontak gm/UID/a_UBAH'))

WebUI.setText(findTestObject('Object Repository/Master/kontak gm/UID/input_Nama_contact_name'), 'n')

WebUI.setText(findTestObject('Object Repository/Master/kontak gm/UID/input_Nomor TeleponHP_contact'), '01')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Master/kontak gm/UID/button_SUBMIT'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Master/kontak gm/UID/div_SuccessData berhasil diubahOk'), 0)

WebUI.click(findTestObject('Object Repository/Master/kontak gm/UID/button_Ok'))

WebUI.takeFullPageScreenshot()

WebUI.refresh()

'Cari Kontak UID'
WebUI.setText(findTestObject('Object Repository/Master/kontak gm/UID/input__r1'), 'jakarta raya')

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

//WebUI.refresh()
//
//'Cari data UP3'
//WebUI.setText(findTestObject('Object Repository/Master/kontak gm/UID/input__r1'), 'Flores Bagian Barat')
//
//WebUI.waitForPageLoad(2)
//
//WebUI.takeFullPageScreenshot()
//
//WebUI.comment('Ubah data UP3')
//
//WebUI.click(findTestObject('Object Repository/Master/kontak gm/UP3/a_UBAH'))
//
//'Masukkan Nama Manager'
//WebUI.setText(findTestObject('Object Repository/Master/kontak gm/UP3/input_Nama Manager_manager'), 'AB')
//
//'Masukkan Nama Kontak'
//WebUI.setText(findTestObject('Object Repository/Master/kontak gm/UP3/input_Nama_contact_name'), 'A')
//
//'Masukkan Nomor Telepon/HP'
//WebUI.setText(findTestObject('Object Repository/Master/kontak gm/UP3/input_Nomor TeleponHP_contact'), '012')
//
//WebUI.takeFullPageScreenshot()
//
//WebUI.click(findTestObject('Object Repository/Master/kontak gm/UID/button_SUBMIT'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Master/kontak gm/UID/div_SuccessData berhasil diubahOk'), 0)
//
//WebUI.click(findTestObject('Object Repository/Master/kontak gm/UID/button_Ok'))
//
//WebUI.takeFullPageScreenshot()
//
//WebUI.refresh()
//
//'Cari data UP3'
//WebUI.setText(findTestObject('Object Repository/Master/kontak gm/UID/input__r1'), 'Flores Bagian Barat')
//
//WebUI.waitForPageLoad(2)
//
//WebUI.takeFullPageScreenshot()
WebUI.closeBrowser()

