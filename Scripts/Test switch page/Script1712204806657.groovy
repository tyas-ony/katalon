import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

'Open browser and navigate to website '
WebUI.openBrowser('')

WebUI.navigateToUrl('https://the-internet.herokuapp.com/windows')

'Maximize the window'
WebUI.maximizeWindow()

'Click on Click Here link'
WebUI.click(findTestObject('null'))

'Switch to New window by Switch to Window index method'
WebUI.switchToWindowTitle('New Window')

'Capturing the Heading of the New Window text and Storing it in a variable'
Heading_NewWindow = WebUI.getText(findTestObject('null'))

'Validating the heading so that it is navigated to desired window by Switch To Window Url Method'
WebUI.verifyEqual(Heading_NewWindow, 'New Window')

'Verify uncheck Hospital readmission check box'
WebUI.verifyElementNotChecked(findTestObject('Page_CURA Healthcare Service (2)/input_hospital_readmission'), 30)

WebUI.selectOptionByValue(findTestObject(null), '1', false)

