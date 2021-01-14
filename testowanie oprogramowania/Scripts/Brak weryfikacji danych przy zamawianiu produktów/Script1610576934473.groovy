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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.practiceselenium.com/welcome.html')

WebUI.click(findTestObject('Object Repository/Page_Welcome/a_Menu'))

WebUI.click(findTestObject('Object Repository/Page_Menu/span_Check Out'))

WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_E-mail_email'), 'katarzyna@wp.pl')

WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_Name_name'), 'Katarzyna')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Check Out/select_Visa              Mastercard        _aa4d3f'), 
    'Mastercard', true)

WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_Card Number_card_number'), '123456789123')

WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_Cardholder Name_cardholder_name'), 'Katarzyna')

WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_Verification Code_verification_code'), '654')

WebUI.click(findTestObject('Object Repository/Page_Check Out/button_Place Order'))

