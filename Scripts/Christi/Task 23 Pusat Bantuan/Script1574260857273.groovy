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

Mobile.startApplication('C:\\Users\\ASUS\\Desktop\\accbid(2).apk', false)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('akun'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Page_Pusat Bantuan/android.view.View0 - Pusat Bantuan'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Page_Pusat Bantuan/android.widget.EditText0 (2)'), search_text, 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

switch (expected.toString()) {
    case 'pass`':
        Mobile.verifyElementVisible(findTestObject('Page_Pusat Bantuan/android.view.View0 - Bagaimana cara melakukan Top Up'), 
            3)

        Mobile.tap(findTestObject('Page_Pusat Bantuan/android.view.View0 - Bagaimana cara melakukan Top Up'), 0)

        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        break
    case 'fail':
        Mobile.verifyElementNotVisible(findTestObject('Page_Pusat Bantuan/android.view.View0 - Bagaimana cara melakukan Top Up'), 
            0)

        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        break
}

Mobile.closeApplication()

