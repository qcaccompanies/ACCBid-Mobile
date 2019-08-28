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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('lihatsemuapromo'), 0)

Mobile.setText(findTestObject('isi_field_promo'), namapromo, 0)

switch (expected.toString()) {
    case 'passed':
        if (keterangan.toString() == 'promo1') {
            Mobile.verifyElementVisible(findTestObject('null'), 0)

            Mobile.tap(findTestObject('null'), 0)
        }
        
        if (keterangan.toString() == 'promo2') {
            Mobile.tap(findTestObject('null'), 0)
        }
        
        if (keterangan.toString() == 'promo3') {
            Mobile.tap(findTestObject('null'), 0)

            break
        }
    case 'failed':
        Mobile.verifyElementVisible(findTestObject('promotidakditemukan'), 0)

        break
}

