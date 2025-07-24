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

WebUI.click(findTestObject('User Management/Page_(VCC) Virtual Command Center by PLN/button_Menu 1_bg-transparent --toggle-btn p_63561a'))

WebUI.click(findTestObject('Master/Regional/div_masterdata'))

WebUI.click(findTestObject('Master/Regional/div_RegionalIndukAreaUnitKontak GM  MUP3'))

WebUI.click(findTestObject('Master/Regional/a_Regional'))

'User melakukan pencarian regional'
WebUI.click(findTestObject('Master/Regional/Cari Regional'), FailureHandling.STOP_ON_FAILURE)

'User melakukan pencarian regional'
WebUI.setText(findTestObject('Master/Regional/Cari Regional'), 'jamali')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Master/Regional/a_UBAH'))

'User mengubah informasi data regional'
WebUI.click(findTestObject('Master/Regional/Pilih Induk'))

'Menambahkan Induk '
WebUI.click(findTestObject('Master/Regional/li_51 - JAWA TIMUR'))

WebUI.click(findTestObject('Master/Regional/button_SUBMIT'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

