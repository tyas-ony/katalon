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

WebUI.comment('User Login menggunakan level Induk Sullutenggo')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Pelanggan/div_PLN MobilePLN Mobile ManagementRekapRek_eef85c'))

'Buka Modul Rekap Pelanggan'
WebUI.click(findTestObject('Object Repository/Rekap/Rekap Pelanggan/a_Rekap Pelanggan'))

WebUI.waitForPageLoad(1)

WebUI.takeFullPageScreenshot()

'Export Data Induk'
WebUI.click(findTestObject('Rekap/Rekap Pelanggan/button_export'))

WebUI.delay(3)

'Pilih Manado'
WebUI.click(findTestObject('Rekap/Rekap Pelanggan/Pilih Manado'))

WebUI.waitForPageLoad(1)

'Export Data Area'
WebUI.click(findTestObject('Rekap/Rekap Pelanggan/button_export'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

'Pilih Paniki'
WebUI.click(findTestObject('Rekap/Rekap Pelanggan/Pilih Paniki'))

WebUI.waitForPageLoad(1)

WebUI.takeFullPageScreenshot()

'Pilih Tanggal Awal'
WebUI.click(findTestObject('Rekap/Rekap Pelanggan/Date Picker/Page_(VCC) Virtual Command Center by PLN/Tanggal Awal'))

WebUI.click(findTestObject('Rekap/Rekap Pelanggan/Date Picker/Page_(VCC) Virtual Command Center by PLN/Tahun Bulan'))

WebUI.click(findTestObject('Rekap/Rekap Pelanggan/Date Picker/Page_(VCC) Virtual Command Center by PLN/Tahun 2022'))

WebUI.click(findTestObject('Rekap/Rekap Pelanggan/brdsrkn user login/TERAPKAN'))

WebUI.takeFullPageScreenshot()

'Melihat Detail'
WebUI.click(findTestObject('Rekap/Rekap Pelanggan/brdsrkn user login/DETAIL'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Rekap/Rekap Pelanggan/brdsrkn user login/Daftar User'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Pelanggan/svg_Detail Rekap Pelanggan_injected-svg icons-sm'))

'Export Data Unit'
WebUI.click(findTestObject('Rekap/Rekap Pelanggan/button_export'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

