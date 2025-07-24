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

WebUI.comment('Buka halaman Outage Monitoring')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Outage/Monitoring/Gangguan Keluhan/div_OutageOutage ManagementDashboardTindak _97fe5d'))

'Klik halaman Monitoring'
WebUI.click(findTestObject('Outage/Monitoring/Page_(VCC) Virtual Command Center by PLN/a_Monitoring'))

'Buka tab WO Monitoring'
WebUI.comment('Buka tab  WO Monitoring')

WebUI.click(findTestObject('Outage/Monitoring/WO Monitoring/tab Wo Monitoring'))

WebUI.waitForPageLoad(1)

WebUI.takeFullPageScreenshot()

WebUI.comment('Menerapkan Filter')

'Filter Induk'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/FIlter Induk'))

'Masukan Teks Jawa'
WebUI.setText(findTestObject('Object Repository/Outage/Monitoring/Gangguan Keluhan/input_Induk_induk'), 'Jawa')

'Pilih Jawa Tengah dan DIY'
WebUI.click(findTestObject('Object Repository/Outage/Monitoring/Gangguan Keluhan/li_JAWA TENGAH DAN DIY'))

'Klik Terapkan'
WebUI.click(findTestObject('Object Repository/Outage/Monitoring/Gangguan Keluhan/button_TERAPKAN'))

'Menampilkan Data Monitoring Jawa Tengah dan DIY'
WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot()

'Filter UP3'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/Filter UP3'))

'Pilih Yogyakarta'
WebUI.click(findTestObject('Object Repository/Outage/Monitoring/Gangguan Keluhan/li_YOGYAKARTA'))

'Klik Terapkan'
WebUI.click(findTestObject('Object Repository/Outage/Monitoring/Gangguan Keluhan/button_TERAPKAN'))

'Menampilkan Data Monitoring Yogyakarta'
WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot()

'Filter ULP'
WebUI.click(findTestObject('Object Repository/Outage/Monitoring/Gangguan Keluhan/Filter ULP'))

'Pilih Bantul'
WebUI.click(findTestObject('Object Repository/Outage/Monitoring/Gangguan Keluhan/li_BANTUL'))

'Klik Terapkan'
WebUI.click(findTestObject('Object Repository/Outage/Monitoring/Gangguan Keluhan/button_TERAPKAN'))

'Menampilkan Data Monitoring Bantul'
WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Regu Available')

'Klik Angka Regu Available'
WebUI.click(findTestObject('Outage/Monitoring/WO Monitoring/Regu Avail'))

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Regu Bertugas')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Outage/Monitoring/WO Monitoring/tab Wo Monitoring'))

'Klik Angka Regu Bertugas'
WebUI.click(findTestObject('Outage/Monitoring/WO Monitoring/Regu Bertugas'))

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Penugasan Khusus')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

WebUI.waitForPageLoad(5)

'Klik Angka Penugasan Khusus'
WebUI.click(findTestObject('Outage/Monitoring/WO Monitoring/Penugasan Khusus'))

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Total Regu Aktif')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

WebUI.waitForPageLoad(5)

'Klik Angka Total Regu Aktif'
WebUI.click(findTestObject('Outage/Monitoring/WO Monitoring/Total Regu Aktif'))

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

WebUI.comment('menunggu data regu bisa di klik')

