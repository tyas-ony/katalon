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

WebUI.comment('Cek empty fields')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/pindah unit/Page_(VCC) Virtual Command Center by PLN/button_A'))

WebUI.click(findTestObject('pindah unit/Page_(VCC) Virtual Command Center by PLN/div_Permohonan Pindah Unit'))

WebUI.click(findTestObject('pindah unit/Page_(VCC) Virtual Command Center by PLN/button_kirim'))

WebUI.verifyElementPresent(findTestObject('pindah unit/Page_(VCC) Virtual Command Center by PLN/p_Silahkan pilih level terlebih dahulu'), 
    0)

WebUI.verifyElementPresent(findTestObject('pindah unit/Page_(VCC) Virtual Command Center by PLN/p_Silahkan pilih unit terlebih dahulu'), 
    0)

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.refresh()

WebUI.comment('Memasukkan valid data')

WebUI.click(findTestObject('Object Repository/pindah unit/Page_(VCC) Virtual Command Center by PLN/button_A'))

WebUI.click(findTestObject('Object Repository/pindah unit/Page_(VCC) Virtual Command Center by PLN/div_Permohonan Pindah Unit'))

WebUI.click(findTestObject('pindah unit/Page_(VCC) Virtual Command Center by PLN/input_Level Baru_r0'))

WebUI.click(findTestObject('Object Repository/pindah unit/Page_(VCC) Virtual Command Center by PLN/li_Pusat'))

WebUI.click(findTestObject('pindah unit/Page_(VCC) Virtual Command Center by PLN/input_Unit Name Baru_r2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('pindah unit/Page_(VCC) Virtual Command Center by PLN/li_-'), FailureHandling.CONTINUE_ON_FAILURE)

//String filePath = RunConfiguration.getProjectDir() + '/Data Files/Dummy 1.docx'
//document.querySelectorAll('input[type=file]')
//
//input[(type = file)]

WebUI.uploadFile(findTestObject('pindah unit/Page_(VCC) Virtual Command Center by PLN/button_PILIH FILE'), 'C:\\Users\\ONY-012\\Dummy.png')

WebUI.delay(0)

WebUI.takeFullPageScreenshot()

