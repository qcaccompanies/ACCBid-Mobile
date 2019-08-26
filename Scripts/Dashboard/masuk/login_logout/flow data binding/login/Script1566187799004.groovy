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

Mobile.startApplication('C:\\Users\\Intan\\Downloads\\accbid.apk', true)

Mobile.waitForElementPresent(findTestObject('android.view.View30 - Masuk atau Daftar'), 0)

Mobile.tap(findTestObject('android.view.View30 - Masuk atau Daftar'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('masuk'), 3, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('masuk'), 0)
} else {
    Mobile.tap(findTestObject('masuk_akun_lain'), 0)
}

Mobile.setText(findTestObject('isi_user'), username, 0)

Mobile.setText(findTestObject('isi_pass_login'), password, 0)

Mobile.tap(findTestObject('btn_login'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

not_run: if (Mobile.verifyElementVisible(findTestObject('akun'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('Dashboard/masuk/login_logout/flow data binding/logout'), [('username') : '', ('password') : ''
            , ('expected') : '', ('keterangan') : ''], FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.closeApplication()
}

switch (expected.toString()) {
    case 'passed':
        Mobile.verifyElementNotVisible(findTestObject('btn_login'), 0)

        WebUI.callTestCase(findTestCase('Dashboard/masuk/login_logout/flow data binding/logout'), [('username') : '', ('password') : ''
                , ('expected') : '', ('keterangan') : ''], FailureHandling.STOP_ON_FAILURE)

        break
    case 'failed':
        Mobile.verifyElementVisible(findTestObject('btn_login'), 0)

        break
        
        not_run: if (keterangan.toString() == 'wrongpass') {
            Mobile.verifyElementVisible(findTestObject('btn_login'), 0)
        }
        
        not_run: if (keterangan.toString() == 'wrongemail') {
            Mobile.verifyElementVisible(findTestObject('btn_login'), 0)
        }
        
        not_run: if (keterangan.toString() == 'fieldempty') {
            Mobile.verifyElementVisible(findTestObject('btn_login'), 0)

            break
        }
}

