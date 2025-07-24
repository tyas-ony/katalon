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

WebUI.comment('Pencarian User Berdasarkan Input ID Pel')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pencarian/Input Id Pel/div_PLN MobilePLN Mobile ManagementRekapRek_eef85c'))

WebUI.click(findTestObject('Pencarian/Input Id Pel/Page_(VCC) Virtual Command Center by PLN/a_Input IDPel'))

'Menginputkan Id Pel tidak valid'
WebUI.setText(findTestObject('Object Repository/Pencarian/Input Id Pel/Masukkan Id Pel'), '1101100351')

'Klik Cari'
WebUI.click(findTestObject('Object Repository/Pencarian/Input Id Pel/button_CARI'))

'Menampilkan pesan Data tidak ditemukan'
WebUI.verifyElementPresent(findTestObject('Object Repository/Pencarian/Cari Id Pel/td_Data tidak ditemukan'), 0)

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

'Menginputkan Id Pel yang valid'
WebUI.setText(findTestObject('Object Repository/Pencarian/Input Id Pel/Masukkan Id Pel'), '89')

'Klik Cari'
WebUI.click(findTestObject('Object Repository/Pencarian/Input Id Pel/button_CARI'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

'Refresh Page'
WebUI.refresh()

WebUI.comment('Pencarian User berdasarkan CSV')

'Pilih File'
WebUI.click(findTestObject('Object Repository/Pencarian/Input Id Pel/Upload File/PILIH FILE'))

'Unggah File CSV'
WebUI.uploadFile(findTestObject('Object Repository/Pencarian/Input Id Pel/Upload File/Upload File'), file)

'Klik Cari'
WebUI.click(findTestObject('Object Repository/Pencarian/Input Id Pel/button_CARI'))

WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot()

'Export'
WebUI.click(findTestObject('Object Repository/Pencarian/Input Id Pel/EXPORT'))

WebUI.waitForPageLoad(1)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

