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

WebUI.navigateToUrl(GlobalVariable.loginPageURL)

WebUI.setText(findTestObject('Page_Pure Influence/input_Email_email'), GlobalVariable.loginEmail)

WebUI.setText(findTestObject('Page_Pure Influence/input_Password_password'), GlobalVariable.loginPassword)

WebUI.click(findTestObject('Page_Pure Influence/button_Login'))

WebUI.verifyElementText(findTestObject('Page_Pure Influence/p_Zeyad Alasad'), 'Zeyad Alasad')

WebUI.click(findTestObject('Page_Pure Influence/a_Wallet'))

WebUI.verifyElementText(findTestObject('Page_Pure Influence/h2_Wallet Balance'), 'Wallet Balance')

WebUI.verifyElementPresent(findTestObject('Page_Pure Influence/h2_Wallet Balance'), 0)

WebUI.click(findTestObject('Page_Pure Influence/div_0'))

WebUI.verifyElementPresent(findTestObject('Page_Pure Influence/h2_Piggy Bank Balance'), 0)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Pure Influence/h2_Piggy Bank Balance'), 'Piggy Bank Balance')

WebUI.click(findTestObject('Page_Pure Influence/a_Collab'))

WebUI.verifyElementPresent(findTestObject('Page_Pure Influence/p_Welcome to the Brand Collab Board, Connect with Your Next Opportunity'), 
    0)

WebUI.click(findTestObject('Page_Pure Influence/a_Home'))

WebUI.closeBrowser()

