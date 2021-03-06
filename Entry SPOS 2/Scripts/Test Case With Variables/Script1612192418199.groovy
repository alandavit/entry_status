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

x = 13

for (def index : findTestData('New Test Data').getValue(1, x)) {
    WebUI.setText(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), findTestData('New Test Data').getValue(
            1, x))

    WebUI.sendKeys(findTestObject('Object Repository/Page_SIAPP/input_Nomor NTP _nontp'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_Simpan'))

    WebUI.click(findTestObject('Object Repository/Page_SIAPP/button_OK'))

    x++
}

