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

WebUI.comment('Buka Halaman Rekap PLN Mobile')

WebUI.comment('User Login menggunakan level induk Suluttenggo')

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Perubahan Daya/div_PLN MobilePLN Mobile ManagementRekapRek_eef85c'))

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Perubahan Daya/a_Rekap Perubahan Daya'))

WebUI.waitForPageLoad(2)

'Klik Area Palu'
WebUI.click(findTestObject('Rekap/Rekap Perubahan Daya/Pilih Palu'))

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

'Klik Induk Kolonedale'
WebUI.click(findTestObject('Rekap/Rekap Perubahan Daya/Pilih Kolonedale'))

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot()

//WebUI.click(findTestObject('Rekap/Rekap Perubahan Daya/Status Transaksi'), FailureHandling.STOP_ON_FAILURE)
//
//'Pilih status transaksi All'
//WebUI.click(findTestObject('null'), FailureHandling.CONTINUE_ON_FAILURE)
'Masukkan Tanggal'
WebUI.click(findTestObject('Rekap/Rekap Perubahan Daya/brdsrkn user login/Tanggal Awal'), FailureHandling.CONTINUE_ON_FAILURE)


WebUI.click(findTestObject('Rekap/Rekap Perubahan Daya/brdsrkn user login/Tahun Bulan'))

WebUI.click(findTestObject('Rekap/Rekap Perubahan Daya/brdsrkn user login/Tahun 2022'))

WebUI.click(findTestObject('Rekap/Rekap Perubahan Daya/brdsrkn user login/Tgl 1'))

'Terapkan Filter'
WebUI.click(findTestObject('Rekap/Rekap Perubahan Daya/brdsrkn user login/TERAPKAN'))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Rekap/Rekap Perubahan Daya/brdsrkn user login/DETAIL'))

WebUI.verifyElementPresent(findTestObject('Rekap/Rekap Perubahan Daya/brdsrkn user login/Detail Rekap Perubahan Daya'), 
    0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Rekap/Rekap Perubahan Daya/brdsrkn user login/button_Informasi Pengguna'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Rekap/Rekap Perubahan Daya/svg_Detail Rekap Perubahan Daya_injected-sv_1cd868'))

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

