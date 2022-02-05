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

WebUI.openBrowser('https://www.techlistic.com/p/selenium-practice-form.html')

WebUI.setViewPortSize(1552, 840)

WebUI.scrollToElement(findTestObject('firstname'), 0)

WebUI.click(findTestObject('firstname'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('firstname'), 'Tom')

WebUI.click(findTestObject('lastname'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('lastname'), 'Wod')

WebUI.click(findTestObject('optionMale'))

WebUI.click(findTestObject('5yearExperient'))

WebUI.click(findTestObject('datePiker'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('datePiker'), '16-10-2020')

WebUI.click(findTestObject('Automatetester'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('seleniumwebdirver'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('continel'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Eropa'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('continel'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('seleniumcomant'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('browserCommand'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.mouseOverOffset(findTestObject('button_submit'), 675.5555419921875, 0)

WebUI.click(findTestObject('button_submit'))

WebUI.closeBrowser()

