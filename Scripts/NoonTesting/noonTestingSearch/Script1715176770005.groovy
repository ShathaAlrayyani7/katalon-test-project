import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.RenderingHints.Key
import java.util.concurrent.ConcurrentHashMap.KeySetView

import org.openqa.selenium.Keys

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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.NoonBaseUrl)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(GlobalVariable.timeOut)

NoonSearchBar = findTestObject('Object Repository/NoonElements/NoonSearchBar')
addFirstElementToCart = findTestObject('Object Repository/NoonElements/addFirstElementToCart')
NoonItemText = findTestObject('Object Repository/NoonElements/NoonCartItemText')
NoonCartBtn = findTestObject('Object Repository/NoonElements/NoonCartBtn')

WebUI.waitForElementPresent(NoonSearchBar, GlobalVariable.timeOut)

WebUI.sendKeys(NoonSearchBar, GlobalVariable.searchItem + Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(addFirstElementToCart, GlobalVariable.timeOut)

WebUI.click(addFirstElementToCart)

WebUI.click(NoonCartBtn)

WebUI.waitForPageLoad(GlobalVariable.timeOut)

WebUI.waitForElementVisible(NoonItemText, GlobalVariable.timeOut)

actualValue = WebUI.getText(NoonItemText)

expectedValue = 'جي بي إل سماعات Tune 510Bt اللاسلكية فوق الاذن - Pure Bass - بطارية 40H - شحن سريع - USB سريع من النوع C - قابلة للطي باللون الأسود أسود'

WebUI.verifyMatch(actualValue, expectedValue, false)

WebUI.delay(2)

WebUI.closeBrowser()

