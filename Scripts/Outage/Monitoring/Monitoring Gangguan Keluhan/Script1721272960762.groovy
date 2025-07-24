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

WebUI.waitForPageLoad(2)

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

WebUI.comment('Gangguan Pelanggan')

WebUI.comment('Gangguan Pelanggan - WO Belum Tindak Lanjut Over SLA')

'Klik Angka WO Belum Tindak Lanjut Over SLA'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/G_WO belum Over SLA'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.comment('Gangguan Pelanggan - WO Sedang Tindak Lanjut Over SLA')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

WebUI.waitForPageLoad(5)

'Klik Angka WO Sedang Tindak Lanjut Over SLA'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/G_WO sedang Over SLA'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.comment('Gangguan Pelanggan - WO BelumTindak Lanjut')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

WebUI.waitForPageLoad(5)

'Klik Angka WO Belum Tindak Lanjut'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/G_WO belum'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.comment('Gangguan Pelanggan - WO Sedang Tindak Lanjut')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

WebUI.waitForPageLoad(5)

'Klik Angka WO Sedang Tindak Lanjut'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/G_WO sedang'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.comment('Gangguan Pelanggan - Close')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

WebUI.waitForPageLoad(5)

'Klik Angka Close'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/G_Close'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.comment('Keluhan Pelanggan')

WebUI.comment('Keluhan Pelanggan - WO Belum Tindak Lanjut Over SLA')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

'Klik Angka WO Sedang Tindak Lanjut Over SLA'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/K_WO belum Over SLA'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.comment('Keluhan Pelanggan - WO Sedang Tindak Lanjut Over SLA')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

WebUI.waitForPageLoad(5)

'Klik Angka WO Sedang Tindak Lanjut Over SLA'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/K_WO sedang Over SLA'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.comment('Keluhan Pelanggan - WO BelumTindak Lanjut')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

WebUI.waitForPageLoad(5)

'Klik Angka WO Belum Tindak Lanjut'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/K_WO belum'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.comment('Keluhan Pelanggan - WO Sedang Tindak Lanjut')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

WebUI.waitForPageLoad(5)

'Klik Angka WO Sedang Tindak Lanjut'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/K_WO sedang'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.comment('Keluhan Pelanggan - Close')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

WebUI.waitForPageLoad(5)

'Klik Angka Close'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/K_Close'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.comment('Gangguan Perlu Perhatian')

WebUI.comment('WO Gangguan Berulang PLN Mobile')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

'Klik Angka WO Gangguan Berulang PLN Mobile'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/GPP_WO Gangguan Berulang'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.comment('WO Gangguan Peralihan dari Keluhan')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

'Klik Angka WO Peralihan dari Keluhan'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/GPP_WO Gangguan Peralihan'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.comment('Keluhan Perhatian Khusus')

WebUI.comment('WO Keluhan Berulang PLN Mobile')

WebUI.navigateToUrl('https://stg-new-vcc.pln.co.id/outage/monitoring')

'Klik Angka WO Keluhan Berulang PLN Mobile'
WebUI.click(findTestObject('Outage/Monitoring/Gangguan Keluhan/GPP_WO Gangguan Berulang'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

WebUI.comment('Nunggu GPP dan KP bisa di klik datanya')

