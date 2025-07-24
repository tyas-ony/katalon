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

WebUI.comment('Buka Halaman Rekap Transaksi')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Transaksi/div_PLN MobilePLN Mobile ManagementRekapRek_eef85c'))

WebUI.click(findTestObject('Rekap/Rekap Transaksi/Page_(VCC) Virtual Command Center by PLN/a_Rekap Transaksi'))

'Pilih Induk Banten'
WebUI.click(findTestObject('Rekap/Rekap Transaksi/Pilih Induk Banten'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

'Export Data Induk'
WebUI.click(findTestObject('Rekap/Rekap Transaksi/button_export'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

'Pilih Area Cikokol'
WebUI.click(findTestObject('Rekap/Rekap Transaksi/Pilih Area Cikokol'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

'Pilih Unit Cikokol'
WebUI.click(findTestObject('Rekap/Rekap Transaksi/Pilih Unit Cikokol'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Rekap/Rekap Transaksi/Date Picker/Tanggal Awal'))

WebUI.click(findTestObject('Rekap/Rekap Transaksi/Date Picker/previous month'))

WebUI.click(findTestObject('Rekap/Rekap Transaksi/Date Picker/previous month'))

WebUI.click(findTestObject('Rekap/Rekap Transaksi/Date Picker/previous month'))

WebUI.click(findTestObject('Rekap/Rekap Transaksi/Date Picker/previous month'))

WebUI.click(findTestObject('Rekap/Rekap Transaksi/Date Picker/tanggal 1'))

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Transaksi/button_TERAPKAN'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

//WebUI.click(findTestObject('Object Repository/Rekap/Rekap Transaksi/button_DETAIL'))
//
//WebUI.click(findTestObject('Object Repository/Rekap/Rekap Transaksi/div_Detail TransaksiTransaksiJumlah Transak_8cc8dd'))
//
//WebUI.takeFullPageScreenshot()
//
//WebUI.click(findTestObject('Object Repository/Rekap/Rekap Transaksi/svg_Detail Transaksi_injected-svg icons-sm'))
//
//WebUI.takeFullPageScreenshot()

'Export Data Unit'
WebUI.click(findTestObject('Rekap/Rekap Transaksi/Export Unit'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Rekap/Rekap Transaksi/Cari Rekap Transaksi'))

WebUI.setText(findTestObject('Rekap/Rekap Transaksi/Cari Rekap Transaksi'), '546105778574')

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

'Export Data Unit'
WebUI.click(findTestObject('Rekap/Rekap Transaksi/Export Unit'))

WebUI.closeBrowser()

