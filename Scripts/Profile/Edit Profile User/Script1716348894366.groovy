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

WebUI.comment('Memasukkan data profile')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('pindah unit/Page_(VCC) Virtual Command Center by PLN/button_A'))

WebUI.click(findTestObject('Profile/a_Administrator085364782243Area  (52100) Yogyakarta'))

'Masukan NIP'
WebUI.click(findTestObject('Profile/Page_(VCC) Virtual Command Center by PLN/input NIP'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Profile/Page_(VCC) Virtual Command Center by PLN/input NIP'), '123456789')

'Masukkan Company'
WebUI.click(findTestObject('Profile/Page_(VCC) Virtual Command Center by PLN/input Company'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Profile/Page_(VCC) Virtual Command Center by PLN/input Company'), 'Company 1')

'Masukkan Department'
WebUI.click(findTestObject('Profile/Page_(VCC) Virtual Command Center by PLN/input Department'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Profile/Page_(VCC) Virtual Command Center by PLN/input Department'), 'Dev')

'Masukkan Phone'
WebUI.click(findTestObject('Profile/Page_(VCC) Virtual Command Center by PLN/input Phone'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Profile/Page_(VCC) Virtual Command Center by PLN/input Phone'), '08123456789')

WebUI.click(findTestObject('Profile/Page_(VCC) Virtual Command Center by PLN/input Position'), FailureHandling.STOP_ON_FAILURE)

'Mengosongkan kolom Position'
WebUI.comment('Mengosongkan mandatory field')

WebUI.sendKeys(findTestObject('Profile/Page_(VCC) Virtual Command Center by PLN/input Position'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Profile/Page_(VCC) Virtual Command Center by PLN/input Position'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Profile/Kirim'))

//'Menampilkan pesan "Masukkan Jabatan anda terlebih dahulu"'
//WebUI.verifyElementPresent(findTestObject('Profile/pesan Masukan Jabatan anda terlebih dahulu'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(0)

'Menampilkan pesan "Masukkan Jabatan anda terlebih dahulu"'
WebUI.takeElementScreenshot(findTestObject('Profile/pesan Masukan Jabatan anda terlebih dahulu'))

'Masukkan Position'
WebUI.click(findTestObject('Profile/Page_(VCC) Virtual Command Center by PLN/input Position'))

WebUI.setText(findTestObject('Profile/Page_(VCC) Virtual Command Center by PLN/input Position'), 'dev')

WebUI.delay(0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Profile/Kirim'))

WebUI.verifyElementPresent(findTestObject('Profile/pesan SuccessData berhasil diubah Ok'), 0)

WebUI.click(findTestObject('Profile/Ok'))

WebUI.delay(0)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

