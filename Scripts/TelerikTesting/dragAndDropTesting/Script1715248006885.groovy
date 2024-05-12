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


WebUI.openBrowser(GlobalVariable.TelerikBaseURL)

WebUI.waitForPageLoad(GlobalVariable.TelerikTimeOut)

WebUI.maximizeWindow()

telerikRadDock2 = findTestObject('Object Repository/TelerikElements/TelerikRadDock2')
telerikRadDock4 = findTestObject('Object Repository/TelerikElements/TelerikRadDock4')
telerikRadDockZone3 = findTestObject('Object Repository/TelerikElements/TelerikRadDockZone3')
telerikRadDockZone2 = findTestObject('Object Repository/TelerikElements/TelerikRadDockZone2')
telerikRadDockZone1 = findTestObject('Object Repository/TelerikElements/TelerikRadDockZone1')

WebUI.dragAndDropToObject(telerikRadDock2, telerikRadDockZone3)
WebUI.delay(2)
WebUI.dragAndDropToObject(telerikRadDock4, telerikRadDockZone1)
WebUI.delay(2)
WebUI.closeBrowser()
