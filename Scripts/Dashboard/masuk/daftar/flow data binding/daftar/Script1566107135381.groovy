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
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\Intan\\Downloads\\accbid.apk', true)

Mobile.waitForElementPresent(findTestObject('android.view.View30 - Masuk atau Daftar'), 0)

Mobile.tap(findTestObject('android.view.View30 - Masuk atau Daftar'), 0)

Mobile.tap(findTestObject('daftar'), 0)

Mobile.setText(findTestObject('isi_nama'), namalengkap, 0)

Mobile.setText(findTestObject('isi_email'), email, 0)

Mobile.setText(findTestObject('isi_nomor'), nomor, 0)

Mobile.setText(findTestObject('isi_pass'), password, 0)

Mobile.setText(findTestObject('isi_pass2'), password2, 0)

switch (expected.toString()) {
    case 'passed':
        Mobile.verifyElementNotVisible(findTestObject('btn_daftar'), 0)

        break
    case 'failed':
        if (keterangan.toString() == 'fieldempty') {
            Mobile.verifyElementAttributeValue(findTestObject('btn_daftar'), 'enabled', 'false', 5)

            Mobile.tap(findTestObject('btn_daftar'), 0)
        }
        
        if (keterangan.toString() == 'emailisused') {
            Mobile.verifyElementVisible(findTestObject('warning_email_sdh_digunakan'), 0)
        }
        
        if (keterangan.toString() == 'wronginput') {
            Mobile.verifyElementVisible(findTestObject('warning_pass_tdksesuai'), 0)
        }
        
        if (keterangan.toString() == 'hapusisian') {
            Mobile.clearText(findTestObject('isi_nama'), 0)

            Mobile.verifyElementAttributeValue(findTestObject('btn_daftar'), 'enabled', 'false', 5)
        }
        
        if (true) {
            Mobile.clearText(findTestObject('isi_email'), 0)

            Mobile.verifyElementAttributeValue(findTestObject('btn_daftar'), 'enabled', 'false', 5)
        }
        
        if (keterangan.toString() == 'hapusisian') {
            Mobile.clearText(findTestObject('isi_nomor'), 0)

            Mobile.verifyElementAttributeValue(findTestObject('btn_daftar'), 'enabled', 'false', 5)
        }
        
        if (keterangan.toString() == 'hapusisian') {
            Mobile.clearText(findTestObject('isi_pass'), 0)

            Mobile.verifyElementAttributeValue(findTestObject('btn_daftar'), 'enabled', 'false', 5)
        }
        
        if (keterangan.toString() == 'hapusisian') {
            Mobile.clearText(findTestObject('isi_pass2'), 0)

            Mobile.verifyElementAttributeValue(findTestObject('btn_daftar'), 'enabled', 'false', 5)
        }
        
        break
}

