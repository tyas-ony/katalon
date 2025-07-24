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

WebUI.comment('Rekap Agen')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Rekap/Rekap Agen/PLN MobilePLN Mobile Management'))

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Agen/a_Rekap Agen'))

WebUI.comment('Menerapkan Filter')

'Masukkan Tanggal Suspect Awal'
WebUI.click(findTestObject('Rekap/Rekap Agen/date picker/Tanggal Suspect Awal'))

WebUI.click(findTestObject('Rekap/Rekap Agen/date picker/Tahun Bulan'))

'Pilih Tahun 2022'
WebUI.click(findTestObject('Rekap/Rekap Agen/date picker/Tahun 2021'))

WebUI.click(findTestObject('Rekap/Rekap Agen/date picker/Previous Month'))

WebUI.click(findTestObject('Rekap/Rekap Agen/date picker/Previous Month'))

WebUI.click(findTestObject('Rekap/Rekap Agen/date picker/Previous Month'))

WebUI.click(findTestObject('Rekap/Rekap Agen/date picker/Previous Month'))

WebUI.click(findTestObject('Rekap/Rekap Agen/date picker/Previous Month'))

'Pilih Tanggal 1'
WebUI.click(findTestObject('Rekap/Rekap Agen/date picker/Tgl 1'))

'Masukkan Tanggal Suspect Akhir'
WebUI.click(findTestObject('Rekap/Rekap Agen/date picker/Tanggal Suspect Akhir'))

'Pilih Tanggal 12'
WebUI.click(findTestObject('Rekap/Rekap Agen/date picker/Tgl 12'))

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Agen/button_TERAPKAN'))

WebUI.takeFullPageScreenshot()

WebUI.comment('Export')

'Export Data Rekap Agen'
WebUI.click(findTestObject('Rekap/Rekap Agen/EXPORT'))

WebUI.takeFullPageScreenshot()

WebUI.comment('Cari Rekap Agen')

WebUI.click(findTestObject('Rekap/Rekap Agen/Pencarian Rekap Agen'))

WebUI.setText(findTestObject('Rekap/Rekap Agen/Pencarian Rekap Agen'), 'Ade')

WebUI.takeFullPageScreenshot()

'Export Data Rekap Agen'
WebUI.click(findTestObject('Rekap/Rekap Agen/EXPORT'))

WebUI.takeFullPageScreenshot()

