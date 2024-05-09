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

CustomKeywords.'navigate.NavigateToURL.openBrowser'(GlobalVariable.w3SchoolBaseURL, GlobalVariable.timeOut)

WebUI.waitForElementClickable(findTestObject('Object Repository/W3school_Elements/StringMethodsLink'), GlobalVariable.timeOut)

WebUI.click(findTestObject('Object Repository/W3school_Elements/StringMethodsLink'))

WebUI.click(findTestObject('Object Repository/W3school_Elements/StringLengthLink'))

WebUI.waitForElementClickable(findTestObject('Object Repository/W3school_Elements/TryItBtn'), GlobalVariable.timeOut)

WebUI.click(findTestObject('Object Repository/W3school_Elements/TryItBtn'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/W3school_Elements/RunBtn'), GlobalVariable.timeOut)

WebUI.click(findTestObject('Object Repository/W3school_Elements/HomeBtn'))

WebUI.switchToWindowIndex(0)

WebUI.verifyElementPresent(findTestObject('Object Repository/W3school_Elements/TryItBtn'), GlobalVariable.timeOut)

WebUI.closeWindowIndex(1)

WebUI.delay(2)

WebUI.closeBrowser()
