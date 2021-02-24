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

WebUI.navigateToUrl('http://siapp.dipendajatim.go.id/')

WebUI.setText(findTestObject('Object Repository/Page_SIAPP Login/input_SIAPP LOGIN_kdsamsat'), '331')

WebUI.setText(findTestObject('Object Repository/Page_SIAPP Login/input_SIAPP LOGIN_nip'), '197106241998032003')

WebUI.setText(findTestObject('Object Repository/Page_SIAPP Login/input_SIAPP LOGIN_password'), 'dyah')

WebUI.click(findTestObject('Object Repository/Page_SIAPP Login/input_SIAPP LOGIN_blogin'))

WebUI.click(findTestObject('Object Repository/Page_SIAPP/a_NTP'))

WebUI.click(findTestObject('Object Repository/Page_SIAPP/a_Status NTP'))

x = 1

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 8

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 15

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 22

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 29

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 36

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 43

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 50

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 57

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 64

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 71

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 78

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 85

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 92

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 99

for (def index : findTestData('Data Status 1').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), findTestData('Data Status 1').getValue(
            1, x))

    WebUI.click(findTestObject('Page_SIAPP/button_Simpan_status'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

WebUI.dismissAlert()

WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nopol_nopol3'), 's6783iy')

WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

WebUI.closeBrowser()

