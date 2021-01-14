import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\adek3\\AppData\\Local\\Temp\\Katalon\\20210113_235852\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://www.sklepdemo.pl/\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_Sklep internetowy demo/i_Kategorie produktw\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Sklep internetowy demo/a_Narzdzia(12)\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Narzdzia  Sklepdemo.pl/em_Producent Baking Anna Poland\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Miernik Elektryczny Sanders Ultimo v2 _570bf3/button_Dodaj do koszyka\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Miernik Elektryczny Sanders Ultimo v2 _570bf3/div_Dodano do koszyka                      _333bd0\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Miernik Elektryczny Sanders Ultimo v2 _570bf3/a_KOSZYK        2    5462,10 z\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Koszyk/label_Patno przy odbiorze\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Koszyk/label_Darmowy kurier UPS\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Koszyk/button_Realizuj zamwienie\'))\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Koszyk/input_Mam konto_email\'), \'Katarzyna@wp.pl\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Koszyk/input_Adres e-mail_billingPhone\'), \'654654654\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Koszyk/input_Numer NIP_billingFirstName\'), \'Katarzyna\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Koszyk/input_Imi_billingLastName\'), \'Kaczo\u0144\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Koszyk/input_Nazwisko_billingAddress\'), \'\u015Awierzbowa\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Koszyk/input_Ulica_billingAddress2\'), \'12\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Koszyk/input_Nr domu_billingAddress3\'), \'13\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Koszyk/input_Nr lokalu_billingCity\'), \'Pozna\u0144\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Koszyk/input_Miejscowo_billingPostalCode\'), \'12-521\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_Koszyk/label_Przykadowa klauzula akceptacji regulaminu\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Koszyk/button_Zamawiam i pac\'))\n\nWebUI.navigateToUrl(\'https://www.sklepdemo.pl/confirmation\')\n\n', FailureHandling.STOP_ON_FAILURE, true)

