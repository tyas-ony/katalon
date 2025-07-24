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

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Transaksi/div_PLN MobilePLN Mobile ManagementRekapRek_eef85c'))

WebUI.comment('Login Level Induk Jawa Tengah dan DIY')

WebUI.click(findTestObject('Rekap/Rekap Transaksi/Page_(VCC) Virtual Command Center by PLN/a_Rekap Transaksi'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

'Export Data Induk'
WebUI.click(findTestObject('Rekap/Rekap Transaksi/button_export'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Rekap/Rekap Transaksi/Error Failed to execute'), 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Rekap/Rekap Transaksi/button Tutup'))

'Pilih Area Surakarta'
WebUI.click(findTestObject('Rekap/Rekap Transaksi/brdsrkn user login/Pilih Area Surakarta'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

'Export Data Area'
WebUI.click(findTestObject('Rekap/Rekap Transaksi/button_export'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Rekap/Rekap Transaksi/Error Failed to execute'), 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Rekap/Rekap Transaksi/button Tutup'))

'Pilih Unit Manahan'
WebUI.click(findTestObject('Rekap/Rekap Transaksi/brdsrkn user login/Pilih Unit Manahan'))

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

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Transaksi/button_DETAIL'))

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Transaksi/div_Detail TransaksiTransaksiJumlah Transak_8cc8dd'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Transaksi/svg_Detail Transaksi_injected-svg icons-sm'))

WebUI.takeFullPageScreenshot()

'Export Data Unit'
WebUI.click(findTestObject('Rekap/Rekap Transaksi/Export Unit'))

WebUI.verifyElementPresent(findTestObject('Rekap/Rekap Transaksi/Export di Unit/Error Export'), 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Rekap/Rekap Transaksi/Export di Unit/Tutup'))

WebUI.closeBrowser()

WebUI.comment('belum bisa export disemua level')

