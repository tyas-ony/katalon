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

WebUI.comment('Pindah Unit')

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/pindah unit/Page_(VCC) Virtual Command Center by PLN/button_A'))

WebUI.click(findTestObject('Object Repository/pindah unit/Page_(VCC) Virtual Command Center by PLN/div_Permohonan Pindah Unit'))

WebUI.click(findTestObject('pindah unit/Page_(VCC) Virtual Command Center by PLN/input_Level Baru_r0'))

WebUI.click(findTestObject('Object Repository/pindah unit/Page_(VCC) Virtual Command Center by PLN/li_Pusat'))

WebUI.click(findTestObject('pindah unit/Page_(VCC) Virtual Command Center by PLN/input_Unit Name Baru_r2'))

WebUI.click(findTestObject('pindah unit/Page_(VCC) Virtual Command Center by PLN/li_-'))

WebUI.uploadFile(findTestObject('pindah unit/Page_(VCC) Virtual Command Center by PLN/button_PILIH FILE'), 'C:\\Users\\ONY-012\\Dummy.pdf')

//'Capturing the file name after upload and storing it in a variable'
//FilePath = WebUI.getAttribute(findTestObject('pindah unit/Page_(VCC) Virtual Command Center by PLN/button_PILIH FILE'), 'value')
//
//'Verifying the Actual path and Expected path of file'
//WebUI.verifyMatch(FilePath, 'D:\\Dummy 1.pdf', false)
//
//String filePath = RunConfiguration.getProjectDir() + '/Data Files/Dummy 1.pdf'
//
//Path absolutePath = Paths.get(filePath)
//
//String absolutePathStr = absolutePath.toString()
//WebUI.uploadFile(findTestObject('object'), absolutePathStr)
WebUI.delay(5)

WebUI.takeFullPageScreenshot()

