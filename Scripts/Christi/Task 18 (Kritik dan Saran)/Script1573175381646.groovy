import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Christi/User_Login'), [('email') : 'christiantiangelin@gmail.com', ('password') : 'Chr!st1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(15)

Mobile.tap(findTestObject('Page_Login/AKUN'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Kritik Saran/Kritik_Saran'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Kritik Saran/kritik saran produk'), 0)

WebUI.delay(3)

switch (expected.toString()) {
    case 'pass':
        Mobile.setText(findTestObject('Kritik Saran/input text'), input_text, 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Kritik Saran/btn submit'), 0)

        break
    case 'failed':
        Mobile.tap(findTestObject('Kritik Saran/btn submit'), 0)

        WebUI.delay(5)

        Mobile.verifyElementVisible(findTestObject('ACC Bid/android.view.error.empty.input'), 0)

        break
}

WebUI.delay(7)

Mobile.closeApplication()

