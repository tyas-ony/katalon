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

WebUI.comment('Pengguna melakukan Cari User')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pencarian/Cari Id Pel berdasarkan User/div_PLN MobilePLN Mobile ManagementRekapRek_eef85c'))

WebUI.click(findTestObject('Pencarian/Cari Id Pel berdasarkan User/a_Cari User'))

WebUI.takeFullPageScreenshot()

'Menginputkan Id Pel tidak valid'
WebUI.setText(findTestObject('Object Repository/Pencarian/Cari Id Pel/Masukkan Id Pel'), '110110035')

'Klik Tombol Cari'
WebUI.click(findTestObject('Object Repository/Pencarian/Cari Id Pel/button_CARI'))

WebUI.waitForPageLoad(1)

'Menampilkan informasi data tidak ditemukan'
WebUI.verifyElementPresent(findTestObject('Object Repository/Pencarian/Cari Id Pel/td_Data tidak ditemukan'), 0)

WebUI.takeFullPageScreenshot()

'Menginputkan Id Pel valid'
WebUI.setText(findTestObject('Object Repository/Pencarian/Cari Id Pel/Masukkan Id Pel'), '189')

WebUI.click(findTestObject('Object Repository/Pencarian/Cari Id Pel/button_CARI'))

WebUI.waitForPageLoad(1)

WebUI.takeFullPageScreenshot()

'Export '
WebUI.click(findTestObject('Object Repository/Pencarian/Cari Id Pel berdasarkan User/button_EXPORT'))

WebUI.waitForPageLoad(1)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

