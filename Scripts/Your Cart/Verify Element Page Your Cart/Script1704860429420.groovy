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

WebUI.verifyElementVisible(findTestObject('Page Your Cart/button_Checkout'))

WebUI.verifyElementVisible(findTestObject('Page Your Cart/button_Continue Shopping'))

WebUI.verifyElementVisible(findTestObject('Page Your Cart/button_Remove'))

WebUI.verifyElementVisible(findTestObject('Page Your Cart/button_Remove'))

WebUI.verifyElementVisible(findTestObject('Page Your Cart/Card Your Cart'))

WebUI.verifyElementVisible(findTestObject('Page Your Cart/Card Number'))

WebUI.verifyElementVisible(findTestObject('Page Your Cart/Deskripsi Product'))

WebUI.verifyElementVisible(findTestObject('Page Your Cart/Label Harga'))

WebUI.verifyElementVisible(findTestObject('Page Your Cart/Label_Description'))

WebUI.verifyElementVisible(findTestObject('Page Your Cart/Label_QTY'))

WebUI.verifyElementVisible(findTestObject('Page Your Cart/Title Page Your Cart'))

WebUI.verifyElementVisible(findTestObject('Page Your Cart/Title Product'))

