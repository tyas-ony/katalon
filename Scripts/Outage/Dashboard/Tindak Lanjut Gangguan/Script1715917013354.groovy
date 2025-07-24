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

WebUI.comment('Buka Halaman Tindak Lanjut Gangguan')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

'Klik Outage'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Tindak Lanjut Gangguan/div_OutageOutage ManagementDashboardTindak _a56380'))

'Klik Modul Tindak Lanjut Gangguan'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Tindak Lanjut Gangguan/a_Tindak Lanjut Gangguan'))

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

'Pilih Div Sumkal'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Tindak Lanjut Gangguan/a_DIVSUMKAL'))

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

'Tekan tombol GM'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Tindak Lanjut Gangguan/button_GM'))

'Menampilkan Informasi Kontak General Manager'
WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/GM Induk'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Kontak WA GM'
WebUI.click(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/a_HUBUNGI WA General Manager UNIT'))

'Kontak GSM GM'
WebUI.click(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/a_HUBUNGI GSM General Manager UNIT'))

WebUI.waitForPageLoad(0)

WebUI.takeElementScreenshot(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/GM Induk'))

WebUI.switchToWindowTitle('(VCC) Virtual Command Center by PLN')

WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Tindak Lanjut Gangguan/svg_General Manager UIDACEH_injected-svg icons-sm'))

'PIlih Induk Sumatera Utara'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Tindak Lanjut Gangguan/a_SUMATERA UTARA'))

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

'Tekan Tombol Manager'
WebUI.click(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/button_MANAGER'))

'Menampilkan Informasi Kontak Manager'
WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/Manager UP3'), 0)

'Kontak WA Manager'
WebUI.click(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/a_HUBUNGI WA Manager UNIT'))

'Kontak GSM Manager'
WebUI.click(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/a_HUBUNGI GSM Manager UNIT'))

WebUI.waitForPageLoad(0)

WebUI.takeElementScreenshot(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/Manager UP3'))

WebUI.switchToWindowTitle('(VCC) Virtual Command Center by PLN')

WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Tindak Lanjut Gangguan/svg_General Manager UIDACEH_injected-svg icons-sm'))

'Tekan Area Medan'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Tindak Lanjut Gangguan/a_MEDAN'))

WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot()

'Tekan Induk Medan Baru'
WebUI.click(findTestObject('Object Repository/Outage/Dashboard/Tindak Lanjut Gangguan/a_MEDAN BARU'))

WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot()

'Klik angka Belum Tindak Lanjut'
WebUI.click(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/Detail WO/Angka Belum Tindak Lanjut'))

WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/Detail WO/Detail WO'), 0)

WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/Detail WO/Klik Kembali Detail WO'), FailureHandling.STOP_ON_FAILURE)

'Klik angka Sedang Tindak Lanjut'
WebUI.click(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/Detail WO/Angka Sedang Ditindak Lanjuti'))

WebUI.verifyElementPresent(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/Detail WO/Detail WO'), 0)

//WebUI.click(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/Page_(VCC) Virtual Command Center by PLN/Cari Detail'))
//
//WebUI.setText(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/Page_(VCC) Virtual Command Center by PLN/Cari Detail'), 
//    'ibu dini')
WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/Detail WO/button_WA PELANGGAN'))

WebUI.click(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/Detail WO/button_WA PETUGAS'))

WebUI.switchToWindowTitle('(VCC) Virtual Command Center by PLN')

WebUI.click(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/Detail WO/button_WA PELANGGAN'))

WebUI.click(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/Detail WO/button_CALL GSM PETUGAS'))

WebUI.switchToWindowTitle('(VCC) Virtual Command Center by PLN')

WebUI.click(findTestObject('Outage/Dashboard/Tindak Lanjut Gangguan/Detail WO/Klik Kembali Detail WO'))

WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

WebUI.comment('button detail ada yang belum clickable')

