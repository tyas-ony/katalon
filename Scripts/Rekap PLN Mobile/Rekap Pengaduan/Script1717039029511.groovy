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

WebUI.comment('Buka Halaman Rekap Pengaduan')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Pengaduan/div_PLN MobilePLN Mobile ManagementRekapRek_eef85c'))

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Pengaduan/a_Rekap Pengaduan'))

WebUI.waitForPageLoad(3)

WebUI.takeFullPageScreenshot()

'Export Data Nasional'
WebUI.click(findTestObject('Rekap/Rekap Pengaduan/Export Nasional'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

'Pilih Induk'
WebUI.click(findTestObject('Rekap/Rekap Pengaduan/1 Sulutenggo'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

'Export Data Induk'
WebUI.click(findTestObject('Rekap/Rekap Pengaduan/Export Induk'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

'Pilih Area '
WebUI.click(findTestObject('Rekap/Rekap Pengaduan/2 Manado'))

WebUI.waitForPageLoad(7)

WebUI.takeFullPageScreenshot()

'Export Data Area'
WebUI.click(findTestObject('Rekap/Rekap Pengaduan/Export Area'))

WebUI.waitForPageLoad(3)

WebUI.takeFullPageScreenshot()

'Pilih Unit'
WebUI.click(findTestObject('Rekap/Rekap Pengaduan/3 Amurang'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

'Masukkan tanggal awal'
WebUI.click(findTestObject('Rekap/Rekap Pengaduan/Date Picker/Tanggal Awal'))

WebUI.click(findTestObject('Rekap/Rekap Pengaduan/Date Picker/Tahun Bulan'))

'Pilih Tahun 2022'
WebUI.click(findTestObject('Rekap/Rekap Pengaduan/Date Picker/Pilih 2021'))

WebUI.click(findTestObject('Rekap/Rekap Pengaduan/Date Picker/previous month'))

WebUI.click(findTestObject('Rekap/Rekap Pengaduan/Date Picker/previous month'))

WebUI.click(findTestObject('Rekap/Rekap Pengaduan/Date Picker/previous month'))

'Pilih Bulan Januari'
WebUI.click(findTestObject('Rekap/Rekap Pengaduan/Date Picker/previous month'))

'Pilih Tanggal 1'
WebUI.click(findTestObject('Rekap/Rekap Pengaduan/Date Picker/Tgl 1'))

'Menampilkan data sesuai filter yang diterapkan'
WebUI.click(findTestObject('Object Repository/Rekap/Rekap Pengaduan/button_TERAPKAN'))

WebUI.waitForPageLoad(7)

WebUI.takeFullPageScreenshot()

'Export Data Unit'
WebUI.click(findTestObject('Rekap/Rekap Pengaduan/Export Unit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Rekap/Rekap Pengaduan/Cari Rekap Pengaduan'))

WebUI.setText(findTestObject('Rekap/Rekap Pengaduan/Cari Rekap Pengaduan'), 'G5423111911783')

WebUI.waitForPageLoad(2)

'Melihat Detail Pengaduan'
WebUI.click(findTestObject('Rekap/Rekap Pengaduan/DETAIL'))

WebUI.verifyElementPresent(findTestObject('Rekap/Rekap Pengaduan/Detail Pengaduan'), 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Pengaduan/svg_Detail Pengaduan_injected-svg icons-sm'))

WebUI.closeBrowser()

WebUI.comment('Export unit masih rekap pelanggan')

