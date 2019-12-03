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

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Page_Login/AKUN'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Page_Pusat Bantuan/android.view.View59'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Page_Pusat Bantuan/input.PertanyaanPusatBantuan'), 0)

Mobile.clearText(findTestObject('Page_Pusat Bantuan/input.PertanyaanPusatBantuan'), 0)

Mobile.setText(findTestObject('Page_Pusat Bantuan/input.PertanyaanPusatBantuan', [('variable') : search_text]), search_text, 
    0)

switch (expected.toString()) {
    case 'pass':
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Page_Pusat Bantuan/login_see more'), 0)

        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Page_Pusat Bantuan/login_see more'), 0)

        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        break
    case 'fail':
        WebUI.delay(3)

        Mobile.verifyElementNotExist(findTestObject('Page_Pusat Bantuan/login_see more'), 0)

        not_run: WebUI.verifyElementAttributeValue(findTestObject('Page_Pusat Bantuan/login_set text'), 'value', search_text, 
            0)

        break
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

