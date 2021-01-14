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

WebUI.navigateToUrl('https://www.sklepdemo.pl/')

WebUI.click(findTestObject('Object Repository/Page_Sklep internetowy demo/i_Kategorie produktw'))

WebUI.click(findTestObject('Object Repository/Page_Sklep internetowy demo/a_Narzdzia(12)'))

WebUI.click(findTestObject('Object Repository/Page_Narzdzia  Sklepdemo.pl/a_Miernik Elektryczny Sanders Ultimo v2Mier_bbe38e'))

WebUI.click(findTestObject('Object Repository/Page_Miernik Elektryczny Sanders Ultimo v2 _570bf3/button_Dodaj do koszyka'))

WebUI.click(findTestObject('Object Repository/Page_Miernik Elektryczny Sanders Ultimo v2 _570bf3/a_Przejd do koszyka'))

WebUI.click(findTestObject('Object Repository/Page_Koszyk/label_Patno przy odbiorze'))

WebUI.click(findTestObject('Object Repository/Page_Koszyk/label_Darmowy kurier UPS'))

WebUI.click(findTestObject('Object Repository/Page_Koszyk/button_Realizuj zamwienie'))

WebUI.click(findTestObject('Object Repository/Page_Koszyk/label_Adres e-mail'))

WebUI.setText(findTestObject('Object Repository/Page_Koszyk/input_Mam konto_email'), 'katarzyna@wp.pl')

WebUI.setText(findTestObject('Object Repository/Page_Koszyk/input_Adres e-mail_billingPhone'), '654654654')

WebUI.setText(findTestObject('Object Repository/Page_Koszyk/input_Numer NIP_billingFirstName'), 'Katarzyna')

WebUI.setText(findTestObject('Object Repository/Page_Koszyk/input_Imi_billingLastName'), 'Kaczoń')

WebUI.setText(findTestObject('Object Repository/Page_Koszyk/input_Nazwisko_billingAddress'), 'Świerzbowa')

WebUI.setText(findTestObject('Object Repository/Page_Koszyk/input_Ulica_billingAddress2'), '13')

WebUI.setText(findTestObject('Object Repository/Page_Koszyk/input_Nr domu_billingAddress3'), '12')

WebUI.setText(findTestObject('Object Repository/Page_Koszyk/input_Nr lokalu_billingCity'), 'Poznań')

WebUI.setText(findTestObject('Object Repository/Page_Koszyk/input_Miejscowo_billingPostalCode'), '54-656')

WebUI.click(findTestObject('Object Repository/Page_Koszyk/label_Przykadowa klauzula akceptacji regulaminu'))

WebUI.click(findTestObject('Object Repository/Page_Koszyk/button_Zamawiam i pac'))

