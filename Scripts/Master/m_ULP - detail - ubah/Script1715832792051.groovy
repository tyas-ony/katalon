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

WebUI.comment('search data masih error')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Master/Induk UID/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('Object Repository/Master/Induk UID/div_masterdata'))

WebUI.click(findTestObject('Master/Regional/div_RegionalIndukAreaUnitKontak GM  MUP3'))

WebUI.click(findTestObject('Object Repository/Master/ULP Unit/a_Unit'))

WebUI.click(findTestObject('Master/ULP Unit/pencarian Master ULP'))

'User melakukan pencarian ULP'
WebUI.setText(findTestObject('Master/ULP Unit/pencarian Master ULP'), 'Lambaro')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

'User melihat detail informasi ULP'
WebUI.click(findTestObject('Object Repository/Master/ULP Unit/button_DETAIL'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementPresent(findTestObject('Object Repository/Master/ULP Unit/div_Informasi UnitID Unit UPI11ID Unit AP11_9b4277'), 
    0)

WebUI.click(findTestObject('Object Repository/Master/ULP Unit/svg_Informasi Unit_injected-svg icons-sm'))

'User mengubah informasi ULP'
WebUI.click(findTestObject('Object Repository/Master/ULP Unit/a_UBAH'))

WebUI.setText(findTestObject('Master/ULP Unit/input Nama Unit'), 'OO')

'User submit perubahan data'
WebUI.click(findTestObject('Object Repository/Master/ULP Unit/button_SUBMIT'))

WebUI.verifyElementPresent(findTestObject('Master/ULP Unit/div_Nomor TeleponHPmasukkan nomor telepon'), 0)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Master/ULP Unit/p_masukkan nomor telepon'), 0)
WebUI.setText(findTestObject('Master/ULP Unit/input Nomor TeleponHP'), '00')

//WebUI.click(findTestObject('Object Repository/Master/ULP Unit/button_SUBMIT'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Master/ULP Unit/div_SuccessData berhasil diubah Ok'), 0)

WebUI.click(findTestObject('Object Repository/Master/ULP Unit/button_Ok'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

