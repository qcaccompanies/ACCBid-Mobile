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

Mobile.tap(findTestObject('masuk'), 0)

Mobile.tap(findTestObject('lupa_kata_sandi'), 0)

Mobile.setText(findTestObject('isi_email_lupapassword'), '', 0)

Mobile.tap(findTestObject('btn_konfirmasi'), 0)

switch (expectedemail.toString()) {
    case 'passed':
        Mobile.verifyElementVisible(findTestObject('verifikasi_keamanan'), 0)

        Mobile.waitForElementPresent(findTestObject('lupa_kata_sandi'), 0)

        Mobile.setText(findTestObject('new_pass'), newpass, 0)

        Mobile.setText(findTestObject('new_pass_conf'), confirmpass, 0)

        Mobile.tap(findTestObject('btn_masuk_conf_pass'), 0)

        switch (expectedpass.toString()) {
            case 'passed':
                Mobile.verifyElementVisible(findTestObject('jadwal_lelang'), 0)

                break
            case 'failed':
                Mobile.verifyElementAttributeValue(findTestObject('btn_masuk_conf_pass'), 'enabled', 'false', 5)

                break
        }
    case 'failed':
        if (keterangan.toString() == 'notregistered') {
            Mobile.verifyElementAttributeValue(findTestObject('btn_konfirmasi'), 'enabled', 'false', 5)
        } else if (keterangan.toString() == 'wronginput') {
            Mobile.verifyElementAttributeValue(findTestObject('btn_konfirmasi'), 'enabled', 'false', 5)
        }
        
        break
}
