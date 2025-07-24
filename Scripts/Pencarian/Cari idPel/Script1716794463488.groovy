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

WebUI.comment('Cari Id Pel berdasarkan Nama Pelanggan')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pencarian/Cari Id Pel/div_PLN MobilePLN Mobile ManagementRekapRek_eef85c'))

WebUI.click(findTestObject('Object Repository/Pencarian/Cari Id Pel/Page_(VCC) Virtual Command Center by PLN/a_Cari IDPel'))

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Pencarian/Cari Id Pel/Page_(VCC) Virtual Command Center by PLN/input User'), 
    'cu')

WebUI.click(findTestObject('Object Repository/Pencarian/Cari Id Pel/Page_(VCC) Virtual Command Center by PLN/button_CARI'))

'Menampilkan pesan "Nama user minimal 3 karakter !"'
WebUI.verifyElementPresent(findTestObject('Object Repository/Pencarian/Cari Id Pel berdasarkan User/div_ErrorNama user minimal 3 karakter Tutup'), 
    0)

WebUI.takeElementScreenshot(findTestObject('Object Repository/Pencarian/Cari Id Pel berdasarkan User/div_ErrorNama user minimal 3 karakter Tutup'))

WebUI.click(findTestObject('Object Repository/Pencarian/Cari Id Pel/Page_(VCC) Virtual Command Center by PLN/button_Tutup'))

WebUI.setText(findTestObject('Object Repository/Pencarian/Cari Id Pel/Page_(VCC) Virtual Command Center by PLN/input User'), 
    't')

WebUI.click(findTestObject('Object Repository/Pencarian/Cari Id Pel/Page_(VCC) Virtual Command Center by PLN/button_CARI'))

WebUI.click(findTestObject('Object Repository/Pencarian/Cari Id Pel/Page_(VCC) Virtual Command Center by PLN/button_EXPORT'))

'Menampilkan User / Pelanggan yang dicari'
WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

