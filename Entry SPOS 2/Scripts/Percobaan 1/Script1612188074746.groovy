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

WebUI.setText(findTestObject('Object Repository/Page_SIAPP Login/input_SIAPP LOGIN_nip'), '199305172019031012')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SIAPP Login/input_SIAPP LOGIN_password'), 'CUVxrfqLCt4=')

WebUI.click(findTestObject('Object Repository/Page_SIAPP Login/input_SIAPP LOGIN_blogin'))

WebUI.click(findTestObject('Page_SIAPP/a_NTP'))

WebUI.click(findTestObject('Object Repository/Page_SIAPP/a_Entry Data NTP'))

x = 1

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 7

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 13

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 19

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 25

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 31

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 37

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 43

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 49

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 55

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 61

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 67

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 73

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 79

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 85

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 91

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

x = 97

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

WebUI.acceptAlert()

